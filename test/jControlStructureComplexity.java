
import Interfaces.TableCalculationView;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chami
 */
public class jControlStructureComplexity {
    File file = null;
    
    @Test
    public void test() throws IOException{
        try{
            file = new File("C:\\Users\\chami\\Documents\\test.java");
        }catch(Exception e){
            System.out.println("Error in jSizeComplexity.java - " +e);
        }
        
        System.out.println("Test method execution started.");
        
        TableCalculationView calculation = new TableCalculationView(file);
        
        int actOut = calculation.getSumControl();
        int expOut = 35;
        
        assertEquals(actOut, expOut);
        
        System.out.println("End of test method execution.");
        
    }
}
