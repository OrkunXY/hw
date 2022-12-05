package com.bilgeadam.hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.BufferedWriter;

public class FileExample 
	
		{
	
		
	
	 
		static void dosyaOku(File file) throws FileNotFoundException {
			
			
			FileReader fileReader=new FileReader(file);
			String line; 
			BufferedReader bufferedReader= new BufferedReader(fileReader);
			try {
			while((line=bufferedReader.readLine())!=null)
			{
				System.out.println(line);
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();

		}
			
		}
	
	 
	 static void dosyaYaz(File file) {
		
		 try
			{	
				if(file.exists())
				{
					FileWriter fileWriter=new FileWriter(file,true);
					BufferedWriter bufferredWriter=new BufferedWriter(fileWriter);
					bufferredWriter.write("merhaba dunya");
					bufferredWriter.close();
					System.out.println("dosya yazma islemi tamamlandi");
					
					
				}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			
			
			
			}
	 }
	 
	 static void dosyaYarat(File file) throws IOException 
	 {
		 try
			{
				
				if(file.exists())
				{
					System.out.println("Dosya zaten var.");
				}
				else
				{
					if(!file.createNewFile()) 
					{
						System.out.println("dosya olusturulurken hata olustu");
					}
					else
						System.out.println("Dosya olusturuldu");
					
				}
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
	
	

}
		}
