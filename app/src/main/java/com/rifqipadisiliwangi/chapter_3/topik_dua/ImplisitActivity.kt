package com.rifqipadisiliwangi.chapter_3.topik_dua

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import com.rifqipadisiliwangi.chapter_3.R
import kotlinx.android.synthetic.main.activity_implisit.*

class ImplisitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implisit)

        btn_gallery.setOnClickListener {
            val keGllery = Intent(Intent.ACTION_VIEW)
            keGllery.data = Uri.parse("content://media/eksternal/images/media/")
        }

        btn_camera.setOnClickListener {
            val keCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(keCamera)
        }

        btn_web.setOnClickListener {
            val keWeb = Intent(Intent.ACTION_WEB_SEARCH)
            keWeb.data = Uri.parse("")
            startActivity(keWeb)
        }

    }
}