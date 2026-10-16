package com.example.questtugasuserinput_199

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext


val context = LocalContext.current

var firstName by remember { mutableStateOf("") }
var lastName by remember { mutableStateOf("") }
var email by remember { mutableStateOf("") }
var birthDate by remember { mutableStateOf("") }
