public class Epreuve {
    private String denomination;
    private Athlete[] tabAthlete;
    private int nbMax;
    private int nbeff;
    private boolean eta;
    public Epreuve(String denomination,int nbMax){
        this.denomination=denomination;
        this.nbMax=nbMax;
        tabAthlete= new Athlete[nbMax];
        nbeff=0;
        eta=true;
    }
    public String toString(){
        String msg=denomination+' ';
        if(eta==true){
            msg=msg+"non terminé ";
        }
        else{
            msg=msg+"terminé ";
        }
        for(int i=0;i<nbeff;i++){
            msg=msg+tabAthlete[i].toString();
        }
        return msg;
    }
    public void ajoutAthlete(Athlete a){
        if(nbeff<nbMax){
            if(eta){
                tabAthlete[nbeff]=a;
                nbeff++;
            }
            else{
                System.out.println("Terminé !!");
            }
        }
        else{
            System.out.println("nombre max !!");
        }
    }
    public void terminer(){
        if(eta){
            this.eta=false;
        }
        else{
            System.out.println("déja terminé");
        }
    }
    public boolean estTerminee(){
        return !(eta);
    }
    public Resultat getRecordOlympique() throws InvalidStateException{
        if(nbeff!=0){
            Resultat meilleur=tabAthlete[0].getresultat();
            for(int i=1;i<nbeff;i++){
                if(meilleur.compareTo(tabAthlete[i].getresultat())==-1){
                    meilleur=tabAthlete[i].getresultat();
                }
            }
            return meilleur;
        }
        return null;
    }
    public Athlete getVinqueur() throws InvalidStateException{
        if(!(this.estTerminee())){
            for(int i=0;i<nbeff;i++){
                if(tabAthlete[i].getresultat().compareTo(this.getRecordOlympique())==0){
                    return tabAthlete[i];
                }
            }
        }
        return null;
    }
    public void fixeResultat(int id,Resultat r) throws IllegalStateException{
        if(!(this.estTerminee())){
            for(int i=0;i<nbeff;i++){
                if(id==tabAthlete[i].getid()){
                    tabAthlete[i].setresultat(r);
                }
            }
        }
        else{
            throw new IllegalStateException();
        }
    }
    public Resultat getResultat(int id){
        for(int i=0;i<nbeff;i++){
            if(id==tabAthlete[i].getid()){
                return tabAthlete[i].getresultat();
            }
        }
        return null;
    }
}
