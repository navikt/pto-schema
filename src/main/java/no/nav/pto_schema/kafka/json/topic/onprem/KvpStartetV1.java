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
public class KvpStartetV1 {
    String aktorId;
    String enhetId;
    String opprettetAv;
    ZonedDateTime opprettetDato;
    String opprettetBegrunnelse;
}
