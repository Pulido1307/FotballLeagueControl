package com.m.m.m.fotballleaguecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()

        buttonIniciarSesion.setOnClickListener {
            val intent: Intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonOlvidastePass.setOnClickListener {
            val intent: Intent = Intent(this@LoginActivity, AdminMainActivity::class.java)
            startActivity(intent)
        }

    }
}