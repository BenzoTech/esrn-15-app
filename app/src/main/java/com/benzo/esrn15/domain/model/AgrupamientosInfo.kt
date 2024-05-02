package com.benzo.esrn15.domain.model

import com.benzo.esrn15.R

sealed class AgrupamientosInfo (val nombre:Int, val turno:Int){
    object PrimeroPrimeraTM:AgrupamientosInfo(R.string.primeroPrimera, R.string.turnoMañana)
    object PrimeroSegundaTM:AgrupamientosInfo(R.string.primeroSegunda, R.string.turnoMañana)
    object PrimeroTerceraTM:AgrupamientosInfo(R.string.primeroTercera, R.string.turnoMañana)

}