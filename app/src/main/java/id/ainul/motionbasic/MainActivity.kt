package id.ainul.motionbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import id.ainul.motionbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonClose.setOnClickListener {
            Toast.makeText(this, "Close button", Toast.LENGTH_SHORT).show()
        }

        binding.buttonPlay.setOnClickListener {
            Toast.makeText(this, "Play button", Toast.LENGTH_SHORT).show()
        }
    }
}