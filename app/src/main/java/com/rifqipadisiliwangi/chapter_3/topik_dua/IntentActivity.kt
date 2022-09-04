package com.rifqipadisiliwangi.chapter_3.topik_dua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_intent.*

class IntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        intentData()
        intentBundle()
        passingDataParcelable()
        parsingDataSerializable()
    }

    fun  intentData(){

        btn_hitungintent.setOnClickListener {
            var datasatu = et_input1.text.toString().toInt()
            var datadua =  et_input2.text.toString().toInt()
            var tambah:Int = datasatu + datadua
// key value
            var intent = Intent(this, EksplisitActivity::class.java)
            intent.putExtra("angkasatu", datasatu)
            intent.putExtra("angkadua", datadua)
            intent.putExtra("angkadua", tambah)
            startActivity(intent)
        }

    }

    fun intentBundle(){
        var datasatu = et_input1.text.toString()
        var datadua =  et_input2.text.toString()

        var bundle = Bundle()
        var pindahBundle = Intent(this, EksplisitActivity::class.java)
        bundle.putString("Satu", datasatu)
        bundle.putString("Dua", datadua)
        pindahBundle.putExtras(bundle)
        startActivity(pindahBundle)
    }

    fun parsingDataSerializable(){
        val intent = Intent(this, SerializableActivity::class.java)
        var data = DataMahasiswaSet("Padi","12345","IF")
        intent.putExtra("datamahasiswa", data)
        startActivity(intent)

    }

    fun passingDataParcelable(){
        val parcalableIntent = Intent(this, ParcelableActivity::class.java)
        var masukinParcalable = PersonParcelable("padi","12345","20","jogja")
        intent.putExtra("dataparcalable", masukinParcalable)
        startActivity(parcalableIntent)
    }
}