package com.example.myfoodapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.FeaturedHorItemBinding
import com.example.myfoodapp.models.FeatureModel

class FeaturedAdapter(
    private val context: Context,
    private val list: List<FeatureModel>
) :
    RecyclerView.Adapter<FeaturedAdapter.ViewHolder>() {

    class ViewHolder(bind: FeaturedHorItemBinding) : RecyclerView.ViewHolder(bind.root) {
        private val bind: FeaturedHorItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: FeatureModel) {
            bind.image.setImageResource(item.image)
            bind.name.text = item.name
            bind.desc.text = item.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FeaturedHorItemBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.featured_hor_item, parent, false)
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