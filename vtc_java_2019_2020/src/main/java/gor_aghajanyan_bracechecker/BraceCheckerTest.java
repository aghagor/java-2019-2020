package gor_aghajanyan_bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
//        String text = "aa   ([   ]) ]  jj  5   ";
        String text = "public static void parseTest(String text) {" +
                "\n" + "        BraceChecker braceChecker = new BraceChecker(16);" +
                "\n" + "        boolean isClosed = braceChecker.parse(text);" +
                "\n" + "" +
                "\n" +
                "\n" + "        if (isClosed) {" +
                "\n" + "           }] System.out.println(\"'parseTest' is passed with 'No Error'\");" +
                "\n" +
                "        ";
        parseTest(text);
    }

    public static void parseTest(String text) {
        BraceChecker braceChecker = new BraceChecker(16);
        boolean isClosed = braceChecker.parse(text);


        if (isClosed) {
            System.out.println(braceChecker.getMessage());
        } else {
            System.err.print(braceChecker.getMessage() +
                    "\nerror index in whale string is : " + braceChecker.getErrorIndex() +
                    "\nerror line is : " + braceChecker.getErrorLineNumber() +
                    "\nindex in error line is : " + braceChecker.getErrorIndexInLine());
        }

    }
}
