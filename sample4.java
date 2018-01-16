/**
 *
 * @author xekid78
 *
 */
public class sample4 {

	public static void main(String[] args) {
		System.out.println("** ケース1 **");
		double num1 = 3.15;
		System.out.println(num1);
		System.out.println((int)num1);
		System.out.println("");

		System.out.println("** ケース２ **");
		int num2 = 5;
		System.out.println(num2);
		System.out.println((double)num2);
		System.out.println("");

		System.out.println("** ケース３ **");
		String text = "123";
		System.out.println(text);
		System.out.println(Integer.parseInt(text) * 100);
		System.out.println(Double.parseDouble(text));
	}

}
