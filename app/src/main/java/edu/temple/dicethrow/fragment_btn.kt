package edu.temple.dicethrow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


interface buttonInterface {
    fun buttonClick()
}

class fragment_btn : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_btn, container, false).apply {
            //Initialize the button
            findViewById<Button>(R.id.button).setOnClickListener{
                (activity as MainActivity).buttonClick()
            }
        }
    }

}

