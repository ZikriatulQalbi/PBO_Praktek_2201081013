/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZikriatulQalbi040423;

/**
 *
 * @author hp
 */
public class Latihan73 { //pakai for//
    public static void main(String[] args){
        String entry[][] = {{"Floence","735-1234","Manila"},{"Joyce","983-3333","Quezon City"},
            {"Becca","456-3322","Manila"}};
        int i=0;
        do{
            System.out.println("name    :"+entry[i][0]);
            System.out.println("Tel.#   :"+entry[i][1]);
            System.out.println("Address :"+entry[i][2]);
            System.out.println("");
            i++;
            
        }
        while(i<3);
    }
    
}
