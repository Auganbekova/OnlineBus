package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bus_info.*
import kotlinx.android.synthetic.main.activity_main.*

class BusInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bus_info)

        setupViews()

        clickPlaces()
    }


    var pl1 = false
    var pl2 = false
    var pl3 = false
    var pl4 = false
    var pl5 = false
    var pl6 = false
    var pl7 = false
    var pl8 = false
    var pl9 = false
    var pl10 = false
    var pl11 = false
    var pl12 = false
    var pl13 = false
    var pl14 = false
    var pl15 = false
    var pl16 = false
    var pl17 = false
    var pl18 = false
    var pl19 = false
    var pl20 = false
    var pl21 = false
    var pl22 = false
    var pl23 = false
    var pl24 = false
    var pl25 = false
    var pl26 = false
    var pl27 = false
    var pl28 = false
    var pl29 = false
    var pl30 = false
    var pl31 = false
    var pl32 = false
    var pl33 = false
    var pl34 = false
    var pl35 = false
    var pl36 = false
    var pl37 = false
    var pl38 = false
    var pl39 = false
    var pl40 = false
    var pl41 = false
    var pl42 = false
    var pl43 = false
    var pl44 = false
    var pl45 = false
    var pl46 = false
    var pl47 = false
    var pl48 = false
    var pl49 = false
    var pl50 = false
    var pl51 = false
    val list = mutableListOf(0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0)

    private fun clickPlaces() {
        place_1.setOnClickListener {
            if (!pl1) {
                place_1.setBackgroundResource(R.drawable.back_selected)
                place_1.setTextColor(Color.parseColor("#FFFFFF"))
                pl1 = true
            } else {
                place_1.setBackgroundResource(R.drawable.back_buttons)
                place_1.setTextColor(Color.parseColor("#000000"))
                pl1 = false
            }
        }
        place_2.setOnClickListener {
            if (!pl2) {
                place_2.setBackgroundResource(R.drawable.back_selected)
                place_2.setTextColor(Color.parseColor("#FFFFFF"))
                pl2 = true
            } else {
                place_2.setBackgroundResource(R.drawable.back_buttons)
                place_2.setTextColor(Color.parseColor("#000000"))
                pl2 = false
            }
        }
        place_3.setOnClickListener {
            if (!pl3) {
                place_3.setBackgroundResource(R.drawable.back_selected)
                place_3.setTextColor(Color.parseColor("#FFFFFF"))
                pl3 = true
            } else {
                place_3.setBackgroundResource(R.drawable.back_buttons)
                place_3.setTextColor(Color.parseColor("#000000"))
                pl3 = false
            }
        }
        place_4.setOnClickListener {
            if (!pl4) {
                place_4.setBackgroundResource(R.drawable.back_selected)
                place_4.setTextColor(Color.parseColor("#FFFFFF"))
                pl4 = true
            } else {
                place_4.setBackgroundResource(R.drawable.back_buttons)
                place_4.setTextColor(Color.parseColor("#000000"))
                pl4 = false
            }
        }
        place_5.setOnClickListener {
            if (!pl5) {
                place_5.setBackgroundResource(R.drawable.back_selected)
                place_5.setTextColor(Color.parseColor("#FFFFFF"))
                pl5 = true
            } else {
                place_5.setBackgroundResource(R.drawable.back_buttons)
                place_5.setTextColor(Color.parseColor("#000000"))
                pl5 = false
            }
        }
        place_6.setOnClickListener {
            if (!pl6) {
                place_6.setBackgroundResource(R.drawable.back_selected)
                place_6.setTextColor(Color.parseColor("#FFFFFF"))
                pl6 = true
            } else {
                place_6.setBackgroundResource(R.drawable.back_buttons)
                place_6.setTextColor(Color.parseColor("#000000"))
                pl6 = false
            }
        }









        place_7.setOnClickListener {
            if (!pl7) {
                place_7.setBackgroundResource(R.drawable.back_selected)
                place_7.setTextColor(Color.parseColor("#FFFFFF"))
                pl7 = true
            } else {
                place_7.setBackgroundResource(R.drawable.back_buttons)
                place_7.setTextColor(Color.parseColor("#000000"))
                pl7 = false
            }
        }
        place_8.setOnClickListener {
            if (!pl8) {
                place_8.setBackgroundResource(R.drawable.back_selected)
                place_8.setTextColor(Color.parseColor("#FFFFFF"))
                pl8 = true
            } else {
                place_6.setBackgroundResource(R.drawable.back_buttons)
                place_6.setTextColor(Color.parseColor("#000000"))
                pl8 = false
            }
        }
        place_9.setOnClickListener {
            if (!pl9) {
                place_9.setBackgroundResource(R.drawable.back_selected)
                place_9.setTextColor(Color.parseColor("#FFFFFF"))
                pl9 = true
            } else {
                place_9.setBackgroundResource(R.drawable.back_buttons)
                place_9.setTextColor(Color.parseColor("#000000"))
                pl9 = false
            }
        }
        place_10.setOnClickListener {
            if (!pl10) {
                place_10.setBackgroundResource(R.drawable.back_selected)
                place_10.setTextColor(Color.parseColor("#FFFFFF"))
                pl10 = true
            } else {
                place_10.setBackgroundResource(R.drawable.back_buttons)
                place_10.setTextColor(Color.parseColor("#000000"))
                pl10 = false
            }
        }
        place_11.setOnClickListener {
            if (!pl11) {
                place_11.setBackgroundResource(R.drawable.back_selected)
                place_11.setTextColor(Color.parseColor("#FFFFFF"))
                pl11 = true
            } else {
                place_11.setBackgroundResource(R.drawable.back_buttons)
                place_11.setTextColor(Color.parseColor("#000000"))
                pl11 = false
            }
        }
        place_12.setOnClickListener {
            if (!pl12) {
                place_12.setBackgroundResource(R.drawable.back_selected)
                place_12.setTextColor(Color.parseColor("#FFFFFF"))
                pl12 = true
            } else {
                place_12.setBackgroundResource(R.drawable.back_buttons)
                place_12.setTextColor(Color.parseColor("#000000"))
                pl12 = false
            }
        }
        place_13.setOnClickListener {
            if (!pl13) {
                place_13.setBackgroundResource(R.drawable.back_selected)
                place_13.setTextColor(Color.parseColor("#FFFFFF"))
                pl13 = true
            } else {
                place_13.setBackgroundResource(R.drawable.back_buttons)
                place_13.setTextColor(Color.parseColor("#000000"))
                pl13 = false
            }
        }
        place_14.setOnClickListener {
            if (!pl14) {
                place_14.setBackgroundResource(R.drawable.back_selected)
                place_14.setTextColor(Color.parseColor("#FFFFFF"))
                pl14 = true
            } else {
                place_14.setBackgroundResource(R.drawable.back_buttons)
                place_14.setTextColor(Color.parseColor("#000000"))
                pl14 = false
            }
        }
        place_15.setOnClickListener {
            if (!pl15) {
                place_15.setBackgroundResource(R.drawable.back_selected)
                place_15.setTextColor(Color.parseColor("#FFFFFF"))
                pl15 = true
            } else {
                place_15.setBackgroundResource(R.drawable.back_buttons)
                place_15.setTextColor(Color.parseColor("#000000"))
                pl15 = false
            }
        }
        place_16.setOnClickListener {
            if (!pl16) {
                place_16.setBackgroundResource(R.drawable.back_selected)
                place_16.setTextColor(Color.parseColor("#FFFFFF"))
                pl16 = true
            } else {
                place_16.setBackgroundResource(R.drawable.back_buttons)
                place_16.setTextColor(Color.parseColor("#000000"))
                pl16 = false
            }
        }
        place_17.setOnClickListener {
            if (!pl17) {
                place_17.setBackgroundResource(R.drawable.back_selected)
                place_17.setTextColor(Color.parseColor("#FFFFFF"))
                pl17 = true
            } else {
                place_17.setBackgroundResource(R.drawable.back_buttons)
                place_17.setTextColor(Color.parseColor("#000000"))
                pl17 = false
            }
        }
        place_18.setOnClickListener {
            if (!pl18) {
                place_18.setBackgroundResource(R.drawable.back_selected)
                place_18.setTextColor(Color.parseColor("#FFFFFF"))
                pl18 = true
            } else {
                place_18.setBackgroundResource(R.drawable.back_buttons)
                place_18.setTextColor(Color.parseColor("#000000"))
                pl18 = false
            }
        }
        place_19.setOnClickListener {
            if (!pl19) {
                place_19.setBackgroundResource(R.drawable.back_selected)
                place_19.setTextColor(Color.parseColor("#FFFFFF"))
                pl19 = true
            } else {
                place_19.setBackgroundResource(R.drawable.back_buttons)
                place_19.setTextColor(Color.parseColor("#000000"))
                pl19 = false
            }
        }
        place_20.setOnClickListener {
            if (!pl20) {
                place_20.setBackgroundResource(R.drawable.back_selected)
                place_20.setTextColor(Color.parseColor("#FFFFFF"))
                pl20 = true
            } else {
                place_20.setBackgroundResource(R.drawable.back_buttons)
                place_20.setTextColor(Color.parseColor("#000000"))
                pl20 = false
            }
        }
        place_21.setOnClickListener {
            if (!pl21) {
                place_21.setBackgroundResource(R.drawable.back_selected)
                place_21.setTextColor(Color.parseColor("#FFFFFF"))
                pl21 = true
            } else {
                place_21.setBackgroundResource(R.drawable.back_buttons)
                place_21.setTextColor(Color.parseColor("#000000"))
                pl21 = false
            }
        }
        place_22.setOnClickListener {
            if (!pl22) {
                place_22.setBackgroundResource(R.drawable.back_selected)
                place_22.setTextColor(Color.parseColor("#FFFFFF"))
                pl22 = true
            } else {
                place_22.setBackgroundResource(R.drawable.back_buttons)
                place_22.setTextColor(Color.parseColor("#000000"))
                pl22 = false
            }
        }
        place_23.setOnClickListener {
            if (!pl23) {
                place_23.setBackgroundResource(R.drawable.back_selected)
                place_23.setTextColor(Color.parseColor("#FFFFFF"))
                pl23 = true
            } else {
                place_23.setBackgroundResource(R.drawable.back_buttons)
                place_23.setTextColor(Color.parseColor("#000000"))
                pl23 = false
            }
        }











        place_24.setOnClickListener {
            if (!pl24) {
                place_24.setBackgroundResource(R.drawable.back_selected)
                place_24.setTextColor(Color.parseColor("#FFFFFF"))
                pl24 = true
            } else {
                place_24.setBackgroundResource(R.drawable.back_buttons)
                place_24.setTextColor(Color.parseColor("#000000"))
                pl24 = false
            }
        }
        place_25.setOnClickListener {
            if (!pl25) {
                place_25.setBackgroundResource(R.drawable.back_selected)
                place_25.setTextColor(Color.parseColor("#FFFFFF"))
                pl25 = true
            } else {
                place_25.setBackgroundResource(R.drawable.back_buttons)
                place_25.setTextColor(Color.parseColor("#000000"))
                pl25 = false
            }
        }
        place_26.setOnClickListener {
            if (!pl26) {
                place_26.setBackgroundResource(R.drawable.back_selected)
                place_26.setTextColor(Color.parseColor("#FFFFFF"))
                pl26 = true
            } else {
                place_26.setBackgroundResource(R.drawable.back_buttons)
                place_26.setTextColor(Color.parseColor("#000000"))
                pl26 = false
            }
        }
        place_27.setOnClickListener {
            if (!pl27) {
                place_27.setBackgroundResource(R.drawable.back_selected)
                place_27.setTextColor(Color.parseColor("#FFFFFF"))
                pl27 = true
            } else {
                place_27.setBackgroundResource(R.drawable.back_buttons)
                place_27.setTextColor(Color.parseColor("#000000"))
                pl27 = false
            }
        }
        place_28.setOnClickListener {
            if (!pl28) {
                place_28.setBackgroundResource(R.drawable.back_selected)
                place_28.setTextColor(Color.parseColor("#FFFFFF"))
                pl28 = true
            } else {
                place_28.setBackgroundResource(R.drawable.back_buttons)
                place_28.setTextColor(Color.parseColor("#000000"))
                pl28 = false
            }
        }
        place_29.setOnClickListener {
            if (!pl29) {
                place_29.setBackgroundResource(R.drawable.back_selected)
                place_29.setTextColor(Color.parseColor("#FFFFFF"))
                pl29 = true
            } else {
                place_29.setBackgroundResource(R.drawable.back_buttons)
                place_29.setTextColor(Color.parseColor("#000000"))
                pl29 = false
            }
        }
        place_30.setOnClickListener {
            if (!pl30) {
                place_30.setBackgroundResource(R.drawable.back_selected)
                place_30.setTextColor(Color.parseColor("#FFFFFF"))
                pl30 = true
            } else {
                place_30.setBackgroundResource(R.drawable.back_buttons)
                place_30.setTextColor(Color.parseColor("#000000"))
                pl30 = false
            }
        }
        place_31.setOnClickListener {
            if (!pl31) {
                place_31.setBackgroundResource(R.drawable.back_selected)
                place_31.setTextColor(Color.parseColor("#FFFFFF"))
                pl31 = true
            } else {
                place_31.setBackgroundResource(R.drawable.back_buttons)
                place_31.setTextColor(Color.parseColor("#000000"))
                pl31 = false
            }
        }
        place_32.setOnClickListener {
            if (!pl32) {
                place_32.setBackgroundResource(R.drawable.back_selected)
                place_32.setTextColor(Color.parseColor("#FFFFFF"))
                pl32 = true
            } else {
                place_32.setBackgroundResource(R.drawable.back_buttons)
                place_32.setTextColor(Color.parseColor("#000000"))
                pl32 = false
            }
        }
        place_33.setOnClickListener {
            if (!pl33) {
                place_33.setBackgroundResource(R.drawable.back_selected)
                place_33.setTextColor(Color.parseColor("#FFFFFF"))
                pl33 = true
            } else {
                place_33.setBackgroundResource(R.drawable.back_buttons)
                place_33.setTextColor(Color.parseColor("#000000"))
                pl33 = false
            }
        }
        place_34.setOnClickListener {
            if (!pl34) {
                place_34.setBackgroundResource(R.drawable.back_selected)
                place_34.setTextColor(Color.parseColor("#FFFFFF"))
                pl34 = true
            } else {
                place_34.setBackgroundResource(R.drawable.back_buttons)
                place_34.setTextColor(Color.parseColor("#000000"))
                pl34 = false
            }
        }
        place_35.setOnClickListener {
            if (!pl35) {
                place_35.setBackgroundResource(R.drawable.back_selected)
                place_35.setTextColor(Color.parseColor("#FFFFFF"))
                pl35 = true
            } else {
                place_35.setBackgroundResource(R.drawable.back_buttons)
                place_35.setTextColor(Color.parseColor("#000000"))
                pl35 = false
            }
        }
        place_36.setOnClickListener {
            if (!pl36) {
                place_36.setBackgroundResource(R.drawable.back_selected)
                place_36.setTextColor(Color.parseColor("#FFFFFF"))
                pl36 = true
            } else {
                place_36.setBackgroundResource(R.drawable.back_buttons)
                place_36.setTextColor(Color.parseColor("#000000"))
                pl36 = false
            }
        }
        place_37.setOnClickListener {
            if (!pl37) {
                place_37.setBackgroundResource(R.drawable.back_selected)
                place_37.setTextColor(Color.parseColor("#FFFFFF"))
                pl37 = true
            } else {
                place_37.setBackgroundResource(R.drawable.back_buttons)
                place_37.setTextColor(Color.parseColor("#000000"))
                pl37 = false
            }
        }
        place_38.setOnClickListener {
            if (!pl38) {
                place_38.setBackgroundResource(R.drawable.back_selected)
                place_38.setTextColor(Color.parseColor("#FFFFFF"))
                pl38 = true
            } else {
                place_38.setBackgroundResource(R.drawable.back_buttons)
                place_38.setTextColor(Color.parseColor("#000000"))
                pl38 = false
            }
        }
        place_39.setOnClickListener {
            if (!pl39) {
                place_39.setBackgroundResource(R.drawable.back_selected)
                place_39.setTextColor(Color.parseColor("#FFFFFF"))
                pl39 = true
            } else {
                place_39.setBackgroundResource(R.drawable.back_buttons)
                place_39.setTextColor(Color.parseColor("#000000"))
                pl39 = false
            }
        }
        place_40.setOnClickListener {
            if (!pl40) {
                place_40.setBackgroundResource(R.drawable.back_selected)
                place_40.setTextColor(Color.parseColor("#FFFFFF"))
                pl40 = true
            } else {
                place_40.setBackgroundResource(R.drawable.back_buttons)
                place_40.setTextColor(Color.parseColor("#000000"))
                pl40 = false
            }
        }
        place_41.setOnClickListener {
            if (!pl41) {
                place_41.setBackgroundResource(R.drawable.back_selected)
                place_41.setTextColor(Color.parseColor("#FFFFFF"))
                pl41 = true
            } else {
                place_41.setBackgroundResource(R.drawable.back_buttons)
                place_41.setTextColor(Color.parseColor("#000000"))
                pl41 = false
            }
        }
        place_42.setOnClickListener {
            if (!pl42) {
                place_42.setBackgroundResource(R.drawable.back_selected)
                place_42.setTextColor(Color.parseColor("#FFFFFF"))
                pl42 = true
            } else {
                place_42.setBackgroundResource(R.drawable.back_buttons)
                place_42.setTextColor(Color.parseColor("#000000"))
                pl42 = false
            }
        }
        place_43.setOnClickListener {
            if (!pl43) {
                place_43.setBackgroundResource(R.drawable.back_selected)
                place_43.setTextColor(Color.parseColor("#FFFFFF"))
                pl43 = true
            } else {
                place_43.setBackgroundResource(R.drawable.back_buttons)
                place_43.setTextColor(Color.parseColor("#000000"))
                pl43 = false
            }
        }
        place_44.setOnClickListener {
            if (!pl44) {
                place_44.setBackgroundResource(R.drawable.back_selected)
                place_44.setTextColor(Color.parseColor("#FFFFFF"))
                pl44 = true
            } else {
                place_44.setBackgroundResource(R.drawable.back_buttons)
                place_44.setTextColor(Color.parseColor("#000000"))
                pl44 = false
            }
        }
        place_45.setOnClickListener {
            if (!pl45) {
                place_45.setBackgroundResource(R.drawable.back_selected)
                place_45.setTextColor(Color.parseColor("#FFFFFF"))
                pl45 = true
            } else {
                place_45.setBackgroundResource(R.drawable.back_buttons)
                place_45.setTextColor(Color.parseColor("#000000"))
                pl45 = false
            }
        }
        place_46.setOnClickListener {
            if (!pl46) {
                place_46.setBackgroundResource(R.drawable.back_selected)
                place_46.setTextColor(Color.parseColor("#FFFFFF"))
                pl46 = true
            } else {
                place_46.setBackgroundResource(R.drawable.back_buttons)
                place_46.setTextColor(Color.parseColor("#000000"))
                pl46 = false
            }
        }
        place_47.setOnClickListener {
            if (!pl47) {
                place_47.setBackgroundResource(R.drawable.back_selected)
                place_47.setTextColor(Color.parseColor("#FFFFFF"))
                pl47 = true
            } else {
                place_47.setBackgroundResource(R.drawable.back_buttons)
                place_47.setTextColor(Color.parseColor("#000000"))
                pl47 = false
            }
        }
        place_48.setOnClickListener {
            if (!pl48) {
                place_48.setBackgroundResource(R.drawable.back_selected)
                place_48.setTextColor(Color.parseColor("#FFFFFF"))
                pl48 = true
            } else {
                place_48.setBackgroundResource(R.drawable.back_buttons)
                place_48.setTextColor(Color.parseColor("#000000"))
                pl48 = false
            }
        }
        place_49.setOnClickListener {
            if (!pl49) {
                place_49.setBackgroundResource(R.drawable.back_selected)
                place_49.setTextColor(Color.parseColor("#FFFFFF"))
                pl49 = true
            } else {
                place_49.setBackgroundResource(R.drawable.back_buttons)
                place_49.setTextColor(Color.parseColor("#000000"))
                pl49 = false
            }
        }
        place_50.setOnClickListener {
            if (!pl50) {
                place_50.setBackgroundResource(R.drawable.back_selected)
                place_50.setTextColor(Color.parseColor("#FFFFFF"))
                pl50 = true
            } else {
                place_50.setBackgroundResource(R.drawable.back_buttons)
                place_50.setTextColor(Color.parseColor("#000000"))
                pl50 = false
            }
        }
        place_51.setOnClickListener {
            if (!pl51) {
                place_51.setBackgroundResource(R.drawable.back_selected)
                place_51.setTextColor(Color.parseColor("#FFFFFF"))
                pl51 = true
            } else {
                place_51.setBackgroundResource(R.drawable.back_buttons)
                place_51.setTextColor(Color.parseColor("#000000"))
                pl51 = false
            }
        }

    }

    private fun setupViews() {
        bronirovat.setOnClickListener {
            val places = listOf(pl1, pl2, pl3,pl4,pl5,pl6,pl7,pl8,pl9,pl10,pl11,pl12,pl13,pl14,pl15,
                                pl16,pl17,pl18,pl19,pl20,pl21,pl22,pl23,pl24,pl25,pl26,pl27,pl28,pl29,pl30,
                                pl31,pl32,pl33,pl34,pl35,pl36,pl37,pl38,pl39,pl40,pl41,pl42,pl43,pl44,pl45,
                                pl46,pl47,pl48,pl49,pl50,pl51)

            var n = 1

            for(i in places){
                if(i) break
                else n++
            }

            val intent = Intent(this, PassengersActivity::class.java)
            intent.putExtra("place", n)
            startActivity(intent)
        }
    }
}