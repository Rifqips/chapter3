package com.rifqipadisiliwangi.chapter_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class HomeActivity : AppCompatActivity() {

    lateinit var et_angka_satu:EditText
    lateinit var et_angka_dua:EditText
    lateinit var btn_simpan:Button
    lateinit var tv_hasil_ini:TextView
    lateinit var btn_reset:Button
    lateinit var alert:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        et_angka_satu.findViewById<EditText>(R.id.et_angka_satu)
        et_angka_dua.findViewById<EditText>(R.id.et_masukNama)
        btn_simpan.findViewById<Button>(R.id.btn_simpan)
        tv_hasil_ini.findViewById<TextView>(R.id.tv_hasil_ini)
        alert.findViewById<TextView>(R.id.alert)

        btn_reset.findViewById<Button>(R.id.btn_reset)

        btn_simpan.setOnClickListener {
            var input = et_angka_satu.text.toString().toInt()
            var inputDua = et_angka_dua.toString().toInt()
            var jumlah = input + inputDua
            tv_hasil_ini.text = jumlah.toString()
            if (jumlah > 100){
                alert.text="Nilai lebih dari seratus"
            }else{
                alert.text="Nilai kurang lebih dari seratus"
            }
        }

        btn_reset.setOnClickListener {
            resetData()
        }
    }


    fun resetData(){
        et_angka_satu.setText("")
        et_angka_dua.setText("")

    }
}