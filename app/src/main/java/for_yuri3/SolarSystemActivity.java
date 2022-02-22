package for_yuri3;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import for_yuri3.questions.solSysQuestions;

import static for_yuri3.R.id.buttona5;

public class SolarSystemActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView question;
//private Questions nQuestions = new Questions();

    private String nAnswer;
//private  int nQuestionLength = nQuestions.nQuestions.length;

    Random r;
    ArrayList<String> questionList = new ArrayList<>(Arrays.asList(solSysQuestions.nQuestions));
    ArrayList<String[]> choiceList = new ArrayList<>(Arrays.asList(solSysQuestions.nChoices));
    ArrayList<String> correctAnswerList = new ArrayList<>(Arrays.asList(solSysQuestions.nCorrectAnswers));

    //List<String> questionList;
//List<String[]> choiceList;
//List<String> correctAnswerList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solarsystem_activity);

        //r =new Random();
        button1 = (Button) findViewById(R.id.button1s);
        button2 = (Button) findViewById(R.id.button2s);
        button3 = (Button) findViewById(R.id.button3s);
        button4 = (Button) findViewById(R.id.button4s);
        question = (TextView) findViewById(R.id.questions);

        r = new Random();

//        questionList = Arrays.asList(Questions.nQuestions);
//        choiceList = Arrays.asList(Questions.nChoices);
//        correctAnswerList = Arrays.asList(Questions.nCorrectAnswers);

        updateQuestion(r.nextInt(questionList.size()));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button1.getText() == nAnswer) {

                    if (questionList.size() > 0) {
                        updateQuestion(r.nextInt(questionList.size()));
                    }
                    else {
                        winAskOnceAgain();
                    }
                }
                else {
                    showtoast();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getText() == nAnswer) {

                    if (questionList.size() > 0) {
                        updateQuestion(r.nextInt(questionList.size()));
                    }
                    else {
                        winAskOnceAgain();
                    }
                }
                else {
                    showtoast();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button3.getText() == nAnswer) {

                    if (questionList.size() > 0) {
                        updateQuestion(r.nextInt(questionList.size()));
                    }
                    else {
                        winAskOnceAgain();
                    }
                }
                else {
                    showtoast();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button4.getText() == nAnswer) {

                    if (questionList.size() > 0) {
                        updateQuestion(r.nextInt(questionList.size()));
                    }
                    else {
                        winAskOnceAgain();
                    }
                }
                else {
                    showtoast();
                }
            }
        });

    }

    private void updateQuestion(int num) {

        question.setText(questionList.get(num));
        button1.setText(choiceList.get(num)[0]);
        button2.setText(choiceList.get(num)[1]);
        button3.setText(choiceList.get(num)[2]);
        button4.setText(choiceList.get(num)[3]);

        nAnswer = correctAnswerList.get(num);
        questionList.remove(num);
        choiceList.remove(num);
        correctAnswerList.remove(num);
    }

    /*private void gameOver() {
    setContentView(R.layout.end_activity);
    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(AnimalActivity.this);
    alertDialogBuilder
            .setMessage("Игра окончена")
            .setCancelable(false)
            .setPositiveButton("Новая игра", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    startActivity(new Intent(getApplicationContext(), AnimalActivity.class));
                    finish();
                }
            })
            .setNegativeButton("Выход", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
    AlertDialog alertDialog = alertDialogBuilder.create();
    alertDialog.show();
} */
    public void showtoast(){
        LayoutInflater inflater = getLayoutInflater();
        View button5 = inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(buttona5));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(button5);
        toast.show();
    }

    private void winAskOnceAgain() {
        setContentView(R.layout.win_activity);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(SolarSystemActivity.this);
        alertDialogBuilder
                .setMessage("Игра окончена")
                .setCancelable(false)
                .setPositiveButton("Новая игра", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (button1.getText() == nAnswer) {

                            if (questionList.size() > 0) {
                                updateQuestion(r.nextInt(questionList.size()));
                            }
                            else {
                                winAskOnceAgain();
                            }
                        }
                        else {
                            showtoast();
                        }
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("Выход", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
