import javax.swing.*;
import java.net.URL;
public class Buttons extends JFrame
{
   JPanel pnl = new JPanel();
   ClassLoader ldr = this.getClass().getClassLoader();
   URL crossURL = ldr.getResource("1474242518_Close_Icon_Dark.png");
   URL tickURL = ldr.getResource("1474242499_Tick_Mark_Dark.png");
   ImageIcon cross = new ImageIcon(crossURL);
   ImageIcon tick = new ImageIcon(tickURL);
   JButton btn = new JButton("Click");
   JButton crossBtn = new JButton("Decline", cross);
   JButton tickBtn = new JButton("Accept",tick);
   public static void main(String[] args)
   {
       Buttons gui = new Buttons();
   }
   public Buttons()
   {
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       setVisible(true);
       pnl.add(btn);
       pnl.add(tickBtn);
       pnl.add(crossBtn);
   }
}

