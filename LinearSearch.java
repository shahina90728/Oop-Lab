import java.util.Scanner;
public class LinearSearch
  {
	public static void main(String[] args){
	  int i,n,search,array[];
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of elements :");
	  n=sc.nextInt();
	  array=new int[n];
	  
	  System.out.println("Enter "+n+" elements:");
	    for (i=0;i<n;i++) {
	      array[i] = sc.nextInt();
      }      
    System.out.println("Enter element to search:");
    search = sc.nextInt();
    for (i=0;i<n;i++){
      if(array[i]==search){
        System.out.println("Element "+search+" found  at position "+(i+1));
        break;
      }
    }
    if(i==n)
      System.out.println("Element "+search+"  not found ");
	}
}
