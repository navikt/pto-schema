package no.nav.pto_schema.kafka.json.topic.onprem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class EndringPaMalV1 {
    String aktorId;
    ZonedDateTime endretTidspunk;
    InnsenderData lagtInnAv;
    String veilederIdent;

    public enum InnsenderData {
        BRUKER,
        NAV
    }
}
