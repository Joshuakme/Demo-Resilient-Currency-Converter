package com.joshuakme.resilientcurrencyconverter.converter.domain.repository

import com.joshuakme.resilientcurrencyconverter.converter.common.Resource
import com.joshuakme.resilientcurrencyconverter.converter.domain.model.CurrencyRate
import kotlinx.coroutines.flow.Flow

interface CurrencyRepository {
    // We return a Flow because the data might update (Loading -> Cache -> Network)
    fun getRates(forceRefresh: Boolean): Flow<Resource<List<CurrencyRate>>>
}