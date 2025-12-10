package com.joshuakme.resilientcurrencyconverter.converter.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CurrencyDao {
    @Query("SELECT * FROM currency_rates")
    suspend fun getAllRates(): List<CurrencyEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRates(rates: List<CurrencyEntity>)

    @Query("DELETE FROM currency_rates")
    suspend fun clearAll()

    // Transaction to update cache atomically
    @androidx.room.Transaction
    suspend fun clearAndInsert(rates: List<CurrencyEntity>) {
        clearAll()
        insertRates(rates)
    }
}