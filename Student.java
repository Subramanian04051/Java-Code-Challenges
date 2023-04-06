import java.util.*;
import java.util.Random;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.lang.*;
public class Student
{
String name="";
String password="";
String dept="";
public Student(String name,String dept,String password)
{
	this.name=name;
	this.password=password;
	this.dept=dept;
}
public static boolean validatePassword(String a,String b)
{
	return a.equals(b);
}
public void printDetails()
{
	Calendar cal=Calendar.getInstance();
	String dep[]=dept.split(" ");
	SimpleDateFormat simpleFormat=new SimpleDateFormat("dd/MMMM/yyyy");
	String strDate=simpleFormat.format(new Date());
	String str[]=strDate.split("/");
	simpleFormat=new SimpleDateFormat("MMMM");
	String strMonth=simpleFormat.format(new Date());
	System.out.println("Welcome"+name+"!! You have enrolled for "+dep[1]+"\ton"+str[0]+strMonth+str[2]);
	Random rand=new Random();
	int regid=rand.nextInt(10000);
	System.out.println("Your Registration id is"+dep[1]+Integer.toString(regid));
System.out.println("Your session will start from  onwards and you are expected to report by 8:00 Am at meeting hall");}

public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	Student s;
	System.out.println("Enter student name:");
	String studentName=in.nextLine();
	System.out.println("enter department name:");
	String dept=in.nextLine();
	
	while(true)
	{
		System.out.println("Enter password:");
	String password=in.nextLine();
	System.out.println("Retype password:");
	String retypePassword=in.nextLine();
	if(validatePassword(password,retypePassword))
	{
		s=new Student(studentName,dept,password);
		s.printDetails();
		break;
	}
	else
	{
		System.out.println("Retype password again");
	}
	}
}
}
