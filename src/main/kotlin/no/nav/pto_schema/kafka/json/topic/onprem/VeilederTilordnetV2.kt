package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class VeilederTilordnetV2(
    val aktorId: String,
    val veilederId: String? = null,
    val tilordnetTidspunkt: ZonedDateTime? = null,
)

