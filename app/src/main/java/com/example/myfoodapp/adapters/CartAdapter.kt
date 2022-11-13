package com.example.myfoodapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.MycartItemBinding
import com.example.myfoodapp.models.CartModel

class CartAdapter(
    private val context: Context,
    private val list: List<CartModel>
) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    class ViewHolder(bind: MycartItemBinding) : RecyclerView.ViewHolder(bind.root) {
        private val bind: MycartItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: CartModel) {
            bind.image.setImageResource(item.image)
            bind.name.text = item.name
            bind.price.text = item.price
            bind.rating.text = item.rating
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            MycartItemBinding.bind(
                LayoutInflater.from(context)
                    .inflate(R.layout.mycart_item, parent, false)
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