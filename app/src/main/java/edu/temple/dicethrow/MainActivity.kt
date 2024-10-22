package edu.temple.dicethrow

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


//FRAGMENT COMMUNICATION BRANCH
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize our Button. When it is clicked,
        // we create a new fragment that displays a random number from a specified range
        findViewById<Button>(R.id.rollDiceButton).setOnClickListener{
            //TODO: Reference the fragment and call its function

            //Reference our already initialized fragmentContainer: dieContainer
            //However, this findFragmentById ONLY returns the generic Fragment
            //Thus, the methods in DieFragment cannot be accessed
//            (supportFragmentManager.findFragmentById(R.id.dieContainer) as DieFragment).throwDie()


            // Create a fragment using companion object
            // With a companion object, we can make a fragment have different parameters
            val fragCompanion = DieFragment.newInstance(20)

            //Check if a fragment is already created in the fragmentContainer: dieContainer
            // This is used to prevent multiple fragments from initializing
            // However, this means that our ROLL button will not work as intended,
            // since a new fragment will no longer be made, thus a new number is not shown.
            if (supportFragmentManager.findFragmentById(R.id.dieContainer) !is DieFragment) {
                //If no fragment is found, add the fragment to the fragmentContainer
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.dieContainer, fragCompanion)
                    .commit()
            }
        }
    }
}