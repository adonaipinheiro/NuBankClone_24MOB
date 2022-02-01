package br.com.adonaipinheiro.nubankclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.adonaipinheiro.nubankclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setup()

        binding.userButton.setOnClickListener() {
            println("Clicou")
        }
    }

    private fun setup() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView((binding.root))
    }
}