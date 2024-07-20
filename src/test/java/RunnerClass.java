import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class RunnerClass {
    @Test
    public void runTestNG() {
        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<>();
        suites.add("testng.xml"); // Replace with your XML suite file path
        testNG.setTestSuites(suites);
        testNG.run();
    }
}
