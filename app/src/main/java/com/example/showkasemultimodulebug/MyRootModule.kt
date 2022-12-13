package com.example.showkasemultimodulebug

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.android.showkase.annotation.ShowkaseRoot
import com.airbnb.android.showkase.annotation.ShowkaseRootModule

@ShowkaseRoot
class MyRootModule: ShowkaseRootModule

@Composable
@Preview
fun SampleComposable() {}