package com.example.atividadeavaliativa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.atividadeavaliativa.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voltar.setOnClickListener(){
            val voltarTelaPrincipal = Intent(this,MainActivity::class.java)
            startActivity(voltarTelaPrincipal)
        }
    }
}