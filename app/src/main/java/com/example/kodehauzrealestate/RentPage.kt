package com.example.kodehauzrealestate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class RentPage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_page)

        val btn1 = findViewById<Button>(R.id.buttonrent1) as Button
        val btn2 = findViewById<Button>(R.id.buttonrent2) as Button
        val btn3 = findViewById<Button>(R.id.buttonrent3) as Button

        btn1.setOnClickListener {
            val intent =Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array =  arrayOf("drmusic2021@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL,str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT,"AFAHA UQUA HOUSE")
            intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 500,000")
            intent.type = "message/house D"
            val a = Intent.createChooser(intent,"Launch Email")
            startActivity(a)
            }

            btn2.setOnClickListener {
                val intent =Intent(Intent.ACTION_SEND)
                intent.data = Uri.parse("Email")
                val str_array =  arrayOf("drmusic2021@gmail.com")
                intent.putExtra(Intent.EXTRA_EMAIL,str_array)
                intent.putExtra(Intent.EXTRA_SUBJECT,"OKOPEDI HOUSE")
                intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 450,000")
                intent.type = "message/house D"
                val a = Intent.createChooser(intent,"Launch Email")
                startActivity(a)
        }

        btn3.setOnClickListener {
            val intent =Intent(Intent.ACTION_SEND)
            intent.data = Uri.parse("Email")
            val str_array =  arrayOf("drmusic2021@gmail.com")
            intent.putExtra(Intent.EXTRA_EMAIL,str_array)
            intent.putExtra(Intent.EXTRA_SUBJECT,"MKPOK HOUSE")
            intent.putExtra(Intent.EXTRA_TEXT,"2bed Room, 2bath 780+sqft 38 Afaha Uqua,Eket.Aks, Price: 400,000")
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