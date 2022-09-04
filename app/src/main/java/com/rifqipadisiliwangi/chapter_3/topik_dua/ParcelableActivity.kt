package com.rifqipadisiliwangi.chapter_3.topik_dua

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_parcelable.*

class ParcelableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        var dataPerson = intent.getParcelableExtra("dataparcalable") as PersonParcelable?
        getParcalable.text = dataPerson?.kota ?: null


    }
}