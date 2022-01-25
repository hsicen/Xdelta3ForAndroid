package com.lenovo.leos.patch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lenovo.leos.xdelta3.Patch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Patch.isSoLoaded()) {
            println("hsc:  apply result: " + Patch.applyPatch("", "", ""))
        }
    }
}