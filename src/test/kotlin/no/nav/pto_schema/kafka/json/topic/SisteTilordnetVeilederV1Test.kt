package no.nav.pto_schema.kafka.json.topic

import no.nav.pto_schema.utils.ValidationUtils.validate
import org.everit.json.schema.ValidationException
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import java.time.ZonedDateTime

class SisteTilordnetVeilederV1Test {

    @Test
    fun should_not_throw_when_valid_json() {
        validate(
            SisteTilordnetVeilederV1(
                aktorId = "123433",
                veilederId = "Z1234",
                tilordnet = ZonedDateTime.now(),
            )
        )
    }

    @Test
    fun should_throw_when_aktorId_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteTilordnetVeilederV1(
                    aktorId = null,
                    veilederId = "Z1234",
                    tilordnet = ZonedDateTime.now(),
                )
            )
        }
    }

    @Test
    fun should_throw_when_veilederId_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteTilordnetVeilederV1(
                    aktorId = "123456",
                    veilederId = null,
                    tilordnet = ZonedDateTime.now(),
                )
            )
        }
    }

    @Test
    fun should_throw_when_tilordnet_is_null() {
        assertThrows(ValidationException::class.java) {
            validate(
                SisteTilordnetVeilederV1(
                    aktorId = "123456",
                    veilederId = "Z1234",
                    tilordnet = null,
                )
            )
        }
    }
}

