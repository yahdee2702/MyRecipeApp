package com.yahdi.recipeapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yahdi.recipeapp.databinding.ItemRecipesBinding

class RecipeAdapter(private val recipes: ArrayList<RecipeData>): RecyclerView.Adapter<RecipeAdapter.MyViewHolder>() {
    class MyViewHolder(private val binding: ItemRecipesBinding): RecyclerView.ViewHolder(binding.root) {
        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)

                return MyViewHolder(
                    ItemRecipesBinding.inflate(layoutInflater, parent, false)
                )
            }
        }

        fun bind(data: RecipeData) {
            binding.apply {
                tvTitle.text = data.title

                Glide.with(root.context)
                    .load(data.imageUrl)
                    .into(ivPreview)

                root.setOnClickListener {
                    val intent = Intent(root.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.RECIPE_DATA, data)
                    root.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder.from(parent)

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(recipes[position])
    }

    override fun getItemCount() = recipes.size
}