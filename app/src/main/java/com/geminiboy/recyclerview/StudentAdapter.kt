package com.geminiboy.recyclerview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(var listStudent : ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var nama = view.findViewById<TextView>(R.id.tvNama)
        var umur = view.findViewById<TextView>(R.id.tvUmur)
        var kategori = view.findViewById<TextView>(R.id.tvKategori)
        var img = view.findViewById<ImageView>(R.id.imgNews)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentAdapter.ViewHolder, position: Int) {
        holder.nama.text = listStudent[position].nama
        holder.umur.text = listStudent[position].umur
        holder.kategori.text = listStudent[position].kategori
        holder.img.setImageResource(listStudent[position].img)
    }

    override fun getItemCount(): Int {
        return  listStudent.size
    }
}