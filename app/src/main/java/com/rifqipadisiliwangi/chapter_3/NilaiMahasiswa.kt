package com.rifqipadisiliwangi.chapter_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_nilai_mahasiswa.*
import kotlinx.android.synthetic.main.activity_nilai_mahasiswa.view.*

class NilaiMahasiswa : AppCompatActivity() {

    lateinit var etinputnamamhs:EditText
    lateinit var etinputnimmhs:EditText
    lateinit var etinputuasmhs:EditText
    lateinit var etinpututsmhs:EditText
    lateinit var etinputtugasmhs:EditText

    lateinit var btnhitungnilai:Button
    lateinit var btnresetnilai:Button

    lateinit var tvoutputnama:TextView
    lateinit var tvoutputnim:TextView
    lateinit var tvoutputuas:TextView
    lateinit var tvoutpututs:TextView
    lateinit var tvoutputtugas:TextView
    lateinit var tvoutputtotal:TextView
    lateinit var tvoutputratarata:TextView
    lateinit var tvoutputhuruf:TextView
    lateinit var tvoutputstatusmhs:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_mahasiswa)

        etinputnamamhs = findViewById(R.id.et_input_nama_mhs)
        etinputnimmhs = findViewById(R.id.et_input_nim_mhs)
        etinputuasmhs = findViewById(R.id.et_input_uas_mhs)
        etinpututsmhs = findViewById(R.id.et_input_uts_mhs)
        etinputtugasmhs = findViewById(R.id.et_input_tugas_mhs)

        btnhitungnilai = findViewById(R.id.btn_hitung_nilai)
        btnresetnilai = findViewById(R.id.btn_reset_nilai)

        tvoutputnama = findViewById(R.id.tv_output_nama)
        tvoutputnim = findViewById(R.id.tv_output_nim)
        tvoutputuas = findViewById(R.id.tv_output_uas)
        tvoutpututs = findViewById(R.id.tv_output_uts)
        tvoutputtugas = findViewById(R.id.tv_output_tugas)
        tvoutputtotal = findViewById(R.id.tv_output_total)
        tvoutputratarata = findViewById(R.id.tv_output_rata_rata)
        tvoutputhuruf = findViewById(R.id.tv_output_huruf)
        tvoutputstatusmhs = findViewById(R.id.tv_output_status_mhs)

        btnhitungnilai.setOnClickListener {
            hitungNilai()
        }

        btnresetnilai.setOnClickListener {
            resetNilai()
        }
    }

    fun resetNilai(){
        tvoutputnama.setText("")
        tvoutputnim.setText("")
        tvoutputuas.setText("")
        tvoutpututs.setText("")
        tvoutputtugas.setText("")
        tvoutputtotal.setText("")
        tvoutputratarata.setText("")
        tvoutputhuruf.setText("")
        tvoutputstatusmhs.setText("")

    }

    fun hitungNilai(){

        etinputnamamhs.tv_output_nama
        etinputnimmhs.tv_output_nim
        etinputuasmhs.tv_output_uas
        etinpututsmhs.tv_output_uts
        etinputtugasmhs.tv_output_tugas

        val a = etinputuasmhs.text.toString().toInt()
        val b = etinpututsmhs.text.toString().toInt()
        val c = etinputtugasmhs.text.toString().toInt()

        val totalNilai = a + b + c
        tv_output_total.text = totalNilai.toString()

        val statusMhs: Int = (a + b + c)/3
        tv_output_rata_rata.text = statusMhs.toString()

        when (statusMhs) {
            in 0..60 -> {
                tvoutputhuruf.text="F"
            }
            in 61..70 -> {
                tvoutputhuruf.text="D"
            }
            in 71..80 -> {
                tvoutputhuruf.text = "C"
            }
            in 81..90 -> {
                tvoutputhuruf.text = "B"
            }
            in 91..100 -> {
                tvoutputhuruf.text = "A"
            }
            else -> {
                tvoutputhuruf.text = "Nilai $tvoutputhuruf tidak dapat ditampilkan"
            }
        }

        when (tvoutputhuruf.text.toString()){
            "A" -> tvoutputstatusmhs.text = "Lolos"
            "B" -> tvoutputstatusmhs.text = "Lolos"
            "C" -> tvoutputstatusmhs.text = "Lolos"
            "D" -> tvoutputstatusmhs.text = "Tidak lulus"
            "E" -> tvoutputstatusmhs.text = "Tidak"
        }

    }

}