package no.nav.pto_schema.kafka.json.topic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SisteOppfolgingsperiodeV1 {
    UUID uuid;
    String aktorId;
    ZonedDateTime startDato;
    ZonedDateTime sluttDato;
}
