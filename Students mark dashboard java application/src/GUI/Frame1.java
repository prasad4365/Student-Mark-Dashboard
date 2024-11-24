/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

//import javax.swing.DefaultListModel;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;

/**
 *
 * @author ACER
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
//        arrayReset();
    }
    

    private void  arrayReset(){
        indexArray = new String[0];
        markArray = new double[0];
        gradeArray = new char[0];
        buttonCount=0;
         buttonCount= indexArray.length;
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        indexText = new javax.swing.JTextField();
        markText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        clearBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        summaryBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Students Mark Board");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 228, 228));
        jPanel1.setForeground(new java.awt.Color(0, 65, 239));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 65, 239));
        jLabel1.setText("Index Number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 65, 239));
        jLabel2.setText("Marks");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 50, -1));

        addBtn.setBackground(new java.awt.Color(39, 89, 241));
        addBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add Student");
        addBtn.setToolTipText("Click to Add");
        addBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBtn.setBorderPainted(false);
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 30));

        indexText.setForeground(new java.awt.Color(0, 87, 236));
        indexText.setToolTipText("Input index number here");
        indexText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexTextActionPerformed(evt);
            }
        });
        jPanel1.add(indexText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, -1));

        markText.setForeground(new java.awt.Color(0, 87, 236));
        markText.setToolTipText("Input mark here");
        markText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markTextActionPerformed(evt);
            }
        });
        markText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                markTextKeyTyped(evt);
            }
        });
        jPanel1.add(markText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 80, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 76, 223));
        jSeparator1.setForeground(new java.awt.Color(18, 44, 231));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 660, 10));

        clearBtn.setBackground(new java.awt.Color(34, 72, 236));
        clearBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear Students");
        clearBtn.setToolTipText("Click to clear All");
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 563, 140, 30));

        updateBtn.setBackground(new java.awt.Color(34, 72, 236));
        updateBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update Results");
        updateBtn.setToolTipText("Click to update Result");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 563, 140, 30));

        summaryBtn.setBackground(new java.awt.Color(34, 72, 236));
        summaryBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        summaryBtn.setForeground(new java.awt.Color(255, 255, 255));
        summaryBtn.setText("Save Summary");
        summaryBtn.setToolTipText("Click to save Summary");
        summaryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        summaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(summaryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 563, 140, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 126, 253));
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Students Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 67, 225))); // NOI18N
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea1.setSelectionColor(new java.awt.Color(16, 124, 228));
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 280));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(0, 126, 253));
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("");
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 67, 225))); // NOI18N
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextArea2.setSelectionColor(new java.awt.Color(16, 124, 228));
        jScrollPane1.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 330, 450));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(18, 63, 225));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STUDENT  MARKS  BOARD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 600, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void indexTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indexTextActionPerformed
//DefaultListModel number = new DefaultListModel();
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:     
        
       
      
//         
        try {
//            if(markText.getText().equals() ==  )
               
            if(indexText.getText().isEmpty() || markText.getText().isEmpty()){
                     getToolkit().beep();
                JOptionPane.showMessageDialog(null," Please fill all dtails !");
               
//           }else if()){
////               JOptionPane.showMessageDialog(null," You should have to enter numarical value !");
           }else{
////              
    
      
            int i;
           String index = indexText.getText();
//          int count = indexArray.length;
         
        String tempArray[]= indexArray;
        buttonCount++;
        
          indexArray  = new String[buttonCount];
          indexArray[buttonCount-1]=index;
        
        for( i=0;i<tempArray.length;i++){
          indexArray[i] = tempArray[i];
//          
   
        }
        
        //input marks into the array
       double marks;
         marks =Double.parseDouble(markText.getText());
           
         
       double tempmarkArray[]= markArray;
        
          markArray   = new double[buttonCount];
          markArray[buttonCount-1]=  marks;
        
        for( i=0;i<tempmarkArray.length;i++){
            markArray[i]= tempmarkArray[i] ;
//            System.out.println(indexArray[j]);
        }
         

        jTextArea1.append(indexArray.length+" .  "+indexArray[i]+"  -  "+ markArray[i]+'\n');

//        }
          indexText.setText("");
         markText.setText("");
        
       
        
           updateBtn.setVisible(true);
        
            }    
           
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null," You should have to enter numarical value !");
            JOptionPane.showMessageDialog(null,e);
        }

            
       

        
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
      try{
          if(buttonCount==0){
                getToolkit().beep();
                 JOptionPane.showMessageDialog(null,"You haven't entered Students details yet !");
          }else{
            double total=0;
            double average;
        
        for(int i=0;i<markArray.length;i++){
                 total = markArray[i]+total;
        }

        
        average = total/markArray.length;

        
        //find max value of the array 
        double max = markArray[0];
        for (int i =0;i<markArray.length;i++){
         if (max<markArray[i]){
             max= markArray[i];
         }
        }

            
           //find min value of the array 
             double min = markArray[0];
        for (int i =0;i<markArray.length;i++){
         if (min>markArray[i]){
             min= markArray[i];
         }
        }
//
    jTextArea2.append("**************************"+'\n'+'\n'+" Number Of Students :- "+indexArray.length+'\n'+" Average Mark Of Students :- "+average+'\n'+" Maxximum Mark Of Students : "+max+'\n'+" Minimum Mark Of Students :- "+min+'\n'+'\n'+"**************************"+'\n'+'\n');
            
            // find grade
               char grade[]= new char[markArray.length];
            for (int i=0; i<markArray.length;i++){
                if (markArray[i]>75){
                 grade [i]= 'A';

                }else if (markArray[i]>65){
                
                 grade [i]= 'B';
                }else if (markArray[i]>55){
                 
                 grade [i]= 'C';
                 }else  if (markArray[i]>35){
                 
                   grade [i]= 'W';
                  }else{
                  grade[i]= 'F';
                  }
                 }

                 for(int i=0;i<indexArray.length;i++){
              jTextArea2.append( "   "+ indexArray[i]+" - " +markArray[i]+" "+"("+grade[i]+")"+'\n');
                  updateBtn.setVisible(false);
                  summaryBtn.setVisible(true);
                  
                 }
          }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
      
      
    }//GEN-LAST:event_updateBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        try {
             
            if(buttonCount==0){
                 getToolkit().beep();
                 JOptionPane.showMessageDialog(null,"You haven't entered Students details yet !");
            }else if (buttonCount==indexArray.length){
                 getToolkit().beep();
                int response = JOptionPane.showConfirmDialog(this,"Do you want to clear all Students details ?", "Conform", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                   if(response == JOptionPane.YES_OPTION) {
                     
                 jTextArea2.setText("");
                 jTextArea1.setText("");
                 indexText.setText("");
                 markText.setText("");
                    
                 arrayReset();
                 
                  
                }
                  
            } 
//                updateBtn.setVisible(true);     
        } catch (Exception e) {
        }
     
      
          
              
//             
//                     }  
              
        
    }//GEN-LAST:event_clearBtnActionPerformed

    private void summaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryBtnActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser(); 
            
//            File F = new File("C:\\Users\\ACER\\Desktop\\netbeans java\\Students mark board java application\\students mark board app\\results_summary.txt");
//       
                if(buttonCount==0){
                    getToolkit().beep();
                            
                    JOptionPane.showMessageDialog(null,"You haven't entered Students details yet !");
                }else{  
                    JOptionPane.showMessageDialog(null,"You should have to give expect file extention "+'\n'+"end of the file name ");
                    fc.showSaveDialog(this);
                    File f = fc.getSelectedFile();
                    
//                         F.createNewFile();
//                     FileWriter fw = new FileWriter("C:\\Users\\ACER\\Desktop\\netbeans java\\Students mark board java application\\students mark board app\\results_summary.txt");
                        FileWriter fw = new FileWriter(f);
                         fw.write(jTextArea1.getText());
                         fw.write(jTextArea2.getText());
                         fw.close();
                
             JOptionPane.showMessageDialog(null,"Your Summary file is created succesfully !");
             summaryBtn.setVisible(false); 
                }
        } catch (Exception e) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"You didn't choose lacation");
        }
       
        
    }//GEN-LAST:event_summaryBtnActionPerformed

    private void markTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_markTextKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == evt.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_markTextKeyTyped

    private void markTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markTextActionPerformed
    
    /**
     * @param args the command line arguments
     */
     String indexArray[]= new String[0];
     double [] markArray = new double[0];
     char gradeArray[] = new char[0];
//     int count = indexArray.length;
     
     int buttonCount = indexArray.length;
       
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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
  
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);

            
            
               

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField indexText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField markText;
    private javax.swing.JButton summaryBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

 
}
