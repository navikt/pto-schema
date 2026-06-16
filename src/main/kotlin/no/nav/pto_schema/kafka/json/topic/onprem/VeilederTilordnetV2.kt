package no.nav.pto_schema.kafka.json.topic.onprem

import java.time.ZonedDateTime

data class VeilederTilordnetV2(
    val aktorId: String,
    val veilederId: String? = null,
    val tilordnetTidspunkt: ZonedDateTime? = null,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var veilederId: String? = null
        private var tilordnetTidspunkt: ZonedDateTime? = null

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun veilederId(veilederId: String?): Builder = apply { this.veilederId = veilederId }
        fun tilordnetTidspunkt(tilordnetTidspunkt: ZonedDateTime?): Builder = apply { this.tilordnetTidspunkt = tilordnetTidspunkt }

        fun build(): VeilederTilordnetV2 = VeilederTilordnetV2(aktorId!!, veilederId, tilordnetTidspunkt)
    }
}

