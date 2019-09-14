/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Interfaces.TableCalculationView;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 *
 * @author chami
 */
public class jInheritanceComplexity {
    File file = null;
    
    @Test
    public void test() throws IOException{
        try{
            file = new File("C:\\Users\\chami\\Documents\\test.java");
        }catch(Exception e){
                System.out.println("Error in jTestCalculation.java - " +e);
        }
        
        System.out.println("Test method execution started.");
        
        TableCalculationView calculation = new TableCalculationView(file);
        
        int actOut = calculation.getInheritanceSum();
        int expOut = 166;
        
        assertEquals(actOut, expOut);
        
        System.out.println("End of test method execution.");
        
    }
    
}
