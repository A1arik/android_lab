package com.example.mytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;
public class QuestionsAdapter extends ArrayAdapter<Question>{

    private LayoutInflater inflater;
    private int layout;
    private List<Question> questions;

    public QuestionsAdapter(Context context, int resource, List<Question> questions) {
        super(context, resource, questions);
        this.questions = questions;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);

        TextView questionView = (TextView) view.findViewById(R.id.question);

        Question question = questions.get(position);
        RadioGroup radioGroup = (RadioGroup)view.findViewById(R.id.radioGroup);
        for (int i = 0; i < question.getAnswers().size(); i++)
        {
            ((RadioButton) radioGroup.getChildAt(i)).setText(question.getAnswers().get(i));
        }
        questionView.setText(question.getQuestion());

        return view;
    }
}
