public class ResultatRang implements Resultat{
    private int rang;
    public ResultatRang(int rg){
        rang=rg;
    } 
    public int getrg(){
        return rang;
    }
    public String toString(){
        return this.getClass().getSimpleName()+" rang="+rang;
    }
    @Override
    public void affiche() {
        System.out.println(this);
    }
    @Override
    public int compareTo(Resultat r) throws InvalidStateException  {
        if(r instanceof ResultatRang){
            if(((ResultatRang)r).getrg()==this.rang){
                return 0;
            }
            else if(((ResultatRang)r).getrg()>this.rang){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            throw new InvalidStateException();
        }
    }
    
}
