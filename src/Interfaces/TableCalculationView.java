/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Calculations.ControlStructureComplexity;
import Calculations.InheritanceComplexity;
import Calculations.NestedComplexity;
import Calculations.SizeComplexity;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
<<<<<<< HEAD
import java.io.FileNotFoundException;
=======
<<<<<<< HEAD:src/Interfaces/TableCalculationView.java
import java.io.FileNotFoundException;
=======
>>>>>>> c46fdcccffb5cabbd4fae6d27126b41fe0c8967c:src/Interfaces/Calculation.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author chami
 */
public class TableCalculationView extends javax.swing.JFrame {//^public .*     

<<<<<<< HEAD
=======
<<<<<<< HEAD:src/Interfaces/TableCalculationView.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
    File ff;

    private int inheritanceValue = 0;
    private int rowNum = 0;
    private int colRowNum = 0;
    private int rowNumTable = 1;

    //complexity initializers
    private int sumInheritance = 0;
    private int sumSize = 0;
    private int sumNested = 0;
    private int sumControl = 0;
    
    //cp
    private int sumCps = 0;
    private int colSum = 0;
    
    //regex
    String regex_findClasses = "\\b(class)\\b\\s\\w+";
    String regex_findcode = "\\n|^\\s*$|(\\{|^([\\W]*\\})|^[\\W]*\\s*\\/\\/|^[\\W]*\\s*\\*\\/|^[\\W]*\\s*\\/\\*|^[\\W]*\\s*\\*|^[\\W]*\\s*try\\s*\\{*|^[\\W]*\\s*\\}*\\s*(else)\\s*\\{*)|^public\\s*\\:|^private\\s*\\:";
    String regex_findcode2 = "(^([\\W]*\\}\\s*[\\w]+^(?!else))|\\w+^(?!try)\\{\\s*\\w*|\\w*\\{\\s*\\w+|\\w*\\{\\s*\\W+\\w+|\\w+\\W+\\{\\s*)";

<<<<<<< HEAD
=======
=======
   
>>>>>>> c46fdcccffb5cabbd4fae6d27126b41fe0c8967c:src/Interfaces/Calculation.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
    /**
     * Creates new form Calculation
     */
    public TableCalculationView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        jTableDesign();
        showTime();
    }
