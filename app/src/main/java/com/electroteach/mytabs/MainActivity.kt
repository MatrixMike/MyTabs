package com.electroteach.mytabs

import android.icu.text.DateFormat
import android.icu.text.SimpleDateFormat
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.electroteach.mytabs.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import gearsOut
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)

        val viewPager: ViewPager = findViewById(R.id.view_pager)	// find View by ID
        viewPager.adapter = sectionsPagerAdapter

        val tabs: TabLayout = findViewById(R.id.tabs)			// find View by ID
        tabs.setupWithViewPager(viewPager)

        val fab: FloatingActionButton = findViewById(R.id.fab)		// find View by ID

        val current = LocalDateTime.now()
        val dateFormat: DateFormat = SimpleDateFormat("hh.mm aa")
        val dateString: String = dateFormat.format(Date()).toString()
    //    println("Current time in AM/PM: $dateString")
        val myInt = 17
        val myString = "Some text from Mike $myInt " // + current
        val myString2 = String.format(" %tB ", current)
        val formatted = String.format("Q %.2f   %.2f   %.2f ", 3.1, 3.2, 3.3)
        gearsOut ()
        fab.setOnClickListener { view ->
            Snackbar.make(
                view,
                "$myString$myString2$formatted* $dateString",
                Snackbar.LENGTH_LONG
            )
                    .setAction("Action", null).show()
        }
    }
}