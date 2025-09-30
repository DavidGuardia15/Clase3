package dam.pmdm.clase3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dam.pmdm.clase3.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mensaje = intent.getStringExtra("character").toString()

        if(mensaje.toString() == "Luigi") {
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            binding.image.setImageResource(R.drawable.luigi)
            binding.titleText.setText(R.string.luigi)
            binding.info.setText(R.string.informationluigi)

        }else if (mensaje.toString() == "Mario") {
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            binding.image.setImageResource(R.drawable.mario)
            binding.titleText.setText(R.string.mario)
            binding.info.setText(R.string.informationmario)
        }
    }
}