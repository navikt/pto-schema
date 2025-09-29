package no.nav.pto_schema.kafka.json.topic;

import org.everit.json.schema.ValidationException;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static no.nav.pto_schema.utils.ValidationUtils.validate;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SisteTilordnetVeilederV1Test {

    @Test
    public void should_not_throw_when_valid_json() {
        validate(
                SisteTilordnetVeilederV1.builder()
                        .aktorId("123433")
                        .veilederId("Z1234")
                        .tilordnetTidspunkt(ZonedDateTime.now())
                        .build()
        );
    }

    @Test
    public void should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteTilordnetVeilederV1.builder()
                        .aktorId(null)
                        .veilederId("Z1234")
                        .tilordnetTidspunkt(ZonedDateTime.now())
                        .build()
        ));
    }

    @Test
    public void should_throw_when_veilederId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteTilordnetVeilederV1.builder()
                        .aktorId("123456")
                        .veilederId(null)
                        .tilordnetTidspunkt(ZonedDateTime.now())
                        .build()
        ));
    }

    @Test
    public void should_throw_when_tilordnet_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteTilordnetVeilederV1.builder()
                        .aktorId("123456")
                        .veilederId("Z1234")
                        .tilordnetTidspunkt(null)
                        .build()
        ));
    }

}
