package sample;
import javax.swing.*;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    JLabel typeLabel;
    JLabel colorLabel;
    JLabel sidesLabel;
    JLabel sizeLabel;
    JComboBox shapeType;
    JComboBox shapeColor;
    JSpinner sidesNumber;
    JSpinner shapeSize;


    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    /**
     * the method creates and adds all the configuration panel's components (type, size, color, shape labels)
     */
    private void init()
    {
        /**
         * I created a label for different aspects of the shape
         */
        /**
         *  size
         */
        sizeLabel=new JLabel("Size:  ");
        shapeSize=new JSpinner(new SpinnerNumberModel(20,5,100,5));
        shapeSize.setValue(20);

        /**
         *  sides
         */
        sidesLabel=new JLabel("Sides:  ");
        sidesNumber=new JSpinner(new SpinnerNumberModel(4,3,20,1));
        sidesNumber.setValue(4);

        /**
         *type
         */
        typeLabel=new JLabel("Type: ");
        String[] types={"Polygon","Circle"};
        shapeType=new JComboBox(types);
        shapeType.setSelectedIndex(0);


        /**
         *  color
         */
        colorLabel=new JLabel("Color: ");
        String[] colors={"Random","Black"};
        shapeColor=new JComboBox(colors);
        shapeColor.setSelectedIndex(0);

        add(sizeLabel);
        add(shapeSize);
        add(sidesLabel);
        add(sidesNumber);
        add(typeLabel);
        add(shapeType);
        add(colorLabel);
        add(shapeColor);

    }

}