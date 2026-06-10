package no.nav.pto_schema.utils

import no.nav.common.json.JsonUtils
import no.nav.pto_schema.kafka.json.JsonSchemaLocator
import org.json.JSONObject
import org.json.JSONTokener

object ValidationUtils {

    fun validate(obj: Any) {
        val schema = JsonSchemaLocator.getKafkaSchema(obj.javaClass)
        schema.validate(JSONObject(JSONTokener(JsonUtils.toJson(obj))))
    }
}

