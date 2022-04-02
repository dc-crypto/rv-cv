package com.diegocastro.kotlincardviewenrecyclerview

var productoList= mutableListOf<Producto>()

val PRODUCTO_ID_EXTRA= "productoExtra"

class Producto ( var imagen:Int,
                 var titulo:String,
                 var modelo:String,
                 var descripcion:String,
                 val id:Int?= productoList.size)
