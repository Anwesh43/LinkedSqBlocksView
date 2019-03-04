package com.anwesh.uiprojects.linkedsqblocksrotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.sqblocksrotview.SqBlocksRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SqBlocksRotView.create(this)
    }
}
