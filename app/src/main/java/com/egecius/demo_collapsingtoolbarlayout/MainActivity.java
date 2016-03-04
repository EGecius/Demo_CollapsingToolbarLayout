package com.egecius.demo_collapsingtoolbarlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initActionBar();
		setImage();
	}

	private void initActionBar() {
		setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
	}

	private void setImage() {
		ImageView imageView = (ImageView) findViewById(R.id.image);
		String url = "http://cdn.images.express.co.uk/img/dynamic/128/590x/Giraffes-in-the-wild-that-are-in-danger-543940.jpg";
		Picasso.with(this).load(url).into(imageView);
	}
}
