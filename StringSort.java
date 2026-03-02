import java.util.Scanner;
import java.util.Arrays;
public class StringSort{
	public static void main(String[] args){
	
		int count=0;
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Strings :");
		count=sc.nextInt();
		String strlist[]=new String[count];
		Scanner sc1=new Scanner(System.in);
		
		System.out.println("enter the strings :");
		for(int i=0;i<count;i++)
			strlist[i]=sc1.nextLine();
		System.out.println("choose 1 or 2 from emnu below :");
		System.out.println("1.in-built sort :");
		System.out.println("2.user defined sort :");
		int ch;
		ch=sc.nextInt();
		switch(ch)
		{
		  case 1:Arrays.sort(strlist);
             System.out.println(Arrays.toString(strlist));
             break;
      case 2:for (int i=0;i<count;i++) {
                    for (int j=i+1;j<count;j++) {
                        if (strlist[i].compareTo(strlist[j])>0) {
                            temp = strlist[i];
                            strlist[i] = strlist[j];
                            strlist[j] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(strlist));
                break;
		}
		
	}
}

