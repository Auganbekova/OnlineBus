package homework.mobile.homework.routes

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.races.Races

@Dao
interface RacesDao {
    @Insert
    fun insertRace(route: Races)

    @Query("SELECT * FROM Bus_items")
    fun getAllRaces(): List<Races>

    @Query("UPDATE Bus_items SET non_free_places=:places WHERE id=:busId ")
    fun setPlaceById(places: List<String>, busId: Int)
}