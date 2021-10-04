package com.example.appointmentpage.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.appointmentpage.R


val Roboto = FontFamily(
    Font(R.font.roboto_medium),
    Font(R.font.roboto_bold, FontWeight.Bold)
)


// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    body1 = TextStyle(
        fontFamily = Roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
)

