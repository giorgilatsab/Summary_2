package com.giorgi.summary_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giorgi.summary_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



       binding.btSave.setOnClickListener{

           val edWord =  binding.Edtext.text.toString()
           val text = binding.text
           list.add(edWord)
           text.text = list.toString()

       }
        binding.btOutput.setOnClickListener{
            val task = Anarams()
            val arr: Array < String > = arrayOf(
                list.toString());
            // Get the length of array
            val n: Int = arr.count();

            val text = binding.text
            text.text = task.anagramsPairs(arr, n).toString()

        }



    }


}