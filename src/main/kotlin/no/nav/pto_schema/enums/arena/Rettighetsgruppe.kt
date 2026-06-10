package no.nav.pto_schema.enums.arena

enum class Rettighetsgruppe(private val kode: String) {
    AAP("AAP"),     // Arbeidsavklaringspenger:
    ATTF("ATTF"),   // Attføringspenger:
    DAGP("DAGP"),   // Dagpenger:	                        Personer med dagpenger skal tilhøre formidlingsgruppe Arbeidssøker.
    INDS("INDS"),   // Individstønad, basisytelse:
    IYT("IYT"),     // Ingen livsoppholdsytelse i Arena:	Defaultverdi.  Når ingen rettighet.
    VENT("VENT"),   // Ventestønad:
    VLONN("VLONN"); // Ventelønn:	                        Ventelønn

    override fun toString(): String = kode
}

