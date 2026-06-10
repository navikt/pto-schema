package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class KvpAvsluttetV1(
    val aktorId: String,
    val avsluttetAv: String? = null,
    val avsluttetDato: ZonedDateTime? = null,
    val avsluttetBegrunnelse: String? = null,
)

