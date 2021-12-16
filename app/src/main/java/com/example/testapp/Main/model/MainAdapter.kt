package com.example.testapp.Main.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R

class MainAdapter(
    private val onClick: (Int) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<AdapterItem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MainAdapter.MainViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.main_recycler_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is MainAdapter.MainViewHolder -> {
                holder.bind(position, items[position], onClick)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(itemList: List<AdapterItem>) {
        items = itemList
    }

    class MainViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text_view)

        fun bind(
            position: Int,
            item: AdapterItem,
            onClick: (Int) -> Unit
            ) {
            itemView.setOnClickListener {onClick(position)}
            textView.setText(item.text)
        }
    }
}



