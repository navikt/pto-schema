package no.nav.pto_schema.enums.arena;

public enum SikkerhetstiltakType {
    FTUS("FTUS"), // Fysisk/telefonisk utestengelse
    FYUS("FYUS"), // Fysisk utestengelse
    TOAN("TOAN"), // To ansatte i samtale
    TFUS("TFUS"); // ?

    private final String kode;

    SikkerhetstiltakType(final String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return kode;
    }
}
