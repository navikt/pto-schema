package no.nav.pto_schema.kafka.json.topic.onprem

import no.nav.pto_schema.enums.arena.Formidlingsgruppe
import no.nav.pto_schema.enums.arena.Hovedmaal
import no.nav.pto_schema.enums.arena.Kvalifiseringsgruppe
import no.nav.pto_schema.enums.arena.Rettighetsgruppe
import no.nav.pto_schema.enums.arena.SikkerhetstiltakType
import java.time.LocalDate
import java.time.ZonedDateTime

data class EndringPaaOppfoelgingsBrukerV2(
    val fodselsnummer: String,
    val formidlingsgruppe: Formidlingsgruppe? = null,
    val iservFraDato: LocalDate? = null,
    val fornavn: String? = null,
    val etternavn: String? = null,
    val oppfolgingsenhet: String? = null,
    val kvalifiseringsgruppe: Kvalifiseringsgruppe? = null,
    val rettighetsgruppe: Rettighetsgruppe? = null,
    val hovedmaal: Hovedmaal? = null,
    val sikkerhetstiltakType: SikkerhetstiltakType? = null,
    val diskresjonskode: String? = null, // Kan være: "0", "4", "5", "6", "7", "19"
    val harOppfolgingssak: Boolean? = null,
    val sperretAnsatt: Boolean? = null,
    val erDoed: Boolean? = null,
    val doedFraDato: LocalDate? = null,
    val sistEndretDato: ZonedDateTime? = null,
)

