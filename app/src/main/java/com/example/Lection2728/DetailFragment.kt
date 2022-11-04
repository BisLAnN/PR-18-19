package com.example.Lection2728

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.lection2728.R

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.detailsText)
        val imageView = view?.findViewById<ImageView>(R.id.detailsView)
        if (selectedItem=="Бенгальская")
        {
            textView?.setText(R.string.bengal_cat)
            imageView?.setImageResource(R.drawable.bengal)
        }
        else if (selectedItem=="Шотладнская вислоухая")
        {
            textView?.setText(R.string.scottish_cat)
            imageView?.setImageResource(R.drawable.scottish)
        }
        else if (selectedItem=="Мейн-кун")
        {
            textView?.setText(R.string.maine_coon)
            imageView?.setImageResource(R.drawable.maine_coon)
        }
        else if (selectedItem=="Персидская")
        {
            textView?.setText(R.string.persian_cat)
            imageView?.setImageResource(R.drawable.persian)
        }
        else if (selectedItem=="Сиамская")
        {
            textView?.setText(R.string.siamese_cat)
            imageView?.setImageResource(R.drawable.siamese)
        }
    }
}