package edu.temple.dicethrow

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel() {
    //MutableLiveData starts as a null object
    private val rollValue = MutableLiveData<Int>()

    fun getRollValue(): LiveData<Int> {
        return rollValue
    }

    fun setRollValue(newRoll : Int) {
        rollValue.value = newRoll
        Log.d("THROWDIE", rollValue.value.toString())
    }

}