import java.util.Scanner;

class bankAcc{
	public volatile boolean check = true;
	int balance = 0;
	Scanner sc = new Scanner(System.in);
	synchronized void withdraw() throws InterruptedException {
		int amt = sc.nextInt();
		while(check) {
			if(balance<amt) {
				balance = balance - amt;
				System.out.println("No sufficent funds. Waiting for deposit");
				this.wait();
			}else {
				System.out.println("Your new Balance: " + balance);
				check = false;
			}
		
		}
	}
	synchronized void deposit() throws InterruptedException{
		System.out.println("Enter the deposit balance");
		int amt  = sc.nextInt();
		balance = balance + amt;
		this.notify();
	}
}
public class interthreadcomm {

	public static void main(String[] args) {
		bankAcc b1 = new bankAcc();
		new Thread() {
			public void run() {
				try {
					b1.withdraw();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					b1.deposit();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

}
