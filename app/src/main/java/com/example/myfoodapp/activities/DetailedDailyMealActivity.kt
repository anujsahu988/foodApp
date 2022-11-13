package com.example.myfoodapp.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfoodapp.R
import com.example.myfoodapp.adapters.DetailedDailyAdapter
import com.example.myfoodapp.databinding.ActivityDetailedDailyMealBinding
import com.example.myfoodapp.databinding.DetailedDailyMealItemBinding
import com.example.myfoodapp.models.DetailedDailyModel

class DetailedDailyMealActivity : AppCompatActivity() {

    private lateinit var bind: ActivityDetailedDailyMealBinding

    private val detailedDailyModelList = ArrayList<DetailedDailyModel>()
    private lateinit var detailedDailyAdapter: DetailedDailyAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailedDailyMealBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val type = intent.getStringExtra("type")

        bind.detailedRec.layoutManager = LinearLayoutManager(this)
        detailedDailyAdapter = DetailedDailyAdapter(this, detailedDailyModelList)
        bind.detailedRec.adapter = detailedDailyAdapter


        if (type != null && type == "breakfast") {
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.fav1,
                    "Breakfast",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.fav2,
                    "Breakfast",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.fav3,
                    "Breakfast",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyAdapter.notifyDataSetChanged()
        }

        if (type != null && type == "sweets") {
            bind.image.setImageResource(R.drawable.sweets)
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.s1,
                    "Sweet",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.s2,
                    "Sweet",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.s3,
                    "Sweet",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )
            detailedDailyModelList.add(
                DetailedDailyModel(
                    R.drawable.s4,
                    "Sweet",
                    "description",
                    "4.4",
                    "40",
                    "10am to 9pm"
                )
            )

            detailedDailyAdapter.notifyDataSetChanged()
        }

        if (type!=null && type == "lunch"){
            bind.image.setImageResource(R.drawable.lunch)
        }

        if (type!=null && type == "dinner"){
            bind.image.setImageResource(R.drawable.dinner)
        }

        if (type!=null && type == "coffee"){
            bind.image.setImageResource(R.drawable.coffee)
        }

    }
}