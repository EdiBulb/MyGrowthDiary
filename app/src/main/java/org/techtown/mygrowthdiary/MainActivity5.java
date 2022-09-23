package org.techtown.mygrowthdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    //객체 선언
    ImageButton imgBtn;
    ImageView imgV;

    //회전값 변수
//    int degree = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        //객체 id 연결
        imgBtn = findViewById(R.id.btn);
        imgV = findViewById(R.id.img);

        //버튼 클릭시 이미지 10도씩 회전
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                degree += 10;
//                imgV.setRotation(degree);
                imgV.setRotation(imgV.getRotation()+10);
            }
        });
    }
}