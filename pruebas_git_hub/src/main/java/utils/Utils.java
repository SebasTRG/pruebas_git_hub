/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author Sebastian
 */
public class Utils {
    
    
    public static double division(int a, int b) throws ArithmeticException{
        if(b!=0){
            return a/b;
        }else{
            throw new ArithmeticException("división por cero no valido");
        }
        
    }
}
