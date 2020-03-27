package sample;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    /**
     * Initializing the buttons
     */
    JButton loadBut= new JButton("Load");
    JButton saveBut = new JButton("Save");
    JButton resetBut = new JButton("Reset");
    JButton exitBut= new JButton("Exit");

    /**
     * The buttuns and their functions are added to the frame.
     *
     */
    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        add(loadBut);
        loadBut.addActionListener(this::load);
        add(saveBut);
        saveBut.addActionListener(this::save);
        add(resetBut);
        resetBut.addActionListener(this::reset);
        add(exitBut);
        exitBut.addActionListener(this::exit);
    }

    /**
     * saving the result as jpg
     */
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "JPG", new File("C:\\Users\\Sebi\\Desktop\\result.jpg"));
        } catch (IOException ex) {
            System.err.println("error at save");
        }
    }

    /**
     * Loading from given path
     */
    private void load(ActionEvent e) {
        try {
            BufferedImage img = ImageIO.read(new File("C:\\Users\\Sebi\\Desktop\\result.jpg"));
            frame.canvas.graphics.drawImage(img, 0, 0, this);

        } catch (IOException ex) {
            System.err.println("error at load");
        }

    }

    /**
     * Canvas is cleared
     */
    private void reset(ActionEvent e) {
        frame.canvas.clear();
    }

    /**
     * The frame is closed
     */
    private void exit(ActionEvent e) {
        System.exit(0);
    }
}