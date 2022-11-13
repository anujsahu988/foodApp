package com.example.myfoodapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.DailyMealItemBinding
import com.example.myfoodapp.databinding.DetailedDailyMealItemBinding
import com.example.myfoodapp.models.DetailedDailyModel

class DetailedDailyAdapter(
    private val context: Context,
    private val list: List<DetailedDailyModel>
) :
    RecyclerView.Adapter<DetailedDailyAdapter.ViewHolder>() {

    class ViewHolder(bind: DetailedDailyMealItemBinding) : RecyclerView.ViewHolder(bind.root) {
        private val bind: DetailedDailyMealItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: DetailedDailyModel) {
            bind.image.setImageResource(item.image)
            bind.name.text = item.name
            bind.desc.text = item.desc
            bind.rating.text = item.rating
            bind.price.text = item.price
            bind.timing.text = item.timing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DetailedDailyMealItemBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.detailed_daily_meal_item, parent, false)
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setView(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}