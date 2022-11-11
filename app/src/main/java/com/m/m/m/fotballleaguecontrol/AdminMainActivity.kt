package com.m.m.m.fotballleaguecontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.m.m.m.fotballleaguecontrol.adapters.AdapterDivisiones
import com.m.m.m.fotballleaguecontrol.models.Division
import kotlinx.android.synthetic.main.activity_admin_main.*

class AdminMainActivity : AppCompatActivity() {

    private var listaDivsiones: ArrayList<Division> = arrayListOf(
        Division("Primera A"),
        Division("Primera B"),
        Division("Segunda A"),
        Division("Segunda B"),
        Division("Tercera A"),
        Division("Tercera B"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_main)
        supportActionBar!!.hide()

        recyclerDivision!!.layoutManager = LinearLayoutManager(this@AdminMainActivity)
        recyclerDivision!!.adapter = AdapterDivisiones(this@AdminMainActivity, listaDivsiones, this@AdminMainActivity)



    }
}