import java.util.*;
public class TestAppDivisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter the numbers: ");
int n = sc.nextInt();
Divisible Db = new Divisible();
Db.divisible2(n);
Db.divisible3(n);
Db.divisible5(n);
Db.divisible25(n);
Db.divisible35(n);
System.out.println("enter the no."+ n);
Db.PrimeNo(n);
Db.evenDivi(n);
Db.oddDivi(n);
Db.oddprime(n);
	}

}
