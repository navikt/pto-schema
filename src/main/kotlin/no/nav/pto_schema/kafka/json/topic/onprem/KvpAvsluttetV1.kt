package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class KvpAvsluttetV1(
    val aktorId: String,
    val avsluttetAv: String? = null,
    val avsluttetDato: ZonedDateTime? = null,
    val avsluttetBegrunnelse: String? = null,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var avsluttetAv: String? = null
        private var avsluttetDato: ZonedDateTime? = null
        private var avsluttetBegrunnelse: String? = null

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun avsluttetAv(avsluttetAv: String?): Builder = apply { this.avsluttetAv = avsluttetAv }
        fun avsluttetDato(avsluttetDato: ZonedDateTime?): Builder = apply { this.avsluttetDato = avsluttetDato }
        fun avsluttetBegrunnelse(avsluttetBegrunnelse: String?): Builder = apply { this.avsluttetBegrunnelse = avsluttetBegrunnelse }

        fun build(): KvpAvsluttetV1 = KvpAvsluttetV1(
            aktorId = aktorId!!,
            avsluttetAv = avsluttetAv,
            avsluttetDato = avsluttetDato,
            avsluttetBegrunnelse = avsluttetBegrunnelse,
        )
    }
}

