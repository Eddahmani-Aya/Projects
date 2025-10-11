package Boucles;
/*Exercice 8 :
Utilisez une boucle while pour calculer et afficher la somme des nombres de 1
à 50.
*/
public class EX8_sum {
	public static void main(String[] args) {
		int sum = 0,i = 0;
		while(i<=50) {
			sum=sum+i;
			i++;
		}
		System.out.print("la somme des nombres de 1 à 50 est:"+sum);
	}
}
