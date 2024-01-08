/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group13.westernmaps;

/**
 *
 * @author blind
 */
public class UserMain extends javax.swing.JFrame {

    /**
     * Creates new form UserMain
     */
    public UserMain() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 165, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("\n\nABOUT:\n\nWestern Maps.\nTeam members:\nTeam 13\t1\tKoroush Emari\t        kemari@uwo.ca\nTeam 13\t2\tRobert Ghita\t        rghita@uwo.ca\nTeam 13\t3\tAbdisalam Halane\tahalane@uwo.ca\nTeam 13\t4\tMohammed Mustafa Khan\tmkhan545@uwo.ca\nTeam 13\t5\tJonathon Mikhael\tjmikhael@uwo.ca\n\nRelease Date: April 6th 2023\n\n\n:: HELP GUIDE ::\n\nMAP: \nTo navigate the maps, once on the main menu, the options of different buildings should be \ngiven to you, choose the building you want and select edit. A similar screen will pop up\nfor that building's floors, in the same fashion, choose the floor you want and you will be\non that floor's map. To navigate back to the main menu, simply click on the main menu tab \nat the top of the map.\n\n\nCreating point of interests:\n\nTo create Point of interests, simly click on the screen and a pop up will appear, guiding you\nwith the required properities of the Point of interest that should be filled. Once filled, hit \nok/save.\n\n**CAUTION, DO NOT ADD COMMA INTO YOUR NAME**\nEditing User Created Point of interest.\n\nTo edit a User created point of interest, simply click on the point of interest you want and\nthen the display and edit menu should appear. You would first be on the display tab, switch over\nto the edit tab and there you can see similar options as when you first created the point of interest.\nOnce satisfied, save your edit, or remove it if you like. You can also cancel your edit by pressing the\nclose button on the pop window.\n\nDisplay Layers:\n\nOnce you have selected a Layer from the drop down menu, simply press display, and the layer should be \ndisplayed. The hide button would hide the layer of interest.\n\nYou can add a new Layer to populate by putting in the name of your desired layer in the textbox under the layer\nselection, once you have finished choosing your name, press add, and the new layer should appear there and also\nas another option for types when making a new Point of Interest. (both as admin or user).\n\nYou can also remove a layer by selecting the layer you want to delete in the drop box, and then presssing remove.\n\nThe weather should be displayed in the bottom left corner, you can hit the update button to update the weater.\nYou can also hit the help guide again to see this page.\n\nYou can search a point of interest by first selecting a floor and then pressing the search button, if no result is \nfound, Nothing happens.\n\nYou can also select a point of interest youd like to discover in the drop box menu at the top left corner of the window.\nsimply press ok once finished selecting a POI.\n\nAdmin can create new Built In POIS. Login in as an admin, and you should be able to create one similar to how a user \nwould create their user created poi.\n\nYou can display and hide the usercreated point of interest by pressing the display/hide buttons where it says UPOI.\nYou can also select and go to a Usercreated Point of interest in that corner by selecting the User Created POI you want\nfrom the drop box menu and pressing ok.\n\nYou can favourite a point of interest you like by pressing it and then hitting the favourite buttton in the new pop up\nwindow, the point of interest should turn blue. You can also remove it by hitting the same favourite button.\nFavourites should be put in the favourite drop down menu, and then pressing ok. You can also display and hide favourites\nwith the hide and display buttons. NOTE, this does only the floor you are on.\n\nTo exit the help, select the main menu tab.\n- Abdisalam\n\n\n\n");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Main Menu", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Building1", jPanel1);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\blind\\Desktop\\CS2212\\westernmaps\\MiddleSex.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jScrollPane1.setViewportView(jLabel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Building2", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 580, 560));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

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
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMain().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel jPanel4;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
