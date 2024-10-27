public class Fraction {
    private int num;
    private int den =1;

    Fraction(){

    }

    Fraction(int num,int den){
        this.num = num;
        setDen(den);
    }

    int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    int getDen() {
        return den;
    }
    public void setDen(int den) {
        if(den == 0){
            System.out.println("Denum can not be 0,choose another");
                    return;
        }
        this.den = den;
    }
    public void print(){
        if (den == 0){
        System.out.println(num + "/" + den);
        return;
    }
        if (den<0){
            num *= -1;
        }
        System.out.println(num + "/" + den);
    }
    public Fraction add(Fraction extFranction){
        return new Fraction(num,den);
    }
}