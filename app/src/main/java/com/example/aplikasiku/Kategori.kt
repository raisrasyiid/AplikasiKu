package com.example.aplikasiku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity

class Kategori : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kategori)

        //interface kategori
        val kategori:ListView = findViewById(R.id.list_kategori)

        //membuat data kategori
        val namaKategori: List<String> = listOf("hijab", "mukena", "gamis", "aksesoris")

        //membuat adapter yang berisi perulangan data
        val perulanganData:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,namaKategori)

        //pasang perulangan data di interface
        kategori.adapter = perulanganData
    }
}