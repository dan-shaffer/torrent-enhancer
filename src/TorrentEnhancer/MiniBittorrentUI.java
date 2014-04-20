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

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * GUI object of MiniTorrent application
 * @author janfsd
 */
public class MiniBittorrentUI extends javax.swing.JFrame {

    /** Creates new form MiniBittorrentUI */
    public MiniBittorrentUI() {
        initComponents();
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
        progressBar = new javax.swing.JProgressBar();
        speedLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        torrentLabel = new javax.swing.JLabel();
        fileOpenedLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        torrentFileChooser.setAcceptAllFileFilterUsed(false);
        torrentFileChooser.setFileFilter(new TorrentFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniTorrent");

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

        log.setColumns(20);
        log.setEditable(false);
        log.setRows(5);
        jScrollPane1.setViewportView(log);

        progressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressBar.setStringPainted(true);

        speedLabel.setText("0 kb/s");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("DL Speed:");

        torrentLabel.setText("Torrent File:");

        fileOpenedLabel.setText("None opened...");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("LOG:");

        jLabel3.setText("Downloaded:");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(torrentLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fileOpenedLabel)
                        .addContainerGap(323, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(openButton)
                                .add(82, 82, 82))
                            .add(layout.createSequentialGroup()
                                .add(jLabel3)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(15, 15, 15)
                                .add(jLabel1)
                                .add(27, 27, 27)
                                .add(speedLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(exitButton)
                                .addContainerGap())
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 185, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(158, 158, 158))))))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(torrentLabel)
                    .add(fileOpenedLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(progressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(9, 9, 9)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(exitButton)
                    .add(openButton)
                    .add(speedLabel)
                    .add(jLabel1))
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
            (engine = new StartEngine(file, log, progressBar, speedLabel)).execute();

            // Showing the name of the torrent file
            fileOpenedLabel.setText(file.getName());
        }
        else {
            log.append("Open command cancelled by user." + "\n");
        }

    }//GEN-LAST:event_openButtonActionPerformed



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
                new MiniBittorrentUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel fileOpenedLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea log;
    private javax.swing.JButton openButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JFileChooser torrentFileChooser;
    private javax.swing.JLabel torrentLabel;
    // End of variables declaration//GEN-END:variables

    private File file;
    private StartEngine engine;

}
