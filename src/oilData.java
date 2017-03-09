
import java.io.*;
import java.util.*;
public class oilData {

	
	public static void main(String[] args) throws FileNotFoundException { 
		
		
//		netLoss(); //works!
		totalcost(); 
		
	}

	
	
	
	
	
	private static void totalcost() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		//Total Cost
		File infile = new File("TotalCost.txt");
		File cost = new File("TotalCost.csv");
		PrintStream output = new PrintStream(cost);
		
		//input section
		Scanner in = new Scanner(infile);
		
		//Console out
//		PrintStream output = new PrintStream(System.out);
		
		int total = 0;
		int thisline;
		while (in.hasNextInt()) {
			thisline = in.nextInt();
			total = Math.abs(total) + thisline; //Math.abs required, otherwise the data picks up a negative...no clue why
//			output.println("total = " + total + ", thisline = " + thisline); //console output
			output.println(total + "," + thisline); //file output
			
		}
		
	}






	private static void netLoss() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// Net Loss
		File infile = new File("netloss.txt");
		File netloss = new File("NetLoss.csv");
//		PrintStream output = new PrintStream(netloss);
		
		//input section
		Scanner in = new Scanner(infile);
		
		//Console out
		PrintStream output = new PrintStream(System.out);
		
		double total = 0.0;
		double thisline;
		while(in.hasNextDouble()) {
			thisline = in.nextDouble();
			total = total + thisline;
			output.println("total = " + total + ", thisline = " + thisline); //to console
//			output.println(total + "," + thisline); //to file
		}
	}
}
