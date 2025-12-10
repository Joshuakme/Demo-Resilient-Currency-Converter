package com.joshuakme.resilientcurrencyconverter.converter.domain.model

data class CurrencyRate(
    val code: String,  // e.g., "USD"
    val rate: Double,  // e.g., 0.23
    val lastUpdated: Long // Timestamp to show user how "fresh" the data is
)