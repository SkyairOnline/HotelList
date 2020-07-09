package com.arudo.hotellist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.ActionMode
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.arudo.hotellist.adapter.ListHotelAdapter
import com.arudo.hotellist.models.Hotel
import com.arudo.hotellist.models.HotelData

class MainActivity : AppCompatActivity() {

    private lateinit var rvHotel: RecyclerView
    private var list: ArrayList<Hotel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvHotel=findViewById(R.id.rvHotel)
        rvHotel.setHasFixedSize(true)
        list.addAll(HotelData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_contextual, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.optionAbout->{
                showAboutLayout()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showAboutLayout(){
        val aboutIntent =Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutIntent)

    }

    private fun showRecyclerList(){
        rvHotel.layoutManager = LinearLayoutManager(this)
        val listHotelAdapter=ListHotelAdapter(list)
        rvHotel.adapter=listHotelAdapter
        listHotelAdapter.setOnItemClickCallBack(object :ListHotelAdapter.OnItemClickCallBack{
            override fun onItemClicked(data: Hotel) {
                selectedHotel(data)
            }
        })
    }

    private fun selectedHotel(hotel:Hotel){
        val moveHotelIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveHotelIntent.putExtra(DetailActivity.image, hotel.photo)
        moveHotelIntent.putExtra(DetailActivity.name, hotel.name)
        moveHotelIntent.putExtra(DetailActivity.detail, hotel.detail)
        moveHotelIntent.putExtra(DetailActivity.website, hotel.website)
        moveHotelIntent.putExtra(DetailActivity.rating, hotel.rating)
        moveHotelIntent.putExtra(DetailActivity.location, hotel.location)
        startActivity(moveHotelIntent)
    }


}
