package com.rifqipadisiliwangi.chapter_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_bmi.*
import kotlinx.android.synthetic.main.activity_bmi.view.*

class BmiActivity : AppCompatActivity() {

    lateinit var etumur:EditText
    lateinit var ettinggibadan:EditText
    lateinit var etberatbadan:EditText
    lateinit var btnkuyhitung:Button
    lateinit var btnkuyreset:Button
    lateinit var tvumuranda:TextView
    lateinit var tvtinggianda:TextView
    lateinit var tvberatanda:TextView
    lateinit var tvbmianda:TextView
    lateinit var tvkategorianda:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        etumur = findViewById<EditText>(R.id.et_umur)
        ettinggibadan = findViewById<EditText>(R.id.et_tinggi_badan)
        etberatbadan = findViewById<EditText>(R.id.et_berat_badan)
        btnkuyhitung = findViewById<Button>(R.id.btn_kuy_hitung)
        btnkuyreset = findViewById<Button>(R.id.btn_reset)
        tvumuranda = findViewById<TextView>(R.id.tv_umur_anda)
        tvtinggianda = findViewById<TextView>(R.id.tv_tinggi_anda)
        tvberatanda = findViewById<TextView>(R.id.tv_berat_anda)
        tvbmianda = findViewById<TextView>(R.id.tv_bmi_anda)
        tvkategorianda = findViewById<TextView>(R.id.tv_kategori_anda)

        btnkuyhitung.setOnClickListener {
            etumur.tv_umur
            etumur.tv_tinggi_anda
            etberatbadan.tv_berat_anda
        }

        btnkuyhitung.setOnClickListener {
            kriteriaUmur()
        }
        btnkuyreset.setOnClickListener {
            resetKuy()
        }
    }

    fun resetKuy(){
        tvumuranda.setText("")
        tvtinggianda.setText("")
        tvberatanda.setText("")
        tvbmianda.setText("")
        tvkategorianda.setText("")
    }

    fun  kriteriaUmur(){

        val bb = etberatbadan.text.toString()
        val umurUser = etumur.text.toString()
        val tb = ettinggibadan.text.toString()

            var masukinUmur = etumur.text.toString().toInt()
            if (masukinUmur > 16){
                tvkategorianda.text= "Terlalu kurus"
            }else if (masukinUmur in 16..17){
                tvkategorianda.text = "Cukup kurus"
            }else if (masukinUmur.toDouble() in 17.1..18.5){
                tvbmianda.text="Sedikit kurus"
            }else if (masukinUmur.toDouble() in 18.5..25.1){
                tvkategorianda.text = "Normal"
            }else if (masukinUmur.toDouble() in 25.1..30.1){
                tvkategorianda.text = "Gemuk"
            }else if (masukinUmur.toDouble() in 30.1..35.1){
                tvkategorianda.text = "Obesitas kelas 1"
            }else if (masukinUmur.toDouble() in 35.1..40.1){
                tvkategorianda.text = "Obesitas kelas 2"
            }else {
                tvkategorianda.text= "Obesitas kelas 3"
            }
    }
}