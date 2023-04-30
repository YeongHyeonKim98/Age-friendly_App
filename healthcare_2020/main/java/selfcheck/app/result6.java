package selfcheck.app;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class result6 extends AppCompatActivity  {
    private Button button11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result6);
        button11 = findViewById(R.id.button51);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(result6.this)
                        .setTitle("진단 종료")
                        .setMessage("진단을 종료하시겠습니까?")
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {

                            @Override

                            public void onClick(DialogInterface dialog, int which) {


                                // TODO Auto-generated method stub

                                Toast.makeText(result6.this, "진단을 종료합니다.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(result6.this, MainActivity1.class);
                                startActivity(intent);
                                ActivityCompat.finishAffinity(result6.this);
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
    }
}

