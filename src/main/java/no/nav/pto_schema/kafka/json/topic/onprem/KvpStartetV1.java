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
public class KvpStartetV1 {
    String aktorId;
    String enhetId;
    String opprettetAv;
    ZonedDateTime opprettetDato;
    String opprettetBegrunnelse;
}
