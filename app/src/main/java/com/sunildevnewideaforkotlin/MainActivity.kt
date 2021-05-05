package com.sunildevnewideaforkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var totalAttempts = 3
    lateinit var user:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val userNameStr = findViewById<EditText>(R.id.editTextTextPersonName)
val tesxt = findViewById<TextView>(R.id.textView3)
val btn = findViewById<Button>(R.id.button2)
        tesxt.text = "You have attempt $totalAttempts"

        printInitials("sunil kumar")



        btn.setOnClickListener {

            var suni = userNameStr.text.get(4)
            Log.e("hjhkh","jhhjjhk : "+suni)


            if (totalAttempts >=1) {

                Log.e("hjkdfhdkhf","fdlfh:  "+userNameStr.text)
                if (userNameStr.text.toString().equals("pass",ignoreCase = true)) {
                    System.out.println("Correct");
                    Toast.makeText(this, "Correct", Toast.LENGTH_LONG).show()
                }
                else {
                    Toast.makeText(this,"Incorrect",Toast.LENGTH_LONG).show()

                    totalAttempts--
                    tesxt.text = "You have attempt $totalAttempts"


                }

            } else

            Toast.makeText(this,"Maximum number of attempts exceeded",Toast.LENGTH_LONG).show()

        }

        }
    private fun printInitials(name: String) {
        val nameParts = name.split(" ").toTypedArray()
        val firstName = nameParts[0]
        val firstNameChar = firstName[0]
        if (nameParts.size > 1) {
            println("First character of first name: $firstNameChar")
            val lastName = nameParts[nameParts.size - 1]
            var lastNameChar = lastName[0]
            println("First character of last name: $lastNameChar")
        } else {
            println("First character name: $firstNameChar")
        }

    }


    }