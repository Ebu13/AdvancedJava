public final class Daire extends Shape{
    private double yaricap;
    public Daire(double yarıcap){
        this.yaricap=yarıcap;
        super.setAlan((yarıcap*yarıcap)*Math.PI);
    }
    public double getAlan(){
        return super.getAlan();
    }
}
