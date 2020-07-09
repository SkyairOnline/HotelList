package com.arudo.hotellist

import android.os.Bundle
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import kotlinx.android.synthetic.main.about.*

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = "About Us"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
        Glide.with(this)
            .load(R.drawable.profile)
            .centerCrop()
            .transform(CircleCrop())
            .into(photoCreatorAbout)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}