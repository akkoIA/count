package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int=0

        val counttextView=findViewById<TextView>(R.id.counttextView)
        val button=findViewById<Button>(R.id.button)

        button.setOnClickListener {
            count++
            counttextView.setText(count.toString())

        }

    }
}
