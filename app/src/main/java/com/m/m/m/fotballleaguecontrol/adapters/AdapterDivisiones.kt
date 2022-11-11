package com.m.m.m.fotballleaguecontrol.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.InformationMatch
import com.m.m.m.fotballleaguecontrol.MatchResultsActivity
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.Division
import com.m.m.m.fotballleaguecontrol.models.UltimosResultados

class AdapterDivisiones(private val context: Context, private val divisionesList: ArrayList<Division>, private val activity: Activity): RecyclerView.Adapter<AdapterDivisiones.DivisionesHolder>() {

    inner class DivisionesHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewDivision: TextView = itemView.findViewById(R.id.textViewDivision)
        val cardViewDivisones: CardView = itemView.findViewById(R.id.cardViewDivisones)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DivisionesHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.card_divisiones, parent, false)
        return DivisionesHolder(itemView)
    }

    private fun moveToActivity() {
        val intent: Intent = Intent(context, MatchResultsActivity::class.java)
        activity.startActivity(intent)
    }


    override fun onBindViewHolder(holder: DivisionesHolder, position: Int) {
        holder.textViewDivision.text = divisionesList[position].nombreDivision

        holder.cardViewDivisones.setOnClickListener {
            moveToActivity()
        }
    }

    override fun getItemCount(): Int {
        return divisionesList.size
    }
}