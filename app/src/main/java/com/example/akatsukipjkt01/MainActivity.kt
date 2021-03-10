package com.example.akatsukipjkt01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.akatsukipjkt01.databinding.ActivityMainBinding
import java.util.logging.Logger

lateinit private var binding:ActivityMainBinding
data class User(var firstName:String)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        changeName()
    }
    fun changeName(){
        binding.button.setOnClickListener {
            binding.editName.text=binding.editName.editableText
            Log.e(binding.editName.editableText.toString(),"MainActivity")
            binding.text=User(binding.editName.text.toString())
        }
    }
}