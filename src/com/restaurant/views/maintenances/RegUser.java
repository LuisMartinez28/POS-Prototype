/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.views.maintenances;

import com.restaurant.classes.Employe;
import com.restaurant.classes.User;
import com.restaurant.combo.ItemRenderEmploye;
import static com.restaurant.utilities.Hash.getMD5;
import java.awt.Frame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class RegUser extends javax.swing.JDialog {
    User user;
    Employe emp;
    public RegUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.emp = new Employe();
        this.user = new User();
        this.emp.readFile();
        this.user.readFile();
        
        initComponents();
        setComboEmploye();
        
    }
    
    
    public void clear(){
        this.txt_Email.setText("");
        this.txt_Password.setText("");
        this.txt_UserName.setText("");
        this.setComboEmploye();
    }

    
/**
     * Creates new form RegUser
     */
    private void setComboEmploye(){
        DefaultComboBoxModel value;
            
        value =new DefaultComboBoxModel();
        cbx_Employees.setModel(value);
         
     
        
        for (int i = 0; i < this.emp.getEmployees().size(); i++) {
                Employe str = this.emp.getEmployees().get(i);
                
                if (str.getAvailable() == 0)
                    value.addElement(new Employe(str.getIdEmploye(), str.getName()));
                    
               
        }
        
        
     
        
     
        
         
        if (this.emp.getEmployees().size()>0) {
          
            if (value.getSize() == 0) {
                
                 value.addElement( new Employe(0,  "Empty") );    
            }
            
            
        }
        cbx_Employees.setRenderer(new ItemRenderEmploye());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        btn_addUser = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        Datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        cbx_LevelAcccess = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbx_Employees = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Registrar Usuario");
        Header.add(jLabel1);

        bottom.setLayout(new java.awt.GridLayout(1, 0));

        btn_addUser.setText("Registrar");
        btn_addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addUserActionPerformed(evt);
            }
        });
        bottom.add(btn_addUser);

        btn_exit.setText("Cancelar");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        bottom.add(btn_exit);

        Datos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Datos.setEnabled(false);

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        cbx_LevelAcccess.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"0", "1"}));
        cbx_LevelAcccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_LevelAcccessActionPerformed(evt);
            }
        });

        jLabel4.setText("Acceso");

        cbx_Employees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Employees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_EmployeesActionPerformed(evt);
            }
        });

        jLabel6.setText("Email");

        jLabel7.setText("Empleado");

        jButton1.setText("Agregar Empleado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DatosLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(24, 24, 24)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txt_UserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbx_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DatosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addComponent(cbx_LevelAcccess, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(26, 26, 26))))
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatosLayout.createSequentialGroup()
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatosLayout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DatosLayout.createSequentialGroup()
                        .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_LevelAcccess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addUserActionPerformed
     
        if (this.txt_UserName.getText().isEmpty() || this.txt_Password.getText().isEmpty() ||  0 == ((Employe) this.cbx_Employees.getSelectedItem()).getIdEmploye()) {
            JOptionPane.showMessageDialog(this, "Campos en Blanco", "Mensaje", JOptionPane.ERROR_MESSAGE);
            
          return;
        }
      
        int newId =  this.user.getUsers().get(this.user.getUsers().size() - 1).getIdUser() + 1;
        int IdEmploye =((Employe) this.cbx_Employees.getSelectedItem()).getIdEmploye();
        this.user.getUsers().add(new User(newId, this.txt_UserName.getText(), getMD5(this.txt_Password.getText()), this.txt_Email.getText(), Integer.parseInt(this.cbx_LevelAcccess.getSelectedItem().toString()),IdEmploye ));
    
        
        for (int i = 0; i < this.emp.getEmployees().size(); i++) {
            if ( this.emp.getEmployees().get(i).getIdEmploye() == IdEmploye ) {
                  this.emp.getEmployees().get(i).setAvailable(1);
            }
          
            
        }
        this.user.writeFile();
        this.emp.writeFile();
        clear();
    }//GEN-LAST:event_btn_addUserActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void cbx_LevelAcccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_LevelAcccessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_LevelAcccessActionPerformed

    private void cbx_EmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_EmployeesActionPerformed

        System.out.println(((Employe) this.cbx_Employees.getSelectedItem()).getIdEmploye());
         System.out.println(((Employe) this.cbx_Employees.getSelectedItem()).getName());
    }//GEN-LAST:event_cbx_EmployeesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegEmploye addEmploye = new RegEmploye(new Frame(), true);

        addEmploye.setLocationRelativeTo(null);
        addEmploye.setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Datos;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel bottom;
    private javax.swing.JButton btn_addUser;
    private javax.swing.JButton btn_exit;
    private javax.swing.JComboBox<String> cbx_Employees;
    private javax.swing.JComboBox<String> cbx_LevelAcccess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables
}