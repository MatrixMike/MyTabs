package com.electroteach.mytabs

import android.os.Build
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import com.electroteach.mytabs.ui.main.SectionsPagerAdapter
import gearsOut
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        val current = LocalDateTime.now()
        val myInt = 17
        val myString = "Some text from Mike $myInt " // + current
        val myString2 = String.format(" %tB ", current)
        val formatted = String.format("Q %.2f   %.2f   %.2f ", 3.1, 3.2, 3.3)
        gearsOut ()
        fab.setOnClickListener { view ->
            Snackbar.make(view, myString + myString2 + formatted + current, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }
}