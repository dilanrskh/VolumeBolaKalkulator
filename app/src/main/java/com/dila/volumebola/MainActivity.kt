package com.dila.volumebola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dila.volumebola.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolume.setOnClickListener {
            val jariLingkaran = binding.edtJariLingkaran.text.toString()
            proses(jariLingkaran)
        }
    }

    private fun proses(jariLingkaran: String) {
        if (jariLingkaran.isEmpty()) {
            Toast.makeText(this@MainActivity, "Jari Jari Tidak Boleh Kosong !", Toast.LENGTH_SHORT)
                .show()
        }
        if (jariLingkaran.isNotEmpty()) {
            hitung(jariLingkaran.toDouble())
        }

    }

    private fun hitung(jariLingkaran: Double) {
        var hasil = 0.0
        hasil = 4 * ( 3.14 * jariLingkaran * jariLingkaran * jariLingkaran ) / 3
        binding.tvHasil.text = hasil.toString()

    }
}

