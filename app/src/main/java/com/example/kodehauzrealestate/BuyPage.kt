package com.example.kodehauzrealestate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class BuyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_page)

        val btn1 = findViewById<Button>(R.id.buttonbuy1) as Button
        val btn2 = findViewById<Button>(R.id.buttonbuy2) as Button
        val btn3 = findViewById<Button>(R.id.buttonbuy3) as Button

        btn1.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array =  arrayOf("drmusic2021@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL,str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT,"House A: 3,000,000")
            intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 3,000,000")
            intent.type = "message/house D"
            val a = Intent.createChooser(intent,"Launch Email")
            startActivity(a)
        }

        btn2.setOnClickListener {
            val intent =Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array =  arrayOf("drmusic2021@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL,str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT,"House B: 1,500,000")
            intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 1,500,000")
            intent.type = "message/house D"
            val a = Intent.createChooser(intent,"Launch Email")
            startActivity(a)
        }

        btn3.setOnClickListener {
            val intent =Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array =  arrayOf("drmusic2021@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL,str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT,"House C: 2,500,000")
            intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 2,500,000")
            intent.type = "message/house D"
            val a = Intent.createChooser(intent,"Launch Email")
            startActivity(a)
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