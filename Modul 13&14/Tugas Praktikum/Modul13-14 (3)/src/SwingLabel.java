
import javax.swing.*;


public class SwingLabel extends JFrame{
    private JLabel label;
    
    public SwingLabel(){
        setTitle("Swing Frime");
        setSize(400,200);
        setLayout(null);
        
        component();
    }
    
    private void component(){
        label = new JLabel("I LOVE YOU MY EX");
        int x =150; int y=50;
        int width = 300; int height =30;
        label.setBounds(x, y, width, height);
        
        add(label);
    }
    public static void main(String[] args){
        SwingLabel tstSwing = new SwingLabel();
        tstSwing.setVisible(true);
    }
}

    

