package com.example.anushmp.demoquizapp

import androidx.viewpager2.widget.ViewPager2

data class QuestionModel(val question: String,
val option1: String,
val option2: String,
val option3: String,
val option4: String,
val correctanswer: String)