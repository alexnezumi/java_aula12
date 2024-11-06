/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laboratorio-Info
 */
public class Splash_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Splash_GUI
     */
    public Splash_GUI() {
        initComponents();
        
    //inicio codigo
         new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<=100; i++){
                    try {
                        sleep(60); 
                        
                        Barra.setValue(i);
                        
                        if(Barra.getValue() == 10){
                        
                            Mensagem.setText("Fazendo a conexao com o banco de dados");

                            sleep(2000);
                                                       
                        
                        }else if (Barra.getValue() <=30){
                            Mensagem.setText("Carregando o sistema");
                          sleep(100);  
                        } else if (Barra.getValue() <=99){
                            Mensagem.setText("Carregamento quase completo");
                            
                        }else{
                            Mensagem.setText("Carregamento completo. Seu programa sera iniciado.");
                        
                        sleep(3000);
                        
                        new Login_GUI().setVisible(true);
                        dispose();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
 			
	}        
        }
        
        }.start();
        
    }
  

 
    
    
    
  //termino codigo 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Mensagem = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);
        jPanel1.add(Mensagem);
        Mensagem.setBounds(20, 200, 360, 40);

        Barra.setForeground(new java.awt.Color(102, 51, 255));
        Barra.setStringPainted(true);
        jPanel1.add(Barra);
        Barra.setBounds(66, 174, 270, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar Barra;
    public static javax.swing.JLabel Mensagem;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
