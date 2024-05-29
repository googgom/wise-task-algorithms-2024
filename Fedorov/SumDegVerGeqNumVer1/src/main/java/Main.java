import com.mathsystem.api.graph.GraphFactory;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SumDegVerGeqNumVer1 sdvgenv = new SumDegVerGeqNumVer1();
        var testGraph = GraphFactory.loadGraphFromFile(new File("src/main/resources/graph.txt"));
        boolean result = sdvgenv.execute(testGraph);
        System.out.println(result);
    }
}