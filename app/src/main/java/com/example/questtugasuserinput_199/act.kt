package com.example.questtugasuserinput_199

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import java.util.Calendar


val context = LocalContext.current

var firstName by remember { mutableStateOf("") }
var lastName by remember { mutableStateOf("") }
var email by remember { mutableStateOf("") }
var birthDate by remember { mutableStateOf("") }

val calendar = Calendar.getInstance()
val year = calendar.get(Calendar.YEAR)
val month = calendar.get(Calendar.MONTH)
val day = calendar.get(Calendar.DAY_OF_MONTH)