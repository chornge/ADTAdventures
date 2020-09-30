package com.example.myadt.ui

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myadt.R
import com.example.myadt.model.Character
import kotlinx.android.synthetic.main.item_layout.view.*


/*
 * Created by chornge on 09/30/2020.
 */

class MainAdapter(private val characterList: ArrayList<Character>) :
    RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(character: Character) {
            itemView.apply {
                textViewCharacterName.text = character.name
                textViewCharacterStatus.text = character.status
                textViewCharacterSpecies.text = character.species
                Glide.with(textViewCharacterImage.context)
                    .load(character.image)
                    .into(textViewCharacterImage)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        )

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val singleCharacter = characterList[position]
        holder.bind(singleCharacter)
        holder.itemView.setOnClickListener {
            val dialog = AlertDialog.Builder(it.context)
            dialog.setTitle("Location: ${singleCharacter.location.name}")
                .setPositiveButton("Dismiss", DialogInterface.OnClickListener { d, _ ->
                    d.dismiss()
                }).show()
        }
    }

    fun addCharacters(characters: List<Character>) {
        this.characterList.apply {
            clear()
            addAll(characters)
        }
    }
}