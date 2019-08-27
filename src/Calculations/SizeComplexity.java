package Calculations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SizeComplexity {

    static int complexity = 0;

    public void referenceComp(String[] Expresion) { // Calculating the complexity for && / *

        Pattern andKey = Pattern.compile("(\\B&[ ]\\B)");
        Pattern asterisk = Pattern.compile("([*])");
        Pattern keywords = Pattern.compile("(new|throw|throws|public|private)");

        for (int i = 0; i < Expresion.length; i++) {
            Matcher andMatcher = andKey.matcher(Expresion[i]);
            Matcher astMatcher = asterisk.matcher(Expresion[i]);
            Matcher keyMatcher = keywords.matcher(Expresion[i]);

            if (andMatcher.find() == true) {
                complexity = complexity + 1;
            }
            if (astMatcher.find() == true) {
                complexity = complexity + 1;
            }
            if (keyMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void arithmeticComp(String[] Expression) {

        Pattern arithmetic = Pattern.compile("(\\+\\+|\\-\\-| \\+ |\\-|\\%|\\/)"); // Calculating the complexity for - + /
        // % ++ --

        for (int i = 0; i < Expression.length; i++) {
            Matcher arithmeticMatcher = arithmetic.matcher(Expression[i]);

            if (arithmeticMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void relationalComp(String[] Expression) {

        Pattern relational = Pattern.compile("[=<>^*]="); // Calculating the complexity for - + / % ++ =--

        for (int i = 0; i < Expression.length; i++) {
            Matcher relationalMatcher = relational.matcher(Expression[i]);

            if (relationalMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void logicalComp(String[] Expression) {

        Pattern logical = Pattern.compile("[|]{2}|&&|!"); // Calculating the complexity for - + / % ++ =--

        for (int i = 0; i < Expression.length; i++) {
            Matcher logicalMatcher = logical.matcher(Expression[i]);

            if (logicalMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void bitwiseComp(String[] Expression) {

        Pattern bitwise = Pattern.compile("[|]{1}|\\^|\\~|[<]{2}|[<]{3}|[>]{2}|[>]{3}"); // Calculating the
        // complexity for -
        // + / % ++ =--

        for (int i = 0; i < Expression.length; i++) {
            Matcher bitwiseMatcher = bitwise.matcher(Expression[i]);

            if (bitwiseMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void miscComp(String[] Expression) {

        Pattern misc = Pattern.compile(",|\\.|[:]{2}|\\-\\>"); // Calculating the complexity for - + / % ++ =--

        for (int i = 0; i < Expression.length; i++) {
            Matcher miscMatcher = misc.matcher(Expression[i]);

            if (miscMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void assignmentComp(String[] Expression) {

        Pattern assignment = Pattern
                .compile("=|\\+\\=|\\-\\=|\\*\\=|\\/\\=|>\\>\\>\\=|\\&\\=|\\%\\=|\\<\\<\\=|\\>\\>\\=|\\^\\="); // Calculating

        for (int i = 0; i < Expression.length; i++) {
            Matcher assignmentMatcher = assignment.matcher(Expression[i]);

            if (assignmentMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void keyComp(String[] Expression) {

        Pattern keywords = Pattern.compile("(void|double|int|float|string|printif|println|class|cout|cin|if|for|while|do|switch|case|endl)");
        Pattern characters = Pattern.compile("([a-zA-Z_][a-zA-Z0-9_]*)", Pattern.COMMENTS);
        Pattern arrays = Pattern.compile("((?:[a-z][a-z]+))", Pattern.COMMENTS);

        for (int i = 0; i < Expression.length; i++) {
            Matcher keyMatcher = keywords.matcher(Expression[i]);
            Matcher charMatcher = characters.matcher(Expression[i]);
            Matcher ArrayMatcher = arrays.matcher(Expression[i]);

            if (keyMatcher.find() == true) {
                complexity = complexity + 1;
            }
            if (charMatcher.find() == true) {
                complexity = complexity + 1;
            }
            if (ArrayMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void stringComp(String[] Expression) {

        Pattern strings = Pattern.compile("(\".*?\")", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        for (int i = 0; i < Expression.length; i++) {
            Matcher stringMatcher = strings.matcher(Expression[i]);

            if (stringMatcher.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public int sizeCalculate(String[] expression) {

        referenceComp(expression);
        arithmeticComp(expression);
        relationalComp(expression);
        logicalComp(expression);
        bitwiseComp(expression);
        miscComp(expression);
        assignmentComp(expression);
        keyComp(expression);
        stringComp(expression);

        return complexity;
    }

}
