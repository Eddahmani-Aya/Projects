package Boucles;
/*Exercice 7 :
Écrivez un programme qui affiche la table de multiplication de 5 (de 1 à 10).*/
import java.util.Scanner;
public class EX7_tab_mult {
	public static void main(String[] args) {
		int i;
		Scanner input = new Scanner(System.in);
		System.out.print("Entrer un nombre:");
		int nbr=input.nextInt();
		System.out.println("La table de multiplication de "+nbr);
		for(i=1;i<=10;i++) {
			System.out.println(nbr+"*"+i+"="+nbr*i);
		}
		input.close();
	}
}
