package java.bracechecker;

public class BraceChecker {
    private Stack stack;
    private String message = "No errors";
    private int errorIndex = -1;
    private int errorIndexInLine = 0;
    private int errorLineNumber = 0;

    public String getMessage() {
        return message;
    }

    public int getErrorIndex() {
        return errorIndex;
    }

    public int getErrorIndexInLine() {
        return errorIndexInLine;
    }

    public int getErrorLineNumber() {
        return errorLineNumber;
    }

    public BraceChecker(int capacity) {
        this.stack = new Stack(capacity);
    }

    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
        int textLength = text.length();
        char lastElement;
        for (int i = 0; i < textLength; i++) {
            char element = text.charAt(i);
            errorIndexInLine++;
            switch (element) {
                case '\r':
                case '\n':
                    errorIndexInLine = 0;
                    errorLineNumber++;
                    break;
                case '(':
                case '[':
                case '{':
                    errorIndex = i;
                    errorIndexInLine = i;
                    stack.push(element);
                    break;
                case ')':
                    if (stack.isEmpty()) {
                        message = "Don't opened any but closed ')'";
                        errorIndex = i;
                        return false;
                    }
                    lastElement = (char) stack.pop();
                    if (lastElement != '(') {
                        message = "Opened '" + lastElement + "' but closed ')'";
                        errorIndex = i;
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        message = "Don't opened any but closed ']'";
                        errorIndex = i;
                        errorIndexInLine = i;
                        return false;
                    }
                    lastElement = (char) stack.pop();
                    if (lastElement != '[') {
                        message = "Opened '" + lastElement + "' but closed ']'";
                        errorIndex = i;
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        message = "Don't opened any but closed '}'";
                        errorIndex = i;
                        return false;
                    }
                    lastElement = (char) stack.pop();
                    if (lastElement != '{') {
                        message = "Opened '" + lastElement + "' but closed '}'.";
                        errorIndex = i;
                        return false;
                    }
                    break;
            }
        }

        if (!stack.isEmpty()) {
            lastElement = (char) stack.pop();
            message = "Opened '" + lastElement + "' but not closed.";
            return false;
        }

        message = "Brace checking is passed with no errors.";
        errorIndex = -1;
        errorIndexInLine = -1;
        return true;
    }

}