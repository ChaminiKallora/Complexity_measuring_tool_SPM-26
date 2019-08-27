/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chami //([^{]*?)(?=\}) class\s\w*\s\{ new - class\s\w*\s\{((.|\n)*)\}
 * // \((?>[^()]|(?R))*\)
 */
public class InheritanceComplexity {

    BufferedReader br;
    FileReader fr;
    String code;
    File ff;
    String sCode[];

    Map<String, String> classExtended = new HashMap<String, String>();
    Map<String, Integer> classes = new HashMap<String, Integer>();

    public InheritanceComplexity(File ff) throws FileNotFoundException, IOException {
        this.ff = ff;
        fr = new FileReader(ff);
        br = new BufferedReader(fr);

        convertFiletoString();
        findClasses();
        checkExtends();
        calculateComplexityInheritance();
    }

    //break the code by regex to get class names and extended classes
    public void codeBreak(String theRegex, String line) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(code);

        //get extended classes and insert in to classExtended hash map
        if ("class\\s+\\w+\\s+extends\\s+\\w+".equals(theRegex)) {
            String s[];
            while (regexMatcher.find()) {
                if (regexMatcher.group().length() != 0) {
                    s = regexMatcher.group().trim().split(" ");

                    try {
                        classExtended.put(s[1], s[3]);
                    } catch (Exception e) {
                        System.out.println("error - " + e);
                    }
                }
            }

            //insert class names and default value to the classes hash map    
        } else if ("\\b(class)\\b\\s\\w+(\\s*|\\s+(extends)\\s+\\w.+\\s*)".equals(theRegex)) {
            String s[];
            while (regexMatcher.find()) {
                if (regexMatcher.group().length() != 0) {
                    s = regexMatcher.group().trim().split(" ");
                    classes.put(s[1], 2);
                }
            }
        } else {
            while (regexMatcher.find()) {
                if (regexMatcher.group().length() != 0) {
                    // System.out.println(regexMatcher.group().trim());
                }
            }
        }
    }

    public boolean checkLines(String theRegex, String line) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(line);

        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                //System.out.println(regexMatcher.group().trim());
                return true;
            }
        }
        return false;
    }

    public String extractClass(String theRegex, String line) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(line);

        String s[];
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                s = regexMatcher.group().trim().split(" ");
                return s[1];
            }
        }

        return "false";
    }

    private void calculateComplexityInheritance() {
        boolean loop;

        for (Map.Entry c : classes.entrySet()) {

            for (Map.Entry c2 : classExtended.entrySet()) {

                loop = true;

                if (c.getKey().equals(c2.getKey())) {  //check whether the class is inside the extended classes
                    int count = (int) c.getValue() + 1;
                    c.setValue(count);

                    String className = (String) c2.getValue();

                    for (Map.Entry c5 : classes.entrySet()) { // check for extended class has more parents
                        if (!classExtended.containsKey(c5.getKey())) {
                            if (className.equals(c5.getKey())) {
                                loop = false;
                            }
                        }
                    }

                    for (Map.Entry c6 : classExtended.entrySet()) { // check if the class extended from other than the user defined classes 

                        if (!classes.containsKey(c6.getValue())) {

                            if (className.equals(c6.getValue())) {
                                loop = false;
                            }

                        }
                    }

                    // check for all the hierarchical levels
                    while (loop == true) {
                        for (Map.Entry c3 : classExtended.entrySet()) {

                            if (className.equals(c3.getKey())) {
                                count = (int) c.getValue() + 1;
                                c.setValue(count);

                                className = (String) c3.getValue();

                                for (Map.Entry c4 : classes.entrySet()) {

                                    if (!classExtended.containsKey(c4.getKey())) {
                                        if (className.equals(c4.getKey())) {
                                            loop = false;
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }

        Set set = classes.entrySet();//Converting to Set so that we can traverse  
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately  
            Map.Entry entry = (Map.Entry) iterator.next();
        }
    }

    //pass extend classes regex code
    public void checkExtends() throws IOException {
        codeBreak("class\\s+\\w+\\s+extends\\s+\\w+", null);
    }

    //pass classes regex code to break
    private void findClasses() {
        codeBreak("\\b(class)\\b\\s\\w+(\\s*|\\s+(extends)\\s+\\w.+\\s*)", null);
    }

    //convert file to string
    private void convertFiletoString() throws IOException {
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();

        while (line != null) {
            sb.append(line).append("\n");
            line = br.readLine();
        }

        code = sb.toString();
    }

    public HashMap<String, Integer> getClasses() {
        return (HashMap) classes;
    }

}
