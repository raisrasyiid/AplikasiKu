package com.example.aplikasiku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable

class Produk_all_item(val halaman:ProdukAll, val nama:List<String>, val foto:List<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return nama.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(halaman).inflate(R.layout.produk_all_item,parent,false)
        val txt_nama:TextView = view.findViewById(R.id.text_nama)
        val img_foto:ImageView = view.findViewById(R.id.img_foto)

        txt_nama.text = nama.get(position)
        img_foto.setImageResource(foto.get(position))
        return view
    }
}