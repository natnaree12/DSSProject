/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceltojava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Natnaree
 */
public class ExcelToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "/Users/Natnaree/NetBeansProjects/ExcelToJava/src/exceltojava/Department.csv";
		File file = new File(path);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",");
                                System.out.print(arr[0]);
                                System.out.print(" - ");
                                System.out.print(arr[1]);
                                System.out.println();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
