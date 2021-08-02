package miniproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class clientList extends NumberMenu {
	
          public static void main(String[] args) {
        	  Scanner scr= new Scanner(System.in); 
        	  File file = new File("PhoneDb.txt");
        	  FileWriter writer= null;
        	  BufferedWriter bwriter= null;
        	  
        	  
        	  try {
        		  writer = new FileWriter(file, true);
        		  bwriter= new BufferedWriter(writer);
        		 String msg= scr.next();
        		  bwriter.write(msg);
        		  bwriter.flush();
        		  
        		  System.out.println("DONE");
        		  
        		  
        	  } catch(IOException e) {
        		  e.printStackTrace();		 
        		  
        	  } finally {
        		  try {
        			  if(bwriter != null) bwriter.close();
        			  if(writer != null) writer.close();
        			  
        		  } catch(IOException e) {
        			  e.printStackTrace();
        			  
        		  }
        	  }
        	
        	  
        	  
        	  
          }

		
		
		
		 
		 
		
		  
    
    	
    	
    }

