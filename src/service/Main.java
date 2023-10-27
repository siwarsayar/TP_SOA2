package service;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BanqueService ser =new BanqueService();
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("donner un montant:\n");
			double TND =scan.nextDouble();
			System.out.println("le montant avant le conversion ="+TND);
			
			double  Euro =ser.conversion(TND);

			System.out.println("\nle montant aprés le conversion ="+Euro);
		}
		ser.addCompte(new Compte(99,20.500,"09/03/2023" ));
		ser.addCompte(new Compte(100,100000.0,"14/06/2023"));
		ser.addCompte(new Compte(200,70000.6,"09/10/2023"));
		
		
		
		
		
		ser.toString();
		
	}
}
