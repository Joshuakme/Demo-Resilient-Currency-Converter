package com.joshuakme.resilientcurrencyconverter.converter.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currency_rates")
data class CurrencyEntity(
    @PrimaryKey val code: String,
    val rate: Double,
    val timestamp: Long
)