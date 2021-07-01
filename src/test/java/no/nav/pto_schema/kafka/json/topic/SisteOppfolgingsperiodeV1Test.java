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
                SisteOppfolgingsperiodeV1.builder()
                        .uuid(UUID.randomUUID())
                        .aktorId("123433")
                        .startDato(ZonedDateTime.now())
                        .sluttDato(null)
                        .build()
        );
    }

    @Test
    public void should_throw_when_startDato_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteOppfolgingsperiodeV1.builder()
                        .uuid(UUID.randomUUID())
                        .aktorId("123433")
                        .startDato(null)
                        .sluttDato(null)
                        .build())
        );
    }

    @Test
    public void should_throw_when_aktorId_is_not_numeric() {
        assertThrows(ValidationException.class, () -> validate(
                SisteOppfolgingsperiodeV1.builder()
                        .uuid(UUID.randomUUID())
                        .aktorId("123abc")
                        .startDato(ZonedDateTime.now())
                        .sluttDato(null)
                        .build())
        );
    }

    @Test
    public void should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteOppfolgingsperiodeV1.builder()
                        .uuid(UUID.randomUUID())
                        .aktorId(null)
                        .startDato(ZonedDateTime.now())
                        .sluttDato(null)
                        .build())
        );
    }

    @Test
    public void should_throw_when_uuid_is_null() {
        assertThrows(ValidationException.class, () -> validate(
                SisteOppfolgingsperiodeV1.builder()
                        .uuid(null)
                        .aktorId("1234")
                        .startDato(ZonedDateTime.now())
                        .sluttDato(null)
                        .build())
        );
    }

}
