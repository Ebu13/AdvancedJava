public final class Ucgen extends Shape{
    private int kenar1;
    private int kenar2;
    private int kenar3;
    public Ucgen(int kenar1,int kenar2,int kenar3){
        double s = (kenar1 + kenar2 + kenar3) / 2;
        double area = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
        super.setAlan(area);
    }
    public double getAlan(){
        return super.getAlan();
    }
}
