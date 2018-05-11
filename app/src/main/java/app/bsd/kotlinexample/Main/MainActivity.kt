package app.bsd.kotlinexample.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import app.bsd.kotlinexample.Detail.detail
import app.bsd.kotlinexample.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnChange.setOnClickListener({
            Toast.makeText(this, "Hola oswaldo", Toast.LENGTH_LONG).show()
            txtMessage.text = "Hola oswaldo"

            val intent = Intent(this, detail::class.java)
            startActivity(intent)
        })

    }
}
