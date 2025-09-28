//1. Ecrire la classe abstraite ObjetGraphique qui est définie par le diagramme de classe suivant : 
package graphique;

public abstract class ObjetGraphique {
	 protected int x, y, largeur, hauteur;
	 public ObjetGraphique() {
	    }
	 public ObjetGraphique(int x, int y, int largeur, int hauteur) {
	        this.x = x;
	        this.y = y;
	        this.largeur = largeur;
	        this.hauteur = hauteur;
	    }
	 public ObjetGraphique(ObjetGraphique obj) {
	        this.x = obj.x;
	        this.y = obj.y;
	        this.largeur = obj.largeur;
	        this.hauteur = obj.hauteur;
	    }
	 public int getHauteur() {
	        return hauteur;
	    }
	    public int getLargeur() {
	        return largeur;
	    }
	    public int getX() {
	        return x;
	    }
	    public int getY() {
	        return y;
	    }
	    public void setObjetGraphique(int x, int y, int largeur, int hauteur) {
	        this.x = x;
	        this.y = y;
	        this.largeur = largeur;
	        this.hauteur = hauteur;
	    }
	    public void setTaille(int largeur, int hauteur) {
	        this.largeur = largeur;
	        this.hauteur = hauteur;
	    }
	    public void setPosition(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
}
