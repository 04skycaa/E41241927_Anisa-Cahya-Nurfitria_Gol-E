package DrawShapes;
import java.awt.*;
import javax.swing.*;

public class DrawShapes extends JPanel {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public DrawShapes() {
        // The Font is Arial, Size 18, and is Italicized
        font = new Font("Arial", Font.ITALIC, 18);

        // Some colors are predefined in the Color class
        redColor = Color.red;
        backgroundColor = Color.orange;

        // Colors can be created using Red, Green, Blue values
        blueColor = new Color(0, 0, 122);

        // Set the background color of the panel
        setBackground(backgroundColor);
    }

    @Override
    protected void paintComponent(Graphics graph) {
        super.paintComponent(graph); // Memastikan panel digambar dengan benar

        // Set font
        graph.setFont(font);

        // Create a title
        graph.drawString("Draw Shapes", 90, 20);

        // Set the color for the first shape
        graph.setColor(blueColor);

        // Draw a rectangle using drawRect(int x, int y, int width, int height)
        graph.drawRect(120, 120, 120, 120);

        // This will fill a rectangle
        graph.fillRect(115, 115, 90, 90);

        // Set the color for the next shape
        graph.setColor(redColor);

        // Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc(115, 115, 50, 50, 0, 360);

        // Set color for next shape
        graph.setColor(Color.CYAN);

        // Draw another rectangle
        graph.drawRect(50, 50, 50, 50);

        // This will fill a rectangle
        graph.fillRect(50, 50, 60, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Shapes Example");
        DrawShapes panel = new DrawShapes();

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
