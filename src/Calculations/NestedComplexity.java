package Calculations;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NestedComplexity {



    ArrayList<String> codelines;
    ArrayList<Integer> nestedCount;

    int bracketsCount = 0;

    
    String openBrackets = "\\b((if|while|for|do)(\\s+|\\().*\\{)";
    String closeBracketEmpty = "^(\\s*\\}\\s*)|^(\\s*)$";
    String closeBracket = "\\}";
    String elseBracket = "\\b((else)(.*\\{))";
    
    public NestedComplexity(ArrayList<String> codelines){
        this.codelines = codelines;
        nestedCount = new ArrayList<Integer>(codelines.size());
        returnCtcValues();
        
    }

    public void addBracket() {
        bracketsCount++;
    }
    
    public void removeBracket() {
        if (bracketsCount > 0) {
            bracketsCount--;
        }
    }
	
    public void calLineByLine(){

        Pattern p1 = Pattern.compile(openBrackets);
        Pattern p2 = Pattern.compile(closeBracketEmpty);
        Pattern p3 = Pattern.compile(closeBracket);
        Pattern p4 = Pattern.compile(elseBracket);
        
        
        for(int i = 0; i < codelines.size() ; i++){
            int Count = 0;

            String codeline = codelines.get(i);

            Matcher m1 = p1.matcher(codeline);
            while (m1.find()){
                addBracket();
            }
            Count = bracketsCount;

            Matcher m2 = p2.matcher(codeline);
            if (m2.find()){
                Count = 0;
            }
            
            Matcher m3 = p3.matcher(codeline);
            while (m3.find()){
                removeBracket();
            }

            Matcher m4 = p4.matcher(codeline);
            if (m4.find()){
                addBracket();
            }

            nestedCount.add(Count);
        }
    }

    public ArrayList<Integer> returnCtcValues(){
        calLineByLine();
        return nestedCount;
    }

    //Calculate total Nested value for whole program
    public int calTotalNested(){
        int totalNestedCount = 0;
        for(int i = 0; i < nestedCount.size() ; i++){
            totalNestedCount = totalNestedCount + nestedCount.get(i);
        }

        return totalNestedCount;
    }

}