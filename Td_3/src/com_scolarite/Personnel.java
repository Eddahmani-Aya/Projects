package com_scolarite;
//b. Ecrire une classe Personnel qui hérite de la classe Personne et ayant comme diagramme de classe suivant :
public class Personnel extends Personne {
	protected String adresse;
	protected float salaire;
	public Personnel() {
		super();
	}
	public Personnel(String nom, byte age, String adresse, float salaire) {
		super(nom,age);
		this.adresse=adresse;
		this.salaire=salaire;
	}
	public Personnel(Personnel P) {
		super(P.nom,P.age);
		this.adresse=P.adresse;
		this.salaire=P.salaire;
	}
	public void setPersonnel (String nom, byte age, String adresse, float salaire) 
	{
		super.setPersonne(nom,age);
		this.adresse=adresse;
		this.salaire=salaire;
	}
	public String getAdresse()
	{
		return adresse;
	}
	public float getSalaire() 
	{
		return salaire;
	}
	public String toString() {
		return super.toString() +" Adresse:"+adresse+" Salaire:"+salaire;
	}
}
