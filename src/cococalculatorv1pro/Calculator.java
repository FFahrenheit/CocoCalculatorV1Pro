/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cococalculatorv1pro;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author ivan_
 */
public class Calculator extends JFrame
{
    protected JButton[][] buttons = new JButton[4][5];
    protected JTextField display;
    private int height;
    private int width;
    
    Calculator()
    {
        width=375;
        height=600;
        initWindow();
        initButtons();
        this.setLayout(null);
    }
    
    private void initWindow()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setTitle("Calculadora imaginaria");
        Color color = new Color(102,153,153,255);
        this.getContentPane().setBackground(color);
        
        display = new JTextField();
        display.setBounds(50, 50, 275, 50);
        Font font = new Font("Arial",Font.PLAIN,50); 
        display.setText("Bienvenido");
        display.setFont(font);
        display.setEditable(false);
        this.add(display);
    }
    
    private void initButtons()
    {
        String buttonText[][] = {
            {"CE", "C", "info","+"},
            {"7","8","9","-"},
            {"4","5","6","*"},
            {"1","2","3","/"},
            {"i","0",".","="}
        };
        int x0 = 50;
        int y0 = 150;
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j <5; j++) 
            {
                buttons[i][j] = new JButton(buttonText[j][i]);
                buttons[i][j].setBounds(x0+i*75, y0 + j*75, 50, 50);
                this.add(buttons[i][j]);
            }
        }
    }
}
