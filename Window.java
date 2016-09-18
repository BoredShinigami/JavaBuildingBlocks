import javax.swing.*;
public class Window extends JFrame
{
   JPanel pnl = new JPanel();
   public static void main(String[] args)
   {
       Window gui = new Window();
   }
   public Window()
   {
       super("Swing Window");
       setSize(500,200);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(pnl);
       setVisible(true);
   }
}

