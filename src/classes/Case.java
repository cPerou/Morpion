package classes;

public class Case {
    private int position;
    private boolean utilise;
    //constructeur
    public Case(int position, boolean utilise) {
        this.position = position;
        this.utilise = utilise;
    }
    //getter et setter
    public int getPosition() {return position;}
    public boolean isUtilise() {return utilise;}
    public void setUtilise(boolean utilise) {this.utilise = utilise;}
    //methodes
    public void utiliser(){
        this.utilise = false;
        System.out.println("La case a ete jouee");
    }
}
