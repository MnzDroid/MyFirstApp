package it.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getInformation()
    }

    //First method for onClick
    private fun getInformation(){
        val btnOk = findViewById<Button>(R.id.btnOk)
        val btnCanc = findViewById<Button>(R.id.btnCanc)
        val myText = findViewById<TextView>(R.id.tvText)
        val intent = Intent(this, SecondaryActivity::class.java)

        btnOk.setOnClickListener {
            intent.putExtra("text",myText.text)
            startActivity(intent)
        }
        btnCanc.setOnClickListener {
            myText.text = ""
        }
    }
}