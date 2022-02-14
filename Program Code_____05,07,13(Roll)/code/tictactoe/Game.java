package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Game extends javax.swing.JFrame {
    private String StartGame="X";
    private int xCount=0;
    private int oCount=0;
     
    public Game() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
   private void GameScore(){
       jblPlayerX.setText(String.valueOf(xCount));
       jblPlayerO.setText(String.valueOf(oCount));
   }
   private void choose_a_Player()
   {
       if(StartGame.equalsIgnoreCase("X"))
       {
           StartGame="O";
       }        
       else{
           StartGame="X";
       }
               
   }
   private void winningGame()
   {
       String b1=jButton1.getText();
       String b2=jButton2.getText();
       String b3=jButton3.getText();
         
       String b4=jButton4.getText();
       String b5=jButton5.getText();
       String b6=jButton6.getText();
            
       String b7=jButton7.getText();
       String b8=jButton8.getText();
       String b9=jButton9.getText();
       
       if (b1==("X") && b2==("X") && b3==("X"))
       {   xCount++;      
           GameScore();
           jButton1.setEnabled(true);
           jButton2.setEnabled(true);
           jButton3.setEnabled(true);
           jButton1.setBackground(Color.YELLOW);
           jButton2.setBackground(Color.YELLOW);
           jButton3.setBackground(Color.YELLOW);
           JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         }
       if (b4==("X") && b5==("X") && b6==("X"))
       {
                      xCount++;
           GameScore();
           jButton4.setEnabled(true);
           jButton5.setEnabled(true);
           jButton6.setEnabled(true);
           jButton4.setBackground(Color.YELLOW);
           jButton5.setBackground(Color.YELLOW);
           jButton6.setBackground(Color.YELLOW);
           JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);

        }
       
        if(b7==("X") && b8==("X") && b9==("X"))
       {                  xCount++;   
           GameScore();
           jButton7.setEnabled(true);
           jButton8.setEnabled(true);
           jButton9.setEnabled(true);
           jButton7.setBackground(Color.YELLOW);
           jButton8.setBackground(Color.YELLOW);
           jButton9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
        }
          
          if(b1==("X") && b4==("X") && b7==("X"))
       {                     xCount++;
           GameScore();
           jButton1.setEnabled(true);
           jButton4.setEnabled(true);
           jButton7.setEnabled(true);
           jButton1.setBackground(Color.YELLOW);
           jButton4.setBackground(Color.YELLOW);
           jButton7.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
              
         if(b2==("X") && b5==("X") && b8==("X"))
       {                    xCount++; 
           GameScore();
           jButton2.setEnabled(true);
           jButton5.setEnabled(true);
           jButton8.setEnabled(true);
           jButton2.setBackground(Color.YELLOW);
           jButton5.setBackground(Color.YELLOW);
           jButton8.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }    
               
        if(b3==("X") && b6==("X") && b9==("X"))
       {           xCount++;
           GameScore();
           jButton3.setEnabled(true);
           jButton6.setEnabled(true);
           jButton9.setEnabled(true);
           jButton3.setBackground(Color.YELLOW);
           jButton6.setBackground(Color.YELLOW);
           jButton9.setBackground(Color.YELLOW);           
           JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);  
        }
                 
         if(b1==("X") && b5==("X") && b9==("X"))
       {           xCount++;
           GameScore();
           jButton1.setEnabled(true);
           jButton5.setEnabled(true);
           jButton9.setEnabled(true);
           jButton1.setBackground(Color.YELLOW);
           jButton5.setBackground(Color.YELLOW);
           jButton9.setBackground(Color.YELLOW);
           JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
                     
         if(b3==("X") && b5==("X") && b7==("X"))
       {           xCount++;
           GameScore();
           jButton3.setEnabled(true);
           jButton5.setEnabled(true);
           jButton7.setEnabled(true);
           jButton3.setBackground(Color.YELLOW);
           jButton5.setBackground(Color.YELLOW);
           jButton7.setBackground(Color.YELLOW);
           JOptionPane.showMessageDialog(this,"Player X Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);      
        }         
                          
         if(b1==("O") && b2==("O") && b3==("O"))
       {           oCount++;
           GameScore();
           jButton1.setEnabled(true);
           jButton2.setEnabled(true);
           jButton3.setEnabled(true);
           jButton1.setBackground(Color.CYAN);
           jButton2.setBackground(Color.CYAN);
           jButton3.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
       if(b4==("O") && b5==("O") && b6==("O"))
       { oCount++;
           GameScore();
           jButton5.setEnabled(true);
           jButton4.setEnabled(true);
           jButton6.setEnabled(true);
           jButton4.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton6.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
       
    if(b7==("O") && b8==("O") && b9==("O"))
       { oCount++;
           GameScore();
           jButton7.setEnabled(true);
           jButton8.setEnabled(true);
           jButton9.setEnabled(true);
           jButton7.setBackground(Color.CYAN);
           jButton8.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
          
       if(b1==("O") && b4==("O") && b7==("O"))
       { oCount++;
           GameScore();
           jButton1.setEnabled(true);
           jButton4.setEnabled(true);
           jButton7.setEnabled(true);           
           jButton1.setBackground(Color.CYAN);
           jButton4.setBackground(Color.CYAN);
           jButton7.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
              
        if(b2==("O") && b5==("O") && b8==("O"))
       { oCount++;
           GameScore();
           jButton8.setEnabled(true);
           jButton5.setEnabled(true);
           jButton2.setEnabled(true);
           jButton2.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton8.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }    
               
         if(b3==("O") && b6==("O") && b9==("O"))
       { oCount++;
           GameScore();
           jButton3.setEnabled(true);
           jButton6.setEnabled(true);
           jButton9.setEnabled(true);
           jButton3.setBackground(Color.CYAN);
           jButton6.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
                 
        if(b1==("O") && b5==("O") && b9==("O"))
       { oCount++;
           GameScore();
           jButton1.setEnabled(true);
           jButton5.setEnabled(true);
           jButton9.setEnabled(true);
           jButton1.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton9.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        }
                     
          if(b3==("O") && b5==("O") && b7==("O"))
       { oCount++;
           GameScore();
           jButton3.setEnabled(true);
           jButton5.setEnabled(true);
           jButton7.setEnabled(true);
           jButton3.setBackground(Color.CYAN);
           jButton5.setBackground(Color.CYAN);
           jButton7.setBackground(Color.CYAN);
           JOptionPane.showMessageDialog(this,"Player O Won","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        } 
       
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(130, 130, 174));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe");
        jLabel2.setAlignmentX(300.0F);
        jPanel1.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMaximumSize(new java.awt.Dimension(327677, 32767));
        jPanel3.setPreferredSize(new java.awt.Dimension(1194, 420));
        jPanel3.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Player X:");
        jPanel5.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel11.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm If You Want To Exit", "Tic Tac Toe",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
            
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
     
          jButton1.setText(null);
          jButton1.setEnabled(true);
          jButton2.setText(null);
          jButton2.setEnabled(true);
          jButton3.setText(null);
          jButton3.setEnabled(true);
              
          jButton4.setText(null);
          jButton4.setEnabled(true);
          jButton5.setText(null);
          jButton5.setEnabled(true);
          jButton6.setText(null);
          jButton6.setEnabled(true);
                    
          jButton7.setText(null);
          jButton7.setEnabled(true);
          jButton8.setText(null);
          jButton8.setEnabled(true);
          jButton9.setText(null);
          jButton9.setEnabled(true);
          
          jButton1.setBackground(Color.LIGHT_GRAY);
          jButton2.setBackground(Color.LIGHT_GRAY);
          jButton3.setBackground(Color.LIGHT_GRAY);
            
          jButton4.setBackground(Color.LIGHT_GRAY);
          jButton5.setBackground(Color.LIGHT_GRAY);
          jButton6.setBackground(Color.LIGHT_GRAY);
               
          jButton7.setBackground(Color.LIGHT_GRAY);
          jButton8.setBackground(Color.LIGHT_GRAY);
          jButton9.setBackground(Color.LIGHT_GRAY);
          StartGame="X";               
             
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jButton1.setText(StartGame);
       if( StartGame.equalsIgnoreCase("X"))
       {
           jButton1.setForeground(Color.GREEN);
       }        
       else{
            jButton1.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jButton2.setText(StartGame);
       if( StartGame.equalsIgnoreCase("X"))
       {
           jButton2.setForeground(Color.GREEN);
       }        
       else{
            jButton2.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton3.setForeground(Color.GREEN);
       }        
       else
       {
            jButton3.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       jButton4.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton4.setForeground(Color.GREEN);
       }        
       else{
            jButton4.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       jButton5.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton5.setForeground(Color.GREEN);
       }        
       else{
            jButton5.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton6.setForeground(Color.GREEN);
       }        
       else{
            jButton6.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       jButton7.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton7.setForeground(Color.GREEN);
       }        
       else{
            jButton7.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       jButton8.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton8.setForeground(Color.GREEN);
       }        
       else{
            jButton8.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       jButton9.setText(StartGame);
       if(  StartGame.equalsIgnoreCase("X"))
       {
           jButton9.setForeground(Color.GREEN);
       }        
       else{
            jButton9.setForeground(Color.RED);
       }
        choose_a_Player();
        winningGame();
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration//GEN-END:variables
}
