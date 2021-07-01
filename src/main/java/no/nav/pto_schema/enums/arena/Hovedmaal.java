package no.nav.pto_schema.enums.arena;

public enum Hovedmaal {
    BEHOLDEA("BEHOLDEA"), // Beholde arbeid
    OKEDELT("OKEDELT"),   // Øke deltakelse
    SKAFFEA("SKAFFEA");   // Skaffe arbeid

    private final String kode;

    Hovedmaal(final String kode) {
        this.kode = kode;
    }

    @Override
    public String toString() {
        return kode;
    }
}
