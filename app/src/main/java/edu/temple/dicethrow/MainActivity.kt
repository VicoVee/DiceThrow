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

        //Check if the fragment is initialized and in the dieContainer
        if (supportFragmentManager.findFragmentById(R.id.dieContainer) == null) {
            //If not initialized, then add fragment to container
            supportFragmentManager
                .beginTransaction()
                .add(R.id.dieContainer, throwFrag)
                .commit()
        } else {
            //If there is already a fragment, simply call the throwDie function
            //To change the die value on existing fragment
            (supportFragmentManager.findFragmentById(R.id.dieContainer) as DieFragment).throwDie()
        }
    }
}