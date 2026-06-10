package no.nav.pto_schema.enums.arena

enum class Formidlingsgruppe(private val kode: String) {
    ARBS("ARBS"),   // Arbeidssøker:	                Person er tilgjengelig for alt søk etter   arbeidskraft, ordinær og vikar
    IARBS("IARBS"), // Ikke arbeidssøker:	            Person er ikke tilgjengelig for søk etter arbeidskraft
    IJOBS("IJOBS"), // Inaktivert jobbskifter:	    Jobbskifter som er inaktivert fra nav.no
    ISERV("ISERV"), // Ikke servicebehov:	            Inaktivering, person mottar ikke bistand fra NAV
    JOBBS("JOBBS"), // Fra nav.no:	                Personen er ikke tilgjengelig for søk
    PARBS("PARBS"), // Pre arbeidssøker:	            Personen fra nav.no som ønsker å bli arbeidssøker, men som enda ikke er   verifisert
    RARBS("RARBS"); // Pre reaktivert arbeidssøker:	Person som er reaktivert fra nav.no

    override fun toString(): String = kode
}

