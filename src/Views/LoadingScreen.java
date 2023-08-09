/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author Saidh-PC
 */
public class LoadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoadingScreen
     */
    public LoadingScreen() {
        initComponents();
    }

    LoadingScreen(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Percentage = new javax.swing.JLabel();
        loading = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Percentage.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        Percentage.setForeground(new java.awt.Color(255, 255, 255));
        Percentage.setText("%");
        getContentPane().add(Percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, 37, 34));

        loading.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading");
        getContentPane().add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 170, 20));

        jProgressBar2.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 511, 770, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clock.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 220, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoadingView.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LoadingScreen MySplash = new LoadingScreen(); 
        
        MySplash.setVisible(true);
        try{
            for (int i = 0; i < 100; i++) {
                Thread.sleep(40);
                MySplash.jProgressBar2.setValue(i);if(i == 10)
    {
        MySplash.loading.setText("Turning on Modules...");
    }
    if(i == 20)
    {
        MySplash.loading.setText("Loading Modules...");
    }
    if(i == 50)
    {
        MySplash.loading.setText("Connecting to Database...");
    }
    if(i == 70)
    {
        MySplash.loading.setText("Connction Successful !");
    }
    if(i == 80)
    {
        MySplash.loading.setText("Launching Application...");
    }
    
                MySplash.Percentage.setText(Integer.toString(i)+"%");
            }
     
        }catch(Exception e)
        {
            
        }
   // new MainInterface().setVisible(true);
   MainInterface mn1 = new MainInterface();
   mn1.show();
   MySplash.dispose();
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables
}