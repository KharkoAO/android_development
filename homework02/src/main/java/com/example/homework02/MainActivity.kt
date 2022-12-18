package com.example.homework02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val borderLeftSet = findViewById<EditText>(R.id.leftBorderSetNumbers)
        val borderRightSet = findViewById<EditText>(R.id.rightBorderSetNumbers)
        val borderLeftInSet = findViewById<EditText>(R.id.leftBorderNumbersInSet)
        val borderRightInSet = findViewById<EditText>(R.id.rightBorderNumbersInSet)
        val generate = findViewById<Button>(R.id.generateRandomNumbers)

        generate.setOnClickListener {
            val intent = Intent(this@MainActivity, OperationsActivity::class.java)
            val randomizer = Randomizer().getSetRandomNumbers(
                Integer.parseInt(borderLeftSet.text.toString()),
                Integer.parseInt(borderRightSet.text.toString()),
                Integer.parseInt(borderLeftInSet.text.toString()),
                Integer.parseInt(borderRightInSet.text.toString())).toIntArray()
            intent.putExtra("random", randomizer)
            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val result = data?.getStringExtra("result")
        val resultView = findViewById<TextView>(R.id.resultView)
        resultView.text = result
        println(result)
    }
}
