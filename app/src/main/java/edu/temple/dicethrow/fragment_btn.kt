package edu.temple.dicethrow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


interface ButtonInterface {
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
                //Call the buttonClick function in the MainActivity
                //Since activity is a FragmentActivity, we need to cast it to MainActivity
                // (activity as MainActivity).buttonClick()

                //To make it more generic, we can cast it to ButtonInterface
                //As a result, we can use this fragment in other activities/projects since
                //it no longer relies specifically on MainActivity (cohesion
                (activity as ButtonInterface).buttonClick()
            }
        }
    }

}

