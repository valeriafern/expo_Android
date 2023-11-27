package com.example.expo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val context: Context, private val imageArray: Array<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return imageArray.size
    }

    override fun getItem(position: Int): Any {
        return imageArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView
        if (convertView == null) {
            // If the view is not recycled, initialize and set attributes as desired
            imageView = ImageView(context)
            imageView.layoutParams = ViewGroup.LayoutParams(200, 200)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }

        // Set image resource based on the data provided
        imageView.setImageResource(imageArray[position])

        return imageView
    }
}