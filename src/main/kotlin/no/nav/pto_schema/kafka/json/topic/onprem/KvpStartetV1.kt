package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class KvpStartetV1(
    val aktorId: String,
    val enhetId: String? = null,
    val opprettetAv: String? = null,
    val opprettetDato: ZonedDateTime? = null,
    val opprettetBegrunnelse: String? = null,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var enhetId: String? = null
        private var opprettetAv: String? = null
        private var opprettetDato: ZonedDateTime? = null
        private var opprettetBegrunnelse: String? = null

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun enhetId(enhetId: String?): Builder = apply { this.enhetId = enhetId }
        fun opprettetAv(opprettetAv: String?): Builder = apply { this.opprettetAv = opprettetAv }
        fun opprettetDato(opprettetDato: ZonedDateTime?): Builder = apply { this.opprettetDato = opprettetDato }
        fun opprettetBegrunnelse(opprettetBegrunnelse: String?): Builder = apply { this.opprettetBegrunnelse = opprettetBegrunnelse }

        fun build(): KvpStartetV1 = KvpStartetV1(aktorId!!, enhetId, opprettetAv, opprettetDato, opprettetBegrunnelse)
    }
}

