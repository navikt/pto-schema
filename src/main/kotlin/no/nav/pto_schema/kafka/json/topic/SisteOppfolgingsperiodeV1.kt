package no.nav.pto_schema.kafka.json.topic

import java.time.ZonedDateTime
import java.util.UUID

data class SisteOppfolgingsperiodeV1(
    val uuid: UUID? = null,
    val aktorId: String? = null,
    val startDato: ZonedDateTime? = null,
    val sluttDato: ZonedDateTime? = null,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var uuid: UUID? = null
        private var aktorId: String? = null
        private var startDato: ZonedDateTime? = null
        private var sluttDato: ZonedDateTime? = null

        fun uuid(uuid: UUID?): Builder = apply { this.uuid = uuid }
        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun startDato(startDato: ZonedDateTime?): Builder = apply { this.startDato = startDato }
        fun sluttDato(sluttDato: ZonedDateTime?): Builder = apply { this.sluttDato = sluttDato }

        fun build(): SisteOppfolgingsperiodeV1 = SisteOppfolgingsperiodeV1(uuid, aktorId, startDato, sluttDato)
    }
}

