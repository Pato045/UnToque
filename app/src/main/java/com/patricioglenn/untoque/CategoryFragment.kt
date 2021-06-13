package com.patricioglenn.untoque

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.patricioglenn.untoque.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment(R.layout.fragment_category) {

    lateinit var binding: FragmentCategoryBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCategoryBinding.bind(view)

        val navController = findNavController()
        binding.button2.setOnClickListener {
            val action = CategoryFragmentDirections.actionCategoryFragmentToProfileFragment()
            navController.navigate(action)
        }
    }

}