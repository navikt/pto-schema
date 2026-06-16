package no.nav.pto_schema.kafka.json.topic

import java.time.ZonedDateTime

data class SisteTilordnetVeilederV1(
    val aktorId: String? = null,
    val veilederId: String? = null,
    val tilordnet: ZonedDateTime? = null,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var veilederId: String? = null
        private var tilordnet: ZonedDateTime? = null

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun veilederId(veilederId: String?): Builder = apply { this.veilederId = veilederId }
        fun tilordnet(tilordnet: ZonedDateTime?): Builder = apply { this.tilordnet = tilordnet }

        fun build(): SisteTilordnetVeilederV1 = SisteTilordnetVeilederV1(aktorId, veilederId, tilordnet)
    }
}

