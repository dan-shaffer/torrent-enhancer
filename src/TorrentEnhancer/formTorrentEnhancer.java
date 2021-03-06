/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MiniBittorrentUI.java
 *
 * Created on Jan 3, 2010, 1:13:39 PM
 */

package TorrentEnhancer;

import jBittorrentAPI.*;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.UnsupportedEncodingException;

/**
 * GUI object of MiniTorrent application
 * @author janfsd
 */
public class formTorrentEnhancer extends javax.swing.JFrame {

    public String torrentHash;
    private TorrentParser Parser;
    public DumpToString dumper;
    /** Creates new form MiniBittorrentUI */
    public formTorrentEnhancer() {
        initComponents();
    }

    public void Update() {
        txtHash.setText(torrentHash);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        torrentFileChooser = new javax.swing.JFileChooser();
        openButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        log = new javax.swing.JTextArea();
        torrentLabel = new javax.swing.JLabel();
        fileOpenedLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHash = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        openButton1 = new javax.swing.JButton();
        btnTest1 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listFiles = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listTrackers = new javax.swing.JList();

        torrentFileChooser.setAcceptAllFileFilterUsed(false);
        torrentFileChooser.setFileFilter(new TorrentFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Torrent Enhancer");

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        log.setEditable(false);
        log.setColumns(20);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        torrentLabel.setText("Torrent File:");

        fileOpenedLabel.setText("None opened...");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("LOG:");

        jLabel4.setText("Hash:");

        txtHash.setName("txtHash"); // NOI18N
        txtHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHashActionPerformed(evt);
            }
        });

        jLabel5.setText("Files:");

        openButton1.setText("Disable");
        openButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButton1ActionPerformed(evt);
            }
        });

        btnTest1.setText("Test");
        btnTest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTest1ActionPerformed(evt);
            }
        });

        txtName.setName("txtHash"); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel6.setText("Name:");

        jButton1.setText("Change");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        listFiles.setToolTipText("");
        jScrollPane3.setViewportView(listFiles);

        jLabel7.setText("Trackers:");

        listTrackers.setToolTipText("");
        jScrollPane4.setViewportView(listTrackers);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel6)
                                    .add(jLabel4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 460, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(txtHash, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jButton1))))
                            .add(jLabel5))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(26, 26, 26)
                                .add(openButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(torrentLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(fileOpenedLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 335, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 484, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel7)
                                    .add(289, 289, 289)
                                    .add(btnTest1)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(openButton1))
                                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 476, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(exitButton)
                        .add(40, 40, 40)
                        .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 83, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(100, 100, 100))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(torrentLabel)
                    .add(fileOpenedLabel)
                    .add(openButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(txtHash, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButton1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(openButton1)
                    .add(btnTest1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(9, 9, 9)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(exitButton)
                    .add(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed


    /**
     * Handles what happens when the open button is clicked
     * @param evt
     */
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        // Show the file chooser dialog, returns 1 if a file is choosen
        int returnVal = torrentFileChooser.showOpenDialog(this);

        // if we selected a file
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            file = torrentFileChooser.getSelectedFile();
            log.append("Opening: "+ file.getName() + "   Path: " + file.getAbsolutePath() + "\n");

            // Starting the engine in a new background thread
            //(engine = new StartEngine(file, log)).execute();
                
            (Parser = new TorrentParser(file)).Parse();
            
            // Showing the name of the torrent file
            fileOpenedLabel.setText(file.getName());
            txtHash.setText(Parser.TorrentHash);
            txtName.setText((String) Parser.torrentfile.saveAs);
            System.out.println(Parser.TorrentFiles);
            //listFiles.setListData(Parser.TorrentFiles);
            DefaultListModel listModel = new DefaultListModel();
            for (Object item : Parser.TorrentFiles ) {
                  listModel.addElement(item.toString());
                  
            }
            listFiles.setModel(listModel);
            System.out.println(Parser.torrentfile.announceURL);
            
            
               
                
               
 //            System.out.println(dumper.dump(Parser));
                        
        }
        else {
            log.append("Open command cancelled by user." + "\n");
        }

    }//GEN-LAST:event_openButtonActionPerformed

    
    
    private void openButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openButton1ActionPerformed

    private void btnTest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTest1ActionPerformed
    
    }//GEN-LAST:event_btnTest1ActionPerformed

    private void txtHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHashActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        TorrentProcessor TorProc = null;
        System.out.println( TorProc.getTorrent(Parser.torrentfile) );
        
    }//GEN-LAST:event_btnSaveActionPerformed



    /**
    * Main Class
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        try {
	    // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
        }
         catch (UnsupportedLookAndFeelException e) {
       // handle exception
        }
        catch (ClassNotFoundException e) {
       // handle exception
        }
        catch (InstantiationException e) {
       // handle exception
        }
        catch (IllegalAccessException e) {
       // handle exception
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formTorrentEnhancer().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnTest1;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fileOpenedLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList listFiles;
    private javax.swing.JList listTrackers;
    private javax.swing.JTextArea log;
    private javax.swing.JButton openButton;
    private javax.swing.JButton openButton1;
    private javax.swing.JFileChooser torrentFileChooser;
    private javax.swing.JLabel torrentLabel;
    private javax.swing.JTextField txtHash;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private File file;
    // private StartEngine engine;



}
