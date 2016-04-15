package com.android.example.science5;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int activePage = 1;
    Button button1, button2, button3, button4, button5, back, next;
    TextView title, content;
    ImageView image;
    ScrollView scroll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        back = (Button) findViewById(R.id.back);
        next = (Button) findViewById(R.id.next);
        title = (TextView) findViewById(R.id.title);
        content = (TextView) findViewById(R.id.content);
        image = (ImageView) findViewById(R.id.image);
        scroll = (ScrollView) findViewById(R.id.scroll);
    }

    public void selectQuestion(View view){
        disable(button1);
        enable(getActivePageButton());
        disable(back);
        enable(next);

        title.setText(R.string.title_1);
        content.setText(R.string.content_1);
        image.setImageResource(R.drawable.question);
        scroll.scrollTo(0, 0);

        activePage = 1;
    }

    public void selectResearch(View view){
        disable(button2);
        enable(getActivePageButton());
        enable(back);
        enable(next);

        title.setText(R.string.title_2);
        content.setText(R.string.content_2);
        image.setImageResource(R.drawable.research);
        scroll.scrollTo(0, 0);

        activePage = 2;
    }


    public void selectHypothesis(View view){
        disable(button3);
        enable(getActivePageButton());
        enable(back);
        enable(next);

        title.setText(R.string.title_3);
        content.setText(R.string.content_3);
        image.setImageResource(R.drawable.hypothesis);
        scroll.scrollTo(0, 0);

        activePage = 3;
    }

    public void selectExperiment(View view){
        disable(button4);
        enable(getActivePageButton());
        enable(back);
        enable(next);

        title.setText(R.string.title_4);
        content.setText(R.string.content_4);
        image.setImageResource(R.drawable.experiment);
        scroll.scrollTo(0, 0);

        activePage = 4;
    }

    public void selectConclusions(View view) {
        disable(button5);
        enable(getActivePageButton());
        enable(back);
        disable(next);

        title.setText(R.string.title_5);
        content.setText(R.string.content_5);
        image.setImageResource(R.drawable.conclusions);
        scroll.scrollTo(0,0);

        activePage = 5;
    }

    public void next(View view){
        if(activePage == 1){
            selectResearch(view);
        }
        else if(activePage == 2){
            selectHypothesis(view);
        }
        else if(activePage == 3){
            selectExperiment(view);
        } else if(activePage == 4){
            selectConclusions(view);
        }
    }

    public void back(View view){
        if(activePage == 2){
            selectQuestion(view);
        }
        else if(activePage == 3){
            selectResearch(view);
        }
        else if(activePage == 4){
            selectHypothesis(view);
        }
        else if(activePage == 5){
            selectExperiment(view);
        }
    }

    public Button getActivePageButton(){
        if(activePage == 1){
            return button1;
        }
        if(activePage == 2){
            return button2;
        }
        if(activePage == 3){
            return button3;
        }
        if(activePage == 4){
            return button4;
        }
        if(activePage == 5){
            return button5;
        }
        return null;
    }

    public void enable(Button button){
        button.setBackgroundColor(Color.parseColor("#00BCD4"));
        button.setEnabled(true);
    }

    public void disable(Button button){
        button.setBackgroundColor(Color.parseColor("#B2EBF2"));
        button.setEnabled(false);
    }
}
