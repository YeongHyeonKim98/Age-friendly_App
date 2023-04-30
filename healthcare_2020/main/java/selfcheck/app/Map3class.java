package selfcheck.app;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.overlay.Marker;
import com.naver.maps.map.util.FusedLocationSource;
import com.naver.maps.map.util.MarkerIcons;

import java.util.ArrayList;
import java.util.List;


public class Map3class extends AppCompatActivity implements OnMapReadyCallback {
    private static final int ACCESS_LOCATION_PERMISSION_REQUEST_CODE = 100;

    private FusedLocationSource locationSource;
    private NaverMap naverMap;
    private List<Marker> markerList = new ArrayList<>();
    private ArrayList<MapPoint3> mapPoint3 = new ArrayList<MapPoint3>();

    private Button btnmark3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map3);

        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ShelterApi3 parser = new ShelterApi3();
                    try {
                        mapPoint3 = parser.apiParserSearch3();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();


        btnmark3 = findViewById(R.id.btn13);

        btnmark3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mapPoint3.size() == 0) {
// 자료가 준비되지 않았음
                    return;
                }
                for (int i = 0; i < mapPoint3.size(); i++) { // 의심되는 부분

                    Marker marker = new Marker();
                    marker.setPosition(new LatLng(mapPoint3.get(i).getREFINE_WGS84_LAT3(), mapPoint3.get(i).getREFINE_WGS84_LOGT3()));
                    marker.setTag(mapPoint3.get(i).getFACLT_NM3());
                     marker.setIcon(MarkerIcons.BLACK);
                     marker.setIconTintColor(Color.RED);
                     marker.setWidth(50);
                     marker.setHeight(80);
                    // marker.setAnchor(new PointF(0.5f,1.0f));
                    marker.setMap(naverMap);
                    markerList.add(marker);
                    markerList.clear();

                }
            }


        });



    }
    @Override
    public void onMapReady (@NonNull NaverMap naverMap){
        FusedLocationSource locationSource = new FusedLocationSource(this, 100);
        naverMap.setLocationSource(locationSource);
        UiSettings uiSettings = naverMap.getUiSettings();
        uiSettings.setLocationButtonEnabled(true);

        this.naverMap = naverMap;
    }

    @Override
    public void onRequestPermissionsResult ( int requestCode,
                                             @NonNull String[] permissions, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case ACCESS_LOCATION_PERMISSION_REQUEST_CODE:
                locationSource.onRequestPermissionsResult(requestCode, permissions, grantResults);
                return;
        }
    }

}



