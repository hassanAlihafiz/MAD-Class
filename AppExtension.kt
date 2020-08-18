package com.example.class_iu_work

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showLog(mess:String){
    Log.i(Utils.appName,mess)
}

fun Context.showToast(mess: String){
        Toast.makeText(this,mess,Toast.LENGTH_SHORT).show()
}