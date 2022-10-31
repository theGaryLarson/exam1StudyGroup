import javax.swing.*;
import java.awt.*;

public class GuiArrayList extends JFrame {
    JComboBox<String> dropDown;
    
    public GuiArrayList() {
        setSize(300, 300);
        Dimension screenSize = getToolkit().getScreenSize();
        setLocation((screenSize.width-getWidth())/2, (screenSize.height-getHeight())/2);
        setLayout(new BorderLayout());
        setTitle("Exam 1 Review");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(93, 39, 179, 255));
        getContentPane().add(panel);
        
        String[] dropDownItems = new String[]{"Item1", "Item2", "Item3"};
        dropDown = new JComboBox<>(dropDownItems);
        dropDown.setSize(new Dimension(100, 40));
        panel.add(dropDown);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        GuiArrayList gui = new GuiArrayList();
    }
}
