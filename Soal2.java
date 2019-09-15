import java.util.Scanner;
import java.io.Console;

public class Soal2{
	public static void main(String[] args){

		double pay = 0;
		int i,fee;
		i = 0;
		fee = 0;
		String s1,s2,s3,s4; 
		s1 = "N";
		s3 = "Y";

		Console con = System.console();


		System.out.print("Masukan Banyak Perangkat :");
		i = Integer.parseInt(con.readLine());
		System.out.print("Apakah Dilakukan Pada Jam Kerja (Y/N) : ");
		s2 = con.readLine();
		
		switch(i){
		case 1:
		case 2:
			fee = 50;
			break;
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			fee = 100 + (i *10);
			break;
		default:
			if(i > 0 && i >= 11){
				fee = 500 + (i * 10);
			}
			break;
		}

		if(s2.equals(s1)){
			pay = fee * 2;
			System.out.println("Apakah Pelanggan Membawa dan Mengambil Barangnya Ditoko?(Y/N) :");
			s4 = con.readLine();
			if(s4.equals(s3)){
				pay = fee * 1.5;
			}
		}
		else{
			pay = fee;
		}
		System.out.print("Pelanggan Harus Membayar : $" + pay + "\n");
	}
}