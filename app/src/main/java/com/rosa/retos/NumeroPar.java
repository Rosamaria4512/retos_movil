package com.rosa.retos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;

public class NumeroPar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_par);
        // par();
        // letrass();
        //letras();
         mayor();
        //menoramayor();
        //sumapar();
        //Descendente();
        //ordernarletras();
        //retote();

    }

    private void par() {

        int[] array = {1, 2, 3, 1, -2, -6, -3, 4, 4, -2, -1, 1, 45};

        for (int i = 0; i < array.length; i++) {
            Toast.makeText(this, "arreglo" + array[i], Toast.LENGTH_SHORT).show();
            for (int j = 0; j < array.length; j++) {
                if (array[j] % 2 == 0) {
                    Toast.makeText(this, "son pares" + array[j], Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private void letras() {
        String[] palabras = {"mundo", "hola", "casa", "xiomara"};
        for (int i = 0; i < palabras.length; i++) {
            for(String palabra:palabras)
            if(palabra.length()==4){
                  Toast.makeText(this, "numero 3" + palabra, Toast.LENGTH_SHORT).show();

            }
        }
    }

    private void letrass() {
        String abedecedario = "abcdefghijklmnopqrstuvwxyz";

        int i = 0;

        int j = 0;

        for (i = 0; i < abedecedario.length(); i++) {
            Toast.makeText(this, "" + abedecedario.charAt(i), Toast.LENGTH_SHORT).show();


            System.out.println("numero" + i + "imprimir letras " + abedecedario.charAt(i));

        }
    }

    private void mayor() {
        int arreglo[] = {1, 2, 3, 4, 15, 6, 7, 8, 9};
        int mayor = arreglo[0];


        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        Toast.makeText(this, "Numero mayor" + mayor, Toast.LENGTH_SHORT).show();

    }

    private void sumapar() {

        int[] suma = {1, 2, 3, 4, 5, 6};
        int sumapares = 0;
        for (int i = 0; i < suma.length; i++) {
            if (suma[i] % 2 == 0) {
                int num = suma[i];
                sumapares = sumapares + num;
                Toast.makeText(this, "la suma de pares " + sumapares, Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void ordernarletras() {
        String[] letras = {"e", "a", "c", "u", "y"};
        Arrays.sort(letras);
        for (int i = 0; i < letras.length; i++) {
            Toast.makeText(this, "" + letras[i], Toast.LENGTH_SHORT).show();
        }
    }
    private void Descendente(){
        int[] numero = {1, 2, 3, 4, 5, 6, 7};

        for (int i = numero.length - 1; i >= 0; i--) {
            Toast.makeText(this, "De menor a mayor y letras  "+numero[i], Toast.LENGTH_SHORT).show();
        }
    }


    private void retote(){
        int[] reto = {1, 2, 3, 4, 5, 6};
        int []n3 =Arrays.stream(reto).filter(num->num >3).toArray();
        Arrays.stream(n3).forEach(System.out::println);
        Toast.makeText(this, "mayor a 3"+n3, Toast.LENGTH_SHORT).show();
       // System.out.println(n3);

    }
}



