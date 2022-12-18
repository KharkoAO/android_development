package com.example.homework02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

!class OperationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operations)

        val calculate = findViewById<Button>(R.id.calculate)
        val randomArray = intent.extras?.getIntArray("random")
        val resultIntent = Intent()

        if (randomArray != null) {
            resultIntent.putExtra("result",
                "Sum numbers array: ${randomArray.sum()}\n" +
                        "Average numbers array: ${randomArray.average()}\n" +
                        "Division parts array: ${ArrayPartsOperations().getPartsOfArrayDivisionResult(randomArray)}")
        }

        calculate.setOnClickListener {
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}
