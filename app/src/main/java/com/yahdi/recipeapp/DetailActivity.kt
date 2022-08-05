package com.yahdi.recipeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.yahdi.recipeapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val RECIPE_DATA = "recipe"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val recipeData = intent.getParcelableExtra<RecipeData>(RECIPE_DATA)

        if (recipeData != null) {
            binding.apply {
                tvTitle.text = recipeData.title
                tvBahanDescription.text = recipeData.bahan
                tvCaraDescription.text = recipeData.cara
                Glide.with(this@DetailActivity)
                    .load(recipeData.imageUrl)
                    .into(ivPreview)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}