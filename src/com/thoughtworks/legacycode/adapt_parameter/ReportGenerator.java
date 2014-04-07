package com.thoughtworks.legacycode.adapt_parameter;

import java.io.Console;

public class ReportGenerator {
    public void reportToConsole(Console console) {
        final String userInput = console.readLine();
        console.printf(userInput);
    }
}
