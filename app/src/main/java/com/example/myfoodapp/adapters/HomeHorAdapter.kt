package com.example.myfoodapp.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.HomeHorizontalItemBinding
import com.example.myfoodapp.models.HomeHorModel
import com.example.myfoodapp.models.HomeVerModel

@Suppress("NAME_SHADOWING")
class HomeHorAdapter(
    private val activity: Activity,
    private val list: ArrayList<HomeHorModel>,
    private val updateVerticalRec: UpdateVerticalRec
) :
    RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {

    private var check = true
    private var select = true
    private var rowIndex = -1

    class ViewHolder(bind: HomeHorizontalItemBinding) : RecyclerView.ViewHolder(bind.root) {

        private val bind: HomeHorizontalItemBinding

        init {
            this.bind = bind
        }

        fun setView(item: HomeHorModel) {
            bind.horImg.setImageResource(item.image)
            bind.horText.text = item.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            HomeHorizontalItemBinding.bind(
                LayoutInflater.from(activity).inflate(R.layout.home_horizontal_item, parent, false)
            )
        )
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.setView(list[position])

        if (check) {
            val homeVerModel = ArrayList<HomeVerModel>()
            homeVerModel.add(
                HomeVerModel(
                    R.drawable.pizza1,
                    "Pizza 1",
                    "10:00 - 23:00",
                    "4.9",
                    "Min - $35"
                )
            )
            homeVerModel.add(
                HomeVerModel(
                    R.drawable.pizza2,
                    "Pizza 2",
                    "10:00 - 23:00",
                    "4.9",
                    "Min - $35"
                )
            )
            homeVerModel.add(
                HomeVerModel(
                    R.drawable.pizza3,
                    "Pizza 3",
                    "10:00 - 23:00",
                    "4.9",
                    "Min - $35"
                )
            )
            homeVerModel.add(
                HomeVerModel(
                    R.drawable.pizza4,
                    "Pizza 4",
                    "10:00 - 23:00",
                    "4.9",
                    "Min - $35"
                )
            )

            updateVerticalRec.callBack(position, homeVerModel)
            check = false
        }

        holder.itemView.setOnClickListener {
            rowIndex = position
            notifyDataSetChanged()

            when (position) {
                0 -> {

                    val homeVerModel = ArrayList<HomeVerModel>()
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.pizza1,
                            "Pizza 1",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.pizza2,
                            "Pizza 2",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.pizza3,
                            "Pizza 3",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.pizza4,
                            "Pizza 4",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )

                    updateVerticalRec.callBack(position, homeVerModel)

                }
                1 -> {

                    val homeVerModel = ArrayList<HomeVerModel>()
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.burger1,
                            "Burger 1",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.burger2,
                            "Burger 2",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.burger4,
                            "Burger 3",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )

                    updateVerticalRec.callBack(position, homeVerModel)

                }
                2 -> {

                    val homeVerModel = ArrayList<HomeVerModel>()
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.fries1,
                            "Fries 1",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.fries2,
                            "Fries 2",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.fries3,
                            "Fries 3",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.fries4,
                            "Fries 4",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )

                    updateVerticalRec.callBack(position, homeVerModel)

                }
                3 -> {

                    val homeVerModel = ArrayList<HomeVerModel>()
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.icecream1,
                            "Ice Cream 1",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.icecream2,
                            "Ice Cream 2",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.icecream3,
                            "Ice Cream 3",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.icecream4,
                            "Ice Cream 4",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )

                    updateVerticalRec.callBack(position, homeVerModel)

                }
                4 -> {

                    val homeVerModel = ArrayList<HomeVerModel>()
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.sandwich1,
                            "Sandwich 1",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.sandwich2,
                            "Sandwich 2",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.sandwich3,
                            "Sandwich 3",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )
                    homeVerModel.add(
                        HomeVerModel(
                            R.drawable.sandwich4,
                            "Sandwich 4",
                            "10:00 - 23:00",
                            "4.9",
                            "Min - $35"
                        )
                    )

                    updateVerticalRec.callBack(position, homeVerModel)
                }
            }
        }

        if (select) {
            if (position == 0) {
                holder.itemView.setBackgroundResource(R.drawable.change_bg)
                select = false
            }
        } else {
            if (rowIndex == position) {
                holder.itemView.setBackgroundResource(R.drawable.change_bg)
            } else {
                holder.itemView.setBackgroundResource(R.drawable.default_bg)
            }

        }

    }


    override fun getItemCount(): Int {
        return list.size
    }
}