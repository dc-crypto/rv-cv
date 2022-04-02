package com.diegocastro.kotlincardviewenrecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.diegocastro.kotlincardviewenrecyclerview.databinding.CardCellBinding

class CardViewHolder (private val cardCellBinding: CardCellBinding, private val clickListener: ProductoClickListener )

    : RecyclerView.ViewHolder(cardCellBinding.root)

{
        fun bindProducto(producto: Producto){
            cardCellBinding.imagen.setImageResource(producto.imagen)
            cardCellBinding.titulo.text=producto.titulo
            cardCellBinding.modelo.text=producto.modelo

            cardCellBinding.cardView.setOnClickListener{
                clickListener.onClick(producto)
            }

        }
}