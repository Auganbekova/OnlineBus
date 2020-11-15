package com.example.myapplication.races

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Bus_items")
data class Races (
    @PrimaryKey @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "from")val from: String,
    @ColumnInfo(name = "to")val to: String,
    @ColumnInfo(name = "ost_mesto")val ost_mesto: Int,
    @ColumnInfo(name = "vsego_mesto")val vsego_mesto: Int,
    @ColumnInfo(name = "otpravlenie_date")val otpravlenie_date: String,
    @ColumnInfo(name = "pribytie_date")val pribytie_date: String,
    @ColumnInfo(name = "otpravlenie_time")val otpravlenie_time: String,
    @ColumnInfo(name = "pribytie_time")val pribytie_time: String,
    @ColumnInfo(name = "dlt_vremya")val dlt_vremya: Int,
    @ColumnInfo(name = "marka")val marka: String,
    @ColumnInfo(name = "god_vp")val god_vp: Int,
    @ColumnInfo(name = "gos_number")val gos_number: String,
    @ColumnInfo(name = "images") val images: String,
@ColumnInfo(name = "non_free_places") val non_free_places: List<String>


): Serializable