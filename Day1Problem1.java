import java.io.*;
import java.util.*;

public class Day1Problem1 {
public static void main(String[] args) throws FileNotFoundException{
	Scanner in  = new Scanner(new File("Inputs\\Day1Problem1.txt"));
	int sum = 0, currentNumber;
	while(in.hasNext()) {
		currentNumber = (int)(Math.floor(in.nextInt()/3)-2);
		sum+= currentNumber;
	}
	System.out.println(sum);
}
}
