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


public class Map2class extends AppCompatActivity implements OnMapReadyCallback {
    private static final int ACCESS_LOCATION_PERMISSION_REQUEST_CODE = 100;

    private FusedLocationSource locationSource;
    private NaverMap naverMap;
    private List<Marker> markerList = new ArrayList<>();

    private ArrayList<MapPoint2> mapPoint2 = new ArrayList<MapPoint2>();

    private Button btnmark2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map2);

        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ShelterApi2 parser = new ShelterApi2();
                    try {
                        mapPoint2 = parser.apiParserSearch2();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();


        btnmark2 = findViewById(R.id.btn12);


        btnmark2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mapPoint2.size() == 0) {
// 자료가 준비되지 않았음
                    return;
                }
                for (int i = 0; i < mapPoint2.size(); i++) { // 의심되는 부분

                    Marker marker = new Marker();
                    marker.setPosition(new LatLng(mapPoint2.get(i).getWgs84Lat2(), mapPoint2.get(i).getWgs84Lon2()));
                    marker.setTag(mapPoint2.get(i).getDutyName2());
                    marker.setIcon(MarkerIcons.BLACK);
                     marker.setIconTintColor(Color.RED);
                     marker.setWidth(50);
                     marker.setHeight(80);
                    // marker.setAnchor(new PointF(0.5f,1.0f));
                    marker.setMap(naverMap);
                    markerList.add(marker);

                }
            }
        });

        // btnmark3.setOnClickListener(new View.OnClickListener() {

        // });

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



