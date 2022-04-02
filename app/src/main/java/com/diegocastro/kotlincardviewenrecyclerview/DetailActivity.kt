package com.diegocastro.kotlincardviewenrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegocastro.kotlincardviewenrecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val productoID=intent.getIntExtra(PRODUCTO_ID_EXTRA,-1)
        val producto=productoFromID(productoID)

        if(producto!=null)
        {
            binding.imagen.setImageResource(producto.imagen)
            binding.titulo.text=producto.titulo
            binding.modelo.text=producto.modelo
            binding.descripcion.text=producto.descripcion
        }
        
    }

    private fun productoFromID(productoID: Int): Producto? {

        for(producto in productoList)
            {
             if(producto.id==productoID)
                 return producto
            }
        return null

    }
}