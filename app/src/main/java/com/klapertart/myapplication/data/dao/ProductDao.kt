package com.klapertart.myapplication.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.klapertart.myapplication.data.entities.Product

@Dao
interface ProductDao{
    @Query("select * from product")
    fun getAll() : List<Product>

    @Insert
    fun insertAll(vararg products: Product)

    @Delete
    fun delete(product: Product)

    @Query("delete from product")
    fun deleteAll()
}