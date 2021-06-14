package no.nav.pto_schema.kafka.json;

import lombok.SneakyThrows;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonSchemaLocator {

    public static Schema getKafkaSchema(Class<?> schemaTypeClass) {
        return toSchema(getKafkaSchemaStr(schemaTypeClass));
    }

    public static String getKafkaSchemaStr(Class<?> schemaTypeClass) {
        String kafkaSchemaResourcePath = createKafkaSchemaResourcePath(schemaTypeClass);
        return getResourceFileAsString(kafkaSchemaResourcePath);
    }

    public static String createKafkaSchemaResourcePath(Class<?> kafkaSchemaClass) {
        String schemaName = getSchemaName(kafkaSchemaClass);
        return "kafka/json/topic/" + schemaName;
    }

    /**
     * Creates a schema name from a class
     * @param schemaClass class which will be used to create schema name
     * @return schema name of class. example: MyTopicV1.class -> my-topic-v1-schema.json
     */
    public static String getSchemaName(Class<?> schemaClass) {
        String className = schemaClass.getSimpleName();
        StringBuilder schemaNameBuilder = new StringBuilder();

        char[] chars = className.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (Character.isUpperCase(ch) && i > 0) {
                schemaNameBuilder.append('-');
            }

            schemaNameBuilder.append(Character.toLowerCase(ch));
        }

        return schemaNameBuilder.toString() + "-schema.json";
    }

    private static Schema toSchema(String schemaJson) {
        return SchemaLoader.load(new JSONObject(new JSONTokener(schemaJson)));
    }

    @SneakyThrows
    private static String getResourceFileAsString(String resourcePath) {
        ClassLoader classLoader = JsonSchemaLocator.class.getClassLoader();

        try (InputStream resourceStream = classLoader.getResourceAsStream(resourcePath)) {
            if (resourceStream == null) {
                throw new IllegalArgumentException("No resource found for " + resourcePath);
            }

            return new String(resourceStream.readAllBytes(), StandardCharsets.UTF_8);
        }
    }


}
