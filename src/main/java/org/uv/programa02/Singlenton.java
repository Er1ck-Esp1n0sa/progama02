/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa02;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * 
 *
 * @author erikc
 */
public class Singlenton {
    
    private static Singlenton s=null;
    public static Singlenton getInstabce(){
        if(s==null)
            s=new Singlenton();
        return s;
    }
    private Singlenton(){
    }
    
    public void imprimir (){
        Logger.getLogger(Singlenton.class.getName()).log(Level.INFO,"Hola...");
                
    }
}
