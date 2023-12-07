package com.shrutipandit.myapplicationbysk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shrutipandit.myapplicationbysk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myarray = arrayListOf<String>()
        var apple = Apple()
        apple.myApple(this,myarray,binding.textview)

        val password = apple.password("pkt@#")
        binding.textview.text = password

        binding.btn.setOnClickListener {
            val result = apple.tableArray(binding.edittext.text.trim().toString().toInt())
            binding.textview.text = result.toString()

        }

        val myapple = Apple()
         myapple.dataAddToFireBase("Shruti","Sk@p#")
        val myapplere = Apple()
        var retriveData= myapple.retriveDataFrebase()
        binding.textview.text = retriveData.toString()
        binding.addbtn.setOnClickListener {
            binding.num.text = executeLongRunningTask().toString()
        }
    }
    private fun executeLongRunningTask(){
        for (i in 1..10000){

        }
    }
    fun doAction(view: View){
        executeLongRunningTask()
    }

    }