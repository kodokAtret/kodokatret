package com.example.keran

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOption
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListKeranAdapter : RecyclerView.Adapter<ListKeranAdapter.ListViewHolder>() {
    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i : Int): ListViewHolder {
        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_keran, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val keran = listKeran[position]

        Glide.with(holder.itemView.context)
            .load(keran.photo)
            .apply(RequestOption().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = keran.name
        holder.tvDetail.text = keran.detail
    }

    override fun getItemCount(): Int {}

}