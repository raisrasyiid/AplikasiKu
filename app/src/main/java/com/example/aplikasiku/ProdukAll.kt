package com.example.aplikasiku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.activity.ComponentActivity

class ProdukAll : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produk_all)

        val nama_produk:List<String> = listOf("alesha 150", "pashmina ayuk", ",mukena sabrina", "zayana voal")
        val foto:List<Int> = listOf(R.drawable.mukena, R.drawable.mukena2, R.drawable.kerudung, R.drawable.kerudung2, R.drawable.pashmina)

        val grid_produk:GridView = findViewById(R.id.grid_produk)
        val perulangan_data = Produk_all_item(this, nama_produk,foto)

        grid_produk.adapter = perulangan_data
    }
}