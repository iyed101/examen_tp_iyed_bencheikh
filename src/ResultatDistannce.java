public class ResultatDistannce implements Resultat{
    private double distance;
    public ResultatDistannce(double dis){
        distance=dis;
    }
    public double getdis(){
        return distance;
    }
    public String toString(){
        return this.getClass().getSimpleName()+" distance="+distance;
    } 
    @Override
    public void affiche() {
        System.out.println(this);
    }

    @Override
    public int compareTo(Resultat r) throws InvalidStateException {
        if(r instanceof ResultatDistannce){
            if(((ResultatDistannce)r).getdis()==this.distance){
                return 0;
            }
            else if(((ResultatDistannce)r).getdis()<this.distance){
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
