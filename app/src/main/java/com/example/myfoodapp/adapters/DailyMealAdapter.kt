package com.example.myfoodapp.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.activities.DetailedDailyMealActivity
import com.example.myfoodapp.databinding.DailyMealItemBinding
import com.example.myfoodapp.models.DailyMealModel

class DailyMealAdapter(private val context: Context, private val list: List<DailyMealModel>) :
    RecyclerView.Adapter<DailyMealAdapter.ViewHolder>() {

    class ViewHolder(bind: DailyMealItemBinding) : RecyclerView.ViewHolder(bind.root) {
        private val bind: DailyMealItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: DailyMealModel) {
            bind.image.setImageResource(item.image)
            bind.title.text = item.name
            bind.desc.text = item.desc
            bind.discount.text = item.discount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DailyMealItemBinding.bind(
                LayoutInflater.from(context).inflate(R.layout.daily_meal_item, parent, false)
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setView(list[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailedDailyMealActivity::class.java)
            intent.putExtra("type", list[position].type)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}