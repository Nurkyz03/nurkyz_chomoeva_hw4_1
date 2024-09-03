package com.geeks.nurkyz_chomoeva_hw4_1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.geeks.nurkyz_chomoeva_hw4_1.databinding.FragmentDetailBinding

class Detail : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val args : DetailArgs by navArgs<DetailArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        val userDetails = args.user
        if (userDetails != null) {
            binding.tvName.text = userDetails.name
            binding.tvEmail.text = userDetails.email
            binding.tvPassword.text = userDetails.password
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}


