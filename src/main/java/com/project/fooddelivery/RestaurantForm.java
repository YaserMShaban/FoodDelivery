/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.fooddelivery;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author EL-YaMaMa
 */
public class RestaurantForm extends javax.swing.JFrame  implements ActionListener{

    /**
     * Creates new form RestaurantForm
     */
              JMenuItem i1, i2, i3, i4, i5,i6;  

    public RestaurantForm() {
        initComponents();
        
         JMenu menu, submenu,username;  
 
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("☰");  
          submenu=new JMenu("Sub Menu");  
          i1=new JMenuItem("Order History");  
          i2=new JMenuItem("My Cart");  
          i3=new JMenuItem("Logout");
          i6 = new JMenuItem("My Profile");
          
          i1.addActionListener(this);  
          i2.addActionListener(this);
          i3.addActionListener(this);   
          i6.addActionListener(this);
          
           menu.add(i6); menu.add(i1); menu.add(i2); menu.add(i3);  
//          submenu.add(i4); submenu.add(i5);  
//          menu.add(submenu); 
//          menu.add(submenu);  
          username =  new JMenu(FoodDelivery.user.getName());
//                    username =  new JMenu("TEST");


          mb.add(menu);
          mb.add(new JLabel(" | "));
          mb.add(username);
          
          this.setJMenuBar(mb);   
//          this.setVisible(true);  

//---------------------------


        final int FRAME_WIDTH = 555;
        final int FRAME_HEIGHT = 810;

        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Restaurants");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
  
        JPanel p2 = new JPanel();


        p2.setLayout(new GridLayout(-1, 1));
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setAutoscrolls(true);

        JScrollPane scrollPane = new JScrollPane(p2);
        scrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        scrollPane.getVerticalScrollBar().setUnitIncrement(20);

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setPreferredSize(new Dimension(540, 740));
        contentPane.add(scrollPane, BorderLayout.CENTER);

try{
        String content = Files.readString(Paths.get("Restaurant.txt"));
        JSONArray array = new JSONArray(content);  
        for(int i=0; i < array.length(); i++)   
        {  
        JSONObject object = array.getJSONObject(i);
        Restaurant Res = new Restaurant(object.getString("Name"), object.getString("Rate"), object.getString("Desc"), object.getString("Time"));
        JPanel sp1 = new RestaurantPanel(this,Res);
        p2.add(sp1);
        }

        for(int i=0;i<7-array.length();i++){
            JPanel sp1 = new RestaurantPanel(false);
            p2.add(sp1);
        }

    }catch (IOException e) {
            
    }


        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {    
        if(e.getSource()==i3) {
            System.out.println("yes");
        Login JframeLogin = new Login();
        JframeLogin.setVisible(true);
        JframeLogin.setLocation(this.getLocationOnScreen());
        this.setVisible(false);
        }
        
        if(e.getSource() == i6){
            AccountFrame Acc = new AccountFrame();
            Acc.setVisible(true);
            Acc.setLocation(getLocationOnScreen());
            setVisible(false);
        }
            if(e.getSource() == i2){
            CartForm cf = new CartForm();
            cf.setVisible(true);
            cf.setLocation(getLocationOnScreen());
            setVisible(false);
        }
}     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
