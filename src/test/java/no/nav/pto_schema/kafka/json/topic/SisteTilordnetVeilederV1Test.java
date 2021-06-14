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
                new SisteTilordnetVeilederV1()
                        .setAktorId("123433")
                        .setVeilederId("Z1234")
                        .setTilordnet(ZonedDateTime.now())
        );
    }

    @Test
    public void should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteTilordnetVeilederV1()
                        .setAktorId(null)
                        .setVeilederId("Z1234")
                        .setTilordnet(ZonedDateTime.now())
        ));
    }

    @Test
    public void should_throw_when_veilederId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteTilordnetVeilederV1()
                        .setAktorId("123456")
                        .setVeilederId(null)
                        .setTilordnet(ZonedDateTime.now())
        ));
    }

    @Test
    public void should_throw_when_tilordnet_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteTilordnetVeilederV1()
                        .setAktorId("123456")
                        .setVeilederId("Z1234")
                        .setTilordnet(null)
        ));
    }

}
