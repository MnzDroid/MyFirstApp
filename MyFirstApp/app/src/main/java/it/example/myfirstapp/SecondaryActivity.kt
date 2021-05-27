package it.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondaryActivity: AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        //Second method for onClick
        val btnExit = findViewById<Button>(R.id.btnExit)
        val copyText = findViewById<TextView>(R.id.copytvText)

        btnExit.setOnClickListener(this)

        val newText = intent.extras?.get("text")
        copyText.text = newText as CharSequence
    }

    override fun onClick(v: View?) {
        if(v != null){
            if(v.id == R.id.btnExit){
                finish()
            }
        }
    }
}