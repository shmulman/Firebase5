package il.co.shmulman.www.firebase5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*


var database = FirebaseDatabase.getInstance()
var myRef = database.getReference("message")

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {
            statusUpdate.text = "Start button pressed"
        }

        clearButton.setOnClickListener {
            statusUpdate.text = "Clear button pressed"
        }

        saveButton.setOnClickListener {
            statusUpdate.text = "Save button pressed"
            myRef.setValue("Hello, World!")
            outputText.text = "\n"
        }

        markButton.setOnClickListener {
            statusUpdate.text = "Mark button pressed"
        }
    }
}
