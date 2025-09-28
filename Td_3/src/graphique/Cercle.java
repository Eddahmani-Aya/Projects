package graphique;

public class Cercle extends ObjetGraphique {
private int rayon;
    public Cercle() {
        super();
    }
    
    // كونستروكتور بالباراميترات
    public Cercle(int x, int y, int rayon) {
        super(x, y, rayon * 2, rayon * 2); // largeur = hauteur = 2 * rayon
        this.rayon = rayon;
    }
    public Cercle(Cercle c) {
        super(c);
        this.rayon = c.rayon;
    }
    public void setRayon(int rayon) {
        this.rayon = rayon;
        this.largeur = rayon * 2;
        this.hauteur = rayon * 2;
    }
    public int getRayon() {
        return rayon;
    }
}
