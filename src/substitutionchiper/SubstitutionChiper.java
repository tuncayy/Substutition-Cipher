/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substitutionchiper;

import java.util.Scanner;

/**
 *
 * @author tuncaymsi
 */
public class SubstitutionChiper {

    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
			String plaintext;
                        String key;
                        
			System.out.println("type plain text");
			plaintext = input.nextLine();
                        
                        System.out.println("type the key ");
                        key = input.nextLine();
                        
                        String alp = "abcdefghijklmnopqrstuvwxyz";
                        String alpyedek = alp;
                        String alp2 = "";
                        String criptedtext = "";
                        alp2 += key; // anahtar kelimeyi harflerin soluna koyuyor.
                        
                        for (int i = 0; i < alp.length(); i++) {  //key in içindeki harfleri tüm harflerden çıkartıyor
                            for (int j = 0; j < key.length(); j++) {
                                if(alp.charAt(i) == key.charAt(j))
                                {
                                    alp = alp.substring(0,i) + alp.substring(i+1);
                                }
                            }
                        }
                        alp2 += alp; // kalan harfleri anahtar kelimenin arkasına diziyor
                        
                        for(int x = 0; x < plaintext.length(); x++){
        char c = (char)(plaintext.charAt(x));
           
            int a = 0;
            while(a < alpyedek.length())
            {
                if(c == alpyedek.charAt(a)){
                     criptedtext += alp2.charAt(a);
                     break;
                }
               
                a++;
            }
    }
           //  System.out.println("alp2= " + alp2);
             System.out.println("cripted text= " + criptedtext);
                        
                        
    }
    
}
