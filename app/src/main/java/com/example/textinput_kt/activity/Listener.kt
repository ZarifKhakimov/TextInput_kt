package com.example.textinput_kt.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.textinput_kt.R
import com.google.android.material.textfield.TextInputEditText


class Listener : AppCompatActivity() {
    var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        initViews()
        val textInputLayout: TextInputEditText
        textInputLayout = findViewById<View>(R.id.textInputLayout) as TextInputEditText
        textInputLayout.setOnKeyListener { view, i, keyEvent -> false }
    }

    fun initViews() {
        val input1 = findViewById<View>(R.id.input1) as TextInputEditText
        val input2 = findViewById<View>(R.id.input2) as TextInputEditText
        val go1 = findViewById<View>(R.id.Go1) as Button

        // go1.setEnabled(false); //Default turning off my button
        val watcher: TextWatcher = object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                go1.isEnabled = (!TextUtils.isEmpty(input1.hint)
                        && !TextUtils.isEmpty(input2.hint))
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {}
        }
    }
}