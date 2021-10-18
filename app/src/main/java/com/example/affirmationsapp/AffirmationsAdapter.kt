package com.example.affirmationsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class AffirmationsAdapter(val list: List<AffirmationsDataModel>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent, false
        )

        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.imgAffirmations.setImageResource(list[position].img)
        holder.textAffirmations.text = list[position].affirmationsText
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var imgAffirmations: ImageView = view.findViewById(R.id.img_affirmations)
    var textAffirmations: TextView = view.findViewById(R.id.text_affirmations)
}