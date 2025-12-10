package com.joshuakme.resilientcurrencyconverter.converter.data.remote

import retrofit2.http.GET

interface CurrencyApi {
    @GET("v6/YOUR_API_KEY_HERE/latest/MYR")
    suspend fun getRates(): CurrencyResponseDto
}