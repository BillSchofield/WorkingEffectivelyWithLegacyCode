package com.thoughtworks.legacycode.adapt_parameter;

import org.junit.Test;

public class ReportGeneratorTest {

//  Adapt Parameter

//  Use adapter pattern on tough dependency
//
// Wrap the console parameter in a new class that we can then mock

    @Test
    public void shouldPrintConsoleInputSomething() {
        ReportGenerator reportGenerator = new ReportGenerator();

        // Change
        reportGenerator.reportToConsole(System.console());

        // Verify that we printed the string that the user entered into the console
    }
}
