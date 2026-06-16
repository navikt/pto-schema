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
) {
    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {
        private var fodselsnummer: String? = null
        private var formidlingsgruppe: Formidlingsgruppe? = null
        private var iservFraDato: LocalDate? = null
        private var fornavn: String? = null
        private var etternavn: String? = null
        private var oppfolgingsenhet: String? = null
        private var kvalifiseringsgruppe: Kvalifiseringsgruppe? = null
        private var rettighetsgruppe: Rettighetsgruppe? = null
        private var hovedmaal: Hovedmaal? = null
        private var sikkerhetstiltakType: SikkerhetstiltakType? = null
        private var diskresjonskode: String? = null
        private var harOppfolgingssak: Boolean? = null
        private var sperretAnsatt: Boolean? = null
        private var erDoed: Boolean? = null
        private var doedFraDato: LocalDate? = null
        private var sistEndretDato: ZonedDateTime? = null

        fun fodselsnummer(fodselsnummer: String?): Builder = apply { this.fodselsnummer = fodselsnummer }
        fun formidlingsgruppe(formidlingsgruppe: Formidlingsgruppe?): Builder = apply { this.formidlingsgruppe = formidlingsgruppe }
        fun iservFraDato(iservFraDato: LocalDate?): Builder = apply { this.iservFraDato = iservFraDato }
        fun fornavn(fornavn: String?): Builder = apply { this.fornavn = fornavn }
        fun etternavn(etternavn: String?): Builder = apply { this.etternavn = etternavn }
        fun oppfolgingsenhet(oppfolgingsenhet: String?): Builder = apply { this.oppfolgingsenhet = oppfolgingsenhet }
        fun kvalifiseringsgruppe(kvalifiseringsgruppe: Kvalifiseringsgruppe?): Builder = apply { this.kvalifiseringsgruppe = kvalifiseringsgruppe }
        fun rettighetsgruppe(rettighetsgruppe: Rettighetsgruppe?): Builder = apply { this.rettighetsgruppe = rettighetsgruppe }
        fun hovedmaal(hovedmaal: Hovedmaal?): Builder = apply { this.hovedmaal = hovedmaal }
        fun sikkerhetstiltakType(sikkerhetstiltakType: SikkerhetstiltakType?): Builder = apply { this.sikkerhetstiltakType = sikkerhetstiltakType }
        fun diskresjonskode(diskresjonskode: String?): Builder = apply { this.diskresjonskode = diskresjonskode }
        fun harOppfolgingssak(harOppfolgingssak: Boolean?): Builder = apply { this.harOppfolgingssak = harOppfolgingssak }
        fun sperretAnsatt(sperretAnsatt: Boolean?): Builder = apply { this.sperretAnsatt = sperretAnsatt }
        fun erDoed(erDoed: Boolean?): Builder = apply { this.erDoed = erDoed }
        fun doedFraDato(doedFraDato: LocalDate?): Builder = apply { this.doedFraDato = doedFraDato }
        fun sistEndretDato(sistEndretDato: ZonedDateTime?): Builder = apply { this.sistEndretDato = sistEndretDato }

        fun build(): EndringPaaOppfoelgingsBrukerV2 = EndringPaaOppfoelgingsBrukerV2(
            fodselsnummer = fodselsnummer!!,
            formidlingsgruppe = formidlingsgruppe,
            iservFraDato = iservFraDato,
            fornavn = fornavn,
            etternavn = etternavn,
            oppfolgingsenhet = oppfolgingsenhet,
            kvalifiseringsgruppe = kvalifiseringsgruppe,
            rettighetsgruppe = rettighetsgruppe,
            hovedmaal = hovedmaal,
            sikkerhetstiltakType = sikkerhetstiltakType,
            diskresjonskode = diskresjonskode,
            harOppfolgingssak = harOppfolgingssak,
            sperretAnsatt = sperretAnsatt,
            erDoed = erDoed,
            doedFraDato = doedFraDato,
            sistEndretDato = sistEndretDato,
        )
    }
}

