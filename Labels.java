import javax.swing.*;
public class Labels extends JFrame
{
   JPanel pnl = new JPanel();
   ImageIcon tux = new ImageIcon("tux.png");
   ImageIcon android = new ImageIcon("android.png");
   ImageIcon ninjacat = new ImageIcon("ninja-cat.png");
   JLabel lbl1 = new JLabel(android);
   JLabel lbl2 = new JLabel("Tux, the Linux mascot",tux,JLabel.CENTER);
   JLabel lbl3 = new JLabel("Ninja-Cat",ninjacat,JLabel.CENTER);
   
   
   public static void main(String[] args)
   {
       Labels gui = new Labels();
   }
   public Labels()
   {
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       setVisible(true);
       lbl1.setToolTipText("Android Logo");
       lbl2.setHorizontalTextPosition(JLabel.CENTER);
       lbl2.setVerticalTextPosition(JLabel.BOTTOM);
       lbl3.setHorizontalTextPosition(JLabel.CENTER);
       lbl3.setVerticalTextPosition(JLabel.BOTTOM);
       pnl.add(lbl1);
       pnl.add(lbl2);
       pnl.add(lbl3);
   }
}

