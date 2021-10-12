/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Development
 */
public class Interfaz extends javax.swing.JFrame {

    int contRagalos = 1;
    int contQuejas = 1;
    int contAbonos = 1;
    int contCreditos = 1;

    Stack regalos = new Stack();

    Queue<Integer> quejas = new LinkedList<>();
    Queue<Integer> abonos = new LinkedList<>();
    Queue<Integer> creditos = new LinkedList<>();

    public Interfaz() {
        initComponents();
    }

    //ENTREGA DE TICKETS EN CADA FUNCION UTILIZANDO METODOS//
    public void regalo() {

        regalos.push(contRagalos);

        JOptionPane.showMessageDialog(null, " Ticket R- "
                + regalos.peek() + " entregado.");

        contRagalos = contRagalos + 1;
    }

    public void quejas() {

        quejas.offer(contQuejas);

        JOptionPane.showMessageDialog(null, " Ticket Q- "
                + contQuejas + " entregado.");

        contQuejas = contQuejas + 1;
    }

    public void abono() {

        abonos.offer(contAbonos);

        JOptionPane.showMessageDialog(null, " Ticket A- "
                + contAbonos + "entregado.");

        contAbonos = contAbonos + 1;
    }

    public void credito() {

        creditos.offer(contCreditos);

        JOptionPane.showMessageDialog(null, "Ticket C-"
                + contCreditos + "entregado.");

        contCreditos = contCreditos + 1;
    }
    public void Consultaregalos(){
        
          if(regalos.isEmpty() == true){
           JOptionPane.showMessageDialog(null,"Aun no se han retirado tickets.");
        
        }else if(regalos.size() == 1){
            JOptionPane.showMessageDialog(
                    null,"Ticket R-" + regalos.get(0) + " ya fue atendido.");
            
            regalos.pop();
            
            JOptionPane.showMessageDialog(
                    null,"Todos los tickets fueron atendidos.");
            
            lRegalos.setText(" aun no hay consultas");
        }else{
            JOptionPane.showMessageDialog(
                    
                    null,"Ticket R-" + regalos.remove(0) +
                            " Ya fue atendido, el siguiente ticket en atender es R-" +
                            regalos.get(0) + ".");
            lRegalos.setText(" R-" + regalos.get(0));
        }  
      }
    
