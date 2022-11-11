package com.m.m.m.fotballleaguecontrol.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.Team

class AdapterTable(private val context: Context, private val tableList: ArrayList<Team>): RecyclerView.Adapter<AdapterTable.HolderTable>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderTable {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.card_table, parent, false)
        return HolderTable(itemView)
    }

    override fun onBindViewHolder(holder: HolderTable, position: Int) {
        val positionTable: Team = tableList[position]

        holder.textViewNombreTable.text = positionTable.nombre
        holder.textViewPtsTable.text = positionTable.pts
    }

    override fun getItemCount(): Int {
        return tableList.size
    }

    inner class HolderTable(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageViewTable: ImageView = itemView.findViewById(R.id.imageViewTable)
        val textViewNombreTable: TextView = itemView.findViewById(R.id.textViewNombreTable)
        val textViewPtsTable: TextView = itemView.findViewById(R.id.textViewPtsTable)
    }
}