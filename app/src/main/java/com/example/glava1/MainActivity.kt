package com.example.glava1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private  lateinit var trueButton: Button
    private  lateinit var falseButton: Button
    private val questionBank = listOf(
        Question(R.string.One, true),
        Question(R.string.Two, true),
        Question(R.string.Three, true),
        Question(R.string.Four, true))
    private  var currentIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        trueButton.setOnClickListener { view: View ->
            Toast.makeText( this,
                R.string.correct_toast,
                Toast.LENGTH_LONG)
                .show()

        }
        falseButton.setOnClickListener { view: View ->
            Toast.makeText( this,
                R.string.incorrect_toast,
                Toast.LENGTH_LONG)
                .show()
        }
    }
}