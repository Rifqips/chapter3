package com.rifqipadisiliwangi.chapter_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var btn_main_tiga:Button
    lateinit var tv_hasil_dua:TextView
    lateinit var et_masukNama:EditText
    lateinit var btn_simpan:Button
    lateinit var btn_pindah:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_main = findViewById<Button>(R.id.btn_main) as Button
        var textHasil =findViewById<TextView>(R.id.tv_hasil) as TextView
        var button_dua = findViewById<Button>(R.id.btn_main_dua) as Button
        var tvHasilDua = findViewById<TextView>(R.id.btn_main)


        btn_main_tiga = findViewById<Button>(R.id.btn_main_tiga)
        tvHasilDua = findViewById<TextView>(R.id.tv_hasil_dua)
        et_masukNama = findViewById<EditText>(R.id.et_masukNama)
        btn_simpan =  findViewById<Button>(R.id.btn_simpan)
        btn_pindah = findViewById<Button>(R.id.btn_pindah)

        button_main.setOnClickListener{
            textHasil.text = "Hallo gaes"
        }

        button_dua.setOnClickListener {
            textHasil.text ="Cie ngeklik"
        }

        btn_main_tiga.setOnClickListener {
            textHasil.text = "Hiyaa"
        }

        setOnClick()
        saveNama()
        pindahkuy()

    }


    fun setOnClick(){
        tv_hasil_dua = findViewById(R.id.tv_hasil_dua)
        btn_main_tiga.setOnClickListener {
            tv_hasil_dua.text = "Coba di on create"
        }
    }

    fun saveNama(){
        et_masukNama = findViewById(R.id.et_masukNama)
        btn_simpan = findViewById(R.id.btn_main)

        btn_simpan.setOnClickListener {
            var nama = et_masukNama.text.toString()
            tv_hasil_dua.text = nama
        }
    }

    fun pindahkuy(){
        btn_pindah = findViewById(R.id.btn_pindah)
//        Belajar intent
        btn_pindah.setOnClickListener {
            var yukLah = Intent(this, HomeActivity::class.java)
            startActivity(yukLah)
        }
    }

}