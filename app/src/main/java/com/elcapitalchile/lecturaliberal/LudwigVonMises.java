package com.elcapitalchile.lecturaliberal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LudwigVonMises extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView( R.layout.activity_ludwig_von_mises );

        final ImageButton btn = findViewById(R.id.botonLibros1 );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LudwigVonMises.this,webviewLudwigVonMises.class));
                overridePendingTransition( R.anim.zoom_back_in,R.anim.zoom_back_out );
                btn.setEnabled( false );
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.right_in,R.anim.right_out );



    }

    @Override
    protected void onResume() {
        super.onResume();
        final ImageButton btn = findViewById(R.id.botonLibros1 );
        btn.setEnabled( true );


    }
}
