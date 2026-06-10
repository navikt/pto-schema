package no.nav.pto_schema.enums.arena

enum class SikkerhetstiltakType(private val kode: String) {
    FTUS("FTUS"), // Fysisk/telefonisk utestengelse
    FYUS("FYUS"), // Fysisk utestengelse
    TOAN("TOAN"), // To ansatte i samtale
    TFUS("TFUS"); // ?

    override fun toString(): String = kode
}

