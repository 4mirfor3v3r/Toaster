package com.amier.customtoastlayout

import android.content.Context
import android.content.res.Resources
import android.content.res.XmlResourceParser
import android.view.*
import android.widget.Toast
import androidx.core.view.ViewGroupCompat

class Toaster {
    companion object {
        fun make(context: Context, idReslayout: Int, viewGroup:ViewGroup, Toastduration: Int): Toast {
            val vs = context.resources.getLayout(idReslayout)
//            val vg = context.resources.v
            val layout = LayoutInflater.from(context).inflate(vs,viewGroup,false)

            val toast = Toast(context.applicationContext)
            toast.apply {
                setGravity(Gravity.BOTTOM, 0, 0)
                view = layout
                duration = Toastduration
                show()
            }
            return toast
        }
    }
}

