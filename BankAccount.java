public class BankAccount {
	public static void main(String[] args) {
		double balance = 500;
		double amountToWithdraw = 300;
		double updatedBalance = balance - amountToWithdraw;
		double amountForEachFriend = updatedBalance / 3 ;
		boolean canPurchaseTicket = amountForEachFriend >= 250;
		System.out.println(canPurchaseTicket);
		System.out.println("I gave each friend "  +  amountForEachFriend  +  " with the value of amountForEachFriend where "  + amountForEachFriend+" is.");
		
		System.out.println(8<=8);
	}
}