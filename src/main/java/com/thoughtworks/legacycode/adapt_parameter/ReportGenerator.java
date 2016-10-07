package com.thoughtworks.legacycode.adapt_parameter;

import java.io.Console;

public class ReportGenerator {

    // Change the console parameter to your new adapter class
    public void reportToConsole(Console console) {
        final String userInput = console.readLine();
        console.printf(userInput);
    }
}
