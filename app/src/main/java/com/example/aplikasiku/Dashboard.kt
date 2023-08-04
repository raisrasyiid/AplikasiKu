package com.example.aplikasiku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView

class Dashboard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val akun: CardView = findViewById(R.id.card_akun)
        val kategori: CardView = findViewById(R.id.card_kategori)
        val produk: CardView = findViewById(R.id.card_produk)
        val logout: CardView = findViewById(R.id.card_logout)

        akun.setOnClickListener {
            val pindah: Intent = Intent(this,Akun::class.java)
            startActivity(pindah)
        }
        kategori.setOnClickListener {
            val pindah: Intent = Intent(this,Kategori::class.java)
            startActivity(pindah)
        }
        produk.setOnClickListener {
            val pindah: Intent = Intent(this,ProdukAll::class.java)
            startActivity(pindah)
        }
        logout.setOnClickListener {
            val pindah: Intent = Intent(this,Login::class.java)
            startActivity(pindah)
        }
    }
}