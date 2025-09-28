/*3. On veut créer une classe nommé Bouton qui hérite de la classe Rectangle, qui a une
variable membre de type String, appelé text.
Ecrire la classe Bouton, son diagramme de classe suivant :*/
package graphique;
public class Bouton extends Rectangle{
	private String text;
    public Bouton() {
        super();
    }
    public Bouton(int x, int y, int largeur, int hauteur, String text) {
    	super(x, y, largeur, hauteur);
        this.text = text;
    }
    
    // كونستروكتور ديال النسخ
    public Bouton(Bouton b) {
        super(b);
        this.text = b.text;
    }
    
    // الميثود باش تعدل النص
    public void setText(String text) {
        this.text = text;
    }
    
    // الميثود باش تجيب النص
    public String getText() {
        return text;
    }
}
