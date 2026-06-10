package no.nav.pto_schema.kafka.json.topic

import java.time.ZonedDateTime

data class SisteTilordnetVeilederV1(
    val aktorId: String? = null,
    val veilederId: String? = null,
    val tilordnet: ZonedDateTime? = null,
)

