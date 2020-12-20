import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class RunCucumberChecks extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}