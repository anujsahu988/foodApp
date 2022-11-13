package com.example.myfoodapp.ui.home

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfoodapp.R
import com.example.myfoodapp.adapters.HomeHorAdapter
import com.example.myfoodapp.adapters.HomeVerAdapter
import com.example.myfoodapp.adapters.UpdateVerticalRec
import com.example.myfoodapp.databinding.FragmentHomeBinding
import com.example.myfoodapp.models.HomeHorModel
import com.example.myfoodapp.models.HomeVerModel

class HomeFragment : Fragment(), UpdateVerticalRec {

    private var _binding: FragmentHomeBinding? = null
    private val bind get() = _binding!!

    private val homeHorModelList = ArrayList<HomeHorModel>()
    private lateinit var homeHorAdapter: HomeHorAdapter

    private val homeVerModelList = ArrayList<HomeVerModel>()
    private lateinit var homeVerAdapter: HomeVerAdapter

    private lateinit var mCtX: Context

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        mCtX = container?.context!!
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //horizontal
        homeHorModelList.add(HomeHorModel(R.drawable.pizza, "Pizza"))
        homeHorModelList.add(HomeHorModel(R.drawable.hamburger, "HamBurger"))
        homeHorModelList.add(HomeHorModel(R.drawable.fried_potatoes, "Fries"))
        homeHorModelList.add(HomeHorModel(R.drawable.ice_cream, "Ice Cream"))
        homeHorModelList.add(HomeHorModel(R.drawable.sandwich, "Sandwich"))

        homeHorAdapter = HomeHorAdapter(requireActivity(), homeHorModelList, this)
        bind.homeHorRec.adapter = homeHorAdapter
        bind.homeHorRec.setHasFixedSize(true)
        bind.homeHorRec.isNestedScrollingEnabled = false

        //vertical

        homeVerAdapter = HomeVerAdapter(mCtX, homeVerModelList)
        bind.homeVerRec.adapter = homeVerAdapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun callBack(position: Int, list: ArrayList<HomeVerModel>) {
        homeVerAdapter = HomeVerAdapter(mCtX, list)
        homeVerAdapter.notifyDataSetChanged()
        bind.homeVerRec.adapter = homeVerAdapter
    }
}