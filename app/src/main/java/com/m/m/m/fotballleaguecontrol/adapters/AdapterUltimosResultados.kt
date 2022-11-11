package com.m.m.m.fotballleaguecontrol.adapters

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.UltimosResultados

class AdapterUltimosResultados(private val context: Context, private val ultimoResultadosList: ArrayList<UltimosResultados>, private val activity: Activity): RecyclerView.Adapter<AdapterUltimosResultados.UltimosResultadosHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UltimosResultadosHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_ultimos_resultados, parent, false)
        return UltimosResultadosHolder(itemView)
    }

    override fun onBindViewHolder(holder: UltimosResultadosHolder, position: Int) {
        val resultadoCurrent: UltimosResultados = ultimoResultadosList[position]

        holder.textViewNameLocalResultados.text = resultadoCurrent.nameLocalResultados
        holder.textViewNameVisitResultados.text = resultadoCurrent.nameVisitResultados
    }

    override fun getItemCount(): Int {
        return ultimoResultadosList.size
    }

    inner class UltimosResultadosHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewNameLocalResultados: TextView = itemView.findViewById(R.id.textViewNameLocalResultados)
        val textViewNameVisitResultados: TextView = itemView.findViewById(R.id.textViewNameVisitResultados)
    }
}