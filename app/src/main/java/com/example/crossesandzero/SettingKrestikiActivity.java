package com.example.crossesandzero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


public class SettingKrestikiActivity extends AppCompatActivity {

    ImageView on_back_pressed;
    Button btn_reset;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_krestiki);

        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();


        btn_reset = findViewById(R.id.btn_reset);
        on_back_pressed = findViewById(R.id.on_back_pressed);

        // сброс счёта
        btn_reset.setOnClickListener(view -> {
            editor.putInt("pointsOfHuman", 0);
            editor.putInt("pointsOfPc", 0);
            editor.apply();
           // Toast.makeText(SettingKrestikiActivity.this,"Счёт 0:0", Toast.LENGTH_SHORT).show();
            toastThree();
        });




        //назад в игру
        on_back_pressed.setOnClickListener((view -> {
            startActivity(new Intent(SettingKrestikiActivity.this, KrestikiNoliki.class));
            finish();
        }));




    }

    @Override
    public void onBackPressed() {
        // Intent intent = new Intent(KrestikiNoliki.this, MainActivity.class);
        startActivity(new Intent(SettingKrestikiActivity.this, KrestikiNoliki.class));
        finish();
    }
    private void toastThree() {
        Toast toastDraw = Toast.makeText(SettingKrestikiActivity.this, "Счёт 0:0", Toast.LENGTH_SHORT);
        // Позиционирование Toast сообщения
        toastDraw.setGravity(Gravity.BOTTOM, 10, 10);
        // Создание компонента ImageView
        ImageView imgView;
        imgView = new ImageView(SettingKrestikiActivity.this);
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
}