public class Athlete {
    private int id;
    private String nom;
    private Resultat resultat;
    public Athlete(int id,String nom){
        this.id=id;
        this.nom=nom;
        this.resultat=null;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String getnom(){
        return nom;
    }
    public void setid(String nom){
        this.nom=nom;
    }
    public Resultat getresultat(){
        return resultat;
    }
    public void setresultat(Resultat resultat){
        this.resultat=resultat;
    }
}
