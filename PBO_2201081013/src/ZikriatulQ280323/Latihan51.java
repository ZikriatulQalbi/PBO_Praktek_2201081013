/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQ280323;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class Latihan51 {

    public static void main(String[] args) {
        BufferedReader dataIn
                = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        String word2 = "";
        String word3 = "";

        try {
            System.out.println("Enter word1 :");
            word1 = dataIn.readLine();
            System.out.println("Enter word2 :");
            word2 = dataIn.readLine();
            System.out.println("Enter word3 :");
            word3 = dataIn.readLine();

        } catch (IOException ex) {
            System.out.println("Error!");

        }

        System.out.println( word1  + " " +  word2  + " " + word3 );

    }
}
