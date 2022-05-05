package week1.day3;

public class Primenumber {
	public static void main(String[] args) {
		int n=11;
		int a=0;
		for(int i=1;i<=11;i++) {
			if(n%i==0) {
				a++;
		
			}
		}
		if(a==2) {
           System.out.println(n+"is prime number");
		}
		else {
			System.out.println(n+"is not prime number");
		}
	}
}
