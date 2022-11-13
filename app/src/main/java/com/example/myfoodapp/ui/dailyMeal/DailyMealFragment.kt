package com.example.myfoodapp.ui.dailyMeal

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfoodapp.R
import com.example.myfoodapp.adapters.DailyMealAdapter
import com.example.myfoodapp.databinding.DailyMealFragmentBinding
import com.example.myfoodapp.models.DailyMealModel

class DailyMealFragment : Fragment() {

    private var _binding: DailyMealFragmentBinding? = null
    private val bind get() = _binding!!

    private val dailyMealModel = ArrayList<DailyMealModel>()
    private lateinit var dailyMealAdapter: DailyMealAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = DailyMealFragmentBinding.inflate(inflater, container, false)
        return bind.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.dailyMealRec.layoutManager = LinearLayoutManager(context)
        dailyMealModel.add(
            DailyMealModel(
                R.drawable.breakfast,
                "Breakfast",
                "30% OFF",
                "breakfast",
                "Description Description"
            )
        )
        dailyMealModel.add(
            DailyMealModel(
                R.drawable.lunch,
                "Lunch",
                "20% OFF",
                "lunch",
                "Description Description"
            )
        )
        dailyMealModel.add(
            DailyMealModel(
                R.drawable.dinner,
                "Dinner",
                "39% OFF",
                "dinner",
                "Description Description"
            )
        )
        dailyMealModel.add(
            DailyMealModel(
                R.drawable.sweets,
                "Sweets",
                "35% OFF",
                "sweets",
                "Description Description"
            )
        )
        dailyMealModel.add(
            DailyMealModel(
                R.drawable.coffee,
                "Coffee",
                "40% OFF",
                "coffee",
                "Description Description"
            )
        )

        dailyMealAdapter = DailyMealAdapter(requireContext(), dailyMealModel)
        bind.dailyMealRec.adapter = dailyMealAdapter
        dailyMealAdapter.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}