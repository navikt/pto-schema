package no.nav.pto_schema.utils;

import no.nav.pto_schema.kafka.json.JsonSchemaLocator;
import org.everit.json.schema.Schema;
import org.json.JSONObject;
import org.json.JSONTokener;

import static no.nav.common.json.JsonUtils.toJson;

public class ValidationUtils {

    public static <T> void validate(T obj) {
        Schema schema = JsonSchemaLocator.getKafkaSchema(obj.getClass());
        schema.validate(new JSONObject(new JSONTokener(toJson(obj))));
    }

}
