package com.rifqipadisiliwangi.chapter_3.topik_tiga

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rifqipadisiliwangi.chapter_3.R
class FragmentSatu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var angka1 = 9
        var angka2 = 10
        var hitungFrag = angka1 + angka2

        hitungAngkaFrag()
    }

    fun hitungAngkaFrag(){

    }
}