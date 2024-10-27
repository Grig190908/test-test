public class Main{
    private static int den;

    public static void main(String[] args){
        int num = 0;
        Fraction fraction = new Fraction(num,den);
        fraction.setDen(-5);
        System.out.println(fraction.getDen());
        fraction.setNum(10);
        System.out.println(fraction.getNum());
        fraction.print();

    }
}