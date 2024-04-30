package com.benzo.esrn15.DOMAIN.model

import com.benzo.esrn15.R

sealed class AgrupamientosInfo (val nombre:Int, val turno:Int){
    object primeroPrimeraTM:AgrupamientosInfo(R.string.primeroPrimera, R.string.turnoMañana)
    object primeroSegundaTM:AgrupamientosInfo(R.string.primeroSegunda, R.string.turnoMañana)
    object primeroTerceraTM:AgrupamientosInfo(R.string.primeroTercera, R.string.turnoMañana)
    object SegundoPrimeraTM:AgrupamientosInfo(R.string.segundoPrimera, R.string.turnoMañana)
    object SegundoSegundaTM:AgrupamientosInfo(R.string.segundoSegunda, R.string.turnoMañana)
    object SegundoTerceraTM:AgrupamientosInfo(R.string.segundoTercera, R.string.turnoMañana)
    object terceroPrimeraTM:AgrupamientosInfo(R.string.terceroPrimera, R.string.turnoMañana)
    object terceroSegundaTM:AgrupamientosInfo(R.string.terceroSegunda, R.string.turnoMañana)
    object terceroTerceraTM:AgrupamientosInfo(R.string.terceroTercera, R.string.turnoMañana)
}