package com.egecius.demo_collapsingtoolbarlayout;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


final public class DetailActivity extends AppCompatActivity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_activity);


		initActionBar();
		setImage();
	}

	private void initActionBar() {
		setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
		ActionBar ab = getSupportActionBar();
		if (ab != null) {
			ab.setDisplayHomeAsUpEnabled(true);
		}
	}

	private void setImage() {
		ImageView imageView = (ImageView) findViewById(R.id.image);
		String url = "http://cdn.images.express.co.uk/img/dynamic/128/590x/Giraffes-in-the-wild-that-are-in-danger-543940.jpg";
		Picasso.with(this).load(url).into(imageView);
	}
}
