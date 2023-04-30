package selfcheck.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    private Button btn1_move;
    private Button btn2_move;
    private Button btn3_move;
    private Button btn4_move;
    private Button btn5_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btn1_move = findViewById(R.id.btn1_move);
        btn1_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity1.this)
                        .setTitle("진단 시작")
                        .setMessage("진단을 시작하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MainActivity1.this, "진단을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity1.this, button1.class);
                                startActivity(intent);
                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {



                            @Override

                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub

                            }

                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();


                }

        });
        btn2_move = findViewById(R.id.btn2_move);
        btn2_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity1.this)
                        .setTitle("진단 시작")
                        .setMessage("진단을 시작하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MainActivity1.this, "진단을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity1.this, button2.class);
                                startActivity(intent);
                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {



                            @Override

                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub

                            }

                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();


            }

        });

        btn3_move = findViewById(R.id.btn3_move);
        btn3_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity1.this)
                        .setTitle("진단 시작")
                        .setMessage("진단을 시작하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MainActivity1.this, "진단을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity1.this, button3.class);
                                startActivity(intent);
                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {



                            @Override

                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub

                            }

                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();


            }

        });
        btn4_move = findViewById(R.id.btn4_move);
        btn4_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity1.this)
                        .setTitle("진단 시작")
                        .setMessage("진단을 시작하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MainActivity1.this, "진단을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity1.this, button4.class);
                                startActivity(intent);

                            }

                        })

                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {



                            @Override

                            public void onClick(DialogInterface dialog, int which) {

                                // TODO Auto-generated method stub

                            }

                        })

                        // 뒤로가기 버튼이 작동하지 못하게 함

                        .setCancelable(false)

                        .show();


            }

        });
        btn5_move = findViewById(R.id.btn5_move);
        btn5_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity1.this);
                builder.setTitle("초기화면으로 이동");
                builder.setMessage("진단을 종료합니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {


                        // TODO Auto-generated method stub

                        Toast.makeText(MainActivity1.this, "진단을 종료합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity1.this, MainActivity.class);
                        startActivity(intent);
                        ActivityCompat.finishAffinity(MainActivity1.this);


                    }

                });
                builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {


                    @Override

                    public void onClick(DialogInterface dialog, int which) {

                        // TODO Auto-generated method stub

                    }

                });
                builder.setCancelable(false);
                builder.show();// 뒤로가기 버튼이 작동하지 못하게 함


            }

        });
    }

}