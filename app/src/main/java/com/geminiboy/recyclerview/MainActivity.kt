package com.geminiboy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.geminiboy.recyclerview.databinding.ActivityMainBinding
import java.util.logging.LogManager

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lisStudentData = arrayListOf(
            ListStudent("Titik Kumpul Tawuran", "Kamis, 30 Mar 2023 01:03 WIB", "News", R.drawable.img1),
            ListStudent("Polisi Bekuk 5 Pelaku Curanmor ", "Kamis, 30 Mar 2023 00:32 WIB", "News", R.drawable.img2),
            ListStudent("Debat Panas soal Anggota DPR ", "Rabu, 29 Mar 2023 23:10 WIB", "Politik", R.drawable.img3),
            ListStudent("Harga naik", "Rabu, 22 Mar 2023 10:00 WIB", "News", R.drawable.img4),
            ListStudent("Update Rencana Mercedes-Benz", "29/03/2023, 16:21 WIB", "Otomotif", R.drawable.img5),
            ListStudent("Update Ranking BWF", "29/03/2023, 08:30 WIB", "Olahraga", R.drawable.img6),
            ListStudent("Update Kasus Penganiayaan", "28/03/2023, 20:12 WIB", "News", R.drawable.img7),
            ListStudent("Apple Rilis iOS 16.4 untuk iPhone", "28/03/2023, 11:00 WIB", "Teknologi", R.drawable.img8),
            ListStudent("Update Mudik Gratis Kemenhub", "25/03/2023, 17:46 WIB", "News", R.drawable.img9),
            ListStudent("Update Penerima Subsidi Motor Listrik", "21/03/2023, 07:02 WIB", "Otomotif", R.drawable.img10),

        )

        val adapterStudent = StudentAdapter(lisStudentData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
    }
}