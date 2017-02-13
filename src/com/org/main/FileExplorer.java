/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.org.main;

/**
 *
 * @author eriyamo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FileExplorer extends JFrame {

    final JPanel Errorpanel = new JPanel();

    public FileExplorer() {
//set size and default close operation for Jframe	
        setTitle("File Explorer");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        JButton button = new JButton();
        JButton button2 = new JButton();
        
        button2.setText("Goals");
        button.setText("Photos");
//        button.setIcon(new ImageIcon("images\\button_photos.png"));
//        button2.setIcon(new ImageIcon("images\\button_ipm.png"));
        
//        button2.setBounds(300, 400, 500, 500);
//        button.setSize(300,300);
        
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().open(new File("C:\\Users\\ramo\\Documents\\Camera"));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Could not open file", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Desktop.getDesktop().open(new File("C:\\Users\\ramo\\Documents"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Could not open file", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        });

// set contentpanel to display the impage you required
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\eriyamo\\Documents\\NetBeansProjects\\NetBeansProjects_1st_September\\HibernateExample\\Images\\emc.jpg"))); // specify the image path
        add(button);
        add(button2);
        setLayout(new FlowLayout());

        setSize(700, 390);

    }

    public static void main(String args[]) {
        try {
//           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);
        } 
//        catch (InstantiationException ex) {
//            Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(FileExplorer.class.getName()).log(Level.SEVERE, null, ex);
//        }
        new FileExplorer();
    }
}
