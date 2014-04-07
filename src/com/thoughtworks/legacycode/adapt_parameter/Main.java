package com.thoughtworks.legacycode.adapt_parameter;

import java.io.Console;
import java.io.InputStream;

/**
 * Created by ThoughtWorker on 4/7/14.
 */
public class Main {
    public static void main(String[] args) {
        final ReportGenerator reportGenerator = new ReportGenerator();
        final Console console = System.console();
        reportGenerator.reportToConsole(console);
    }
}
