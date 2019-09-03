/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointe;

import javax.swing.JOptionPane;

/**
 *
 * @author nico
 */
public class JFrameTiket extends javax.swing.JFrame {
    private Hamburguesa a;
    private int total;
    /**
     * Creates new form JFrameTiket
     */
    public JFrameTiket(Hamburguesa a,int total) {
        initComponents();
        setVisible(true);
        setResizable(false);
        this.total=total;
        this.a=a;
        factura.setText("");
        
        if(a.getNombre().equals("Durr Pollo")){
            ticketPollo();
        }
        if(a.getNombre().equals("Durr Simple")){
            ticketSimple();
        }
        if (a.getNombre().equals("Durr Triple")){
        ticketTriple();
        
    }
        
        
        
    }
    private void ticketTriple(){
        
        String texto = factura.getText();
        JFrameTiket.factura.setText(texto+'\n'+"Hamburguesa: "+a.getNombre()+"     Precio:$250");
        if(JFrameTriple.mediana.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Mediano" + "     Precio:+$10");
        }
        if(JFrameTriple.grande.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Grande     Precio:+$20");
        }
        if(JFrameTriple.Bacon.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Bacon      Precio:+$5");
        }
        if(JFrameTriple.Queso.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Queso      Precio:+$5");
        }
        if(JFrameTriple.Lechu.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Lechuga     Precio:+$5");
        }
           if(JFrameTriple.Pepi.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Pepino     Precio:+$5");
        }
             if(JFrameTriple.Cebo.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Cebolla     Precio:+$5");
        }
        texto=factura.getText();   
        factura.setText(texto+'\n'+"Total: $"+total);
        
    }
    
        private void ticketSimple(){
        
        String texto = factura.getText();
        JFrameTiket.factura.setText(texto+'\n'+"Hamburguesa: "+a.getNombre()+"     Precio:$220");
        if(JFrameSipmle.mediana.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Mediano" + "     Precio:+$10");
        }
        if(JFrameSipmle.grande.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Grande     Precio:+$20");
        }
        if(JFrameSipmle.Bacon.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Bacon      Precio:+$5");
        }
        if(JFrameSipmle.Queso.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Queso      Precio:+$5");
        }
        if(JFrameSipmle.Lechu.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Lechuga     Precio:+$5");
        }
           if(JFrameSipmle.Pepi.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Pepino     Precio:+$5");
        }
             if(JFrameSipmle.Cebo.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Cebolla     Precio:+$5");
        }
        texto=factura.getText();   
        factura.setText(texto+'\n'+"Total: $"+total);
        
        
    
        
    }
    private void ticketPollo(){
        
        String texto = factura.getText();
        JFrameTiket.factura.setText(texto+'\n'+"Hamburguesa: "+a.getNombre()+"     Precio:$200");
        if(JFramePollo.mediana.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Mediano" + "     Precio:+$10");
        }
        if(JFramePollo.grande.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Tamaño: Grande     Precio:+$20");
        }
        if(JFramePollo.Bacon.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Bacon      Precio:+$5");
        }
        if(JFramePollo.Queso.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Queso      Precio:+$5");
        }
        if(JFramePollo.Lechu.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Lechuga     Precio:+$5");
        }
           if(JFramePollo.Pepi.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Pepino     Precio:+$5");
        }
             if(JFramePollo.Cebo.isSelected()){
            texto=factura.getText();
            factura.setText(texto+'\n'+"Extras: Cebolla     Precio:+$5");
        }
        texto=factura.getText();   
        factura.setText(texto+'\n'+"Total: $"+total);
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        factura = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ticket de Compra");

        factura.setEditable(false);
        factura.setBackground(new java.awt.Color(255, 0, 0));
        factura.setColumns(20);
        factura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        factura.setRows(5);
        factura.setText("                                 Durr Burguer");
        jScrollPane1.setViewportView(factura);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   JOptionPane.showConfirmDialog(rootPane, "Muchas gracias por su compra, te esperamos pronto", "Felicidades!",2);
        JFrame2 n=new JFrame2();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JFrameTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea factura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
