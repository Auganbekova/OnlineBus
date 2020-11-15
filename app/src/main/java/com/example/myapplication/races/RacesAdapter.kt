package com.example.myapplication.races

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.race_layout.view.*

class RacesAdapter(
    private val races: List<Races>,
    private val onItemClick: (Races) -> Unit,
    private val context: AppCompatActivity
) : RecyclerView.Adapter<RacesAdapter.RaceViewHolder>() {
    var lists = mutableListOf<Races>()

    init {
        this.lists = races as MutableList<Races>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        RaceViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.race_layout, parent, false)
        )


    override fun getItemCount(): Int = races.size

    override fun onBindViewHolder(holder: RaceViewHolder, position: Int) {
        holder.bindItem(races[position])

    }


    inner class RaceViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem(races: Races) {
            view.from_city.text = races.from
            view.to_city.text = races.to
            view.txt_mesto.text = races.ost_mesto.toString()
            view.vsego_place.text = races.vsego_mesto.toString()
            view.txt_otpravlenie.text = races.otpravlenie_date
            view.txt_pribytie.text = races.pribytie_date
            view.otpr_time.text = races.otpravlenie_time
            view.prb_time.text = races.pribytie_time
            view.dlt_time.text = races.dlt_vremya.toString()
            view.avto.text = races.marka
            view.god.text = races.god_vp.toString()
            view.number.text = races.gos_number
            Picasso.get().load(races.images).placeholder(R.mipmap.ic_launcher).into(view.bus_image)

            view.setOnClickListener {
                onItemClick(races)
            }

        }

    }
}