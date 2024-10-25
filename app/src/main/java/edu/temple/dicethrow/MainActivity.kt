package edu.temple.dicethrow

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity

//ViewModelTest BRANCH
//fragment_btn.ButtonInterface
class MainActivity : AppCompatActivity(), ButtonInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //When the button is clicked
    override fun buttonClick() {
        Log.d("THROWDIE", "Button is Clicked")
        val throwFrag = DieFragment()

        //Cheap and dirty way to replace the fragment lol
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.dieContainer, throwFrag)
            .commit()
//        supportFragmentManager.(findFragmentById(R.id.dieContainer) as DieFragment)
    }
}