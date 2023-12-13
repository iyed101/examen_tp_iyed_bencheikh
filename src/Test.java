public class Test {
    public static void main(String args[]){
        Epreuve ep=new Epreuve("100m haires feminin",3);
        Athlete at1=new Athlete(123,"iyed");
        Athlete at2=new Athlete(124,"mouhamed");
        Athlete at3=new Athlete(125,"yosri");
        Resultat res1= new ResultatDistannce(10.5);
        Resultat res2= new ResultatDistannce(12.5);
        Resultat res3= new ResultatRang(5);
        ep.ajoutAthlete(at1);
        ep.ajoutAthlete(at2);
        ep.ajoutAthlete(at3);
        try {
            ep.fixeResultat(123,res1);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            ep.fixeResultat(124,res2);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            ep.fixeResultat(125,res3);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        ep.terminer();
        try {
            System.out.println(ep.getVinqueur());
        } catch (InvalidStateException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(ep.getRecordOlympique());
        } catch (InvalidStateException e) {
            e.printStackTrace();
        }
    }
}
