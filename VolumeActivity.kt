package com.example.class_iu_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bass.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_volume.*

class VolumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)
        btnSaveVolume.setOnClickListener {
            val volume=editVolume.text.toString().trim()
            if(Utils.validate(volume)){
                MainActivity.Volume=volume.toInt()
                setResult(MainActivity.REQ_VOLUME_CODE)
                finish()
            }
            else{
                showToast("Please Enter Valid Volume Value")
            }
        }
    }
}