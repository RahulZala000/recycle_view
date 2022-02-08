package com.example.recyle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyle_view.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reuse.layoutManager=LinearLayoutManager(this)

        var data= ArrayList<ViewModel>()

        for(i in 1..5)
        {
            data.add(ViewModel(R.drawable.ic_launcher_background,"Item "+i))
        }

        binding.reuse.adapter=CustomAdapter(data)
    }
}