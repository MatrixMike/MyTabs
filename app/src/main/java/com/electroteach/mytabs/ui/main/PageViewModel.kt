package com.electroteach.mytabs.ui.main

import android.os.Build
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.time.LocalDateTime
import gearsOut

class PageViewModel : ViewModel() {
    val exp1 = String.format("   ")
    val currentPVM = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        LocalDateTime.now()
    } else {
        TODO("VERSION.SDK_INT < O")
    }
    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Hello world from section: $it  " + currentPVM + "\n\n" +gearsOut()
    }

    fun setIndex(index: Int) {
        _index.value = index		// seems to be called from PLaceholderFragment.kt
    }
}