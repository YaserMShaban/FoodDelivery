
package com.project.fooddelivery;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class RestaurantPanel extends javax.swing.JPanel  {
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Time;
    private javax.swing.JLabel Rate;
    
    
    private javax.swing.JFrame frame;
    private Restaurant res;
    
    
    
    

    public RestaurantPanel(boolean empty){

    }

    public RestaurantPanel(javax.swing.JFrame frame,Restaurant res){
        this.frame = frame;
        this.res = res;

        initComponents();
        
    }


    
    private void initComponents() {
        
        setPreferredSize(new Dimension(0, 105));
        
        Icon = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Rate = new javax.swing.JLabel();


        Icon.setIcon(new javax.swing.ImageIcon("icons\\" + res.getName() + ".png"));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 24));
        Name.setText(res.getName());

        Description.setText(res.getDesc());

        Time.setText(res.getTime()+" Min");

        Rate.setText(res.getRate());


        this.setBorder(new LineBorder(Color.black));

        
        addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                     DishesForm DF = new DishesForm(res.getName(),0);
                     DF.setVisible(true);
                     DF.setLocation(frame.getLocationOnScreen());
                     frame.setVisible(false);

                }
            });
            
            
      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time)
                            .addComponent(Rate))))
                .addGap(10, 10, 10))
        );
        
        
        
        
      
    }
    
    
    
    
}
