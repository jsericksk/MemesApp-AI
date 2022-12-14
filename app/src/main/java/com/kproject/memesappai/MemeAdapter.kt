package com.kproject.memesappai

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class MemeAdapter : RecyclerView.Adapter<MemeAdapter.MemeViewHolder>() {
    private val memes = mutableListOf<Meme>()

    fun setMemes(memes: List<Meme>) {
        this.memes.clear()
        this.memes.addAll(memes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_meme, parent, false)
        return MemeViewHolder(view)
    }

    override fun getItemCount(): Int = memes.size

    override fun onBindViewHolder(holder: MemeViewHolder, position: Int) {
        holder.bind(memes[position])
    }

    class MemeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textView: TextView = itemView.findViewById(R.id.textView)

        fun bind(meme: Meme) {
            imageView.load(meme.url)
            textView.text = meme.name
        }
    }
}