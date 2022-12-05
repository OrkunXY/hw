package com.bilgeadam.hw;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String dosyaYolu="D:\\Users\\BilgeAdam\\IO\\dosya.txt";
		File file=new File(dosyaYolu);
		
		
		FileExample fileExample =new FileExample();
		fileExample.dosyaYarat(file);
		fileExample.dosyaYaz(file);
		fileExample.dosyaOku(file);
		
		
		
		

	}

}
