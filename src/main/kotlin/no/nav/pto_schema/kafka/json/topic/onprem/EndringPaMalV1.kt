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

    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var endretTidspunk: ZonedDateTime? = null
        private var lagtInnAv: InnsenderData? = null
        private var veilederIdent: String? = null

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun endretTidspunk(endretTidspunk: ZonedDateTime?): Builder = apply { this.endretTidspunk = endretTidspunk }
        fun lagtInnAv(lagtInnAv: InnsenderData?): Builder = apply { this.lagtInnAv = lagtInnAv }
        fun veilederIdent(veilederIdent: String?): Builder = apply { this.veilederIdent = veilederIdent }

        fun build(): EndringPaMalV1 = EndringPaMalV1(
            aktorId = aktorId!!,
            endretTidspunk = endretTidspunk!!,
            lagtInnAv = lagtInnAv!!,
            veilederIdent = veilederIdent,
        )
    }
}

