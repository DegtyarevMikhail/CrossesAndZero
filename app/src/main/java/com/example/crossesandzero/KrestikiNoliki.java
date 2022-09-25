package com.example.crossesandzero;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class KrestikiNoliki extends AppCompatActivity {

    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;
    Button restart;
    String krest, nol;
    TextView  pcPoints,humanPoints,textView;
    ImageView on_back, settings_btn;

    int pointsOfHuman,pointsOfPc;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krestiki_noliki);

        on_back = findViewById(R.id.on_back_pressed);
        settings_btn = findViewById(R.id.settings_btn);

        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        restart = findViewById(R.id.restart);

        textView = findViewById(R.id.textView);

        humanPoints = findViewById(R.id.humanPoints);
        pcPoints = findViewById(R.id.pcPoints);
        textView = findViewById(R.id.textView);

        restart.setOnClickListener(view -> clickRestart());

        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        pointsOfHuman = sharedPreferences.getInt("pointsOfHuman", 0);
        humanPoints.setText(""+ pointsOfHuman);

        pointsOfPc = sharedPreferences.getInt("pointsOfPc", 0);
        pcPoints.setText(""+ pointsOfPc);


        krest = "X";
        nol = "0";
        textView.setText("");

        on_back.setOnClickListener(view -> {
            onBackPressed();
        });
        settings_btn.setOnClickListener((view ->{
            startActivity(new Intent(KrestikiNoliki.this, SettingKrestikiActivity.class));
            finish();
        }));

        button_1.setOnClickListener(view -> {
            if (button_1.getText()=="" && textView.getText() == ""){
                button_1.setText(krest);
                isPlayerWinner();
                if (textView.getText() == ""){
                    hodPC();
                }
            }
        });
        button_2.setOnClickListener(view -> {
            if (button_2.getText()=="" && textView.getText() == ""){
                button_2.setText(krest);
                isPlayerWinner();
                if (textView.getText() == ""){
                    hodPC();
                }
            }
        });
        button_3.setOnClickListener(view -> {
            if (button_3.getText() == "" && textView.getText() == "") {
                button_3.setText(krest);
                isPlayerWinner();
                if (textView.getText() == "") {
                    hodPC();
                }
            }
        });
        button_4.setOnClickListener(view -> {
            if (button_4.getText()=="" && textView.getText() == ""){
                button_4.setText(krest);
                isPlayerWinner();
                if (textView.getText() == ""){
                    hodPC();
                }
            }
        });
        button_5.setOnClickListener(view -> {
            if (button_5.getText()=="" && textView.getText() == ""){
                button_5.setText(krest);
                isPlayerWinner();
                if (textView.getText() == ""){
                    hodPC();
                }
            }
        });
       button_6.setOnClickListener(view -> {
           if (button_6.getText()=="" && textView.getText() == ""){
               button_6.setText(krest);
               isPlayerWinner();
               if (textView.getText() == ""){
                   hodPC();
               }
           }
       });
       button_7.setOnClickListener(view -> {
           if (button_7.getText()=="" && textView.getText() == ""){
               button_7.setText(krest);
               isPlayerWinner();
               if (textView.getText() == ""){
                   hodPC();
               }
           }
       });
       button_8.setOnClickListener(view -> {
           if (button_8.getText()=="" && textView.getText() == ""){
               button_8.setText(krest);
               isPlayerWinner();
               if (textView.getText() == ""){
                   hodPC();
               }
           }
       });
       button_9.setOnClickListener(view -> {
           if (button_9.getText()=="" && textView.getText() == ""){
               button_9.setText(krest);
               isPlayerWinner();
               if (textView.getText() == ""){
                   hodPC();
               }
           }
       });
    }



    public void isPlayerWinner() {
        if (button_1.getText() == krest && button_2.getText() == krest && button_3.getText() == krest) {
            button_1.setBackgroundColor(Color.GREEN);
            button_2.setBackgroundColor(Color.GREEN);
            button_3.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
            textView.setText("ПОБЕДА");

        } else if (button_4.getText() == krest && button_5.getText() == krest && button_6.getText() == krest) {
            button_4.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_6.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        }
        else if (button_7.getText() == krest && button_8.getText() == krest && button_9.getText() == krest) {
            button_7.setBackgroundColor(Color.GREEN);
            button_8.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        } else if (button_1.getText() == krest && button_4.getText() == krest && button_7.getText() == krest) {
            button_1.setBackgroundColor(Color.GREEN);
            button_4.setBackgroundColor(Color.GREEN);
            button_7.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        } else if (button_2.getText() == krest && button_5.getText() == krest && button_8.getText() == krest) {
            button_2.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_8.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        } else if (button_3.getText() == krest && button_6.getText() == krest && button_9.getText() == krest) {
            button_3.setBackgroundColor(Color.GREEN);
            button_6.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        } else if (button_1.getText() == krest && button_5.getText() == krest && button_9.getText() == krest) {
            button_1.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        } else if (button_3.getText() == krest && button_5.getText() == krest && button_7.getText() == krest) {
            button_3.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_7.setBackgroundColor(Color.GREEN);
            pointsOfHuman++;
            humanPoints.setText("" + pointsOfHuman);
            textView.setText("ПОБЕДА");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            toastTwo();
        }else if(button_1.getText() !="" && button_2.getText() !=""  && button_3.getText() !="" &&
                button_4.getText() !="" && button_5.getText() !=""  && button_6.getText() !="" &&
                button_7.getText() !="" && button_8.getText() !=""  && button_9.getText() !=""   )  {
            textView.setText("Ничья");
            editor.putInt("pointsOfHuman", pointsOfHuman);
            editor.apply();
            Toast();

        }


    }




    public void isPCWinner() {
        if (button_1.getText() == nol && button_2.getText() == nol && button_3.getText() == nol) {
            button_1.setBackgroundColor(Color.GREEN);
            button_2.setBackgroundColor(Color.GREEN);
            button_3.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
           // Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button_4.getText() == nol && button_5.getText() == nol && button_6.getText() == nol) {
            button_4.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_6.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
           // Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button_7.getText() == nol && button_8.getText() == nol && button_9.getText() == nol) {
            button_7.setBackgroundColor(Color.GREEN);
            button_8.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
          Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else

        if (button_1.getText() == nol && button_4.getText() == nol && button_7.getText() == nol) {
            button_1.setBackgroundColor(Color.GREEN);
            button_4.setBackgroundColor(Color.GREEN);
            button_7.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
            Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button_2.getText() == nol && button_5.getText() == nol && button_8.getText() == nol) {
            button_2.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_8.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
            Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button_3.getText() == nol && button_6.getText() == nol && button_9.getText() == nol) {
            button_3.setBackgroundColor(Color.GREEN);
            button_6.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
           Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else

        if (button_1.getText() == nol && button_5.getText() == nol && button_9.getText() == nol) {
            button_1.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_9.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
           Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }else
        if (button_3.getText() == nol && button_5.getText() == nol && button_7.getText() == nol) {
            button_3.setBackgroundColor(Color.GREEN);
            button_5.setBackgroundColor(Color.GREEN);
            button_7.setBackgroundColor(Color.GREEN);
            textView.setText("LOSS");
          Toast();
            pointsOfPc++;
            pcPoints.setText("" + pointsOfPc);
            editor.putInt("pointsOfPc", pointsOfPc);
            editor.apply();
        }
    }

    private  void hodPC () {
        Random random = new Random();
        int buttonPcClick = 1 + random.nextInt(9);
        Log.i("hodPC", "buttonPcClick - "  + buttonPcClick );
        switch (buttonPcClick){
            case (1): if (button_1.getText() == ""){
                button_1.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (2): if (button_2.getText() == ""){
                button_2.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (3): if (button_3.getText() == ""){
                button_3.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (4): if (button_4.getText() == ""){
                button_4.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (5): if (button_5.getText() == ""){
                button_5.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (6): if (button_6.getText() == ""){
                button_6.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (7): if (button_7.getText() == ""){
                button_7.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (8): if (button_8.getText() == ""){
                button_8.setText(nol);isPCWinner();
            } else{hodPC(); } break;

            case (9): if (button_9.getText() == ""){
                button_9.setText(nol);isPCWinner();
            } else{hodPC(); } break;
        }

    }

    public void Toast(){
        Toast toast3 = Toast.makeText(KrestikiNoliki.this,
                "TerminatorWinn",
                Toast.LENGTH_SHORT);
        // Позиционирование Toast сообщения
        toast3.setGravity(Gravity.CENTER, 0, 100);
        // Создание компонента ImageView
        ImageView imgView;
        imgView = new ImageView(KrestikiNoliki.this);
        // Определение изображения
        imgView.setImageResource(R.drawable.img);
        // Разметка интерфейса
        LinearLayout linearLayout;
        linearLayout = (LinearLayout)toast3.getView();
        // Добавление изображения в интерфейс компонента
        linearLayout.addView(imgView);
        // Представление сообщения
        toast3.show();
    }
    private void toastTwo() {
        Toast toast = Toast.makeText(KrestikiNoliki.this,
                "ПОБЕДА",
               Toast.LENGTH_SHORT);
        // Позиционирование Toast сообщения
        toast.setGravity(Gravity.CENTER, 0, 100);
        // Создание компонента ImageView
        ImageView imgView;
        imgView = new ImageView(KrestikiNoliki.this);
        // Определение изображения
        imgView.setImageResource(R.drawable.img_1);
        // Разметка интерфейса
        LinearLayout linearLayout;
        linearLayout = (LinearLayout)toast.getView();
        // Добавление изображения в интерфейс компонента
        linearLayout.addView(imgView);
        // Представление сообщения
        toast.show();
    }
    private void toastThree() {
        Toast toastDraw = Toast.makeText(KrestikiNoliki.this,
                "TerminatorWinn",
                Toast.LENGTH_SHORT);
        // Позиционирование Toast сообщения
        toastDraw.setGravity(Gravity.CENTER, 0, 100);
        // Создание компонента ImageView
        ImageView imgView;
        imgView = new ImageView(KrestikiNoliki.this);
        // Определение изображения
        imgView.setImageResource(R.drawable.pngegg);
        // Разметка интерфейса
        LinearLayout linearLayout;
        linearLayout = (LinearLayout)toastDraw.getView();
        // Добавление изображения в интерфейс компонента
        linearLayout.addView(imgView);
        // Представление сообщения
        toastDraw.show();
    }

    public void clickRestart() {
        button_1.setText("");
        button_2.setText("");
        button_3.setText("");
        button_4.setText("");
        button_5.setText("");
        button_6.setText("");
        button_7.setText("");
        button_8.setText("");
        button_9.setText("");
        textView.setText("");
        button_1.setBackgroundColor(button_1.getContext().getResources().getColor(R.color.purple_200));
        button_2.setBackgroundColor(button_2.getContext().getResources().getColor(R.color.purple_200));
        button_3.setBackgroundColor(button_3.getContext().getResources().getColor(R.color.purple_200));
        button_4.setBackgroundColor(button_4.getContext().getResources().getColor(R.color.purple_200));
        button_5.setBackgroundColor(button_5.getContext().getResources().getColor(R.color.purple_200));
        button_6.setBackgroundColor(button_6.getContext().getResources().getColor(R.color.purple_200));
        button_7.setBackgroundColor(button_7.getContext().getResources().getColor(R.color.purple_200));
        button_8.setBackgroundColor(button_8.getContext().getResources().getColor(R.color.purple_200));
        button_9.setBackgroundColor(button_9.getContext().getResources().getColor(R.color.purple_200));

    }

    @Override
    public void onBackPressed() {
        // Intent intent = new Intent(KrestikiNoliki.this, MainActivity.class);
        startActivity(new Intent(KrestikiNoliki.this, MainActivity.class));
        finish();
    }
}
