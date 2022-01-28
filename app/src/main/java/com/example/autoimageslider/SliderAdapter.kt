package com.example.autoimageslider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class SliderAdapter(private val sliderItems: List<SliderItem>, private val viewPager2: ViewPager2): RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {
    class SliderViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageSlide)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val adapter = LayoutInflater.from(parent.context).inflate(R.layout.slide_item_container, parent, false)
        return SliderViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        val item = sliderItems[position]
        holder.imageView.setImageResource(item.image)
    }

    override fun getItemCount(): Int = sliderItems.size

    private val runnable = Runnable {
        kotlin.run {
            notifyDataSetChanged()
        }
    }
}