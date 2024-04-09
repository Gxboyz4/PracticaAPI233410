package com.example.practicaapi233410.data.model


data class Products(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)
