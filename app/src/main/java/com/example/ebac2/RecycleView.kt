package com.example.ebac2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebac2.databinding.RecycleViewActivityBinding

class RecycleView() : AppCompatActivity() {

    private lateinit var binding: RecycleViewActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = RecycleViewActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.recyclerView

        val list = generateList()

        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = RecyclerViewAdapter(list)

    }

    private fun generateList(): MutableList<ContactInfo>{
        return mutableListOf(
            ContactInfo("Pedro Mazzilli", "555-9876"),
            ContactInfo("Gerson Silva", "555-2865"),
            ContactInfo("Amanda Souza", "555-1894"),
            ContactInfo("Gabriel Tramonte", "555-2757"),
            ContactInfo("Talita Takeda", "555-1864"),
            ContactInfo("Walkyria Sias", "555-2857"),
            ContactInfo("Danilo Silvestre", "555-4578"),
            ContactInfo("Caio Scalli", "555-8247"),
            ContactInfo("João Coltrano", "555-4578"),
            ContactInfo("Carlos Domingues", "555-1359"),
            ContactInfo("Dandara Lembo", "555-3865"),
            ContactInfo("Catarina Tripoli", "555-9325"),
            ContactInfo("Fábio Ortega", "555-5562"),
            ContactInfo("Gregório Mattos", "555-9572"),
            ContactInfo("Ítalo Senna", "555-9566"),
            ContactInfo("Garganta Torcicolo", "555-6422"),
            ContactInfo("Ken Masters", "555-8863"),
            ContactInfo("Dafne Gracindo", "555-8257"),
            ContactInfo("Cortana 64Bit", "555-6968"),
            ContactInfo("Jorge Aragão", "555-1174"),
        )
    }


}