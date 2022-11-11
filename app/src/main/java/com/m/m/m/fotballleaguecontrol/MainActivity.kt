package com.m.m.m.fotballleaguecontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.m.m.m.fotballleaguecontrol.adapters.AdapterPlantilla
import com.m.m.m.fotballleaguecontrol.adapters.AdapterPosiciones
import com.m.m.m.fotballleaguecontrol.adapters.AdapterUltimosResultados
import com.m.m.m.fotballleaguecontrol.models.Player
import com.m.m.m.fotballleaguecontrol.models.PosicionesTabla
import com.m.m.m.fotballleaguecontrol.models.UltimosResultados
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var listPosiciones: ArrayList<PosicionesTabla> = arrayListOf(
        PosicionesTabla("Nombre de equipo", 1, 20),
        PosicionesTabla("Nombre de equipo", 2, 18),
        PosicionesTabla("Nombre de equipo", 3, 16),
        PosicionesTabla("Nombre de equipo", 4, 14),
        PosicionesTabla("Nombre de equipo", 5, 12),
        PosicionesTabla("Nombre de equipo", 6, 10),
        PosicionesTabla("Nombre de equipo", 7, 8),
        PosicionesTabla("Nombre de equipo", 8, 6),
        PosicionesTabla("Nombre de equipo", 9, 4),
        PosicionesTabla("Nombre de equipo", 10, 0)
    )

    private var lisUltimosResultados: ArrayList<UltimosResultados> = arrayListOf(
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo"),
        UltimosResultados("Nombre de equipo", "Nombre de equipo")
    )

    private var listPlantilla: ArrayList<Player> = arrayListOf(
        Player("Jan Oblak", 13, "Portero"),
        Player("Ivo Grbić", 1, "Portero"),
        Player("José María Giménez", 2, "Defensa"),
        Player("Sergio Reguilón", 3, "Defensa"),
        Player("Stefan Savić", 15, "Defensa"),
        Player("Felipe Augusto", 18, "Defensa"),
        Player("Mario Hermoso", 22, "Defensa"),
        Player("Rodrigo de Paul", 5, "Medio"),
        Player("Koke Resurrección", 6, "Medio"),
        Player("Marcos Llorente", 14, "Medio"),
        Player("Axel Witsel", 20, "Medio"),
        Player("Yannick Carrasco", 21, "Medio"),
        Player("Joao Félix", 7, "Delantero"),
        Player("Antoine Griezmann", 8, "Delantero"),
        Player("Ángel Correa", 10, "Delantero"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        recyclerViewPosiciones!!.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewUltimosResultados!!.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewPlantilla!!.layoutManager = GridLayoutManager(this@MainActivity, 2)

        recyclerViewPosiciones!!.adapter = AdapterPosiciones(this@MainActivity, listPosiciones, this@MainActivity)
        recyclerViewUltimosResultados!!.adapter = AdapterUltimosResultados(this@MainActivity, lisUltimosResultados, this@MainActivity)
        recyclerViewPlantilla!!.adapter = AdapterPlantilla(this@MainActivity, listPlantilla, this@MainActivity)

        topAppBar!!.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.item_opc->{
                    val intent: Intent = Intent(this@MainActivity, OpcAdministrationTeamActivity::class.java)
                    startActivity(intent)
                    true
                }
                else-> false
            }
        }
    }
}