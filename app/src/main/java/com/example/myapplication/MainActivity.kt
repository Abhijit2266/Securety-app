@file:Suppress("DEPRECATION")

package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mactivity_home)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bot_bar)
        bottomBar.setOnItemSelectedListener{menuIteam->

            if (menuIteam.itemId==R.id.nav_guard){
                inflateFragment()
            }else if(menuIteam.itemId == R.id.nav_home){
                inflateHomeFragment()
            }

            true
        }

        }

    private fun inflateHomeFragment() {
        val transient = supportFragmentManager.beginTransaction()
        transient.replace(R.id.container,HomeFragment.newInstance())
        transient.commit()

    }

    private fun inflateFragment() {
        val transient = supportFragmentManager.beginTransaction()
        transient.replace(R.id.container,GuardFragment.newInstance())
        transient.commit()
    }

}






    

