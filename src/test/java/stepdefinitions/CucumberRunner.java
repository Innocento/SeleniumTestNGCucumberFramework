package stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"stepdefinitions"},
        monochrome = true,
        // Handling different types of reports
        plugin = {"pretty", "html:target/HtmlReports",
                "json:target/JSONReports/report.json",
                "junit:target/JUnitReports/report.xml"
}
)
public class CucumberRunner {
}
