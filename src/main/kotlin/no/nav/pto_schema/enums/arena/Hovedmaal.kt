package no.nav.pto_schema.enums.arena

enum class Hovedmaal(private val kode: String) {
    BEHOLDEA("BEHOLDEA"), // Beholde arbeid
    OKEDELT("OKEDELT"),   // Øke deltakelse
    SKAFFEA("SKAFFEA");   // Skaffe arbeid

    override fun toString(): String = kode
}

