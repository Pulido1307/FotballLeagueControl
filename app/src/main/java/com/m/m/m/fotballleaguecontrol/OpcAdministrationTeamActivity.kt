package com.m.m.m.fotballleaguecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_opc_administration_team.*

class OpcAdministrationTeamActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opc_administration_team)
        supportActionBar!!.hide()

        acctionButtons()
    }

    private fun acctionButtons() {
        var intent: Intent
        cardViewAddPlayer.setOnClickListener {
            intent = Intent(this@OpcAdministrationTeamActivity, AddPlayerActivity::class.java)
            startActivity(intent)
        }

        cardViewAdeudos.setOnClickListener {
            intent = Intent(this@OpcAdministrationTeamActivity, ArbitrajeActivity::class.java)
            startActivity(intent)
        }

        cardViewRol.setOnClickListener {
            intent = Intent(this@OpcAdministrationTeamActivity, RolActivity::class.java)
            startActivity(intent)
        }

        cardViewCambiarPass.setOnClickListener {
            intent = Intent(this@OpcAdministrationTeamActivity, EditPasswordActivity::class.java)
            startActivity(intent)
        }

        buttonCerrarSesion.setOnClickListener {
            intent = Intent(this@OpcAdministrationTeamActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}