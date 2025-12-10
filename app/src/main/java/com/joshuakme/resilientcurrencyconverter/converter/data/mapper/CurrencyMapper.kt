package com.joshuakme.resilientcurrencyconverter.converter.data.mapper

import com.joshuakme.resilientcurrencyconverter.converter.data.local.CurrencyEntity
import com.joshuakme.resilientcurrencyconverter.converter.data.remote.CurrencyResponseDto
import com.joshuakme.resilientcurrencyconverter.converter.domain.model.CurrencyRate

// Network -> Entity (Save to DB)
fun CurrencyResponseDto.toEntity(): List<CurrencyEntity> {
    val currentTime = System.currentTimeMillis()
    return this.conversionRates.map { (code, rate) ->
        CurrencyEntity(
            code = code,
            rate = rate,
            timestamp = currentTime
        )
    }
}

// Entity -> Domain (Show in UI)
fun CurrencyEntity.toDomain(): CurrencyRate {
    return CurrencyRate(
        code = code,
        rate = rate,
        lastUpdated = timestamp
    )
}