<<<<<<< HEAD

    public TableCalculationView(File ff) throws IOException {
=======
<<<<<<< HEAD:src/Interfaces/TableCalculationView.java

    public TableCalculationView(File ff) throws IOException {
=======
    
    public Calculation(File ff) throws IOException {
>>>>>>> c46fdcccffb5cabbd4fae6d27126b41fe0c8967c:src/Interfaces/Calculation.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
        initComponents();
        this.ff = ff;

        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        jTableDesign();
        showTime();
<<<<<<< HEAD

        setTableData(ff);
        lineArray();
=======
<<<<<<< HEAD:src/Interfaces/TableCalculationView.java

        setTableData(ff);
        lineArray();
=======
        //regexChecker(".*[{};]", code);
        setTableData(ff);
>>>>>>> c46fdcccffb5cabbd4fae6d27126b41fe0c8967c:src/Interfaces/Calculation.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
    }

    public int getInheritanceSum() {
        return sumInheritance;
    }

    public int getSumSize() {
        return sumSize;
    }

    public int getSumNested() {
        return sumNested;
    }

    public int getSumControl() {
        return sumControl;
    }

    private void jTableDesign() {
        table_uploaded.setRowHeight(40);
        table_uploaded.setShowGrid(true);
        table_uploaded.setGridColor(new Color(153, 153, 255));
        table_uploaded.setSelectionBackground(Color.DARK_GRAY);

        JTableHeader tableHeader = table_uploaded.getTableHeader();
        tableHeader.setBackground(new Color(153, 153, 255));
        tableHeader.setForeground(Color.BLACK);
        tableHeader.setPreferredSize(new Dimension(70, 70));
        tableHeader.setFont(new Font("Arial", Font.BOLD, 12));
    }

    private void showTime() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String days[] = new DateFormatSymbols().getWeekdays();
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
                Calendar dayName = Calendar.getInstance();
                Date dateObject = new Date();
                jTextField6.setText(time.format(dateObject));
                jTextField3.setText(date.format(dateObject) + " " + days[dayName.get(Calendar.DAY_OF_WEEK)]);

            }

        });
        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();

        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);

    }
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/Interfaces/TableCalculationView.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3

    public int setTableData(File ff) throws IOException {
        DefaultTableModel model = (DefaultTableModel) table_uploaded.getModel();

        FileReader fr = new FileReader(ff);
        BufferedReader br = new BufferedReader(fr);

        String strCurrentLine;

        InheritanceComplexity cal = new InheritanceComplexity(ff);
        HashMap inheritance = cal.getClasses();
        Set set = inheritance.entrySet();//Converting to Set so that we can traverse  
        Iterator iterator = set.iterator();

        while ((strCurrentLine = br.readLine()) != null) {

            Object[] row = {rowNumTable++, strCurrentLine, null, null, null, null, null, null, null, null};

            model.addRow(row);
<<<<<<< HEAD
=======
=======
    
    //public void regexChecker(String theRegex, String code){
    public void setTableData(File ff) throws IOException{  
        FileReader fr = new FileReader(ff);    
        BufferedReader br=new BufferedReader(fr);
        
        CodeLineCalculations cal = new CodeLineCalculations(ff);
        //cal.checkExtends();
        
        String strCurrentLine;

        while ((strCurrentLine = br.readLine()) != null) {
        
            Object[] row = { 1, strCurrentLine };
            
            DefaultTableModel model = (DefaultTableModel) table_uploaded.getModel();

            model.addRow(row);
        
        }         
    }
>>>>>>> c46fdcccffb5cabbd4fae6d27126b41fe0c8967c:src/Interfaces/Calculation.java
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3

            //set complexity of inheritance row by row
            inheritanceClaculation(strCurrentLine, cal, set, iterator, model);
            
            //should be called after every complexity is calculated row by row
            colSum(strCurrentLine, cal, set, iterator, model);
        }

        for (int i = 0; i < table_uploaded.getRowCount(); i++) {
            try {
                this.sumInheritance = this.sumInheritance + Integer.parseInt(table_uploaded.getValueAt(i, 6).toString());
            } catch (Exception e) {
            }
                
//            try {
//                if(table_uploaded.getValueAt(i, 9).toString() == null || table_uploaded.getValueAt(i, 9).toString().equals('0')){
//                    this.sumCps = this.sumCps + Integer.parseInt(table_uploaded.getValueAt(i, 8).toString());
//                    System.out.println(sumCps);
//                }else{
//                    this.sumCps = this.sumCps + Integer.parseInt(table_uploaded.getValueAt(i, 9).toString());
//                    System.out.println(sumCps);
//                }
//            } catch (Exception e) {
//                //System.out.println("Error - " +e);
//            }

            boolean n = true;
            try {
                    this.sumCps = this.sumCps + Integer.parseInt(table_uploaded.getValueAt(i, 8).toString());
                    System.out.println(sumCps);
            } catch (Exception e) {
             
            }
            
            try {
                if(table_uploaded.getValueAt(i, 9).toString() != null){
                    this.sumCps = this.sumCps + Integer.parseInt(table_uploaded.getValueAt(i, 9).toString()) - Integer.parseInt(table_uploaded.getValueAt(i, 8).toString());
                    System.out.println(sumCps);
                }
            } catch (Exception e) {

            }
            

        }

        
        Object[] row = {null, "Total", null, null, null, null, sumInheritance, null, null, null};
        model.addRow(row);
        
        Object[] row2 = {null, null, "CPs", null, null, null, null, null, null, sumCps};
        model.addRow(row2);

        return this.sumInheritance;
    }

    private void lineArray() throws FileNotFoundException {
        Scanner file = new Scanner(ff);// Path to the scanning file
        ArrayList<String> lineArray = new ArrayList<String>();

        while (file.hasNextLine()) {
            lineArray.add(file.nextLine());
        }

        file.close();

        String[] stringArray = lineArray.toArray(new String[lineArray.size()]);

        sizeComplexity(stringArray);
        controlComplexity(stringArray);
        nestedLevelComplexity(lineArray);

    }

    private void sizeComplexity(String[] stringArray) throws FileNotFoundException {

        SizeComplexity comp = new SizeComplexity();
        this.sumSize = comp.sizeCalculate(stringArray);

        System.out.println("================ Size Complexity =================\n");
        System.out.println("Size complexity of the file : " + this.sumSize + "\n");
        System.out.println("==================================================\n");

    }

    private void controlComplexity(String[] stringArray) throws FileNotFoundException {

        ControlStructureComplexity comp = new ControlStructureComplexity();
        this.sumControl = comp.controlStructureCalculate(stringArray);

        System.out.println("================ Control Structure Complexity =================\n");
        System.out.println("Control Structure complexity of the file : " + this.sumControl + "\n");
        System.out.println("==================================================\n");

    }

    private void nestedLevelComplexity(ArrayList<String> lineArray) throws FileNotFoundException {

        NestedComplexity ns = new NestedComplexity(lineArray);
        this.sumNested = ns.calTotalNested();

        System.out.println("================ Nested Level Complexity =================\n");
        System.out.println("Nested Level complexity of the file : " + this.sumNested + "\n");
        System.out.println("==================================================\n");

    }

    private void inheritanceClaculation(String strCurrentLine, InheritanceComplexity cal, Set set, Iterator iterator, DefaultTableModel model) {

        boolean check = cal.checkLines(regex_findClasses, strCurrentLine);

        if (check == true) {
            String codeClass = cal.extractClass(regex_findClasses, strCurrentLine);
            iterator = set.iterator();
            while (iterator.hasNext()) {
                //Converting to Map.Entry so that we can get key and value separately  
                Map.Entry entry = (Map.Entry) iterator.next();
                if (codeClass.equals(entry.getKey())) {
                    inheritanceValue = (int) entry.getValue();
                }
            }
        } else {
            //check - {, /n, //, /*, *, */, try{ and try, 
            boolean check2 = cal.checkLines(regex_findcode, strCurrentLine);

            if (check2 == false) {
                if (!strCurrentLine.trim().isEmpty()) {
                    model.setValueAt(inheritanceValue, rowNum, 6);
                }
            } else {
                boolean check3 = cal.checkLines(regex_findcode2, strCurrentLine);

                if (check3 == true) {
                    model.setValueAt(inheritanceValue, rowNum, 6);
                }
            }
        }
        rowNum++;

    }
    
    private void colSum(String strCurrentLine, InheritanceComplexity cal, Set set, Iterator iterator, DefaultTableModel model){
        
        try{
            int cs = (int) model.getValueAt(colRowNum, 3);
            colSum = cs + colSum;
        }catch (Exception e) {
                //System.out.println("Error - " +e);
        }
        
        try{
            int ctc = (int) model.getValueAt(colRowNum, 4);
            colSum = ctc + colSum;
        }catch (Exception e) {
                //System.out.println("Error - " +e);
        }
        
        try{
             int cnc = (int) model.getValueAt(colRowNum, 5);
             colSum = cnc + colSum;
        }catch (Exception e) {
                //System.out.println("Error - " +e);
        }
        
        try{
            int ci = (int) model.getValueAt(colRowNum, 6);
            colSum = ci + colSum;
        }catch (Exception e) {
                //System.out.println("Error - " +e);
        }
        
        try{
            int TW = (int) model.getValueAt(colRowNum, 7);
            colSum = TW + colSum;
        }catch (Exception e) {
                //System.out.println("Error - " +e);
        }

        model.setValueAt(colSum, colRowNum, 8);
        colSum = 0;
        colRowNum++;     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_uploaded = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
<<<<<<< HEAD
=======
        jLabel7 = new javax.swing.JLabel();
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back(1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 40, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backGround2.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 280, 940, 510);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 60, 50);

        table_uploaded.setAutoCreateRowSorter(true);
        table_uploaded.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        table_uploaded.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        table_uploaded.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Program statements", "Tokens identified under the size factor ", "Cs", "Ctc", "Cnc ", "Ci ", "TW ", "Cps ", "Cr "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_uploaded.setGridColor(new java.awt.Color(204, 204, 255));
        table_uploaded.setIntercellSpacing(new java.awt.Dimension(5, 2));
        table_uploaded.setSelectionForeground(new java.awt.Color(204, 204, 255));
        table_uploaded.getTableHeader().setResizingAllowed(false);
        table_uploaded.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_uploadedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                table_uploadedMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(table_uploaded);
        if (table_uploaded.getColumnModel().getColumnCount() > 0) {
            table_uploaded.getColumnModel().getColumn(0).setMinWidth(40);
            table_uploaded.getColumnModel().getColumn(0).setPreferredWidth(40);
            table_uploaded.getColumnModel().getColumn(0).setMaxWidth(40);
            table_uploaded.getColumnModel().getColumn(1).setMinWidth(500);
            table_uploaded.getColumnModel().getColumn(1).setPreferredWidth(500);
            table_uploaded.getColumnModel().getColumn(1).setMaxWidth(500);
            table_uploaded.getColumnModel().getColumn(2).setMinWidth(300);
            table_uploaded.getColumnModel().getColumn(2).setPreferredWidth(300);
            table_uploaded.getColumnModel().getColumn(2).setMaxWidth(500);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 130, 1350, 560);

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1310, 10, 30, 40);

        jLabel9.setBackground(new java.awt.Color(0, 0, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signout_1.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1270, 10, 30, 40);

        jTextField3.setBackground(new java.awt.Color(0, 0, 102));
        jTextField3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(780, 10, 190, 30);

        jTextField4.setBackground(new java.awt.Color(0, 0, 102));
        jTextField4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("Date");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(740, 10, 70, 30);

        jTextField6.setBackground(new java.awt.Color(0, 0, 102));
        jTextField6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(1040, 10, 180, 30);

        jTextField5.setBackground(new java.awt.Color(0, 0, 102));
        jTextField5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("Time");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(990, 10, 80, 30);

<<<<<<< HEAD
=======
        jLabel7.setBackground(new java.awt.Color(0, 0, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/barT.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1490, 50);

>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backGround2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(940, 270, 680, 520);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1570, 790);

        setBounds(0, 0, 1573, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void table_uploadedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_uploadedMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_table_uploadedMouseClicked

    private void table_uploadedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_uploadedMouseEntered

    }//GEN-LAST:event_table_uploadedMouseEntered

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Uploads uploads = new Uploads();
        uploads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableCalculationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableCalculationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableCalculationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableCalculationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableCalculationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabel7;
>>>>>>> c62ac061b5bb030b3a1f0a225ae8cadbbb04dee3
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable table_uploaded;
    // End of variables declaration//GEN-END:variables
}
