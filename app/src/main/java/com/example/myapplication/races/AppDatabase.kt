package com.example.myapplication.races

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import homework.mobile.homework.routes.RacesDao

@Database(entities = [Races::class], version = 3, exportSchema = false)
@TypeConverters(Convert::class)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getRacesDao(): RacesDao


    companion object {
        private const val DB_NAME = "BusOnline.db"
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    DB_NAME
                ).fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }

    }

}