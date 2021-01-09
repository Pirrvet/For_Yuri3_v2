package for_yuri3;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


import for_yuri3.questions.themeQuestions;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView question;
    int num;

    ArrayList<String> questionList = new ArrayList<>(Arrays.asList(themeQuestions.nQuestions));
    ArrayList<String> choiceList = new ArrayList<>(Arrays.asList(themeQuestions.nChoices));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qtheme_activity);

        question = (TextView) findViewById(R.id.questionqt);
        question.setText(questionList.get(num=0));
        button1 = (Button) findViewById(R.id.buttonqt1);
        button1.setText(choiceList.get(num=0));
        //button1.setText(getText(questionList[0]));
        button2 = (Button) findViewById(R.id.buttonqt2);
        button2.setText(choiceList.get(num=1));
        button3 = (Button) findViewById(R.id.buttonqt3);
        button3.setText(choiceList.get(num=2));
        button4 = (Button) findViewById(R.id.buttonqt4);
        button4.setText(choiceList.get(num=3));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

new MainActivitytrash();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new MainActivitytrash();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new MainActivitytrash();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new MainActivitytrash();
            }
        });

    }
   }
