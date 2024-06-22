import java.awt.*;
import javax.swing.*;
// <applet code="GraphicsDemo.class" width=700 height=500> </applet>
public class GraphicsDemo extends JFrame {
    
    public GraphicsDemo() {
        setTitle("Graphics Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Draw a line
        g.drawLine(50, 50, 150, 50);
        
        // Draw a rectangle
        g.drawRect(50, 100, 100, 50);
        
        // Draw a filled rectangle
        g.fillRect(50, 200, 100, 50);
        
        // Draw an oval
        g.drawOval(200, 100, 100, 50);
        
        // Draw a filled oval
        g.fillOval(200, 200, 100, 50);
        
        // Draw a polygon
        int[] xPoints = {300, 350, 400};
        int[] yPoints = {200, 100, 200};
        g.drawPolygon(xPoints, yPoints, 3);
        
        // Draw a filled polygon
        int[] xPoints2 = {300, 350, 400};
        int[] yPoints2 = {300, 400, 300};
        g.fillPolygon(xPoints2, yPoints2, 3);
        
        // Draw a string
        g.drawString("Hello, world!", 50, 350);
        
        // Set the color to blue
        g.setColor(Color.BLUE);
        
        // Draw a rounded rectangle
        g.drawRoundRect(200, 300, 100, 50, 10, 10);
        
        // Draw a filled rounded rectangle
        g.fillRoundRect(200, 50, 100, 50, 10, 10);
    }
    
    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
