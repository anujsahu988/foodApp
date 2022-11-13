package com.example.myfoodapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.HomeVerticalItemBinding
import com.example.myfoodapp.models.HomeVerModel

class HomeVerAdapter(private val context : Context , private val list : ArrayList<HomeVerModel>) :
	RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {

	class ViewHolder(bind : HomeVerticalItemBinding) : RecyclerView.ViewHolder(bind.root) {

		private val bind : HomeVerticalItemBinding

		init {
			this.bind = bind
		}

		fun setView(item : HomeVerModel) {
			bind.verImg.setImageResource(item.image)
			bind.name.text = item.name
			bind.timing.text = item.timing
			bind.rating.text = item.rating
			bind.price.text = item.price
		}

	}

	override fun onCreateViewHolder(parent : ViewGroup , viewType : Int) : ViewHolder {
		return ViewHolder(
			HomeVerticalItemBinding.bind(
				LayoutInflater.from(context).inflate(R.layout.home_vertical_item , parent , false)
			)
		)
	}

	override fun onBindViewHolder(holder : ViewHolder , position : Int) {
		holder.setView(list[position])
	}

	override fun getItemCount() : Int {
		return list.size
	}
}