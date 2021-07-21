
package vezbe12gui; 

import java.io.File; 
import java.util.ArrayList; 
import javax.swing.JFileChooser; 
import javax.swing.JOptionPane; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.util.Scanner;


public class Prodavnica extends javax.swing.JFrame {

    
    public Prodavnica() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textSifra = new javax.swing.JTextField();
        textProizvod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        radioVoce = new javax.swing.JRadioButton();
        radioPovrce = new javax.swing.JRadioButton();
        radioOstalo = new javax.swing.JRadioButton();
        dugmeFajlCitanje = new javax.swing.JButton();
        dugmeFajlPisanje = new javax.swing.JButton();
        dugmeUcitaj = new javax.swing.JButton();
        dugmeUpisi = new javax.swing.JButton();
        Pronadji = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proizvod");

        jLabel2.setText("Sifra");

        jCheckBox1.setText("Domaci proizvod");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        radioVoce.setText("Voce");

        radioPovrce.setText("Povrce");

        radioOstalo.setText("Ostalo");

        dugmeFajlCitanje.setText("Fajl za citanje");
        dugmeFajlCitanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeFajlCitanjeActionPerformed(evt);
            }
        });

        dugmeFajlPisanje.setText("Fajl za pisanje");
        dugmeFajlPisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeFajlPisanjeActionPerformed(evt);
            }
        });

        dugmeUcitaj.setText("Ucitaj");
        dugmeUcitaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeUcitajActionPerformed(evt);
            }
        });

        dugmeUpisi.setText("Upisi");
        dugmeUpisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dugmeUpisiActionPerformed(evt);
            }
        });

        Pronadji.setText("Pronadji");
        Pronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PronadjiActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dugmeFajlPisanje)
                            .addComponent(dugmeFajlCitanje)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioVoce)
                            .addComponent(radioPovrce)
                            .addComponent(radioOstalo))
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(Pronadji)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dugmeUpisi)
                            .addComponent(dugmeUcitaj))
                        .addGap(45, 45, 45)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dugmeFajlCitanje))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dugmeFajlPisanje))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dugmeUcitaj)
                            .addComponent(jCheckBox1))
                        .addGap(26, 26, 26)
                        .addComponent(dugmeUpisi)
                        .addGap(49, 49, 49)
                        .addComponent(Pronadji))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioVoce)
                                .addGap(26, 26, 26)
                                .addComponent(radioPovrce)
                                .addGap(30, 30, 30)
                                .addComponent(radioOstalo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static FileInputStream fileCitanje = null; 
    File ff; 
    ArrayList<Proizvod> lista;
    static PrintWriter pw = null;
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void dugmeUcitajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeUcitajActionPerformed
        if(fileCitanje!=null) {
            Scanner s = new Scanner(fileCitanje); 
            System.out.println(s.nextLine()); 
            while(s.hasNext()){
                jTextArea1.append("Proizvod " + s.nextLine() + "\n"); 
                jTextArea1.append("Sifra " + s.nextLine()); 
                if(s.nextLine().compareTo("da") == 0) 
                    jTextArea1.append("\nDomaci proizvod"); 
                else 
                    jTextArea1.append("\nStrani proizvod");
            
            }  
            for(Proizvod p : lista) {
                jTextArea1.append(p.toString());
            }
            
        
        }else {
            System.out.println("fajl za citanje nije otvoren");
        }
    }//GEN-LAST:event_dugmeUcitajActionPerformed

    private void dugmeFajlCitanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeFajlCitanjeActionPerformed
        try{ 
            
            JFileChooser jfc = new JFileChooser(); 
            jfc.showOpenDialog(jfc); 
            ff = jfc.getSelectedFile(); 
            
            fileCitanje = new FileInputStream(ff); 
            Scanner s = new Scanner(fileCitanje); 
            lista = new ArrayList<Proizvod>(); 
            while(s.hasNext()) {
                System.out.println("Ulaz while");
                lista.add(new Proizvod(s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine()));
            } 
            JOptionPane.showMessageDialog(this, "Fajl za citanje je uspesno otvoren");
        
        }catch(FileNotFoundException e) {
            System.out.println("Greska pri otvaranju fajla");
        }catch(IOException e){
            System.out.println("Greska pri radu sa fajlom");
        }finally {
            try{
                fileCitanje.close();
            }catch(IOException e) {
            
                System.out.println("Kraj");
            }
        
        }
    }//GEN-LAST:event_dugmeFajlCitanjeActionPerformed

    private void dugmeUpisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeUpisiActionPerformed
        if(textProizvod.getText().isEmpty() || textSifra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Unesite sva polja");
        }else {
            pw.println(textProizvod.getText()); 
            pw.flush(); 
            pw.println(textSifra.getText()); 
            pw.flush(); 
            if(jCheckBox1.isSelected()) {pw.println("Domaci proizvod"); pw.flush();} 
            else {pw.println("Strani proizvod"); pw.flush();} 
            
            if(radioOstalo.isSelected()) {
                pw.println("Ostalo"); 
                pw.flush();
            }else if(radioVoce.isSelected()){
                pw.println("Voce");
                pw.flush();
            }else if(radioPovrce.isSelected()){
                pw.println("Povrce"); 
                pw.flush();
            }
        
        }
    }//GEN-LAST:event_dugmeUpisiActionPerformed

    private void PronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PronadjiActionPerformed
        try { 
            
            String ime = JOptionPane.showInputDialog(this, "Unesite naziv proizvoda"); 
            
            System.out.println(ime); 
            
            fileCitanje = new FileInputStream(ff); 
            Scanner s = new Scanner(fileCitanje); 
            boolean postoji = false; 
            while(s.hasNext()){
                String citanje = s.nextLine(); 
                System.out.println(citanje); 
                if(ime.compareTo(citanje) == 0) {
                    JOptionPane.showMessageDialog(this, "Proizvod postoji"); 
                    postoji = true;
                }
                s.nextLine();
                s.nextLine();
                s.nextLine();
            }if(!postoji) {
                JOptionPane.showMessageDialog(this, "Proizvod ne postoji");
            
            }
        
        
        }catch(FileNotFoundException e) {
            System.out.println("Fajl nije pronadjen");
        
        }
    }//GEN-LAST:event_PronadjiActionPerformed

    private void dugmeFajlPisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dugmeFajlPisanjeActionPerformed
        try{
            JFileChooser jfc = new JFileChooser(); 
            jfc.showOpenDialog(this); 
            File f = jfc.getSelectedFile(); 
            
            pw = new PrintWriter(f);
        
        }catch(FileNotFoundException e) {
            System.out.println("Fajl nije pronadjen");
        
        }
    }//GEN-LAST:event_dugmeFajlPisanjeActionPerformed

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
            java.util.logging.Logger.getLogger(Prodavnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prodavnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prodavnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prodavnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Prodavnica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pronadji;
    private javax.swing.JButton dugmeFajlCitanje;
    private javax.swing.JButton dugmeFajlPisanje;
    private javax.swing.JButton dugmeUcitaj;
    private javax.swing.JButton dugmeUpisi;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton radioOstalo;
    private javax.swing.JRadioButton radioPovrce;
    private javax.swing.JRadioButton radioVoce;
    private javax.swing.JTextField textProizvod;
    private javax.swing.JTextField textSifra;
    // End of variables declaration//GEN-END:variables
}
