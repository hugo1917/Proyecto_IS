package InterfazVisual;
import javax.swing.table.DefaultTableModel;

public class ConsolaCalculo extends javax.swing.JFrame {

    public ConsolaCalculo() {
        initComponents();
        DefaultTableModel modeloReq = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel modeloRes = (DefaultTableModel) jTable2.getModel();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        IPbase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Dirección IP base:");

        jLabel2.setText("Máscara CIDR:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/8 (Máscara 255.0.0.0)", "/9", "/10", "/11", "/12", "/13", "/14", "/15", "/16 (Máscara 255.255.0.0)", "/17", "/18", "/19", "/20", "/21", "/22", "/23", "/24 (Máscara 255.255.255.0)", "/25", "/26", "/27", "/28", "/29", "/30 (Usado para enlaces punto a punto)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre SubRed", "Hosts Necesarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Subred", "ID Red", "Rango Utilizable", "Broadcast", "Nueva Mascara"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        IPbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IPbaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        jLabel3.setText("Consola de Calculo");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 395, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(372, 372, 372))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IPbase, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(408, 408, 408))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IPbase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private java.util.List<Object[]> obtenerSubredesOrdenadas() {
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    java.util.List<Object[]> lista = new java.util.ArrayList<>();
    
    if (jTable1.isEditing()) {
        jTable1.getCellEditor().stopCellEditing();
    }

    for (int i = 0; i < modelo.getRowCount(); i++) {
        try {
            Object valorNombre = modelo.getValueAt(i, 0);
            Object valorHosts = modelo.getValueAt(i, 1);

            if (valorNombre != null && valorHosts != null && !valorHosts.toString().trim().isEmpty()) {
                String nombre = valorNombre.toString();
                int hosts = Integer.parseInt(valorHosts.toString().trim());
                
                if (hosts > 0) {
                    lista.add(new Object[]{nombre, hosts});
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Fila " + i + " ignorada por formato incorrecto");
        }
    }
    
    lista.sort((a, b) -> (Integer) b[1] - (Integer) a[1]);
    return lista;
}
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
     try {
        String ipBase = IPbase.getText();
        java.util.List<Object[]> subredes = obtenerSubredesOrdenadas();
        DefaultTableModel modeloRes = (DefaultTableModel) jTable2.getModel();
        modeloRes.setRowCount(0);

        long ipActual = ipAEntero(ipBase);

        for (Object[] sub : subredes) {
            String nombre = (String) sub[0];
            int hostsNecesarios = (int) sub[1];

            int bitsHost = (int) Math.ceil(Math.log(hostsNecesarios + 2) / Math.log(2));
            int nuevaMascara = 32 - bitsHost;
            long salto = (long) Math.pow(2, bitsHost);

            String idRed = enteroAIP(ipActual);
            String rangoI = enteroAIP(ipActual + 1);
            String rangoF = enteroAIP(ipActual + salto - 2);
            String broadcast = enteroAIP(ipActual + salto - 1);

            // Agregar a la tabla de resultados (Capa de Datos para RF-17/19)
            modeloRes.addRow(new Object[]{
                nombre, idRed, rangoI + " - " + rangoF, broadcast, "/" + nuevaMascara
            });

            // Preparar la IP para la siguiente subred
            ipActual += salto;
        }
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error: Verifica que los hosts sean números.");
    }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void IPbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IPbaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IPbaseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new PanelOpcionesIngeniero().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsolaCalculo().setVisible(true);
            }
        });
    }
    
    // Convierte String "192.168.1.0" a long
private long ipAEntero(String ip) {
    String[] partes = ip.split("\\.");
    long resultado = 0;
    for (int i = 0; i < 4; i++) {
        resultado |= (Long.parseLong(partes[i]) << (24 - (8 * i)));
    }
    return resultado & 0xFFFFFFFFL;
}

// Convierte long de vuelta a String "192.168.1.0"
private String enteroAIP(long ip) {
    return String.format("%d.%d.%d.%d",
            (ip >> 24) & 0xFF, (ip >> 16) & 0xFF,
            (ip >> 8) & 0xFF, ip & 0xFF);
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IPbase;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
