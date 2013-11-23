package Latihan01.sesi02.bin;
import java.io.*;
public class Methode1 
{
   static BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
	 public static void main (String[] Xx)
	 {
	   try 
	   {
	      System.out.println("Pilih [1/2/3] : " + "\n\t1. Udang"+"\n\t2.Kepiting" + "\n\t3.kerang");
		  System.out.println();
		  System.out.println("Masukan Pilihan Anda : ");
		  String choose = input.readLine();
		  if (choose.equals("1"))  
		  {
		     System.out.println("Anda Memilih UDANG ");
			 }
			 else
			 if (choose.equals("2")) 
			 {
			    System.out.println("Anda Memilih KEPITING ");
				}
				else
				if (choose.equals("3")) 
				{
				    System.out.println("Anda Memilih KERANG ");
				}
				else
				{
				
				  throw new Exception ("Pilihan Anda Tidak Tersedia !!!");
				  }
				 }
				 catch (Exception e)
				 {
				   System.out.println(e.getMessage());
				   }
				   }
				   }
				   
				
		   