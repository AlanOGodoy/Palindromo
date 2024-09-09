/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;


/**
 * Esta clase es donde se encuentra todo lo relacionado a las operaciones 
 * Esta una suma simple de numeros y tambien donde se Recoge la palabra del usuario y se determina si es o no palindromo
 * y se regresa al usuario para que lo vea
 * @author alang
 */
public class Palindromo {
    /**
     * 
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de los 2 valores.
     */
    public int sumar(int a, int b){
            return a+b;
    }
    /**
     * 
     * @param word Es la palabra ingresada por el usuario
     * @param reversedWord Es la palabra ingresada por el usuario ya leida al revez y letra por letra
     * @return Dice si la palabra es palindromo o no
     */
    public static boolean esPalindromo(String word){
        String cleanWord = word.replace(" ", "");
        String reversedWord = "";
        for(int i=0;i<cleanWord.length(); i++){
        reversedWord = cleanWord.charAt(i) + reversedWord;
        
    }
        return cleanWord.equals(reversedWord);
        
        
        }

    }


    

