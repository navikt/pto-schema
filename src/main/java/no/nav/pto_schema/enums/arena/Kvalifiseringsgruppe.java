package no.nav.pto_schema.enums.arena;

public enum Kvalifiseringsgruppe {
    BATT("BATT"),   // Spesielt tilpasset innsats:	                Personen har nedsatt arbeidsevne og har et identifisert behov for kvalifisering og/eller tilrettelegging.  Aktivitetsplan skal utformes.
    BFORM("BFORM"), // Situasjonsbestemt innsats:	                    Personen har moderat bistandsbehov
    BKART("BKART"), // Behov for arbeidsevnevurdering:	            Personen har behov for arbeidsevnevurdering
    IKVAL("IKVAL"), // Standardinnsats:	                            Personen har behov for ordinær bistand
    IVURD("IVURD"), // Ikke vurdert:	                                Ikke vurdert
    KAP11("KAP11"), // Rettigheter etter Ftrl. Kapittel 11:	        Rettigheter etter Ftrl. Kapittel 11
    OPPFI("OPPFI"), // Helserelatert arbeidsrettet oppfølging i NAV:	Helserelatert arbeidsrettet oppfølging i NAV
    VARIG("VARIG"), // Varig tilpasset innsats:	                    Personen har varig nedsatt arbeidsevne
    VURDI("VURDI"), // Sykmeldt, oppfølging på arbeidsplassen:	    Sykmeldt, oppfølging på arbeidsplassen
    VURDU("VURDU"); // Sykmeldt uten arbeidsgiver:	                Sykmeldt uten arbeidsgiver

    private final String kode;

    Kvalifiseringsgruppe(final String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return kode;
    }
}
