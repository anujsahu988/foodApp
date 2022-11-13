package com.example.myfoodapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.R
import com.example.myfoodapp.adapters.FeaturedAdapter
import com.example.myfoodapp.adapters.FeaturedVerAdapter
import com.example.myfoodapp.databinding.FragmentFirstBinding
import com.example.myfoodapp.models.FeatureModel
import com.example.myfoodapp.models.FeatureVerModel

class FirstFragment : Fragment() {

    private lateinit var bind: FragmentFirstBinding
    private var featureModelList = ArrayList<FeatureModel>()
    private lateinit var featuredAdapter: FeaturedAdapter

    private var featureVerModel = ArrayList<FeatureVerModel>()
    private lateinit var featuredVerAdapter: FeaturedVerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentFirstBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //horizontal
        bind.featuredHorRec.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        featureModelList.add(FeatureModel(R.drawable.fav1, "Featured 1", "Description 1"))
        featureModelList.add(FeatureModel(R.drawable.fav2, "Featured 2", "Description 2"))
        featureModelList.add(FeatureModel(R.drawable.fav3, "Featured 3", "Description 3"))

        featuredAdapter = FeaturedAdapter(requireContext(), featureModelList)
        bind.featuredHorRec.adapter = featuredAdapter

        //vertical
        bind.featuredVerRec.layoutManager =
            LinearLayoutManager(requireContext())

        featureVerModel.add(
            FeatureVerModel(
                R.drawable.ver1,
                "Featured 1",
                "Description 1",
                "4.8",
                "10:00 - 8:00"
            )
        )
        featureVerModel.add(
            FeatureVerModel(
                R.drawable.ver2,
                "Featured 2",
                "Description 2",
                "4.8",
                "10:00 - 8:00"
            )
        )
        featureVerModel.add(
            FeatureVerModel(
                R.drawable.ver3,
                "Featured 3",
                "Description 3",
                "4.8",
                "10:00 - 8:00"
            )
        )

        featuredVerAdapter = FeaturedVerAdapter(requireContext(), featureVerModel)
        bind.featuredVerRec.adapter = featuredVerAdapter

    }
}