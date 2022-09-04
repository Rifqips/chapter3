package com.rifqipadisiliwangi.chapter_3.topik_dua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_serializable.*

class SerializableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serializable)

        serializable()
    }

    fun serializable(){

        var data = intent.getSerializableExtra("datamahasiswa") as DataMahasiswaSet
        txt_jurusan.text =  data.jurusan

    }
}