package com.cwbsoft.templateapp.utils

import android.content.Context
import android.widget.Toast

fun dummyToast(context: Context, message: String, duration:Int)
{
    val toast = Toast.makeText(context, message, duration) // in Activity
    toast.show()
}