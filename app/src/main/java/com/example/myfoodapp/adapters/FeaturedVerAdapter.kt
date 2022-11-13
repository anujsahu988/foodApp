package com.example.myfoodapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.FeaturedVerItemBinding
import com.example.myfoodapp.models.FeatureVerModel

class FeaturedVerAdapter(
    private val context: Context,
    private val list: List<FeatureVerModel>
) :
    RecyclerView.Adapter<FeaturedVerAdapter.ViewHolder>() {

    class ViewHolder(bind: FeaturedVerItemBinding) : RecyclerView.ViewHolder(bind.root) {
        private val bind: FeaturedVerItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: FeatureVerModel) {
            bind.image.setImageResource(item.image)
            bind.name.text = item.name
            bind.desc.text = item.desc
            bind.rating.text = item.rating
            bind.timing.text = item.timing
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FeaturedVerItemBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.featured_ver_item, parent, false)
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