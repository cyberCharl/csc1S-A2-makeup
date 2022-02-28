
/**
 * Simple test harness for RandomGenerator
 * 
 * @author Stephan Jamieson
 * @version 23/7/15
 */
import java.util.Scanner;
//
public class TestPRNG{

    private TestPRNG() {}
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a seed value");
        int seed = scanner.nextInt(); 
        RandomGenerator randomGenerator = new RandomGenerator(seed);
        
        System.out.println("Enter a parameter value for nextInt(int i):");
        int p_i = scanner.nextInt();

        System.out.println("Enter the number of calls required of each method.");
        int calls = scanner.nextInt();

        for (int i=0; i<calls; i++) {
            // Comment out lines that are not being used.
            System.out.println("nextInt(): "+randomGenerator.nextInt());
            System.out.println("nextDouble(): "+randomGenerator.nextDouble());
            System.out.println("nextInt("+p_i+"): "+randomGenerator.nextInt(p_i));
        }
    }
}
