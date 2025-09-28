package com_scolarite;
//c. Ecrire une classe Enseignant qui hérite de la classe Personnel et ayant comme diagramme de classe suivant :

public class Enseignant extends Personnel{
	private String matiereEnseignant;
	public Enseignant() {
		super();
	}
	public Enseignant(String nom, byte age, String adresse, float salaire, String matiereEnseignant)
	{
		super(nom, age, adresse, salaire);
		this.matiereEnseignant=matiereEnseignant;
	}
	public Enseignant(Enseignant E)
	{
		super(E.nom, E.age, E.adresse, E.salaire);
		this.matiereEnseignant=E.matiereEnseignant;
	}
	public void setEnseignant(String nom, byte age, String adresse, float salaire, String matiereEnseignant)
	{
		super.setPersonnel(nom, age, nom, salaire);
		this.matiereEnseignant=matiereEnseignant;
	}
	public String getMatiereEnseignant() 
	{
		return matiereEnseignant;
	}
	public String toString() {
		return super.toString()+" MatiereEnseignant: "+matiereEnseignant;
	}
}
