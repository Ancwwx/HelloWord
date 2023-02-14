public class Char01 {
	public static void main(String[] args) {
		char c1 = 'b'+2;
		char c2 = '\t';
		char c3 = '韓';
		char c4 = 93;//说明：字符类型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println((int)c4);
		//当输出c4的时候，会输出97表示的字符
		System.out.println('a'+10);
		//char类型是可以进行运算的，相当于一个整数，因为他对应有Unicode码。
		char c5 = 'b'+1;
		System.out.println((int)c5); //98+1=99
		System.out.println(c5);
		//99对应的字符 编码表ASCII（规定好的）
		
  }
}

