package com.kproject.memesappai

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Todo o código de classes e layouts criado neste projeto foi completamente feito pelo:
 * https://beta.openai.com/playground
 */
class MainActivity : AppCompatActivity() {
    private val viewModel: MemeViewModel by viewModels {
        MemeViewModel.ViewModelFactory(MemeViewModel(MemeRepository()))
    }

    private lateinit var recyclerView: RecyclerView
    private lateinit var memeAdapter: MemeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        val gridLayoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = gridLayoutManager

        memeAdapter = MemeAdapter()
        recyclerView.adapter = memeAdapter
        viewModel.getMemes()
        viewModel.memes.observe(this, Observer { memes ->
            memeAdapter.setMemes(memes)
        })
    }
}