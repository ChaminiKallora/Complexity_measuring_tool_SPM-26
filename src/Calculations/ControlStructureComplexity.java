/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author chami
 */
public class ControlStructureComplexity {

    static int complexity = 0;

    public void ifCondition(String[] Expression) {

        Pattern ifcondition = Pattern.compile("if"); // Calculating the complexity for if condition/

        for (int i = 0; i < Expression.length; i++) {
            Matcher ifcond = ifcondition.matcher(Expression[i]);

            if (ifcond.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void forCondition(String[] Expression) {

        Pattern forCondition = Pattern.compile("(for|while|do-while)"); // Calculating the complexity for for condition

        for (int i = 0; i < Expression.length; i++) {
            Matcher forCond = forCondition.matcher(Expression[i]);

            if (forCond.find() == true) {
                complexity = complexity + 2;
            }
        }

    }

    public void catchCondition(String[] Expression) {

        Pattern catchCondition = Pattern.compile("catch"); // Calculating the complexity for catch condition

        for (int i = 0; i < Expression.length; i++) {
            Matcher catchCond = catchCondition.matcher(Expression[i]);

            if (catchCond.find() == true) {
                complexity = complexity + 1;
            }
        }

    }

    public void switchCondition(String[] Expression) {

        Pattern switchCondition = Pattern.compile("case"); // Calculating the complexity for switch condition

        for (int i = 0; i < Expression.length; i++) {
            Matcher switchCond = switchCondition.matcher(Expression[i]);

            if (switchCond.find() == true) {

                complexity = complexity + 1;
            }
        }
    }

    public int controlStructureCalculate(String[] expression) {

        ifCondition(expression);
        forCondition(expression);
        catchCondition(expression);
        switchCondition(expression);

        return complexity;
    }

}
