package com.example.showkasemultimodulebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.android.showkase.models.Showkase

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    startActivity(Showkase.getBrowserIntent(this))
  }
}