package Boucles;
/*Exercice 10 :
Écrivez un programme qui utilise une boucle for pour calculer et afficher la
factorielle d’un nombre entier positif saisi par l’utilisateur.*/
import java.util.Scanner;
public class EX10_factorielle {
	public static void main(String[] args) {
		int i,f=1;
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un nombre:");
		int nbr=input.nextInt();
		for(i=1;i<=nbr;i++) {
			f=f*i;
		}
		if(nbr>0)
			System.out.println(nbr+"!="+f);
		else if(nbr==0)
			System.out.println(nbr+"!="+0);
		else
			System.out.println("erreur");
		input.close();
	}



}
