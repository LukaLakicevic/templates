package com.example.testapp.Menu.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testapp.R

class MenuAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<AdapterPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.menu_recycler_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MenuViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(itemList: List<AdapterPost>) {
        items = itemList
    }

    class MenuViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text_view)
        val imageView: ImageView = itemView.findViewById(R.id.image_view)

        fun bind(item: AdapterPost) {
            textView.setText(item.text)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(item.image)
                .into(imageView)


            itemView.setOnClickListener { v: View ->
                val position: Int = absoluteAdapterPosition
                Toast.makeText(itemView.context, "Name ${item.text} \n Number #${absoluteAdapterPosition + 1}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
