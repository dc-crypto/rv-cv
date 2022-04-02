package com.diegocastro.kotlincardviewenrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import com.diegocastro.kotlincardviewenrecyclerview.databinding.CardCellBinding

class CardAdapter(private val productos: List<Producto>, private val clickListener: ProductoClickListener)

    : RecyclerView.Adapter<CardViewHolder>()
//el adapter necesita un view holder, creamos cardviewholder
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder
    {
        val from=LayoutInflater.from(parent.context)
        val binding=CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int)
    {
        holder.bindProducto(productos[position])
    }

    override fun getItemCount(): Int =productos.size
}