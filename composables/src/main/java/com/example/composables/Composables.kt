package com.example.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen(buttonText: String) {
  Column {
    Text("hello")
    Text("world")
    Button(onClick = {}) {
      Text(buttonText)
    }
  }
}

@Preview
@Composable
fun ScreenPreview() {
  Screen("button")
}