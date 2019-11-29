/**
 * Description: Tester class for the IO assignment
 * 
 * Author: Tony Jiang
 * Date: December 12, 2018
 */

import java.io.IOException;

public class IOTester {
        
        public static void main(String[] args) {
            String filePath = "data\\testing.txt";
            
            try {
                IO.createOutputFile(filePath);
            } catch (IOException e){
			System.out.println("Sorry, the file could not be created.");
            }
            
            try {
		IO.println("Monkeys can climb\n" +
                            "Crickets can leap\n" +
                            "Horses can race\n" +
                            "Owls can seek\n" +
                            "Cheetahs can run\n" +
                            "Eagles can fly\n" +
                            "People can try\n" +
                            "But that's about it");
                IO.closeOutputFile();
            } catch (IOException e) {
                System.out.println("Sorry there was an error writing");
            }
            
            try {
		IO.openInputFile(filePath);
                String line = IO.readLine();
		
		while (line != null) {
                    System.out.println(line);
                    line = IO.readLine();
                }
		IO.closeInputFile();
            } catch (IOException e) {
                System.out.println("Sorry there was an error reading");
            }
        }
}
