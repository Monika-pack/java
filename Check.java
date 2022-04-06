package capgemini7;
import java.util.*;
public class Check {
String str1;
int i,len,choice;
char ch;

Scanner sc=new Scanner(System.in);
public void take()
{
	System.out.println("1 for checking charcacter in a sentence ,2 for displaying vowels:");
}
{
choice=sc.nextInt();
 sc=new Scanner(System.in);
if(choice==1)
{
	System.out.println("\nenter sentence:");
	str1=sc.nextLine().toLowerCase();
	System.out.println("\nenter character:");
	ch=sc.next().charAt(0);
	check(str1,ch);
}
else if(choice==2)
{
	System.out.println("enter sentecne:");
	str1=sc.nextLine().toLowerCase();
	check(str1);
}
else
	System.out.println("\nwrong choice");
}
private void check(String s, char ch)
{
	int i = 0,len,c=0;
	len=s.length();
	{
		if(s.charAt(i)==ch)
			c++;
	}

	System.out.println("\nCharacter'"+ ch +"' is present "+ c +" times is sentence:"+s );
}
public static void check (String args[]) {
//private void check(String s) {
	int i,len;
	char ch;
	String s;
	len=s.length();
	System.out.println("the vowels r ");
	for(i=0;i<len;i++)
	{
		ch=s.charAt(i);
		switch(ch)
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			System.out.println(""+ch);
		}
	}
			
		}
	//}
//}
	

	// static void main(String[] args) {
		
		
		
		
	//}

}
