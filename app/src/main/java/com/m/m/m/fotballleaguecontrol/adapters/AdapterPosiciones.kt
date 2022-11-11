package com.m.m.m.fotballleaguecontrol.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.PosicionesTabla

class AdapterPosiciones(private val context: Context, private val posicionesList: ArrayList<PosicionesTabla>, private val activity: Activity): RecyclerView.Adapter<AdapterPosiciones.PosicionesHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosicionesHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_posiciones, parent, false)
        return PosicionesHolder(itemView)
    }

    override fun onBindViewHolder(holder: PosicionesHolder, position: Int) {
        val poscionActual: PosicionesTabla = posicionesList[position]

        holder.textViewNamePosiciones.text = "${poscionActual.nombreEquipo}:"
        holder.textViewPositionPosiciones.text = "Posición actual: ${poscionActual.posicion}"
        holder.textViewPointsPosiciones.text = "Puntos obtenidos: ${poscionActual.puntos}"
    }

    override fun getItemCount(): Int {
        return posicionesList.size
    }

    inner class PosicionesHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewNamePosiciones: TextView = itemView.findViewById(R.id.textViewNamePosiciones)
        val textViewPositionPosiciones: TextView = itemView.findViewById(R.id.textViewPositionPosiciones)
        val textViewPointsPosiciones: TextView = itemView.findViewById(R.id.textViewPointsPosiciones)
    }
}