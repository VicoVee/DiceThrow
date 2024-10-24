package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel : ViewModel() {
    private val rollValue = MutableLiveData<Int>()

    fun getRollValue(): LiveData<Int> {
        return rollValue
    }

    fun setRollValue(newRoll : Int) {
        rollValue.value = newRoll
    }

}