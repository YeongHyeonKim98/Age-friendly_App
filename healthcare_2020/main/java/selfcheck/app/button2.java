package selfcheck.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.Button;


public class button2 extends AppCompatActivity  {
    private CheckBox check1, check2, check3, check4, check5, check6;
    private Button btn;
    int cnt = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);


        check1 = (CheckBox) findViewById(R.id.checkBox1);
        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.isPressed()){
                    cnt=cnt+1;
                }
            }
        });
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView1, boolean isChecked) {
                if (buttonView1.isPressed()) {
                    cnt = cnt + 1;
                }
            }
        });
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView2, boolean isChecked) {
                if (buttonView2.isPressed()) {
                    cnt = cnt + 1;
                }
            }
        });
        check4 = (CheckBox) findViewById(R.id.checkBox4);
        check4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView3, boolean isChecked) {
                if (buttonView3.isPressed()) {
                    cnt = cnt + 1;
                }
            }
        });
        check5 = (CheckBox) findViewById(R.id.checkBox5);
        check5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView4, boolean isChecked) {
                if (buttonView4.isPressed()) {
                    cnt = cnt + 1;
                }
            }
        });
        check6 = (CheckBox) findViewById(R.id.checkBox6);
        check6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView5, boolean isChecked) {
                if (buttonView5.isPressed()) {
                    cnt = cnt + 1;
                }
            }
        });



        btn =findViewById(R.id.button91);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(button2.this)
                        .setTitle("결과 확인")
                        .setMessage("결과를 확인하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(button2.this, "결과를 확인합니다..", Toast.LENGTH_SHORT).show();
                                if(cnt<=2) {
                                    Intent intent1 = new Intent(button2.this, result4.class);
                                    startActivity(intent1);

                                }
                                else if(cnt>2 && cnt<=4){
                                    Intent intent2 = new Intent(button2.this, result5.class);
                                    startActivity(intent2);
                                }
                                else{
                                    Intent intent3 = new Intent(button2.this, result6.class);
                                    startActivity(intent3);
                                }
                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {



                            }
                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();


            }

        });

    }



}




