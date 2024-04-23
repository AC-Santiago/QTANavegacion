package com.example.qta

sealed class items_menu(
    val icon: Int,
    val title: string,
    val ruta: string,
){
    object pantalla1: Items_menu(R.drawable.account_box,
         "Dos mitades")

    //**object pantalla1: Items_menu(R.drawable.diagram_2_fill,
    //    title: "Dos mitades", ruta: "pantalla1")
    //object pantalla1: Items_menu(R.drawable.vector,
      //  title: "Dos mitades", ruta: "pantalla1")

}
