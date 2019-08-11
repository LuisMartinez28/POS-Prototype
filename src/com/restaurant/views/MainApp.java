/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restaurant.views;

import com.restaurant.views.maintenances.MainComments;
import com.restaurant.views.maintenances.MainEmployees;
import com.restaurant.views.maintenances.MainUsers;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class MainApp extends javax.swing.JFrame {

    /**
     * Creates new form MainApp
     */
    private MainUsers regUser;
    private MainEmployees regEmployees;
    private MainComments regComments;
    public MainApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        maintenances = new javax.swing.JMenu();
        maintanceUsers = new javax.swing.JMenuItem();
        maintanceComments = new javax.swing.JMenuItem();
        maintanceTable = new javax.swing.JMenuItem();
        maintanceCustomers = new javax.swing.JMenuItem();
        maintanceEmployees = new javax.swing.JMenuItem();
        maintanceKindsOfProducts = new javax.swing.JMenuItem();
        maintanceProducts = new javax.swing.JMenuItem();
        movements = new javax.swing.JMenu();
        movementOrders = new javax.swing.JMenuItem();
        movementProducts = new javax.swing.JMenuItem();
        processes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        maintenances.setText("Mantenimientos");

        maintanceUsers.setText("De Usuarios ");
        maintanceUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintanceUsersActionPerformed(evt);
            }
        });
        maintenances.add(maintanceUsers);

        maintanceComments.setText("De Comentarios");
        maintanceComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintanceCommentsActionPerformed(evt);
            }
        });
        maintenances.add(maintanceComments);

        maintanceTable.setText("De Mesa");
        maintenances.add(maintanceTable);

        maintanceCustomers.setText("De Clientes");
        maintenances.add(maintanceCustomers);

        maintanceEmployees.setText("De Empleados");
        maintanceEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintanceEmployeesActionPerformed(evt);
            }
        });
        maintenances.add(maintanceEmployees);

        maintanceKindsOfProducts.setText("De Tipo de Productos");
        maintenances.add(maintanceKindsOfProducts);

        maintanceProducts.setText("De Productos");
        maintenances.add(maintanceProducts);

        jMenuBar1.add(maintenances);

        movements.setText("Movimientos");

        movementOrders.setText("De Pedidios");
        movements.add(movementOrders);

        movementProducts.setText("Entrada-Salida Productos");
        movements.add(movementProducts);

        jMenuBar1.add(movements);

        processes.setText("Procesos");

        jMenuItem1.setText("Cobro Pedido");
        processes.add(jMenuItem1);

        jMenuItem2.setText("Cancelar Reservas");
        processes.add(jMenuItem2);

        jMenuItem3.setText("Actualiza Entrada-Salida Productos");
        processes.add(jMenuItem3);

        jMenuItem4.setText("Distribucion Propinas");
        processes.add(jMenuItem4);

        jMenuBar1.add(processes);

        jMenu4.setText("Consultas");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        DesktopPane.getAccessibleContext().setAccessibleName("");
        DesktopPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maintanceUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintanceUsersActionPerformed
        regUser = new MainUsers();
        this.DesktopPane.add(regUser);
        regUser.show();
        
        
    }//GEN-LAST:event_maintanceUsersActionPerformed

    private void maintanceEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintanceEmployeesActionPerformed
        regEmployees = new MainEmployees();
     
        
        this.DesktopPane.add(regEmployees);
        regEmployees.show();
        
    }//GEN-LAST:event_maintanceEmployeesActionPerformed

    private void maintanceCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintanceCommentsActionPerformed
       regComments = new MainComments();
     
        
        this.DesktopPane.add(regComments);
        regComments.show();
    }//GEN-LAST:event_maintanceCommentsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem maintanceComments;
    private javax.swing.JMenuItem maintanceCustomers;
    private javax.swing.JMenuItem maintanceEmployees;
    private javax.swing.JMenuItem maintanceKindsOfProducts;
    private javax.swing.JMenuItem maintanceProducts;
    private javax.swing.JMenuItem maintanceTable;
    private javax.swing.JMenuItem maintanceUsers;
    private javax.swing.JMenu maintenances;
    private javax.swing.JMenuItem movementOrders;
    private javax.swing.JMenuItem movementProducts;
    private javax.swing.JMenu movements;
    private javax.swing.JMenu processes;
    // End of variables declaration//GEN-END:variables
}
