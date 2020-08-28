package com.example.kodehauzrealestate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


        val button : Button = findViewById(R.id.rentbutton)
        button.setOnClickListener {
            val intent = Intent(this, RentPage::class.java)
            startActivity(intent)
        }
        val button2 : Button = findViewById(R.id.buybutton)
        button2.setOnClickListener {
            val intent = Intent(this, BuyPage::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {

            R.id.Aboutus -> {
                val intent = Intent(this, AboutUs::class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)

            }
            R.id.contactus -> {
                val intent = Intent(this, ContactUs::class.java)
                startActivity(intent)
                return super.onOptionsItemSelected(item)

            }
            else -> return super.onOptionsItemSelected(item)

        }

    }

}