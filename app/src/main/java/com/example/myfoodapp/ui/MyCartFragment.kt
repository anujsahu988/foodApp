package com.example.myfoodapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfoodapp.R
import com.example.myfoodapp.adapters.CartAdapter
import com.example.myfoodapp.databinding.FragmentMyCartBinding
import com.example.myfoodapp.models.CartModel

class MyCartFragment : Fragment() {

    private lateinit var bind: FragmentMyCartBinding

    private val list = ArrayList<CartModel>()
    private lateinit var cartAdapter: CartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentMyCartBinding.inflate(layoutInflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.cartRec.layoutManager = LinearLayoutManager(requireContext())

        list.add(CartModel(R.drawable.s1, "Order 1", "$30", "4.3"))
        list.add(CartModel(R.drawable.s2, "Order 2", "$30", "4.3"))
        list.add(CartModel(R.drawable.fav2, "Order 3", "$30", "4.3"))
        list.add(CartModel(R.drawable.s4, "Order 4", "$30", "4.3"))
        list.add(CartModel(R.drawable.fav1, "Order 5", "$30", "4.3"))
        list.add(CartModel(R.drawable.ver1, "Order 6", "$30", "4.3"))

        cartAdapter = CartAdapter(requireContext(), list)
        bind.cartRec.adapter = cartAdapter
    }
}