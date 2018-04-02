/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentdss;

import java.util.Scanner;

/**
 *
 * @author Natnaree
 */
public class DepartmentDSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String question[] = {"Planting and growing crops", 
                            "Solving math problems", 
                            "Being in a play", 
                            "Studying other cultures", 
                            "Talking to people at a party", 
                            "Working with computers"};
        int codeKey[] = new int [16];
//        System.out.println("question: ");
//        for(int i = 0; i < 6; i++){
//            question[i] = sc.next();
//        }
        for(int i = 0; i <= 6; i++){
            if(i%6 == 0) codeKey[i] = 0;
            else if(i%6 == 1) codeKey[i] = 1;
            else if(i%6 == 2) codeKey[i] = 2;
            else if(i%6 == 3) codeKey[i] = 3;
            else if(i%6 == 4) codeKey[i] = 4;
            else codeKey[i] = 5;
        }
        int code[] = new int [6];
        for(int i = 0; i < 6; i++){
            System.out.println(question[i] + " - " + codeKey[i]);
        }
        
        for(int i = 0; i < question.length; i++){
            System.out.println(question[i] + ": ");
            Byte ans = sc.nextByte();
            if(ans == 1) code[codeKey[i]]++;
        }
        
        for(int i = 0; i < 6; i++){
            System.out.println(code[i]);
        }
        
        int max = code[0];
        for(int i = 1; i < 6; i++){
            if(code[i] > max){
                max = code[i];
            }
        }
        System.out.println("Code: " + max);
        //code[0] = R
        //code[1] = I
        //code[2] = A
        //code[3] = S
        //code[4] = E
        //code[5] = C
    }
    
}
