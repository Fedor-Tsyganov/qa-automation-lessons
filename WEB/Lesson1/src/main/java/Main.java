import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

public class Main {

    public static void main(String args[]){

        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        suites.add("/Path/to/testng/xml/file/testng.xml");
        tng.setTestSuites(suites);
        tng.run();

    }
}
