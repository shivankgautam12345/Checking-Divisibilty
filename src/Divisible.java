
public class Divisible {
   public void divisible2(int n) {
	   for(int i = 1;i<=n;i++) {
		   if(i%2==0) {
			   System.out.print(i+" ");
		   }
	   }System.out.println();
   }
   public void divisible3(int n) {
	   for(int i = 1;i<=n;i++) {
		   if(i%3==0) {
			   System.out.print(i+" ");
		   }
	   }System.out.println();
   }
   public void divisible5(int n) {
	   for(int i = 1;i<=n;i++) {
		   if(i%5==0) {
			   System.out.print(i+" ");
		   }
	   }System.out.println();
   }
   public void divisible25(int n) {
	   for(int i = 1;i<=n;i++) {
		   if(i%2==0 && i%5==0) {
			   System.out.print(i+" ");
		   }
	   }System.out.println();
   }
   public void divisible35(int n) {
	   for(int i = 1;i<=n;i++) {
		   if(i%3==0 && i%5==0) {
			   System.out.print(i+" ");
		   }
	   }System.out.println();

}
   public void PrimeNo(int n) {
	   	  int count = 0; 
	   for(int i = 1;i<=n;i++) {
		   count = 0;
	   
		   for(int j = 2;j<=i;j++) {
		   if(i%j==0) {
			   count++;
		   }
	   if(count==1) {
		   System.out.println(i+" ");
	   }}}

}
   public void oddprime(int n) {
	   int ct = 0;
	   if(n==1) {
		  ct=0;
	   }
	   int i;
	   for( i = 2;i<=n;i++) {
		   if(n%i==0) {
			   ct=1;
			   if(ct==1 && i%2!=0) {
				   System.out.println(i);
			   }
			  
		   }
	   }
   }
 public void evenDivi(int n) {
	 for(int i = 0;i<=n;i++) {
		 if(i%2==0 && i%3==0) {
			 System.out.println(i);
		 }
	 }
 }
 public void oddDivi(int n) {
	 for(int i = 0;i<=n;i++) {
		 if(i%2!=0 && i%5==0) {
			 System.out.println(i);
		 }
	 }
 }
   
   
   
   
}   
   
   
   
   
