/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author chami
 */
public class Uploads extends javax.swing.JFrame {

    /**
     * Creates new form Uploads
     */
    public Uploads() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        showTime();  
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileUploded_textArea = new javax.swing.JTextArea();
        fileUpload_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uploadFiles = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(null);

        jTextField3.setBackground(new java.awt.Color(0, 0, 102));
        jTextField3.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        bg.add(jTextField3);
        jTextField3.setBounds(1190, 90, 150, 40);

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
        bg.add(jTextField4);
        jTextField4.setBounds(1130, 90, 70, 40);

        jTextField6.setBackground(new java.awt.Color(0, 0, 102));
        jTextField6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 15)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        bg.add(jTextField6);
        jTextField6.setBounds(1190, 190, 150, 40);

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
        bg.add(jTextField5);
        jTextField5.setBounds(1130, 190, 80, 40);

        fileUploded_textArea.setColumns(20);
        fileUploded_textArea.setRows(5);
        jScrollPane1.setViewportView(fileUploded_textArea);

        bg.add(jScrollPane1);
        jScrollPane1.setBounds(70, 200, 930, 470);

        fileUpload_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fileUpload_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileUpload_nameActionPerformed(evt);
            }
        });
        bg.add(fileUpload_name);
        fileUpload_name.setBounds(200, 140, 800, 26);

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("File Upload");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 204), null, new java.awt.Color(0, 0, 153)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1);
        jButton1.setBounds(70, 140, 120, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Calculate Complexity");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 204), null, new java.awt.Color(0, 0, 153)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg.add(jButton2);
        jButton2.setBounds(410, 690, 240, 40);

        jLabel8.setBackground(new java.awt.Color(0, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        bg.add(jLabel8);
        jLabel8.setBounds(1320, 14, 30, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Upload files");
        bg.add(jLabel5);
        jLabel5.setBounds(420, 50, 210, 40);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue.jpg"))); // NOI18N
        bg.add(jLabel2);
        jLabel2.setBounds(420, 50, 210, 50);

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue.jpg"))); // NOI18N
        bg.add(jLabel4);
        jLabel4.setBounds(1104, 0, 400, 790);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comp3.png"))); // NOI18N
        bg.add(jLabel1);
        jLabel1.setBounds(0, 0, 1490, 800);

        uploadFiles.setBackground(new java.awt.Color(153, 153, 255));
        uploadFiles.setLayout(null);
        bg.add(uploadFiles);
        uploadFiles.setBounds(0, 0, 710, 820);

        getContentPane().add(bg);
        bg.setBounds(-2, -2, 1890, 820);

        setBounds(0, 0, 1887, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void setColour(JTable jp){
        jp.setBackground(new Color(204,204,255));
    }
    
    private void resetColour(JTable jp){
        jp.setBackground(new Color(255,255,255));
    }
    
    private void fileUpload_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileUpload_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileUpload_nameActionPerformed

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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    @SuppressWarnings("unchecked")
    File ff;
    FileReader fr;
    String code;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser jf = new JFileChooser();
        int aa = jf.showOpenDialog(null);
        
        if(aa == JFileChooser.APPROVE_OPTION){
            char cbuf[] = null;
            ff = jf.getSelectedFile();
            fileUpload_name.setText(ff.getName());
            
            try {
                fr = new FileReader(ff);
                fileUploded_textArea.read(fr, "");
                code = fileUploded_textArea.getText();
            } catch (Exception ex) {
                Logger.getLogger(Uploads.class.getName()).log(Level.SEVERE, null, ex);
            }finally{  
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(Uploads.class.getName()).log(Level.SEVERE, null, ex);
                }    
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TableCalculationView calculation = null;
        try {
            calculation = new TableCalculationView(ff);
        } catch (IOException ex) {
            Logger.getLogger(Uploads.class.getName()).log(Level.SEVERE, null, ex);
        }
        calculation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Uploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uploads.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uploads().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField fileUpload_name;
    private javax.swing.JTextArea fileUploded_textArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel uploadFiles;
    // End of variables declaration//GEN-END:variables
}
