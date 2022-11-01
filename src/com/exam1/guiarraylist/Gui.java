package com.exam1.guiarraylist;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gui extends JFrame {
    //remember JComboBox<E> is generic include the type with Declaration
    JComboBox<String> dropDown;
    
    public Gui() {
        setSize(300, 300);
        Dimension screenSize = getToolkit().getScreenSize();
        setLocation((screenSize.width-getWidth())/2, (screenSize.height-getHeight())/2);
        setLayout(new BorderLayout());
        setTitle("Exam 1 Review");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(93, 39, 179, 255));
        getContentPane().add(panel);
        dropDown = new JComboBox<>();
        dropDown.setSize(new Dimension(100, 40));
        // an example of using an ArrayList<String> with JComboBox
        //remember ArrayList<E> is generic include the type with Declaration
        ArrayList<String> dropDownItems = new ArrayList<>();
        dropDownItems.add("Item1");
        dropDownItems.add("Item2");
        dropDownItems.add("Item3");
        /* using an ArrayList to populate a JComboBox */
        for(String item : dropDownItems) dropDown.addItem(item);
        
        panel.add(dropDown);
        
        setVisible(true);
    }
}
