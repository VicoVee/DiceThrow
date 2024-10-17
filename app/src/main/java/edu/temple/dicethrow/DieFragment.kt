package edu.temple.dicethrow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlin.random.Random

const val DIESIDE = "sidenumber"

class DieFragment : Fragment() {
    lateinit var dieTextView: TextView

    var dieSides: Int = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            it.getInt(DIESIDE).run {
                dieSides = this
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_die, container, false).apply {
            dieTextView = findViewById(R.id.dieTextView)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //When the view is first created, a number is randomly generated
        throwDie()
        //When the TextView is clicked, the number will randomize again
        view.setOnClickListener{
            throwDie()
        }
    }

    fun throwDie() {
        //Random.nextInt(dieSide) generates a number from 0-5
        dieTextView.text = (Random.nextInt(dieSides)+1).toString()
    }

    companion object{
        //Creating function newInstance, which will create a DieFragment object
        fun newInstance(sides : Int): DieFragment{
            val bundle = Bundle()
            bundle.putInt(DIESIDE, sides)

            //Create die fragment object
            val frag = DieFragment()

            //Put bundle in the fragment
            frag.arguments = bundle

            //return the DieFragment
            return frag
        }
    }
}