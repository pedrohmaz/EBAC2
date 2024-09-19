package com.example.ebac2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val screen = findViewById<LinearLayoutCompat>(R.id.main)
        val text = findViewById<TextView>(R.id.tv_main)
        val editText = findViewById<EditText>(R.id.et_main)
        val button = findViewById<Button>(R.id.bt_main)

        var counter = 0
        var bgNumber = 0
        var nome = "Nome"

        editText.addTextChangedListener {
            nome = "$it"
            text.text = "$nome - Número de cliques: $counter"
        }

        button.setOnClickListener {
            counter++
            bgNumber++

            if (bgNumber > 2) bgNumber = 0

            when (bgNumber) {

                0 -> screen.background = AppCompatResources.getDrawable(this, R.drawable.bg0)
                1 -> screen.background = AppCompatResources.getDrawable(this, R.drawable.bg1)
                2 -> screen.background = AppCompatResources.getDrawable(this, R.drawable.bg2)
            }
            text.text = "$nome - Número de cliques: $counter"
        }

    }
}