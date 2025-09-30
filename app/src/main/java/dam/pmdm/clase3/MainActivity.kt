package dam.pmdm.clase3

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dam.pmdm.clase3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.luigiCardview.root.setOnClickListener {
            //Toast.makeText(this, "Luigi", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("character", "Luigi")
            startActivity(intent)
        }

        binding.marioCardview.root.setOnClickListener {
            Toast.makeText(this, "Mario", Toast.LENGTH_SHORT).show()
        }

        binding.peachCardview.root.setOnClickListener {
            Toast.makeText(this, "Peach", Toast.LENGTH_SHORT).show()
        }

        binding.yoshiCardview.root.setOnClickListener {
            Toast.makeText(this, "Yoshi", Toast.LENGTH_SHORT).show()
        }

    }
}