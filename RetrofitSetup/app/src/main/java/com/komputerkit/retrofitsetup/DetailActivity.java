package com.komputerkit.retrofitsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class DetailActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String title = getIntent().getStringExtra("intent_title");
        String image = getIntent().getStringExtra("intent_image");

        getSupportActionBar().setTitle(title);

        textView = findViewById(R.id.judulTextView);
        textView.setText(title);

        Picasso.get()
                .load( image )
                .placeholder(R.drawable.img_placeholder)
                .error(R.drawable.img_placeholder)
                .into( (ImageView)findViewById(R.id.imageView) );
    }
}