public class NumereComplexe {

    private double parteintreaga;
    private double parteimaginara;

    NumereComplexe(double parteintreaga,double parteimaginara){
        this.parteimaginara=parteimaginara;
        this.parteintreaga=parteintreaga;

    }
    public String toString(){
        return parteintreaga+ " + " +parteimaginara+ "*i";

    }
    public NumereComplexe sum (NumereComplexe nr) {
        double rez_parteintreaga;
        double rez_parteimaginara;
        rez_parteintreaga = parteintreaga+nr.parteintreaga;
        rez_parteimaginara = parteimaginara+nr.parteimaginara;
        return new NumereComplexe(rez_parteintreaga,rez_parteimaginara);

    }
    public NumereComplexe substract (NumereComplexe nr){
        return new NumereComplexe(parteintreaga-nr.parteintreaga, parteimaginara-nr.parteimaginara);
    }
    public boolean isReal(){
        return parteimaginara==0;
    }
}


