package no.nav.pto_schema.kafka.json.topic.onprem;

import lombok.*;
import no.nav.pto_schema.enums.arena.*;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class EndringPaaOppfoelgingsBrukerV2 {
    @NonNull
    String fodselsnummer;
    Formidlingsgruppe formidlingsgruppe;
    LocalDate iservFraDato;
    String fornavn;
    String etternavn;
    String oppfolgingsenhet;
    Kvalifiseringsgruppe kvalifiseringsgruppe;
    Rettighetsgruppe rettighetsgruppe;
    Hovedmaal hovedmaal;
    SikkerhetstiltakType sikkerhetstiltakType;
    String diskresjonskode; // Kan være: "0", "4", "5", "6", "7", "19"
    Boolean harOppfolgingssak;
    Boolean sperretAnsatt;
    Boolean erDoed;
    LocalDate doedFraDato;
    ZonedDateTime sistEndretDato;
}
