package com.example.class_iu_work

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        var Volume=0
        var Bass=0

        const val REQ_VOLUME_CODE=201
        const val REQ_BASS_CODE=202
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showLog("OnCreate() Called")
        setVolumeAndBase()
//    btnNavigate.setOnClickListener {
//        //Explicit Intent( One Activity To Another Activity)
//        //Implicit Intent  (One App To Another App)
//        //Intent Message Passing Element Hay
//        Intent(this,DashBoardActivity::class.java).apply {
//            startActivity(this)
//        }
//    }
        btnVolume.setOnClickListener {
            Intent(this,VolumeActivity::class.java).apply {
            startActivityForResult(this, REQ_VOLUME_CODE)
                    }
        }
        btnBass.setOnClickListener {
            Intent(this,BassActivity::class.java).apply {
                startActivityForResult(this, REQ_BASS_CODE)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQ_VOLUME_CODE){
            txtVolume.text="$Volume"
        }
        if(requestCode== REQ_BASS_CODE){
            txtBass.text="$Bass"
        }
    }
    fun setVolumeAndBase(){
        txtVolume.text="$Volume"
        txtBass.text="$Bass"
    }
    override fun onStart() {
        super.onStart()
        showLog("OnStart() Called")
        //txtView.text="OnStart()"
    }

    override fun onResume() {
        super.onResume()
        showLog("OnResume() Called")
    }

    override fun onPause() {
        super.onPause()
        showLog("OnPause() Called")
    }

    override fun onStop() {
        super.onStop()
        showLog("OnStop() Called")
    }

    override fun onRestart() {
        super.onRestart()
        showLog("OnRestart() Called")
    }
    override fun onDestroy() {
        super.onDestroy()
        showLog("OnDestroy() Called")
    }
}
