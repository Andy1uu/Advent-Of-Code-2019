import java.io.*;
import java.util.*;

public class Day1Problem2 {
public static void main(String[] args) throws FileNotFoundException{
	Scanner in  = new Scanner(new File("Inputs\\Day1Problem2.txt"));
	//Scanner in  = new Scanner(System.in);
	int sum = 0, currentNumber;
	while(in.hasNext()) {
		currentNumber = ((in.nextInt()/3)-2);
		sum+= currentNumber;
		while(((currentNumber/3)-2)>0) {
			currentNumber = ((currentNumber/3)-2);
			sum+= currentNumber;
		}
	}
	System.out.println(sum);
}
}
