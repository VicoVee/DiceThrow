package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rollDiceButton).setOnClickListener{
            //TODO: Reference the fragment and call its function
            //Reference our already initialized fragmentContainer: dieContainer
            //However, this findFragmentById ONLY returns the generic Fragment
            //Thus, the methods in DieFragment cannot be accessed
//            (supportFragmentManager.findFragmentById(R.id.dieContainer) as DieFragment).throwDie()


            //Create a fragment
            val fragCompanion = DieFragment.newInstance(20)

            //Check if a fragment is already created in the fragmentContainer: dieContainer
            if (supportFragmentManager.findFragmentById(R.id.dieContainer) !is DieFragment) {
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.dieContainer, fragCompanion)

                    .commit()
            }
        }
    }
}