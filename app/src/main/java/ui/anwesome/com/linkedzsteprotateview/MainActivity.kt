package ui.anwesome.com.linkedzsteprotateview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import ui.anwesome.com.zsteprotateview.ZStepRotateView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ZStepRotateView.create(this)
        fullScreen()
    }
}

fun MainActivity.fullScreen() {
    supportActionBar?.hide()
    window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
}
