/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Interfaces.Calculation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chami
 */
public class CodeLineCalculations {
    
    String code;
    ArrayList<String> codeLines = new ArrayList<String>();
    ArrayList<String> classExtended = new ArrayList<String>();
    ArrayList<String> classes = new ArrayList<String>();
    
    public ArrayList<String> breakLines(String theRegex,String code, File ff) throws FileNotFoundException, IOException{
//        this.code = code;
//        Pattern checkRegex = Pattern.compile(theRegex);
//        Matcher regexMatcher = checkRegex.matcher(code);
//        
//        if(".*[{};]".equals(theRegex)){
//            while(regexMatcher.find()){ 
//                if(regexMatcher.group().length() != 0){ 
//                    codeLines.add(regexMatcher.group().trim());
//                }           
//    //            System.out.println("Start index : " +regexMatcher.start());
//    //            System.out.println("End index : " +regexMatcher.end());
//            }
//            return codeLines;
//        }else if("\\w*\\sextends\\s\\w*".equals(theRegex)){
//            while(regexMatcher.find()){ 
//                if(regexMatcher.group().length() != 0){ 
//                    classExtended.add(regexMatcher.group().trim());
//                }           
//            }
//            return classExtended;
//        }

        FileReader fr = new FileReader(ff);    
        BufferedReader br=new BufferedReader(fr);    
  
        int i;    
        while((i=br.read())!=-1){  
            System.out.print((char)i);  
        
        }  
        return null;
    }
    
    public void checkExtends(){
        int i = 0;
        //breakLines("\\w*\\sextends\\s\\w*", code);
        
        Map<String,String> cls = new HashMap<String,String>();  
        
        for (String temp : classExtended) {
            String[] splitArray = temp.split(" extends ", 3);
            System.out.println(splitArray[0]);
            System.out.println(splitArray[1]);
            
            cls.put(splitArray[0], splitArray[1]);
        }
        
        for(Map.Entry c : cls.entrySet()){  
//            System.out.println(c.getKey()+" "+c.getValue());  
            
        }  
        
    }
    
    public void findClasses(){
//        FileReader fr = new FileReader("D:\\testout.txt");    
//        BufferedReader br=new BufferedReader(fr);    
//  
//        int i;    
//        while((i=br.read())!=-1){  
//            System.out.print((char)i);  
//        
//        }  
        
    }
    
}
