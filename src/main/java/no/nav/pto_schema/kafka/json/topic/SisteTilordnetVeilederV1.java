package no.nav.pto_schema.kafka.json.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class SisteTilordnetVeilederV1 {
    String aktorId;
    String veilederId;
    ZonedDateTime tilordnetTidspunkt;
}

