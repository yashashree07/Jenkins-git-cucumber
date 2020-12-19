package com.montran.Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Utils {
	
public static HashMap<String,String>EnvVars=new HashMap<String,String>();
	
	public static void InitializeEnvVars()
	{
		String FilePath="C:\\Users\\Lenovo\\Documents\\EnvVars.csv";
		try
		{
			//opening file in read model
			FileReader Fr=new FileReader(FilePath);
			BufferedReader Br=new BufferedReader(Fr);
			String line = Br.readLine();
			while(line!=null)
			{
				String parts[]=line.split(",");
				String key=parts[0];
				String value=parts[1];
				EnvVars.put(key, value);
				line=Br.readLine();
			}
			
		}
		
		catch(FileNotFoundException e)
		{
			//printing proper message for manual tester
			System.out.println("Required File "+FilePath+" Not Found");
		}
		catch (IOException e) 
		{
				
				System.out.println("Problem In Reading Required File"+FilePath);
		}
		

	}

}
