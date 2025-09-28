package com_scolarite;
/*d. Ecrire une classe TestPersonnel qui contient la méthode main et qui permet de :
 Créer un tableau hétérogène qui contient plusieurs objets de chacune de ces 3
classes
 affiche les informations de chaque objet du tableau
*/
public class TestPersonnel {

	public static void main(String[] args) {
		 Personne[] personnes = new Personne[3];
		 //Personne:
		 personnes[0] = new Personne("Aya", (byte)18);
		//Personnel:
		 personnes[1] = new Personnel("Marwa", (byte)19, "Sidi Saarouf", 8000);
		 //Enseignant:
		 personnes[2] = new Enseignant("Amine", (byte)40, "hay hasani", 12000, "maths");
		 for (int i=0; i<personnes.length;i++) {
			 System.out.println(personnes[i].toString());
	         System.out.println("----------------------");
		 }
	}

}
