package com.klapertart.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klapertart.myapplication.data.entities.Product
import com.klapertart.myapplication.data.entities.User
import com.klapertart.myapplication.data.AppDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = AppDatabase.getInstance(baseContext)

        db.userDao().deleteAll()
        db.productDao().deleteAll()

        val user1 = User(
            1,
            "Abdillah",
            "Hamka"
        )
        db.userDao().insertAll(user1)

        val user2 = User(
            2,
            "Abdillah",
            "Hamzah"
        )
        db.userDao().insertAll(user2)

        val product = Product(
            1,
            "TShirt",
            5,
            15000.0
        )
        db.productDao().insertAll(product)


        println("USER : " + db.userDao().getAll())
        println("PRODUCT : " + db.productDao().getAll())
    }
}
