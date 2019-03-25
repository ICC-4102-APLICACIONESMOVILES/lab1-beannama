package com.example.lab01_naranjo_benjamin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
    }

    fun SignIn(view:View){
        var edit= findViewById<EditText>(R.id.ussername)
        var user : String = edit.toString()
        if (isEmailValid(user)){
            get_log_request = 1
            val intent = Intent(this, MainActivity::class.java)
            startActivityForResult(intent, get_log_request)
        }
        else{

        }
    }

    fun isEmailValid(email:String): Boolean{
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
