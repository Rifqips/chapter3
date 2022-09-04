package com.rifqipadisiliwangi.chapter_3.topik_tiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_main_fragment.*

class MainFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fcFragment, FragmentDua())
            commit()
        }

        btnfr1.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.fcFragment, FragmentSatu())
                commit()
            }

            btnfr2.setOnClickListener{
                supportFragmentManager.beginTransaction().apply{
                    replace(R.id.fcFragment, FragmentDua())
                    commit()
                }
        }
    }
    }
}