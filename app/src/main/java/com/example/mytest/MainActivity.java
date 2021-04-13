package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Question> questions = new ArrayList();
    ListView questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        questionList = (ListView) findViewById(R.id.questionsList);
        QuestionsAdapter stateAdapter = new QuestionsAdapter(this, R.layout.question_item, questions);
        questionList.setAdapter(stateAdapter);
    }
    private void setInitialData(){
        questions.add(new Question(0,"Кто имеет 2 лапы?", 1,new ArrayList<String>() {{
            add("Рыба");
            add("Курица");
            add("Слон");
            add("Человек");
        }}));
        questions.add(new Question (1,"Сколько у человека костей?", 0, new ArrayList<String>() {{
            add("205—208");
            add("134-138");
            add("56-60");
            add("300+");
        }}));
    }
    public void onClick(View view) {
        RadioGroup radioGroup = (RadioGroup)view.findViewById(R.id.radioGroup);
//        for (int i = 0; i < questions.size(); i++)
//        {
//            RadioButton res = ((RadioButton) radioGroup.getChildAt(i));
//            RadioButton res1 = ((RadioButton) radioGroup.getChildAt(i));
//        }
    }
}