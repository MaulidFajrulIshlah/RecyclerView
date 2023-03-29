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
            ListStudent("Politik", "19-Juni-2022", "Politik", R.drawable.img),

        )

        val adapterStudent = StudentAdapter(lisStudentData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
    }
}