package com.devedroy.mydoc.views.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.devedroy.mydoc.R


class CustomDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.custom_dialog_layout, container, false)
        val textView = view.findViewById<TextView>(R.id.dialog_text)
        textView.text = "This is a custom dialog"
        dialog!!.setCanceledOnTouchOutside(true)

        return view
    }
}