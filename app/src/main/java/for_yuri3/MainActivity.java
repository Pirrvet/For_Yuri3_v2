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

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    TextView question;
//private Questions nQuestions = new Questions();

    private String nAnswer;
//private  int nQuestionLength = nQuestions.nQuestions.length;

    Random r;
    ArrayList<String> questionList = new ArrayList<>(Arrays.asList(Questions.nQuestions));
    ArrayList<String[]> choiceList = new ArrayList<>(Arrays.asList(Questions.nChoices));
    ArrayList<String> correctAnswerList = new ArrayList<>(Arrays.asList(Questions.nCorrectAnswers));

    //List<String> questionList;
//List<String[]> choiceList;
//List<String> correctAnswerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //r =new Random();
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        question = (TextView) findViewById(R.id.question);

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
                    gameOver();
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
                    gameOver();
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
                    gameOver();
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
                    gameOver();
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

    private void gameOver() {
        setContentView(R.layout.end_activity);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Игра окончена")
                .setCancelable(false)
                .setPositiveButton("Новая игра", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
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

    private void winAskOnceAgain() {
        setContentView(R.layout.win_activity);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
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
                            gameOver();
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
