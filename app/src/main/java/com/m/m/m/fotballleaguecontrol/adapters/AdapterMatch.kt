package com.m.m.m.fotballleaguecontrol.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.InformationMatch
import com.m.m.m.fotballleaguecontrol.InformationPlayerActivity
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.UltimosResultados

class AdapterMatch (private val context: Context, private val ultimoResultadosList: ArrayList<UltimosResultados>, private val activity: Activity): RecyclerView.Adapter<AdapterMatch.MatchHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.card_match, parent, false)
        return MatchHolder(itemView)
    }

    override fun onBindViewHolder(holder: MatchHolder, position: Int) {
        val resultadoCurrent: UltimosResultados = ultimoResultadosList[position]

        holder.textViewNombreLocalCardMatch.text = resultadoCurrent.nameLocalResultados
        holder.textViewNombreVisitCardMatch.text = resultadoCurrent.nameVisitResultados
        holder.textViewVS.text = "VS"
        holder.cardViewMatch.setOnClickListener {
            moveToActivity()
        }
    }

    private fun moveToActivity() {
        val intent: Intent = Intent(context, InformationMatch::class.java)
        activity.startActivity(intent)
    }

    override fun getItemCount(): Int {
       return ultimoResultadosList.size
    }

    inner class MatchHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewNombreLocalCardMatch: TextView = itemView.findViewById(R.id.textViewNombreLocalCardMatch)
        val textViewNombreVisitCardMatch: TextView = itemView.findViewById(R.id.textViewNombreVisitCardMatch)
        val textViewVS: TextView = itemView.findViewById(R.id.textViewVS)
        val cardViewMatch: CardView = itemView.findViewById(R.id.cardViewMatch)
    }
}
