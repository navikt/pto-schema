package no.nav.pto_schema.kafka.json.topic.onprem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class EndringPaaOppfoelgingsBrukerV1 {
    String aktoerid;
    String fodselsnr;
    String formidlingsgruppekode;
    ZonedDateTime iserv_fra_dato;
    String etternavn;
    String fornavn;
    String nav_kontor;
    String kvalifiseringsgruppekode;
    String rettighetsgruppekode;
    String hovedmaalkode;
    String sikkerhetstiltak_type_kode;
    String fr_kode;
    Boolean har_oppfolgingssak;
    Boolean sperret_ansatt;
    Boolean er_doed;
    ZonedDateTime doed_fra_dato;
    ZonedDateTime endret_dato;
}
