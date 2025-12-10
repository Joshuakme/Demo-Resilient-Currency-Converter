package com.joshuakme.resilientcurrencyconverter.converter.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyResponseDto(
    @SerialName("result") val result: String,
    @SerialName("conversion_rates") val conversionRates: Map<String, Double>
)