 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa02;

/**
 *
 * @author erikc
 */
public class Programa02 {

    public static void main(String[] args) {
        //Singlenton singlenton=new Singlenton();
        Singlenton singlenton = Singlenton.getInstabce();
        singlenton.imprimir();
    }
}
