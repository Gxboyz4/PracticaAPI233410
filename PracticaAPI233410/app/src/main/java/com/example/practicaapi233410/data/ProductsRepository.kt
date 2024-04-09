package com.example.practicaapi233410.data

import com.example.practicaapi233410.data.model.Product
import kotlinx.coroutines.flow.Flow

/**
 * @author 233410
 */
interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}