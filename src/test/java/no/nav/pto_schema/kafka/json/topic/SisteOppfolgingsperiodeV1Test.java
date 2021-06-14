package no.nav.pto_schema.kafka.json.topic;

import org.everit.json.schema.ValidationException;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.UUID;

import static no.nav.pto_schema.utils.ValidationUtils.validate;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SisteOppfolgingsperiodeV1Test {

    @Test
    public void should_not_throw_when_valid_json() {
        validate(
                new SisteOppfolgingsperiodeV1()
                        .setUuid(UUID.randomUUID())
                        .setAktorId("123433")
                        .setStartDato(ZonedDateTime.now())
                        .setSluttDato(null)
        );
    }

    @Test
    public void should_throw_when_startDato_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteOppfolgingsperiodeV1()
                        .setUuid(UUID.randomUUID())
                        .setAktorId("123433")
                        .setStartDato(null)
                        .setSluttDato(null))
        );
    }

    @Test
    public void should_throw_when_aktorId_is_not_numeric() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteOppfolgingsperiodeV1()
                        .setUuid(UUID.randomUUID())
                        .setAktorId("123abc")
                        .setStartDato(ZonedDateTime.now())
                        .setSluttDato(null))
        );
    }

    @Test
    public void should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteOppfolgingsperiodeV1()
                        .setUuid(UUID.randomUUID())
                        .setAktorId(null)
                        .setStartDato(ZonedDateTime.now())
                        .setSluttDato(null))
        );
    }

    @Test
    public void should_throw_when_uuid_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                new SisteOppfolgingsperiodeV1()
                        .setUuid(null)
                        .setAktorId("1234")
                        .setStartDato(ZonedDateTime.now())
                        .setSluttDato(null))
        );
    }

}
