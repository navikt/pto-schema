package no.nav.pto_schema.kafka.json.topic.onprem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class EndringPaManuellStatusV1 {
    private String aktorId;
    private boolean erManuell;
}
