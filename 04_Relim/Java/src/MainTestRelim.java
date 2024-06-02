import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

// import ca.pfv.spmf.algorithms.frequentpatterns.relim.AlgoRelim;

/**
 * Example of how to use the RELIM Algorithm in source code.
 * 
 * @author Philippe Fournier-Viger (Copyright 2008)
 */
public class MainTestRelim {

	public static void main(String [] arg) throws IOException{
		
		String input = "C:\\Users\\INSIGHT\\OneDrive\\Documents\\KCGI\\2024\\MP2\\MP2\\04_Relim\\Java\\src\\contextPasquier99.txt";  // the database
		String output = "C:\\Users\\INSIGHT\\OneDrive\\Documents\\KCGI\\2024\\MP2\\MP2\\04_Relim\\Java\\src\\output5.txt";  // the path for saving the frequent itemsets found
		
		double minsup = 0.70; // means a minsup of 2 transaction (we used a relative support)
		
		// Applying the RELIM algorithm
		AlgoRelim algo = new AlgoRelim();
		algo.runAlgorithm(minsup, input, output);
		algo.printStatistics();

	}
	
	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestHMine.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
