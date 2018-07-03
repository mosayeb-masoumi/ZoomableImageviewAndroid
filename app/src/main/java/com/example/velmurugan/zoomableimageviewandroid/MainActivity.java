package com.example.velmurugan.zoomableimageviewandroid;

import android.graphics.PointF;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    TouchImageView cusImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cusImage=(TouchImageView)findViewById(R.id.img);
        cusImage.setOnTouchImageViewListener(new TouchImageView.OnTouchImageViewListener() {

            @Override
            public void onMove() {
                PointF point = cusImage.getScrollPosition();
                Log.d("point X",String.valueOf( point.x));
                Log.d("point y",String.valueOf( point.y));
                RectF rect = cusImage.getZoomedRect();
                float currentZoom = cusImage.getCurrentZoom();
                boolean isZoomed = cusImage.isZoomed();

            }
        });
    }
}
