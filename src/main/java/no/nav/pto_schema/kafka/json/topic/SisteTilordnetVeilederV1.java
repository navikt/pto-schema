package no.nav.pto_schema.kafka.json.topic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SisteTilordnetVeilederV1 {
    String aktorId;
    String veilederId;
    ZonedDateTime tilordnet;
}