    public void Consultarquejas(){
      if(quejas.isEmpty() == true){
            JOptionPane.showMessageDialog( null,"Aun no se han retirado tickets.");
            
        }else if(quejas.size() == 1){
            JOptionPane.showMessageDialog(
                    null,"Ticket Q-" + quejas.element() +" ya fue atendido.");
            quejas.poll();
            JOptionPane.showMessageDialog(
                    null,"Todos los tickets fueron atendidos.");
            lQuejas.setText(" aun no hay consultas");
        }else{
            JOptionPane.showMessageDialog(
                    null,"Ticket Q- " + quejas.poll() +
                           " Ya fue atendido, el siguiente ticket en atender es Q-" + quejas.element() + ".");
            lQuejas.setText("  Q-"+ quejas.element());
        }
    }
    public void Consultarabono(){
      if(abonos.isEmpty() == true){
            JOptionPane.showMessageDialog( null,"Aun no se han retirado tickets.");
            
        }else if(abonos.size() == 1){
            JOptionPane.showMessageDialog(
                    null,"Ticket A-" + abonos.element() + " ya fue atendido.");
            abonos.poll();
            JOptionPane.showMessageDialog(
                    null,"Todos los tickets fueron atendidos.");
            lAbonos.setText(" aun no hay consultas");
        }else{
            JOptionPane.showMessageDialog(
                    null,"Ticket Q-" + abonos.poll() + 
                            " Ya fue atendido, el siguiente ticket en atender es A-" + abonos.element() + ".");
            lAbonos.setText("  A-"+ abonos.element());
        }
    }
    public void Consultarcredito(){
    if(creditos.isEmpty() == true){
            JOptionPane.showMessageDialog( null,"Aun no se han retirado tickets.");
            
        }else if(creditos.size() == 1){
            JOptionPane.showMessageDialog(
                    null,"Ticket C-" + creditos.element() + " ya fue atendido.");
            creditos.poll();
            JOptionPane.showMessageDialog(
                    null,"Todos los tickets fueron atendidos.");
            lCreditos.setText(" aun no hay consultas");
        }else{
            JOptionPane.showMessageDialog(
                    null,"Ticket C-" + creditos.poll() +
                            " Ya fue atendido, el siguiente ticket en atender es C-" + creditos.element() + ".");
            lCreditos.setText("  C-"+ creditos.element());
        }}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegalo = new javax.swing.JButton();
        btnQuejas = new javax.swing.JButton();
        btnAbono = new javax.swing.JButton();
        btnCredito = new javax.swing.JButton();
        btn2Regalos = new javax.swing.JButton();
        btn2Queja = new javax.swing.JButton();
        btn2Abono = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lRegalos = new javax.swing.JLabel();
        lQuejas = new javax.swing.JLabel();
        lAbonos = new javax.swing.JLabel();
        lCreditos = new javax.swing.JLabel();
        btn2Credito = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegalo.setText("Regalos");
        btnRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegaloActionPerformed(evt);
            }
        });

        btnQuejas.setText("Quejas");
        btnQuejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuejasActionPerformed(evt);
            }
        });

        btnAbono.setText("Abono ");
        btnAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbonoActionPerformed(evt);
            }
        });

        btnCredito.setText("Credito");
        btnCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditoActionPerformed(evt);
            }
        });

        btn2Regalos.setText("Regalos");
        btn2Regalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2RegalosActionPerformed(evt);
            }
        });

        btn2Queja.setText("Quejas");
        btn2Queja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2QuejaActionPerformed(evt);
            }
        });

        btn2Abono.setText("Abono");
        btn2Abono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2AbonoActionPerformed(evt);
            }
        });

        jLabel1.setText("Siguiente ticket");

        jLabel2.setText("Siguiente Ticket ");

        jLabel3.setText("Siguiente ticket");

        jLabel4.setText("Siguiente ticket");

        lRegalos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lRegalos.setText("Tomar ticket Regalos");

        lQuejas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lQuejas.setText("Tomar ticket Quejas");

        lAbonos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lAbonos.setText("Tomar Ticket Abono");

        lCreditos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lCreditos.setText("Tomar ticket  Credito");

        btn2Credito.setText("Credito");

        jLabel5.setText("RETIRAR TICKET");

        jLabel6.setText("REGISTRO DE CONSULTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lRegalos)
                                    .addComponent(lAbonos)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lQuejas)
                                            .addComponent(lCreditos)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn2Abono)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnRegalo)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn2Regalos)
                                    .addComponent(btnAbono))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCredito)
                                .addComponent(btnQuejas)
                                .addComponent(btn2Queja))
                            .addComponent(btn2Credito, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegalo)
                    .addComponent(btnQuejas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbono)
                    .addComponent(btnCredito))
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2Regalos)
                    .addComponent(btn2Queja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2Abono)
                    .addComponent(btn2Credito))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lQuejas)
                    .addComponent(lRegalos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lAbonos))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegaloActionPerformed
        regalo();
    }//GEN-LAST:event_btnRegaloActionPerformed

    private void btnQuejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuejasActionPerformed
        quejas();
    }//GEN-LAST:event_btnQuejasActionPerformed

    private void btnAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbonoActionPerformed
        abono();
    }//GEN-LAST:event_btnAbonoActionPerformed

    private void btnCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditoActionPerformed
        credito();
    }//GEN-LAST:event_btnCreditoActionPerformed

    private void btn2RegalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2RegalosActionPerformed
        Consultaregalos();   // TODO add your handling code here:
    }//GEN-LAST:event_btn2RegalosActionPerformed

    private void btn2QuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2QuejaActionPerformed
       Consultarquejas();
    }//GEN-LAST:event_btn2QuejaActionPerformed

    private void btn2AbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2AbonoActionPerformed
       Consultarabono();
    }//GEN-LAST:event_btn2AbonoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2Abono;
    private javax.swing.JButton btn2Credito;
    private javax.swing.JButton btn2Queja;
    private javax.swing.JButton btn2Regalos;
    private javax.swing.JButton btnAbono;
    private javax.swing.JButton btnCredito;
    private javax.swing.JButton btnQuejas;
    private javax.swing.JButton btnRegalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAbonos;
    private javax.swing.JLabel lCreditos;
    private javax.swing.JLabel lQuejas;
    private javax.swing.JLabel lRegalos;
    // End of variables declaration//GEN-END:variables
}
