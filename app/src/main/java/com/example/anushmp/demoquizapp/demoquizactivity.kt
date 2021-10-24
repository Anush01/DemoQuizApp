package com.example.anushmp.demoquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class demoquizactivity : AppCompatActivity() {

    lateinit var question:TextView
    lateinit var option1:TextView
    lateinit var option2:TextView
    lateinit var option3:TextView
    lateinit var option4:TextView
    lateinit var listofquestions:MutableList<QuestionModel>

    var questionnumber = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demoquizactivity)

        question = findViewById(R.id.quesiton)
        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)

        var questiontoshow : QuestionModel = QuestionModel("what is your name?","john","james"
        ,"Jason","other","other")

        var question2:QuestionModel = QuestionModel("what is the sea?","fire", "water", "earth", "air","water");

        listofquestions = mutableListOf<QuestionModel>()


        listofquestions.add(questiontoshow)
        listofquestions.add(question2)
        listofquestions.add(question2)
        listofquestions.add(question2)
        listofquestions.add(questiontoshow)




        question.text = listofquestions[0].question
        option1.text = listofquestions[0].option1
        option2.text = listofquestions[0].option2
        option3.text = listofquestions[0].option3
        option4.text = listofquestions[0].option4


        Log.d("xxxx",listofquestions.size.toString())



        option1.setOnClickListener {

            if(questionnumber<listofquestions.size) {

                if (option1.text == listofquestions[questionnumber].correctanswer) {

                    Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show()

                    //score = score  + 1
                    //toast the score.


                    questionnumber = questionnumber + 1;

                    nextquestion()

                } else {

                    Toast.makeText(this, "wrong choice", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                }

            }

        }

        option2.setOnClickListener {


            if(questionnumber<listofquestions.size) {


                if (option2.text == listofquestions[questionnumber].correctanswer) {

                    Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                } else {

                    Toast.makeText(this, "wrong choice", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                }

            }

        }

        option3.setOnClickListener {

            if(questionnumber<listofquestions.size) {

                if (option3.text == listofquestions[questionnumber].correctanswer) {

                    Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                } else {

                    Toast.makeText(this, "wrong choice", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                }
            }

        }


        option4.setOnClickListener {

            if(questionnumber<listofquestions.size) {

                if (option4.text == listofquestions[questionnumber].correctanswer) {

                    Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                } else {

                    Toast.makeText(this, "wrong choice", Toast.LENGTH_SHORT).show()
                    questionnumber = questionnumber + 1;
                    nextquestion()
                }

            }

        }


    }

    private fun nextquestion() {

        if(questionnumber > listofquestions.size-1){

            Log.d("xxxx", questionnumber.toString())

            Toast.makeText(this,"Question supply exhausted, end of quiz ", Toast.LENGTH_SHORT).show()
        }else{

            Log.d("xxxx",questionnumber.toString())

            question.text = listofquestions[questionnumber].question
            option1.text = listofquestions[questionnumber].option1
            option2.text = listofquestions[questionnumber].option2
            option3.text = listofquestions[questionnumber].option3
            option4.text = listofquestions[questionnumber].option4

        }


    }
}