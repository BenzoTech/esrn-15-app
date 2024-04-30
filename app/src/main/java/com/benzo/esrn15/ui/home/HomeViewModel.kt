package com.benzo.esrn15.ui.home

import androidx.lifecycle.ViewModel
import com.benzo.esrn15.DOMAIN.model.AgrupamientosInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel

class HomeViewModel @Inject constructor() : ViewModel() {

    private var _home = MutableStateFlow<List<AgrupamientosInfo>>(emptyList())
    val home: StateFlow<List<AgrupamientosInfo>> = _home

    init {
        _home.value = listOf(
            AgrupamientosInfo.primeroPrimeraTM,
            AgrupamientosInfo.primeroSegundaTM,
            AgrupamientosInfo.primeroTerceraTM
        )
    }

    fun getAgrupamientos() {
        listOf(
            AgrupamientosInfo.primeroPrimeraTM,
            AgrupamientosInfo.primeroSegundaTM,
            AgrupamientosInfo.primeroTerceraTM
        )
    }
}