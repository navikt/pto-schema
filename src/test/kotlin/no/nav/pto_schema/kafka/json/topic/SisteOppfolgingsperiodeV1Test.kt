package no.nav.pto_schema.kafka.json.topic

import no.nav.pto_schema.utils.ValidationUtils.validate
import org.everit.json.schema.ValidationException
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.time.ZonedDateTime
import java.util.UUID

class SisteOppfolgingsperiodeV1Test {

    @Test
    fun should_not_throw_when_valid_json() {
        validate(
            SisteOppfolgingsperiodeV1(
                uuid = UUID.randomUUID(),
                aktorId = "123433",
                startDato = ZonedDateTime.now(),
                sluttDato = null,
            )
        )
    }

    @Test
    fun should_throw_when_startDato_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteOppfolgingsperiodeV1(
                    uuid = UUID.randomUUID(),
                    aktorId = "123433",
                    startDato = null,
                    sluttDato = null,
                )
            )
        }
    }

    @Test
    fun should_throw_when_aktorId_is_not_numeric() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteOppfolgingsperiodeV1(
                    uuid = UUID.randomUUID(),
                    aktorId = "123abc",
                    startDato = ZonedDateTime.now(),
                    sluttDato = null,
                )
            )
        }
    }

    @Test
    fun should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteOppfolgingsperiodeV1(
                    uuid = UUID.randomUUID(),
                    aktorId = null,
                    startDato = ZonedDateTime.now(),
                    sluttDato = null,
                )
            )
        }
    }

    @Test
    fun should_throw_when_uuid_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteOppfolgingsperiodeV1(
                    uuid = null,
                    aktorId = "1234",
                    startDato = ZonedDateTime.now(),
                    sluttDato = null,
                )
            )
        }
    }
}

