import java.io.*;
import java.util.*;
class Cuboid
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int length=input.nextInt();
	int width=input.nextInt();
	int height=input.nextInt();
	int totsurarea=2*(length*width+width*height+height*length);
	System.out.print(totsurarea);
	int volume=length*width*height;
	System.out.print(" ");
	System.out.print(volume);
	}
}
