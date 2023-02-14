public class ForceConvert {
	public static void main (String[] args) {
		//演示强制类型转换
		int n1 = (int)1.9;
		System.out.println("n1="+n1);
		
		int n2 = 2000;
		byte n3 = (byte)n2;
		System.out.println("n3="+n3);
		//强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		
		char c1 = 100;
		int m = 100;
		char c3 = (char)m;
		System.out.println(c3);
		
	}
}