package com.example.myfoodapp.ui.favourite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.widget.ViewPager2
import com.example.myfoodapp.databinding.FragmentFavouriteBinding
import com.example.myfoodapp.fragments.FragmentAdapter
import com.google.android.material.tabs.TabLayout

class FavouriteFragment : Fragment() {

    private var _binding: FragmentFavouriteBinding? = null
    private val bind get() = _binding!!

    private lateinit var fragmentAdapter: FragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fm = requireActivity().supportFragmentManager
        fragmentAdapter = FragmentAdapter(fm, lifecycle)

        bind.viewPager2.adapter = fragmentAdapter

        bind.tabLayout.addTab(bind.tabLayout.newTab().setText("Featured"))
        bind.tabLayout.addTab(bind.tabLayout.newTab().setText("Popular"))
        bind.tabLayout.addTab(bind.tabLayout.newTab().setText("New"))

        bind.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                bind.viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        bind.viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                bind.tabLayout.selectTab(bind.tabLayout.getTabAt(position))
            }
        })

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}