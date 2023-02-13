public class Store1 {
	public Store1() {
		System.out.println("I am inside the constructor method.");
		}
	public static void main(String[] args) {
		System.out.println("Start of the main method.");
		Store1 lemonadeStand = new Store1();
		Store1 cakeStore = new Store1();
		System.out.println(cakeStore);
		System.out.println(lemonadeStand);
	}
}