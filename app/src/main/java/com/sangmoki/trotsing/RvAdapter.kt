package com.sangmoki.trotsing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val items: MutableList<String>) : RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvAdapter.ViewHolder {
        // onCreateViewHolder 함수는 ViewHolder를 생성하고 초기화합니다.
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    // onBindViewHolder 함수는 ViewHolder의 bindItems 함수를 호출하여 데이터를 뷰에 바인딩합니다.
    override fun onBindViewHolder(holder: RvAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    // getItemCount 함수는 RecyclerView에 표시할 아이템의 개수를 반환합니다.
    override fun getItemCount(): Int {
        return items.size
    }

    // ViewHolder 클래스는 RecyclerView.ViewHolder를 상속받아야 합니다.
    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item: String) {
            val rv_item = itemView.findViewById<TextView>(R.id.rvItemId)
            rv_item.text = item
        }
    }
}