package com.arudo.hotellist

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.ActionBar
import android.view.View
import android.widget.RatingBar
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val name = "Hotel Name"
        const val detail = "Hotel detail"
        const val image = "Hotel Image"
        const val website = "Hotel Website"
        const val rating = "Hotel Rating"
        const val location = "Hotel Location"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if(supportActionBar != null){
            (supportActionBar as ActionBar).title = "Detail Hotel"
            (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)
        }
        val hotelimage = intent.getIntExtra(image, 0)
        Glide.with(this)
            .load(hotelimage)
            .into(imgHotel)
        val hotelname =intent.getStringExtra(name)
        txtNameHotel.text = hotelname
        val hoteldetail =intent.getStringExtra(detail)
        txtDetailHotel.text = hoteldetail
        val hotelwebsite = intent.getStringExtra(website)
        txtWebsiteHotel.text = hotelwebsite
        val hotelRatingBar = intent.getFloatExtra(rating, 0f)
        ratingBar.rating = hotelRatingBar
        val hotelRating = "$hotelRatingBar/100"
        txtRatingHotel.text = hotelRating
    }

    fun mapLocation(view: View){
        val location = Uri.parse(intent.getStringExtra(location))
        val locationIntent = Intent(Intent.ACTION_VIEW, location)
        startActivity(locationIntent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
