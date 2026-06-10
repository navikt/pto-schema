package no.nav.pto_schema.kafka.json

import org.everit.json.schema.Schema
import org.everit.json.schema.loader.SchemaLoader
import org.json.JSONObject
import org.json.JSONTokener
import java.nio.charset.StandardCharsets

object JsonSchemaLocator {

    @JvmStatic
    fun getKafkaSchema(schemaTypeClass: Class<*>): Schema =
        toSchema(getKafkaSchemaStr(schemaTypeClass))

    @JvmStatic
    fun getKafkaSchemaStr(schemaTypeClass: Class<*>): String {
        val kafkaSchemaResourcePath = createKafkaSchemaResourcePath(schemaTypeClass)
        return getResourceFileAsString(kafkaSchemaResourcePath)
    }

    @JvmStatic
    fun createKafkaSchemaResourcePath(kafkaSchemaClass: Class<*>): String {
        val schemaName = getSchemaName(kafkaSchemaClass)
        return "kafka/json/topic/$schemaName"
    }

    /**
     * Creates a schema name from a class
     * @param schemaClass class which will be used to create schema name
     * @return schema name of class. example: MyTopicV1.class -> my-topic-v1-schema.json
     */
    @JvmStatic
    fun getSchemaName(schemaClass: Class<*>): String {
        val className = schemaClass.simpleName
        val schemaNameBuilder = StringBuilder()

        className.forEachIndexed { i, ch ->
            if (ch.isUpperCase() && i > 0) {
                schemaNameBuilder.append('-')
            }
            schemaNameBuilder.append(ch.lowercaseChar())
        }

        return "$schemaNameBuilder-schema.json"
    }

    private fun toSchema(schemaJson: String): Schema =
        SchemaLoader.load(JSONObject(JSONTokener(schemaJson)))

    private fun getResourceFileAsString(resourcePath: String): String {
        val classLoader = JsonSchemaLocator::class.java.classLoader

        classLoader.getResourceAsStream(resourcePath).use { resourceStream ->
            requireNotNull(resourceStream) { "No resource found for $resourcePath" }
            return String(resourceStream.readAllBytes(), StandardCharsets.UTF_8)
        }
    }
}

