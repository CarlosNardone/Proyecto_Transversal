/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import accesoadatos.AlumnoData;
import accesoadatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Carlos
 */
public class MenuPrincipalView extends javax.swing.JFrame {

    private Alumno alum;
    private AlumnoData alu;
    private MateriaData mat;
    private Materia materia;
    private int documento;

    /**
     * Creates new form MenuPrincipalView
     */
    public MenuPrincipalView() {
        initComponents();
        //La imagen esta echa con label.
//        this.setLocationRelativeTo(null);
//        this.setSize(700, 720);
        alu = new AlumnoData();
        mat = new MateriaData();
        materia = new Materia();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        //ImageIcon icono = new ImageIcon(getClass().getResource("/UniversidadEquipo1/recursos/universidad.jpg"));

        //Image miImagen = icono.getImage();
        jdEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jmiFormularioA = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jmiFormularioMateria = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        jmiManejoinscripciones = new javax.swing.JMenuItem();
        jmiManipNotas = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jmiAlumnoXMateria = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/universidad.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jdEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdEscritorioLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jMenuAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user.png"))); // NOI18N

        jmiFormularioA.setText("Formulario de Alumno");
        jmiFormularioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jmiFormularioA);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/graduation-cap.png"))); // NOI18N

        jmiFormularioMateria.setText("Formulario Materia");
        jmiFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jmiFormularioMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/users.png"))); // NOI18N

        jmiManejoinscripciones.setText("Manejo de inscripciones");
        jmiManejoinscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManejoinscripcionesActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jmiManejoinscripciones);

        jmiManipNotas.setText("Manipulacion de notas");
        jmiManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManipNotasActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jmiManipNotas);

        jMenuBar1.add(jMenuAdministracion);

        jMenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/world.png"))); // NOI18N

        jmiAlumnoXMateria.setText("Alumnos por Materia");
        jmiAlumnoXMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlumnoXMateriaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jmiAlumnoXMateria);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/exit.png"))); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiFormularioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        GestionDeAlumnosView gda = new GestionDeAlumnosView(alu,alum);
        gda.setVisible(true);
        jdEscritorio.add(gda);
        jdEscritorio.moveToFront(gda);
    }//GEN-LAST:event_jmiFormularioAActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jmiFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMateriaActionPerformed
        // TODO add your handling code here:
                jdEscritorio.removeAll();
        jdEscritorio.repaint();
        GestionDeMateriasView gdm = new GestionDeMateriasView(mat,materia);
        gdm.setVisible(true);
        jdEscritorio.add(gdm);
        jdEscritorio.moveToFront(gdm);
    }//GEN-LAST:event_jmiFormularioMateriaActionPerformed

    private void jmiManejoinscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManejoinscripcionesActionPerformed
        // TODO add your handling code here:
                        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        FormularioDeInscripcionView fdi = new FormularioDeInscripcionView();
        fdi.setVisible(true);
        jdEscritorio.add(fdi);
        jdEscritorio.moveToFront(fdi);
    }//GEN-LAST:event_jmiManejoinscripcionesActionPerformed

    private void jmiManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManipNotasActionPerformed
        // TODO add your handling code here:
         jdEscritorio.removeAll();
        jdEscritorio.repaint();
        CargaDeNotasView cdn = new CargaDeNotasView();
        cdn.setVisible(true);
        jdEscritorio.add(cdn);
        jdEscritorio.moveToFront(cdn);
    }//GEN-LAST:event_jmiManipNotasActionPerformed

    private void jmiAlumnoXMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlumnoXMateriaActionPerformed
        // TODO add your handling code here:
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        AlumnosPorMateriaView axm = new AlumnosPorMateriaView();
        axm.setVisible(true);
        jdEscritorio.add(axm);
        jdEscritorio.moveToFront(axm);
    }//GEN-LAST:event_jmiAlumnoXMateriaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenuItem jmiAlumnoXMateria;
    private javax.swing.JMenuItem jmiFormularioA;
    private javax.swing.JMenuItem jmiFormularioMateria;
    private javax.swing.JMenuItem jmiManejoinscripciones;
    private javax.swing.JMenuItem jmiManipNotas;
    // End of variables declaration//GEN-END:variables

}
