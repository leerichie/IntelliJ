package JavaAdvanced.oop;

interface TextTerminal {
    void print(String s);
}

class Console implements TextTerminal {

    @Override
    public void print(String s) {
    }
}

class ErrorConsole implements TextTerminal {
    @Override
    public void print(String s) {
        System.err.println("error: " + s);
    }
}

class InterfaceEx {
    static void printAsdf(TextTerminal textTerminal) {
        textTerminal.print("asdf");
    }

    public static void main(String[] args) {
        Console console = new Console();
        printAsdf(console);

        printAsdf((new ErrorConsole()));
    }
}
