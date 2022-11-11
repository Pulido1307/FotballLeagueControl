package com.m.m.m.fotballleaguecontrol.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.InformationPlayerActivity
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.models.Player

class AdapterPlantilla(private val context: Context, private val plantillaList: ArrayList<Player>, private val activity: Activity): RecyclerView.Adapter<AdapterPlantilla.PlantillaHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantillaHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_plantilla, parent, false)
        return PlantillaHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlantillaHolder, position: Int) {
        val playerCurrent: Player = plantillaList[position]

        holder.textViewNamePlayer.text = playerCurrent.name
        holder.textViewNumberPlayer.text = "# ${playerCurrent.number}"
        holder.textViewPositionPlayer.text = playerCurrent.position

        holder.cardViewItemPlantilla.setOnClickListener {
            moveToActivity()
        }
    }

    private fun moveToActivity() {
        val intent: Intent = Intent(context, InformationPlayerActivity::class.java)
        activity.startActivity(intent)
    }


    override fun getItemCount(): Int {
        return plantillaList.size
    }

    inner class PlantillaHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val cardViewItemPlantilla: CardView = itemView.findViewById(R.id.cardViewItemPlantilla)
        val imageViewPhotoPlayer: ImageView = itemView.findViewById(R.id.imageViewPhotoPlayer)
        val textViewNamePlayer: TextView = itemView.findViewById(R.id.textViewNamePlayer)
        val textViewNumberPlayer: TextView = itemView.findViewById(R.id.textViewNumberPlayer)
        val textViewPositionPlayer: TextView = itemView.findViewById(R.id.textViewPositionPlayer)
    }
}
