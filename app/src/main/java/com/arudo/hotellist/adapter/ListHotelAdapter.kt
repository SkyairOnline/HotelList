package com.arudo.hotellist.adapter

import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.arudo.hotellist.R
import com.arudo.hotellist.models.Hotel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop

class ListHotelAdapter(private val listHotel: ArrayList<Hotel>) :RecyclerView.Adapter<ListHotelAdapter.ListViewHolder>(){
    private lateinit var onItemClickCallBack:OnItemClickCallBack

    interface OnItemClickCallBack{
        fun onItemClicked(data:Hotel)
    }

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    inner class ListViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        var txtNameHotel: TextView = itemView.findViewById(R.id.txtNameHotel)
        var imageItemHotel: ImageView = itemView.findViewById(R.id.imageItemHotel)
        var ratingHotel: TextView = itemView.findViewById(R.id.txtRatingHotel)
        var buttonDetailHotel: ImageButton = itemView.findViewById(R.id.buttonDetailHotel)
        var buttonWebsiteHotel: ImageButton = itemView.findViewById(R.id.buttonWebsiteHotel)
        var buttonLocationHotel: ImageButton = itemView.findViewById(R.id.buttonLocationHotel)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ListViewHolder {
        val view:View = LayoutInflater.from(p0.context).inflate(R.layout.item_list_hotel, p0, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }

    override fun onBindViewHolder(p0: ListViewHolder, p1: Int) {
        val hotel = listHotel[p1]
        val stringRating = "${hotel.rating}/100"
        Glide.with(p0.itemView.context)
            .load(hotel.photo)
            .centerCrop()
            .transform(CircleCrop())
            .into(p0.imageItemHotel)
        p0.txtNameHotel.text=hotel.name
        p0.ratingHotel.text=stringRating
        p0.buttonWebsiteHotel.setOnClickListener {
            val website = Uri.parse(hotel.website)
            val websiteIntent =Intent(Intent.ACTION_VIEW, website)
            it.context.startActivity(websiteIntent)
        }
        p0.buttonLocationHotel.setOnClickListener {
            val location = Uri.parse(hotel.location)
            val locationIntent =Intent(Intent.ACTION_VIEW, location)
            it.context.startActivity(locationIntent)
        }
        p0.buttonDetailHotel.setOnClickListener{
            onItemClickCallBack.onItemClicked(listHotel[p0.adapterPosition])
        }
    }
}