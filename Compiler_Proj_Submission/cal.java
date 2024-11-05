import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class cal {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null)
            is = new FileInputStream(inputFile);

        // Create the lexer and parser
        calLexer lexer = new calLexer(CharStreams.fromStream(is));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        calParser parser = new calParser(tokens);

        // Add an error listener to detect syntax errors
        parser.removeErrorListeners(); // Remove default error listeners
        SyntaxErrorListener errorListener = new SyntaxErrorListener(); 
        parser.addErrorListener(errorListener);

        // Check if there were any syntax errors
        if (errorListener.hasErrors()) {
            System.out.println(inputFile + " has not parsed");
        } else {
            System.out.println(inputFile + " parsed successfully");
        }
    }

    // Custom error listener to track syntax errors
    static class SyntaxErrorListener extends BaseErrorListener {
        private boolean hasErrors = false;

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, 
                                Object offendingSymbol, 
                                int line, int charPositionInLine, 
                                String msg, RecognitionException e) {
            hasErrors = true;  // Set the flag if an error occurs
        }

        public boolean hasErrors() {
            return hasErrors;
        }
    }
}
