package no.nav.pto_schema.enums.arena;

public enum Rettighetsgruppe {
    AAP("AAP"),     // Arbeidsavklaringspenger:
    ATTF("ATTF"),   // Attføringspenger:
    DAGP("DAGP"),   // Dagpenger:	                        Personer med dagpenger skal tilhøre formidlingsgruppe Arbeidssøker.
    INDS("INDS"),   // Individstønad, basisytelse:
    IYT("IYT"),     // Ingen livsoppholdsytelse i Arena:	Defaultverdi.  Når ingen rettighet.
    VENT("VENT"),   // Ventestønad:
    VLONN("VLONN"); // Ventelønn:	                        Ventelønn

    private final String kode;

    Rettighetsgruppe(final String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return kode;
    }
}
