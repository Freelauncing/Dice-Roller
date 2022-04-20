package com.saiharshafinalexam

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*


class MainActivityViewModel:ViewModel() {

    private val _die = MutableLiveData<Die>()
    val dice: LiveData<Die> = _die

    init {
        val first = rand(1,6).toString()
        val second = rand(1,6).toString()

        _die.value = Die(first,second,getImageResource(first),getImageResource(second))
    }

    fun rand(from: Int, to: Int) : Int {
        return Random().nextInt(to - from) + from
    }

    fun refreshDice(){
        val first = rand(1,6).toString()
        val second = rand(1,6).toString()

        _die.value = Die(first,second,getImageResource(first),getImageResource(second))
    }

    fun getImageResource(value:String):Int{
        return when(value){
            "1" -> R.drawable.dice1
            "2" -> R.drawable.dice2
            "3" -> R.drawable.dice3
            "4" -> R.drawable.dice4
            "5" -> R.drawable.dice5
            else -> R.drawable.dice6
        }
    }
}

@BindingAdapter("android:src")
fun setImageViewResource(imageView: ImageView, resource: Int) {
    imageView.setImageResource(resource)
}