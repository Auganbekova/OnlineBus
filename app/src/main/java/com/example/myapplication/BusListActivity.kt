package com.example.myapplication

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.races.AppDatabase
import com.example.myapplication.races.Races
import com.example.myapplication.races.RacesAdapter
import kotlinx.android.synthetic.main.activity_bus_list.*

class BusListActivity : AppCompatActivity() {


    companion object {
        const val BUS = "bus"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_list)
    }

    private fun setupViews(){

        races.layoutManager = LinearLayoutManager(this)

        AsyncTask.execute {
            val listRaces = AppDatabase.getInstance(applicationContext)!!
                .getRacesDao().getAllRaces()
            Log.d("GET_ALL_RACES", listRaces.toString())

            runOnUiThread {
                races.adapter = RacesAdapter(listRaces, onItemClick = {
                    val intent = Intent(this, BusInfoActivity::class.java)
                    intent.putExtra(BUS, it)
                    startActivity(intent)
                },
                    this)

            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.race, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.add_race) {
            addRoute()
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun addRoute() {
        AsyncTask.execute {
            AppDatabase.getInstance(applicationContext)!!
                .getRacesDao().insertRace(
                    Races(
                        from = "Қостанай",
                        to = "Орал",
                        ost_mesto = 53,
                        vsego_mesto = 53,
                        otpravlenie_date = "16.11.2020",
                        pribytie_date = "17.11.2020",
                        otpravlenie_time = "13:00",
                        pribytie_time = "13:00",
                        dlt_vremya = 24,
                        marka = "YUTONG",
                        god_vp = 2015,
                        gos_number = "093PEA02",
                        images = "https://5koleso.ru/wp-content/uploads/2017/03/yutong_zk6122h9_008.jpg",
                        non_free_places = mutableListOf()
                    )
                )
        }
        runOnUiThread {
            val intent = Intent(this, BusListActivity::class.java)
            startActivity(intent)
        }
    }
}