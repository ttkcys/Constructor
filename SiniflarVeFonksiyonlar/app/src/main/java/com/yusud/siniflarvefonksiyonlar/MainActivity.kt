package com.yusud.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sinifCalismasi()
    }

    fun sinifCalismasi(){
        var superman = Superkahraman("Superman",50,"Gazeteci")
        textView2.text = "Yaş: ${superman.age}"
        superman.testFonksiyonu()
    }
}