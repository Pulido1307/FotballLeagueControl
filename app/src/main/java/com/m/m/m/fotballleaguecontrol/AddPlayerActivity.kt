package com.m.m.m.fotballleaguecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AddPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_player)
        supportActionBar!!.hide()
    }
}