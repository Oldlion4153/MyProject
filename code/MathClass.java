/**
 * Math類別常用方法
 */

public class MathClass {
    public static void main(String[] args) {
    	System.out.println("求大於 5.6 的最小整數 : " + Math.ceil(5.6));
    	System.out.println("求小於 5.6 的最大整數 : " + Math.floor(5.6));
    	System.out.println("求 e 的 2 次方 : " + Math.exp(2));
		System.out.println("求 2 的自然對數值 : " + Math.log(2));
		System.out.println("求 5 和 10 二者的較大值 : " + Math.max(5, 10));
		System.out.println("求 5 和 10 二者的較小值 : " + Math.min(5, 10));
		System.out.println("求 2 的 4次方值 : " + Math.pow(2,4));
		System.out.println("求 6.5 的四拾五入值 : " + Math.round(6.5));
		System.out.println("求 16 的開根號值 : " + Math.sqrt(16));
		//取出任 5 個亂數
		System.out.println("取出任 5 個亂數");
		for(int i = 1; i < 5; i++)
			System.out.println(Math.random());	
    }
}
