package com.thoughtworks.legacycode.adapt_parameter;

import java.io.Console;

/**
 * Created by ThoughtWorker on 4/7/14.
 */
public class ReportGenerator {
    public void reportToConsole(Console console) {
        final String userInput = console.readLine();
        console.printf(userInput);
    }
}
