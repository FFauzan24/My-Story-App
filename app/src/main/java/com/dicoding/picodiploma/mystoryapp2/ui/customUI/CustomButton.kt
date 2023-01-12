package com.dicoding.picodiploma.mystoryapp2.ui.customUI

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.dicoding.picodiploma.mystoryapp2.R

class CustomButton: AppCompatButton {

    private lateinit var backgroundEnable: Drawable
    private lateinit var backgroundDisable: Drawable
    private var txtColor: Int = 0

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttrs: Int) : super(
        context,
        attrs,
        defStyleAttrs
    ) {
        init()
    }

    private fun init(){
        txtColor = ContextCompat.getColor(context, R.color.white)
        backgroundEnable = ContextCompat.getDrawable(context, R.color.pink_50) as Drawable
        backgroundDisable = ContextCompat.getDrawable(context, R.color.pink_70) as Drawable
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        background = if (isEnabled) backgroundEnable else backgroundDisable

        textSize = 14f
        setTextColor(txtColor)
        gravity = Gravity.CENTER
        isAllCaps = false
    }

}