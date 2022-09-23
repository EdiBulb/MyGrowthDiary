package org.techtown.mygrowthdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exam4_17);

        TextView tv1, tv2, tv3;

        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);

        tv1.setText("안녕하세요?");
        tv1.setTextColor(Color.RED);
        tv2.setTextSize(30);
        tv2.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
        tv3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하");
        tv3.setSingleLine();
    }
}