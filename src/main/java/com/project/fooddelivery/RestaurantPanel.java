/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project.fooddelivery;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

/**
 *
 * @author TheUltimateGamer
 */
public class RestaurantPanel extends javax.swing.JPanel {
    private javax.swing.JFrame frame;
    private Restaurant res;
    /**
     * Creates new form RestaurantPanelTest
     */
    public RestaurantPanel(boolean empty){

    }
    public RestaurantPanel(javax.swing.JFrame frame,Restaurant res) {
        this.frame = frame;
        this.res = res;
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
                setPreferredSize(new Dimension(0, 105));

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
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Icon = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        Rate = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(555, 105));

        Name.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Name.setText("KFC");

        Description.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Description.setText("Sandwitch ,Fried Chicken");

        Time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Time.setText("45 Min");

        Rate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Rate.setText("4.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rate)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(90, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Description)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Time)
                            .addComponent(Rate))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Description;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Rate;
    private javax.swing.JLabel Time;
    // End of variables declaration//GEN-END:variables
}
