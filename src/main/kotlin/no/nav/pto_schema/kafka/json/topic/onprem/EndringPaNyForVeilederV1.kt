package no.nav.pto_schema.kafka.json.topic.onprem

data class EndringPaNyForVeilederV1(
    val aktorId: String,
    val nyForVeileder: Boolean,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var nyForVeileder: Boolean = false

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun nyForVeileder(nyForVeileder: Boolean): Builder = apply { this.nyForVeileder = nyForVeileder }

        fun build(): EndringPaNyForVeilederV1 = EndringPaNyForVeilederV1(aktorId!!, nyForVeileder)
    }
}

