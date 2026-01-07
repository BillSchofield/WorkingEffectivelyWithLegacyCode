package legacycode.adapt_parameter;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        final ReportGenerator reportGenerator = new ReportGenerator();
        final Console console = System.console();
        reportGenerator.reportToConsole(console);
    }
}
