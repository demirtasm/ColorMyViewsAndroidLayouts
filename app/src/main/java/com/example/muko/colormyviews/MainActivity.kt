package com.example.muko.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        var mixList = listOf(box_one, box_two, box_three, box_four, box_five, constraint_layout)
        for(i in mixList){
            i.setOnClickListener {
                makecolered(it)
            }
        }
    }
    private fun makecolered(view : View){
        when(view.id){
            R.id.box_one -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_two -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_blue_dark)
            R.id.box_five -> view.setBackgroundColor(Color.BLUE)
            else -> view.setBackgroundColor(Color.DKGRAY)
        }
    }
}
