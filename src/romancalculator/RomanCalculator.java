/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romancalculator;
import java.util.Scanner;

/**
 *
 * @author MegaMymelody
 */
public class RomanCalculator {

  
    public static void main(String[] args) {
        String roman1,roman2;
        char operator;
        int operatorIndex = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Roman Numbers and the operator(Ex: XX+II or V-I): ");
        String input  = sc.nextLine();
        for(int i=0;i<(input.length()-1);i++){
            if(input.charAt(i)=='+'||input.charAt(i)== '-'){
                operatorIndex = i;
                i=input.length();
                
            }
        }
       roman1 = input.substring(0, operatorIndex);
       roman2 = input.substring(operatorIndex+1, input.length());
       operator = input.charAt(operatorIndex);
   
       Calculator cal = new Calculator(roman1,operator,roman2);
       System.out.println(cal.verify(roman1));
       System.out.println(cal.verify(roman2));
       cal.answer();
     
    }
   
    
}
