package Main;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ınp=new Scanner(System.in);
		
		System.out.println("Lütfen Boyunuzunu Giriniz: ");
		
	    double boy=ınp.nextDouble();
	    System.out.println(boy);
	    System.out.print("Lütfen Kilonuzu  Giriniz: ");
	    double kilo=ınp.nextDouble();
	    System.out.println(kilo);
	    double a=boy*boy;
	    double vki=kilo/a;
	    System.out.println("Vücut Kitle İndeksiniz: "+vki);
	    
	   
		
		

	}

}
