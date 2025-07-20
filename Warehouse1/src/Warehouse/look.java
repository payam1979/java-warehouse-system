package Warehouse;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class look extends JFrame implements ActionListener 
{
   private JRadioButton w, ml, mf;
   private ButtonGroup groupBtn;
   
   public look() 
   {
      setTitle("Change the look of my Swing app");
      w = new JRadioButton("Windows");
      w.addActionListener(this);
      ml = new JRadioButton("Metal");
      ml.addActionListener(this);
      mf = new JRadioButton("Motif");
      mf.addActionListener(this);
      groupBtn = new ButtonGroup();
      groupBtn.add(w);
      groupBtn.add(ml);
      groupBtn.add(mf);
      setLayout(new FlowLayout());
      add(w);
      add(ml);
      add(mf);
      setSize(250, 250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLocationRelativeTo(null);
   }
   
   @Override
   public void actionPerformed(ActionEvent actionevent) 
   {
      String LookAndFeel;
      if(actionevent.getSource() == w)
         LookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
      else if(actionevent.getSource() == mf)   
         LookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
      else
         LookAndFeel = "javax.swing.plaf.metal.MetalLookAndFeel";
      try {
         UIManager.setLookAndFeel(LookAndFeel);
         SwingUtilities.updateComponentTreeUI(this);
      } catch (Exception e) {
         System.out.println("Error while defining the LookAndFeel..." + e);
      }
   }
   public static void main(String args[]) 
   {
      new look();
   }
}