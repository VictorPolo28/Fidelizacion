package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Informacion  del  cliente   y   valores de compra

        Scanner usuario =  new Scanner(System.in);

        System.out.println("Ingresse  su  nombre: ");
        String nombre = usuario.nextLine();

        System.out.println("ingrese el valor de su compra  con decimales: ");
        double cantidadCompra  = usuario.nextDouble();
        double nivelFidelizacion  = cantidadCompra ;
        double nivelFidelizacionBronze = nivelFidelizacion *=0.10 ;
        double nivelFidelizacionPlata= nivelFidelizacion *=0.20 ;
        double nivelFidelizacionOro = nivelFidelizacion *=0.30 ;
        double nivelFidelizacionPlatino = nivelFidelizacion *=0.40 ;
        int puntosAcumulados  = (int)cantidadCompra ;
        puntosAcumulados  /=10 ;  

    System.out.println("Hola "+ nombre  +" el  valor   de su  compra   fue : " + cantidadCompra  + " esto  equivale   a " + puntosAcumulados  + " en  puntos ");
    usuario.close();


        //muestra   de rango  del  cliente

    if (puntosAcumulados <=100) {
        System.out.println("Señor : " + nombre + " Usted es  un comprador  nivel  Bronze " );      
    } else if (puntosAcumulados >100 && puntosAcumulados <=500 ) {
        System.out.println("Señor : " + nombre + " Usted es  un comprador  nivel  Plata ");
    }else if (puntosAcumulados >500 && puntosAcumulados <=1000  ) {
        System.out.println("Señor : " + nombre + " Usted es  un comprador  nivel  Oro ");
    } else {
        System.out.println("Señor : " + nombre + " Usted es  un comprador  nivel  Platino ");
    }
    
    //ofertas depues de validar   el rango  deli  Cliente 
    


    if (puntosAcumulados <=100) {
        System.out.println("Señor : " + nombre + " Usted obtendra un 10% de descuento  en su compra su descuento  es de :  " + nivelFidelizacionBronze + " mil " );      
    } else if (puntosAcumulados >100 && puntosAcumulados <=500 ) {
        System.out.println("Señor : " + nombre + " Usted obtendra un 20% de descuento  en su compra su descuento  es de :  "  + nivelFidelizacionPlata + " mil ");
    }else if (puntosAcumulados >500 && puntosAcumulados <=1000  ) {
        System.out.println("Señor : " + nombre + " Usted obtendra un 30% de descuento  en su compra su descuento  es de :  "  + nivelFidelizacionOro + " mil " );
    } else {
        System.out.println("Señor : " + nombre + " Usted obtendra un 40% de descuento  en su compra su descuento  es de :  " + nivelFidelizacionPlatino + " mil " );
    }
    }
}