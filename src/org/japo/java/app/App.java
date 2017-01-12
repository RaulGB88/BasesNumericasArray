/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    //Constantes String.
    public static final String DECIMAL = "DECIMAL";
    public static final String OCTAL = "OCTAL";
    public static final String HEXADECIMAL = "HEXADECIMAL";
    public static final String BINARIO = "BINARIO";

    //Constantes Númericas.
    public static final int NUMO1 = 0b110;
    public static final int NUMO2 = 0b1100;
    public static final int NUMO3 = 0b11001;
    public static final int NUMO4 = 0b110011;
    public static final int NUMO5 = 01;
    public static final int NUMO6 = 013;
    public static final int NUMO7 = 0135;
    public static final int NUMO8 = 01357;
    public static final int NUMO9 = 5;
    public static final int NUM10 = 10;
    public static final int NUM11 = 20;
    public static final int NUM12 = 100;
    public static final int NUM13 = 1000;
    public static final int NUM14 = 0x2;
    public static final int NUM15 = 0xC;
    public static final int NUM16 = 0xCA;
    public static final int NUM17 = 0xB0B0;
    public static final int NUM18 = 0xDAD0;
    public static final int NUM19 = 0xFE0;
    public static final int NUM21 = 0xFF;
    public static final int NUM22 = 2048;
    public static final int NUM23 = 512;
    public static final int NUM24 = 64;
    public static final int NUM25 = 8;
    public static final int NUM26 = 0246;
    public static final int NUM27 = 052;
    public static final int NUM28 = 07;
    public static final int NUM29 = 0b10101010101;
    public static final int NUM30 = 0b111000;

    // Insanciación del Array "numeros".
    public static int[] numeros = {NUMO1, NUMO2, NUMO3, NUMO4, NUMO5, NUMO6, NUMO7, NUMO8, NUMO9, NUM10, NUM11, NUM12, NUM13, NUM14, NUM15, NUM16, NUM17, NUM18, NUM19, NUM21, NUM22, NUM23, NUM24, NUM25, NUM26, NUM27, NUM28, NUM29, NUM30};

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Ejecución del método.
        mostrarNumeros();
    }

    //Método que muestra los números en la disitintas bases.
    public void mostrarNumeros() {

        //Mensaje que muestra el tipo de número que mostrará debajo.
        System.out.printf("%-17s  %-6s  %-5s  %-5s\n", BINARIO, OCTAL, DECIMAL, HEXADECIMAL);
        
        //Bucle para localizar la posición correspondiente del Array.
        for (int veces = 0; veces < 29; veces++) {
            //Mensaje con el número y cada base numérica.
            System.out.printf("0b%-16s - 0%-6o - %-5d - 0X%-4x\n", Integer.toBinaryString(numeros[veces]), numeros[veces], numeros[veces], numeros[veces]);
        }
    }

}
