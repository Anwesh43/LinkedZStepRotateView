package ui.anwesome.com.linkedzsteprotateview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ui.anwesome.com.zsteprotateview.ZStepRotateView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ZStepRotateView.create(this)
    }
}
