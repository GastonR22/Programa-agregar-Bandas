package bandas5;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public Interfaz() {
        initComponents();
        this.setResizable(false);
        modelo = (DefaultTableModel) mostrarTabla.getModel();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());

        //Hacemos nuestro Jtable transparente
        mostrarTabla.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) mostrarTabla.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        mostrarTabla.setGridColor(Color.WHITE);
        mostrarTabla.setForeground(Color.WHITE);
        mostrarTabla.setOpaque(false);

        jScrollPane2.setBackground(new Color(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);

        ((DefaultTableCellRenderer) mostrarTabla.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane2.getViewport().setOpaque(false);
        //Fin jTable transparente

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnBandaAzar = new javax.swing.JButton();
        mostrarBandaAzar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingresoBanda = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVerBd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ingresoID = new javax.swing.JTextField();
        btnEliminarRegistro = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnBandaAzar.setText("Buscar Banda al azar");
        btnBandaAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandaAzarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBandaAzar);
        btnBandaAzar.setBounds(810, 380, 205, 23);

        mostrarBandaAzar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        mostrarBandaAzar.setForeground(new java.awt.Color(255, 255, 255));
        mostrarBandaAzar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(mostrarBandaAzar);
        mostrarBandaAzar.setBounds(760, 320, 310, 30);

        jLabel1.setFont(new java.awt.Font("Gabriola", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registros musicales");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(520, 10, 214, 62);

        jLabel2.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese el nombre de la banda ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(800, 70, 230, 41);

        ingresoBanda.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ingresoBanda.setForeground(new java.awt.Color(255, 255, 255));
        ingresoBanda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ingresoBanda.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ingresoBanda.setOpaque(false);
        ingresoBanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoBandaActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoBanda);
        ingresoBanda.setBounds(760, 120, 310, 30);

        btnAgregar.setText("Agregar banda a la DB");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(810, 180, 205, 23);

        jLabel3.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Base de datos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 80, 100, 20);

        btnVerBd.setText("Ver base de datos completa");
        btnVerBd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerBdActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerBd);
        btnVerBd.setBounds(160, 620, 205, 45);

        mostrarTabla.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        mostrarTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE BANDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mostrarTabla.setOpaque(false);
        mostrarTabla.setRowHeight(22);
        mostrarTabla.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane2.setViewportView(mostrarTabla);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(40, 120, 452, 452);

        jLabel4.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Banda al azar");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(860, 280, 110, 20);

        jLabel5.setFont(new java.awt.Font("Gabriola", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eliminar Banda por ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(820, 470, 200, 30);

        ingresoID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ingresoID.setForeground(new java.awt.Color(255, 255, 255));
        ingresoID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ingresoID.setOpaque(false);
        ingresoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoIDActionPerformed(evt);
            }
        });
        jPanel1.add(ingresoID);
        ingresoID.setBounds(760, 510, 310, 30);

        btnEliminarRegistro.setText("Eliminar Banda");
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarRegistro);
        btnEliminarRegistro.setBounds(810, 570, 210, 23);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vinyl_record.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo);
        jLabelFondo.setBounds(0, -10, 1200, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBandaAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandaAzarActionPerformed
        //Boton para mostrar una banda al azar

        
        BaseDatos obj1 = new BaseDatos();
        //Ejecutamos el metodo BandaAzr
        try {
            obj1.bandaAzar();

        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Mostramos el resultado en el jLabel
        mostrarBandaAzar.setText(obj1.getBandaAzar());
         
    }//GEN-LAST:event_btnBandaAzarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Boton para agregar una banda a la base de datos

        //Comprobamos que a la hora de apretar el boton Agregar Banda el campo no este vacio
        if (ingresoBanda.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo no puede ir vacio, por favor ingreselo nuevamente");
        } else {

            try {
                BaseDatos objeto2 = new BaseDatos();
                boolean aux = true;
                boolean aux2 = true;
                //Guardamos el ingreso del jTextField en la variable auxBtnIngreso y se lo asignamos a metodo setBanda
                String auxBtnIngreso = ingresoBanda.getText().toLowerCase();
                objeto2.setBanda(auxBtnIngreso);

                Connection conexion = null;
                //Hacemos la conexion a la base para poder ingresar el nuevo registro
                try {

                    conexion = DriverManager.getConnection("jdbc:sqlite:bandasPrueba.db");

                    if (conexion != null) {

                        JOptionPane.showMessageDialog(null, "Conexion a la base de datos exitosa");

                    }

                } catch (SQLException ex) {
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Error en la conexion a la base de datos");

                }

                Statement s = conexion.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM bandas_tabla");
                //Comprobamos que el string ingresado no se encuentre ya en la base de datos
                while (rs.next()) {

                    String nombreBanda = rs.getString("nombreBanda");

                    if (objeto2.getBanda().equals(nombreBanda)) {

                        JOptionPane.showMessageDialog(null, "La banda ingresada se encuentra en la base de datos , por favor ingresela nuevamente");
                        //Si la banda ya esta ingresada cambiamos la variable booleana aux a falso
                        aux = false;
                    }

                }
                /*Si la variable booleana es falsa quiere decir que la banda ingresada ya se encuentra en la base de datos, el programa no hara nada en este caso
                  en cambio si su valor no ha cambiado hara la actualizacion en la base de datos insertando el nuevo registro  */
                if (aux == false) {

                } else {

                    s.executeUpdate("INSERT INTO bandas_tabla (idBanda, nombreBanda) VALUES (NUll ,'" + objeto2.getBanda() + "')");

                    JOptionPane.showMessageDialog(null, "BANDA INGRESADA A LA BASE DE DATOS DE FORMA EXITOSA");
                    btnVerBd.doClick();

                }
                //Limpiamos el campo de ingreso
                ingresoBanda.setText(null);
                //Cerramos la conexion a la base de datos
                conexion.close();

            } catch (SQLException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnVerBdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerBdActionPerformed
        //Boton para ver la base de datos en nuestro jTable

        BaseDatos objeto1 = new BaseDatos();
        //Guardamos en nuestra variable la cantidad de filas que tiene la tabla
        int fila = modelo.getRowCount();
        /*La siguiente porcion de codigo se fija que las filas no contengan ningun dato, en caso de que los haya 
        se empezaran a remover desde el ultimo registro al primero*/
        if (fila != 0) {
            for (int i = fila - 1; i >= 0; i--) {

                modelo.removeRow(i);
            }
            //Ahora que nos aseguramos que nuestro jTable este limpio llamamos al metodo para llenar los arreglos con el contenido de nuestra base de datos
            objeto1.verBaseDatos();
            //A traves del for añadimos los arreglos ArrayInt y ArrayString a las filas de nuestro jTable
            for (int i = 0; i < objeto1.getAuxArray(); i++) {

                modelo.addRow(new Object[]{objeto1.getArrayInt()[i], objeto1.getArrayString()[i]});

            }

        } else {
            /*En caso de que recien hayamos iniciado el programa no se borrara ningun dato por lo que 
            directamente pasamos a agregar desde nuestros arreglos las filas del jTable*/
            objeto1.verBaseDatos();
            //Compruebo que la base de datos no este vacia, en caso de ser asi pide un ingreso
            if (objeto1.getArrayInt().length == 0 && objeto1.getArrayString().length == 0) {

                JOptionPane.showMessageDialog(null, "No hay ningun elemento en la base de datos, por favor ingrese alguna banda");
            } else {

                for (int i = 0; i < objeto1.getAuxArray(); i++) {

                    modelo.addRow(new Object[]{objeto1.getArrayInt()[i], objeto1.getArrayString()[i]});
                }
            }
        }

    }//GEN-LAST:event_btnVerBdActionPerformed

    private void ingresoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresoIDActionPerformed

    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed

        BaseDatos base = new BaseDatos();

        if (ingresoID.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "El campo no puede ir vacio por favor intentelo nuevamente");

        } else {
            // 0= SI, 1= NO, 2= CANCEL
            int confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro que deseas eliminar el registro?");
            int idIngresado = Integer.parseInt(ingresoID.getText());
            boolean aux = true;
 
            if (confirmacion == 1 || confirmacion == 2) {
                ingresoID.setText("");
            } else {
                base.verBaseDatos();
                for (int i : base.getArrayInt()) {

                    if (idIngresado == i) {

                            try {
                                base.eliminarRegistro(idIngresado);
                                ingresoID.setText("");
                                JOptionPane.showMessageDialog(null, "El registro fue eliminado correctamente");
                                btnVerBd.doClick();
                                aux = false;
                            } catch (SQLException ex) {
                                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                            }

                    }

                }
                if (aux == true) {
                    JOptionPane.showMessageDialog(null, "El ID ingresado no existe en la base de datos");
                    ingresoID.setText("");
                }

            }




        }


    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void ingresoBandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoBandaActionPerformed

    }//GEN-LAST:event_ingresoBandaActionPerformed

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBandaAzar;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnVerBd;
    private javax.swing.JTextField ingresoBanda;
    private javax.swing.JTextField ingresoID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mostrarBandaAzar;
    private javax.swing.JTable mostrarTabla;
    // End of variables declaration//GEN-END:variables

}
