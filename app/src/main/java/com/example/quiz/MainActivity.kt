package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Sunny","001109060117","Sunny@gmail.com", "ABC 1234")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // assign the object to the variable created in activity
        binding.personData = aPerson


        /*
        binding.tvName.text    = aPerson.name
        binding.tvIC.text      = aPerson.ic
        binding.tvEmail.text   = aPerson.email
        binding.tvAddress.text = aPerson.address
        */
        binding.btnUpdate.setOnClickListener(){

            aPerson.email = "Sunny1234@gmail.com"

            // update the data to latest
            binding.apply { invalidateAll()  }

        }

    }
}