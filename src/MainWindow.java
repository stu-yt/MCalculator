public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }
    
    int xx = 0;
    int yy = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        closeButton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        result = new javax.swing.JTextField();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(75, 75, 75));

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setName(""); // NOI18N
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(210, 50, 50));
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setPreferredSize(new java.awt.Dimension(30, 30));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeButtonLayout = new javax.swing.GroupLayout(closeButton);
        closeButton.setLayout(closeButtonLayout);
        closeButtonLayout.setHorizontalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        closeButtonLayout.setVerticalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("MCalculator");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
        );

        button1.setBackground(new java.awt.Color(51, 51, 51));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("1");
        button1.setBorder(null);
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        result.setBackground(new java.awt.Color(51, 51, 51));
        result.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(255, 255, 255));
        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));

        button2.setBackground(new java.awt.Color(51, 51, 51));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("2");
        button2.setBorder(null);
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button3.setBackground(new java.awt.Color(51, 51, 51));
        button3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("3");
        button3.setBorder(null);
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button4.setBackground(new java.awt.Color(51, 51, 51));
        button4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("4");
        button4.setBorder(null);
        button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button5.setBackground(new java.awt.Color(51, 51, 51));
        button5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("5");
        button5.setBorder(null);
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button6.setBackground(new java.awt.Color(51, 51, 51));
        button6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("6");
        button6.setBorder(null);
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button7.setBackground(new java.awt.Color(51, 51, 51));
        button7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button7.setForeground(new java.awt.Color(255, 255, 255));
        button7.setText("7");
        button7.setBorder(null);
        button7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button8.setBackground(new java.awt.Color(51, 51, 51));
        button8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button8.setForeground(new java.awt.Color(255, 255, 255));
        button8.setText("8");
        button8.setBorder(null);
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button9.setBackground(new java.awt.Color(51, 51, 51));
        button9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button9.setForeground(new java.awt.Color(255, 255, 255));
        button9.setText("9");
        button9.setBorder(null);
        button9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonClear.setBackground(new java.awt.Color(146, 29, 29));
        buttonClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("CLEAR");
        buttonClear.setAlignmentY(0.0F);
        buttonClear.setBorder(null);
        buttonClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button0.setBackground(new java.awt.Color(51, 51, 51));
        button0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button0.setForeground(new java.awt.Color(255, 255, 255));
        button0.setText("0");
        button0.setBorder(null);
        button0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button10.setBackground(new java.awt.Color(26, 105, 168));
        button10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button10.setForeground(new java.awt.Color(255, 255, 255));
        button10.setText("-");
        button10.setAlignmentY(0.0F);
        button10.setBorder(null);
        button10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button11.setBackground(new java.awt.Color(26, 105, 168));
        button11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button11.setForeground(new java.awt.Color(255, 255, 255));
        button11.setText("×");
        button11.setAlignmentY(0.0F);
        button11.setBorder(null);
        button11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button12.setBackground(new java.awt.Color(26, 105, 168));
        button12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button12.setForeground(new java.awt.Color(255, 255, 255));
        button12.setText("÷");
        button12.setAlignmentY(0.0F);
        button12.setBorder(null);
        button12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button13.setBackground(new java.awt.Color(26, 105, 168));
        button13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button13.setForeground(new java.awt.Color(255, 255, 255));
        button13.setText("+");
        button13.setAlignmentY(0.0F);
        button13.setBorder(null);
        button13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(result))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        titleBar.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_titleBarMouseDragged

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        closeButton.setBackground(new java.awt.Color(140, 5, 20));
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        closeButton.setBackground(new java.awt.Color(210, 50, 50));
    }//GEN-LAST:event_closeButtonMouseExited

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button13;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField result;
    private javax.swing.JPanel titleBar;
    // End of variables declaration//GEN-END:variables
}
