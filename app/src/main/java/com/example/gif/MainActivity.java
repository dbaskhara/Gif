package com.example.gif;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.gif.R;

public class MainActivity extends AppCompatActivity {
    ImageView GambarGif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TAMBAHKAN INI
        GambarGif = (ImageView)findViewById(R.id.imageviewku);

        Glide.with(MainActivity.this)
                // LOAD URL DARI LOKAL DRAWABLE
                .load(R.drawable.jerapah)
                .asGif()
                //PENGATURAN CACHE
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(GambarGif);

    }
}