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

public class MapButton extends AppCompatActivity {

    private Button map1_move;
    private Button map2_move;
    private Button map3_move;
    private Button map4_move;
    private Button map5_move;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapbutton);

        map1_move = findViewById(R.id.map1_move);
        map1_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MapButton.this)
                        .setTitle("위치 검색")
                        .setMessage("위치를 검색하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MapButton.this, "검색을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MapButton.this, Map1class.class);
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
        map2_move = findViewById(R.id.map2_move);
        map2_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MapButton.this)
                        .setTitle("위치 검색")
                        .setMessage("위치를 검색하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MapButton.this, "검색을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MapButton.this, Map2class.class);
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

        map3_move = findViewById(R.id.map3_move);
        map3_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MapButton.this)
                        .setTitle("위치 검색")
                        .setMessage("위치를 검색하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MapButton.this, "검색을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MapButton.this, Map3class.class);
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
        map4_move = findViewById(R.id.map4_move);
        map4_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MapButton.this)
                        .setTitle("위치 검색")
                        .setMessage("위치를 검색하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(MapButton.this, "검색을 시작합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MapButton.this, Map4class.class);
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
        map5_move = findViewById(R.id.map5_move);
        map5_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MapButton.this);
                builder.setTitle("초기화면으로 이동");
                builder.setMessage("검색을 종료합니다.");
                builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {

                    @Override

                    public void onClick(DialogInterface dialog, int which) {


                        // TODO Auto-generated method stub

                        Toast.makeText(MapButton.this, "검색을 종료합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MapButton.this, MainActivity.class);
                        startActivity(intent);
                        ActivityCompat.finishAffinity(MapButton.this);


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