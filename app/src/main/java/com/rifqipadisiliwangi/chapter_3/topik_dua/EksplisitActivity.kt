package com.rifqipadisiliwangi.chapter_3.topik_dua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_eksplisit.*

class EksplisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksplisit)

        ambilData()
        ambilBundle()

    }

    fun ambilData(){
        var dataSatu  = intent.getStringExtra("angkasatu")
        txt_input1.text = dataSatu
        var dataDua = intent.getStringExtra("angkadua")
        txt_input2.text = dataDua
        var tambah = intent.getStringExtra("angkadua")
        txt_input3.text = tambah
    }

    fun ambilBundle(){
        var bndl = intent.extras
        txt_input1.setText(bndl!!.getString("Satu"))
        txt_input2.setText(bndl!!.getString("Dua"))
    }

}