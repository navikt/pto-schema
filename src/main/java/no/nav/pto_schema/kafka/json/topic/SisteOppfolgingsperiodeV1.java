package no.nav.pto_schema.kafka.json.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.ZonedDateTime;
import java.util.UUID;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class SisteOppfolgingsperiodeV1 {
    UUID uuid;
    String aktorId;
    ZonedDateTime startDato;
    ZonedDateTime sluttDato;
}
