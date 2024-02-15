public sealed class Diktorgen extends Shape permits Kare{
    private int uzunluk;
    private int yukseklik;
    public Diktorgen(int uzunluk, int yukseklik){
        this.uzunluk=uzunluk;
        this.yukseklik=yukseklik;
        super.setAlan(yukseklik*uzunluk);
    }
    public double getAlan(){
        return super.getAlan();
    }
}
