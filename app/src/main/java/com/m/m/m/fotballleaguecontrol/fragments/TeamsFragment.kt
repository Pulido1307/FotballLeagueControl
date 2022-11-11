package com.m.m.m.fotballleaguecontrol.fragments

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.m.m.m.fotballleaguecontrol.R
import com.m.m.m.fotballleaguecontrol.adapters.AdapterPlantilla
import com.m.m.m.fotballleaguecontrol.models.Player

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TeamsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TeamsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
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

    private var listTeam: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root:View =  inflater.inflate(R.layout.fragment_teams, container, false)

        listTeam = root.findViewById(R.id.listTeam)

        listTeam!!.layoutManager = GridLayoutManager(root.context, 2)
        listTeam!!.adapter = AdapterPlantilla(root.context, listPlantilla, root.context as Activity)
        listTeam!!.setHasFixedSize(true)

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TeamsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TeamsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}