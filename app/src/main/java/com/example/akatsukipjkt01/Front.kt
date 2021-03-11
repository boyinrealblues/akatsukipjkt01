package com.example.akatsukipjkt01

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.akatsukipjkt01.databinding.FragmentFrontBinding

class Front : Fragment() {
    data class User(var firstName:String)
 lateinit private var binding:FragmentFrontBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_front,container,false)
        changeName()
        return binding.root
    }
    fun changeName(){
        binding.button.setOnClickListener {
            binding.editName.text=binding.editName.editableText
            Log.e(binding.editName.editableText.toString(),"MainActivity")
            binding.text=User(binding.editName.text.toString())

        }
    }
}