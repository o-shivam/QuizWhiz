package com.example.android.quizwhiz;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    RadioButton questionOneOptionA, questionTwoOptionC, questionThreeOptionA, questionFourOptionD, questionFiveOptionA, questionFiveOptionD, questionSixOptionC, questionSevenOptionD, questionTenOptionC;
    CheckBox questionNineOptionA, questionNineOptionD;
    EditText questionEightAns;
    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void result(View view) {
        questionOneOptionA = findViewById(R.id.q1_optionA);
        Boolean answerOne = questionOneOptionA.isChecked();
        checkSingleChoiceAnswer(answerOne);

        questionTwoOptionC = findViewById(R.id.q2_optionC);
        Boolean answerTwo = questionTwoOptionC.isChecked();
        checkSingleChoiceAnswer(answerTwo);

        questionThreeOptionA = findViewById(R.id.q3_optionA);
        Boolean answerThree = questionThreeOptionA.isChecked();
        checkSingleChoiceAnswer(answerThree);

        questionFourOptionD = findViewById(R.id.q4_optionD);
        Boolean answerFour = questionFourOptionD.isChecked();
        checkSingleChoiceAnswer(answerFour);

        questionFiveOptionA = findViewById(R.id.q5_optionA);
        Boolean answerFive = questionFiveOptionA.isChecked();
        checkSingleChoiceAnswer(answerFive);

        questionSixOptionC = findViewById(R.id.q6_optionC);
        Boolean answerSix = questionSixOptionC.isChecked();
        checkSingleChoiceAnswer(answerSix);

        questionSevenOptionD = findViewById(R.id.q7_optionD);
        Boolean answerSeven = questionSevenOptionD.isChecked();
        checkSingleChoiceAnswer(answerSeven);

        questionEightAns = (EditText) findViewById(R.id.inp_ans8);
        String answerEight = questionEightAns.getText().toString().toLowerCase();
        checkTypedAnswer(answerEight);

        questionNineOptionA = findViewById(R.id.q9_optionA);
        questionNineOptionD = findViewById(R.id.q9_optionB);
        Boolean answerFiveChoiceOne = questionFiveOptionA.isChecked();
        Boolean answerFiveChoiceTwo = questionFiveOptionD.isChecked();
        checkDoubleChoiceAnswer(answerFiveChoiceOne, answerFiveChoiceTwo);

        questionTenOptionC = findViewById(R.id.q10_optionC);
        Boolean answerTen = questionTenOptionC.isChecked();
        checkSingleChoiceAnswer(answerTen);

        Context context = getApplicationContext();
        CharSequence text = "You Scored: " + totalScore + " out of 40";
        int get = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, get);
        toast.show();
    }


    public void checkSingleChoiceAnswer(Boolean answer) {
        if (answer) {
            totalScore += 4;
        }
    }


    public void checkDoubleChoiceAnswer(Boolean answerOne, Boolean answerTwo) {
        if (answerOne && answerTwo) {
            totalScore += 4;
        }
    }


    public void checkTypedAnswer(String answer) {
        if (answer.equals("jupiter")) {
            totalScore += 4;
        }
    }

    public void reset(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}