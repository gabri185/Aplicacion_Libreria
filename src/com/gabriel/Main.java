package com.gabriel;

import LibreriaCOD.FactoriaDeSalidas;
import LibreriaCOD.InterfaceMetodosComunes;

public class Main {

    public static void main(String[] args) {
        InterfaceMetodosComunes unaConsola = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Hola");
        unaConsola.visualiza();

        InterfaceMetodosComunes unaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA,"Chao");
        unaVentana.visualiza();


    }
}
