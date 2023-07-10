package com.myapplication

import android.app.Application
import ui.color.ColorModeProvider

class AndroidApp: Application() {
    init {
        initCommonStrings()
    }

    private fun initCommonStrings() {
        ColorModeProvider.context = this@AndroidApp
    }
}