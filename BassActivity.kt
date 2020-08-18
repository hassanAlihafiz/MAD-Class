package com.example.class_iu_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bass.*

class BassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bass)
        btnSaveBass.setOnClickListener {
            val bass=editBass.text.toString().trim()
            if(Utils.validate(bass)){
                MainActivity.Bass=bass.toInt()
                //iski zaroorat jab hote hay jab Hum ek he activity pa 2 kam kar rahe hon
                setResult(MainActivity.REQ_BASS_CODE)
                finish()
            }
            else{
                showToast("Please Enter Valid Base Value")
            }
        }
    }
}