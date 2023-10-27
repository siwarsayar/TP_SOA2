package service;
import java.util.*; 

public class BanqueService {
private ArrayList<Compte> comptes= new ArrayList<Compte>();
	
	void addCompte(Compte e){
		comptes.add(e);
		
	}
	void getComptes()
	{
		for(int i=0;i<comptes.size();i++)
		{
			System.out.println("Le Compte "+i+":\nCode:"+ comptes.get(i).getCode()+"\nSolde:"+comptes.get(i).getSolde()+
					"\nDate de Creation:"+comptes.get(i).getDateCreation()+"\n");
		}
		
	}
	double conversion(double montant)
	{
		return montant*3.3;
	}
	String  toString(int index)
	{
		return  "Code:"+ comptes.get(index).getCode()+"\nSolde:"+comptes.get(index).getSolde()+
				"\nDate de Creation:"+comptes.get(index).getDateCreation()+"\n";
	}
}

