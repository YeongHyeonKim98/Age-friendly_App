package selfcheck.app;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityStart extends AppCompatActivity {

    private Button btn_st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btn_st = (Button) findViewById(R.id.button_st);


            ImageButton img_1 = (ImageButton) findViewById(R.id.img_1);
            ImageButton img_2 = (ImageButton) findViewById(R.id.img_2);


        }

        public void buttonClick20(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.miraeseum.or.kr/"));
            startActivity(intent);
        }

        public void buttonClick21(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCo2z8iYOZCgbQ-SL8lbsmqw"));
            startActivity(intent);
        }


    public void buttonClick12(View view) {
        Toast.makeText(getApplicationContext(), "개발 어플리케이션으로 이동", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ActivityStart.this, MainActivity.class);
        startActivity(intent);
    }
}

