package com.example.appsorteio

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.appsorteio.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SortearNumero.setOnClickListener(View.OnClickListener {
            val numeroAleatorio = Random().nextInt(10)
            val texto = getString(R.string.texto_sorteio, numeroAleatorio)
            binding.numeroSorteado.text = texto
        })
    }
}