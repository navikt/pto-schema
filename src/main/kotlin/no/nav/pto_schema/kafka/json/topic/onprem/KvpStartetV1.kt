package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class KvpStartetV1(
    val aktorId: String,
    val enhetId: String? = null,
    val opprettetAv: String? = null,
    val opprettetDato: ZonedDateTime? = null,
    val opprettetBegrunnelse: String? = null,
)

