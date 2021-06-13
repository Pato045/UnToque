package com.patricioglenn.untoque

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patricioglenn.untoque.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)

        var navController = findNavController()
        binding.button.setOnClickListener {
            var action = HomeFragmentDirections.actionHomeFragmentToCategoryFragment()
            navController.navigate(action)
        }
    }

}