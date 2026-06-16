package no.nav.pto_schema.kafka.json.topic.onprem

data class EndringPaManuellStatusV1(
    val aktorId: String,
    val erManuell: Boolean,
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var aktorId: String? = null
        private var erManuell: Boolean = false

        fun aktorId(aktorId: String?): Builder = apply { this.aktorId = aktorId }
        fun erManuell(erManuell: Boolean): Builder = apply { this.erManuell = erManuell }

        fun build(): EndringPaManuellStatusV1 = EndringPaManuellStatusV1(aktorId!!, erManuell)
    }
}

