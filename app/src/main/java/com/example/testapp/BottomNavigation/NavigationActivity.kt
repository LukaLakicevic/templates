package com.example.testapp.BottomNavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.testapp.BottomNavigation.fragments.DashboardFragment
import com.example.testapp.BottomNavigation.fragments.InfoFragment
import com.example.testapp.BottomNavigation.fragments.SettingsFragment
import com.example.testapp.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation_bar)
        val navController = findNavController(R.id.nav_fragment)
        bottomNavigationView.setupWithNavController(navController)
    }
}