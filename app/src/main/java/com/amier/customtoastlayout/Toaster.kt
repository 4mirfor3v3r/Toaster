package com.amier.customtoastlayout

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class Toaster {
    fun make(context: Context, idReslayout: Int, Toastduration: Int): Toast {
        val v = idReslayout as View
        val viewgroup = v.parent as ViewGroup
        val layout = LayoutInflater.from(context).inflate(idReslayout, viewgroup)

        val toast = Toast(context.applicationContext)
        toast.apply {
            setGravity(Gravity.BOTTOM, 0, 0)
            view = layout
            duration = Toastduration
        }
        return toast
    }
}
