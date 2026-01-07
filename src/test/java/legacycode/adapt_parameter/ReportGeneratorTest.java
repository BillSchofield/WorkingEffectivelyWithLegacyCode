package legacycode.adapt_parameter;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ReportGeneratorTest {

//  Adapt Parameter

//  Use adapter pattern on tough dependency
//
// Wrap the console parameter in a new class that we can then mock

    @Test
    @Disabled
    public void shouldPrintConsoleInputSomething() {
        ReportGenerator reportGenerator = new ReportGenerator();

        // Change
        reportGenerator.reportToConsole(System.console());

        // Verify that we printed the string that the user entered into the console
    }
}
