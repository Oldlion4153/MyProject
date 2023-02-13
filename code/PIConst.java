/**
 * 利用圓周率求圓的周長和面積
 */

public class PIConst {
    public static void main(String[] args) {
        double r = 5.0;	//圓半徑
        double c;	//圓周長
        double a;	//圓面積
        c = 2 * r * Math.PI;
        a = r * r * Math.PI;
        System.out.println("圓周率為: " + Math.PI);
        System.out.println("圓半徑為: " + r);
        System.out.println("圓周長為: " + c);
        System.out.println("圓面積為: " + a);
    }
}
