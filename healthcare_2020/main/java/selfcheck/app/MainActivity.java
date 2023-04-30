package selfcheck.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_1 = (Button) findViewById(R.id.button_1);
        Button btn_2 = (Button) findViewById(R.id.button_2);
        Button btn_3 = (Button) findViewById(R.id.button_3);
        Button btn_4 = (Button) findViewById(R.id.button_4);
    }

    public void buttonClick(View view) {
        Toast.makeText(getApplicationContext(),"자가진단 서비스 실행중", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity1.class);
        startActivity(intent);
    }


    public void buttonClick1(View view) {
        Toast.makeText(getApplicationContext(),"편의시설 위치정보 실행중", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MapButton.class);
        startActivity(intent);
    }

    public void buttonClick2(View view) {
        Toast.makeText(getApplicationContext(),"정보공유 게시판 실행중", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }

    public void buttonClick3(View view) {
        Toast.makeText(getApplicationContext(),"복지정보 게시판 이동", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seongnam.go.kr/city/1000240/10142/contents.do"));
        startActivity(intent);
    }
}