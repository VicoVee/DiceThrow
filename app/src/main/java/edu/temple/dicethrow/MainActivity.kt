package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity

//FRAGMENT COMMUNICATION 2 BRANCH
class MainActivity : AppCompatActivity(), buttonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun buttonClick() {
        val fragCompanion = DieFragment()

        //Cheap and dirty way to replace the fragment lol
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.dieContainer, fragCompanion)
            .commit()
    }
}

//buttonFragment.buttonInterface