package org.techtown.mygrowthdiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    //activiti_main4의 9개 위젯에 대응할 전역변수 선언
    TextView text1,text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoHam;
    Button btnOK;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //각 위젯을 변수에 대입
        text1 = findViewById(R.id.Text1);
        chkAgree = findViewById(R.id.chKAgree);

        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        rdoDog = findViewById(R.id.RdoDog);
        rdoCat = findViewById(R.id.RdoCat);
        rdoHam = findViewById(R.id.RdoHam);

        btnOK = findViewById(R.id.BtnOk);
        imgPet = findViewById(R.id.ImgPet);

        //체크박스를 체크/언체크할 때 동작하는 리스너를 onCreate() 내부에 정의한다.
        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // 해석 :
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);//해석 :
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        //선택 완료를 클릭하면 동작하는 리스너를 onCreate()메소드 내부에 정의한다.
        btnOK.setOnClickListener(new View.OnClickListener() { // 해석 :
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoDog:
                        imgPet.setImageResource(R.drawable.img_1);
                        break;
                    case R.id.RdoCat:
                        imgPet.setImageResource(R.drawable.img_2);
                        break;
                    case R.id.RdoHam:
                        imgPet.setImageResource(R.drawable.img);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}