package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class EndringPaMalV1(
    val aktorId: String,
    val endretTidspunk: ZonedDateTime,
    val lagtInnAv: InnsenderData,
    val veilederIdent: String? = null,
) {
    enum class InnsenderData {
        BRUKER,
        NAV
    }
}

