/*2. On veut créer une classe nommé Rectangle qui hérite de la classe ObjetGraphique.
Ecrire la classe Rectangle, son diagramme de classe suivant :
*/
package graphique;
public class Rectangle extends  ObjetGraphique{
	public Rectangle() {
        super();
    }
	public Rectangle(int x, int y, int largeur, int hauteur) {
        super(x, y, largeur, hauteur);
    }
	public Rectangle(Rectangle r) {
        super(r);
    }
	
}