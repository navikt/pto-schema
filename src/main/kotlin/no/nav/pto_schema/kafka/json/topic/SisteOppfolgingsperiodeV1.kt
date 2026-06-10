package no.nav.pto_schema.kafka.json.topic

import java.time.ZonedDateTime
import java.util.UUID

data class SisteOppfolgingsperiodeV1(
    val uuid: UUID? = null,
    val aktorId: String? = null,
    val startDato: ZonedDateTime? = null,
    val sluttDato: ZonedDateTime? = null,
)

