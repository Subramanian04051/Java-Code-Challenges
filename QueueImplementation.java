import java.util.Scanner;
import java.io.*;
public class QueueImplementation
{
	private class Node{
		int data;
		Node next;
	}
	Node front,rear;
	public void add(int value)
	{
		Node temp=new Node();
		temp.data=value;
		rear.next=temp;
		rear=temp;
	}
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	QueueImplementation q=new QueueImplementation();
	int val=in.nextInt();
	q.add(val);
}
}