package com.amier.customtoastlayout

import android.content.Context
import android.view.*
import android.widget.Toast

class Toaster {
    companion object {
        fun make(context: Context, idReslayout: Int, toastDuration: Int): Toast {
            val vs = context.resources.getLayout(idReslayout)
            val layout = LayoutInflater.from(context).inflate(vs,null,false)

            val toast = Toast(context.applicationContext)
            toast.apply {
                setGravity(Gravity.BOTTOM, 0, 0)
                view = layout
                duration = toastDuration
                show()
            }
            return toast
        }
        fun make(context: Context, idReslayout: Int, gravity: Int, toastDuration: Int): Toast {
            val vs = context.resources.getLayout(idReslayout)
            val layout = LayoutInflater.from(context).inflate(vs,null,false)

            val toast = Toast(context.applicationContext)
            toast.apply {
                setGravity(gravity, 0, 0)
                view = layout
                duration = toastDuration
                show()
            }
            return toast
        }
    }
}

