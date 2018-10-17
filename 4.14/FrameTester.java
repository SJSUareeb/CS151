import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class FrameTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      final int FIELD_WIDTH = 20;
      JTextField textField = new JTextField(FIELD_WIDTH);
      textField.setText("Fill the circle with a color!");

      JButton red = new JButton("Red");
      
      red.addActionListener(new
    		  ActionListener()
    		  {
    		  public void actionPerformed(ActionEvent event)
    		  {
    		  // Button action goes here
    		  textField.setText("Hello, World!");
    		  }
    		  });
      JButton blue = new JButton("Blue");
      JButton green = new JButton("Green");

      
      red.addActionListener(new
    		  ActionListener()
    		  {
    		  public void actionPerformed(ActionEvent event)
    		  {
    		  // Button action goes here
    		  textField.setText("Hello, World!");
    		  }
    		  });
      
      frame.setLayout(new FlowLayout());

     
      frame.add(red);
      frame.add(blue);
      frame.add(green);
      frame.add(textField);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }

}
	


