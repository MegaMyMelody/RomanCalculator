/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romancalculator;

/**
 *
 * @author MegaMymelody
 */
public class Calculator {
    private String roman1,roman2;
    private char operator;
    public Calculator(String roman1,char operator,String roman2){
        this.operator = operator;
        this.roman1 = roman1;
        this.roman2 = roman2;
    }
   private int convertToInt(String roman){
       int num=0;
        for(int i=0;i<=(roman.length()-1);i++){
          if(roman.charAt(i)=='I'){
               if(i== (roman.length()-1) || roman.charAt(i+1)=='I'){
                   num+=1;
               }
               else if(roman.charAt(i+1)=='V'){
                   num+=4;
                   i= i+1;
               }
               else if(roman.charAt(i+1)=='X'){
                   num+=9;
                   i= i+1;
               }
               else{
                   num= -1;
                   i=roman.length();
                   System.out.println("Input Roman numeral is incorrect");
               }
            }
          else if(roman.charAt(i)=='V'&&(i== (roman.length()-1) || roman.charAt(i+1)=='I') )
              num+=5;
          else if(roman.charAt(i)=='X'){
              if(i== (roman.length()-1) || roman.charAt(i+1)=='X' || roman.charAt(i+1)=='V' || roman.charAt(i+1)=='I'){
                   num+=10;
               }
               else if(roman.charAt(i+1)=='L'){
                   num+=40;
                   i= i+1;
               }
               else if(roman.charAt(i+1)=='C'){
                   num+=90;
                   i= i+1;
               }
               else{
                   num= -1;
                   i=roman.length();
                   System.out.println("Input Roman numeral is incorrect");
               }
            }
            else if (roman.charAt(i)=='L'&&(i== (roman.length()-1) || roman.charAt(i+1)=='X' || roman.charAt(i+1)=='V' || roman.charAt(i+1)=='I'))
              num+=50;
           else if(roman.charAt(i)=='C'){
              if(i== (roman.length()-1)|| roman.charAt(i+1)=='C' || roman.charAt(i+1)=='L'|| roman.charAt(i+1)=='X' || roman.charAt(i+1)=='V' || roman.charAt(i+1)=='I'){
                   num+=100;
               }
               else if(roman.charAt(i+1)=='D'){
                   num+=400;
                   i= i+1;
               }
               else if(roman.charAt(i+1)=='M'){
                   num+=900;
                   i= i+1;
               }
              else{
                   num= -1;
                   i=roman.length();
                   System.out.println("Input Roman numeral is incorrect");
               }
              
            } 
            else if (roman.charAt(i)=='D'&&(i== (roman.length()-1)|| roman.charAt(i+1)=='C' || roman.charAt(i+1)=='L' || roman.charAt(i+1)=='X' || roman.charAt(i+1)=='V' || roman.charAt(i+1)=='I'))
              num+=500;
          else if(roman.charAt(i)=='M'&&(i== (roman.length()-1)|| roman.charAt(i+1)=='M' || roman.charAt(i+1)=='D' ||roman.charAt(i+1)=='C' || roman.charAt(i+1)=='L' || roman.charAt(i+1)=='X' || roman.charAt(i+1)=='V' || roman.charAt(i+1)=='I'))
              num+=1000;
          else{
              num = -1;
              i=roman.length();
              System.out.println("Input Roman numeral is incorrect");
          } 
        }
        
   }
  return num;  
}
public int calculate(){
       int ans = 0;
       int num1 = convertToInt(roman1);
       int num2 = convertToInt(roman2); 
     if(num1!= -1 && num2 != -1){
       if(operator == '+'){
           ans= num1+num2;
       }
       else if(operator == '-') {
           ans = num1-num2;
       }
       else {
           ans = -1;
           System.out.println("There are no operator.");
       }   
   }
    else
         ans= -1;
    return ans;   
}
public void answer(){
    int ans = calculate();
    String romanAns="";
    if(ans>0){
        while(ans!=0){
            if(ans>=1000){
                ans=ans-1000;
                romanAns += "M";
            }
            else if(ans<1000 && ans>=900){
                ans= ans-900;
                romanAns += "CM";
            }
            else if(ans<900 && ans>=500){
                ans = ans-500;
                romanAns +="D";
            }
            else if(ans<500 && ans>=400){
                ans= ans-400;
                romanAns +="CD";
            }
            else if(ans<400 && ans>=100){
                ans = ans-100;
                romanAns+= "C";
            }
            else if(ans<100 && ans>=90){
                ans= ans-90;
                romanAns+= "XC";
            }
            else if(ans<90 && ans>=50){
                ans= ans-50;
                romanAns+= "L";
            }
            else if(ans<50 && ans>=40){
                ans= ans-40;
                romanAns+= "XL";
            }
            else if(ans<40 && ans>=10){
                ans= ans-10;
                romanAns+= "X";
            }
            else if(ans<10 && ans>=9){
                ans= ans-9;
                romanAns+= "IX";
            }
            else if(ans<9 && ans>=5){
                ans= ans-5;
                romanAns+= "V";
            }
            else if(ans<5 && ans>=4){
                ans= ans-4;
                romanAns+= "IV";
            }
            else if(ans<4 && ans>=1){
                ans= ans-1;
                romanAns+= "I";
            }     
        }  
        System.out.println("Answer: "+romanAns);
    }
    else if (ans==0){
        System.out.println("Answer: nulla");
    }
}
}
   


