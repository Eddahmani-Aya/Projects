package Boucles;
/*Exercice 9 :
Créez une boucle qui demande à l’utilisateur d’entrer un nombre, et continue
jusqu’à ce que l’utilisateur entre un nombre négatif.
*/
import java.util.Scanner;
public class EX9_entrer_nbr {
	public static void main(String[] args) {
		float nbr;
		Scanner input = new Scanner(System.in); 
		do {
			System.out.print("Entrer un nombre :");
			nbr = input.nextFloat(); 
		}while(nbr>=0);
		input.close();
	}

}
