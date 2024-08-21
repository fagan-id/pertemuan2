package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCount.setOnClickListener {
            val hasilAmbilAngka = binding.txtNumber.text
            val angka = hasilAmbilAngka.toString().toInt()
            val angkaTambah = angka+1
            binding.txtNumber.text = angkaTambah.toString()
        }

        binding.btnUncount.setOnClickListener {
            val hasilAmbilAngka = binding.txtNumber.text
            val angka = hasilAmbilAngka.toString().toInt()
            val angkaTambah = angka-1
            binding.txtNumber.text = angkaTambah.toString()
        }

        binding.btnToast.setOnClickListener {
            val text = binding.txtNumber.text.toString()
            Toast.makeText(this, "Text yang muncul adalah $text",Toast.LENGTH_SHORT).show()
        }
    }
}