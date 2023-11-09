/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class EliminarContacto extends javax.swing.JFrame {

    /**
     * Creates new form EliminarContacto
     */
    public EliminarContacto() {
        initComponents();
        actualizarListaContactos();
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoUltimo = new javax.swing.JPanel();
        panelFondoTitulo = new javax.swing.JPanel();
        labTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboContactos = new javax.swing.JComboBox<>();
        btBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondoUltimo.setBackground(new java.awt.Color(204, 255, 204));

        panelFondoTitulo.setBackground(new java.awt.Color(255, 255, 255));

        labTitulo.setBackground(new java.awt.Color(0, 51, 0));
        labTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labTitulo.setText("Borrar Contacto");

        javax.swing.GroupLayout panelFondoTituloLayout = new javax.swing.GroupLayout(panelFondoTitulo);
        panelFondoTitulo.setLayout(panelFondoTituloLayout);
        panelFondoTituloLayout.setHorizontalGroup(
            panelFondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoTituloLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(labTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFondoTituloLayout.setVerticalGroup(
            panelFondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jComboContactos.setBackground(new java.awt.Color(204, 204, 204));
        jComboContactos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jComboContactos.setForeground(new java.awt.Color(0, 0, 0));
        jComboContactos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btBorrar.setBackground(new java.awt.Color(204, 204, 204));
        btBorrar.setForeground(new java.awt.Color(0, 204, 204));
        btBorrar.setText("Borrar");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jComboContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btBorrar)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jComboContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btBorrar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout panelFondoUltimoLayout = new javax.swing.GroupLayout(panelFondoUltimo);
        panelFondoUltimo.setLayout(panelFondoUltimoLayout);
        panelFondoUltimoLayout.setHorizontalGroup(
            panelFondoUltimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoUltimoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelFondoUltimoLayout.setVerticalGroup(
            panelFondoUltimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoUltimoLayout.createSequentialGroup()
                .addComponent(panelFondoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private List<String> obtenerListaContactos() {
    List<String> contactos = new ArrayList<>();
    String sql = "SELECT nombre FROM contactos";

    try (Connection connection = ConnectionDB.getConnectionBD();
         PreparedStatement statement = connection.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            contactos.add(nombre);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al obtener la lista de contactos: " + e.getMessage());
    }

    return contactos;
}
    
    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        String nombreContactoSeleccionado = (String) jComboContactos.getSelectedItem();

    if (nombreContactoSeleccionado != null) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este contacto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Consulta SQL para eliminar el contacto
            String sql = "DELETE FROM contactos WHERE nombre = ?";

            try (Connection connection = ConnectionDB.getConnectionBD();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nombreContactoSeleccionado);

                int filasAfectadas = statement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Contacto eliminado con éxito.");
                    // Actualiza el JComboBox con la lista actualizada 
                    actualizarListaContactos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró ningún contacto para eliminar.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el contacto: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_btBorrarActionPerformed
    
    private void actualizarListaContactos() {
    jComboContactos.removeAllItems(); // Borra todos los elementos del JComboBox

    // Vuelve a llenar el JComboBox con la lista actualizada de contactos
    List<String> contactos = obtenerListaContactos();
    for (String contacto : contactos) {
        jComboContactos.addItem(contacto);
    }
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JComboBox<String> jComboContactos;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labTitulo;
    private javax.swing.JPanel panelFondoTitulo;
    private javax.swing.JPanel panelFondoUltimo;
    // End of variables declaration//GEN-END:variables
}
