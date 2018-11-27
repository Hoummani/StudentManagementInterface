import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class FrameStudentsManagement extends JFrame {
    /*-----------------------------
      -------   Class attribut----
     */
    public JLabel image;
    public JLabel firstName,lastName,age,sex,schoolClass;
    public JTextField firstNameValue,lastNameValue,schoolClassValue;
    public JSlider ageValue;
    public JRadioButton men,women;
    public JButton updatePersonnelInfo;



    /*-------------------------------
    ------  Constructor -------------
     */
    public FrameStudentsManagement(){
        this.setSize(850,600);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension dm=tk.getScreenSize();

        int xPos=(dm.width/2)-(this.getWidth()/2);
        int yPos=(dm.height/2)-(this.getHeight()/2);
        this.setLocation(xPos,yPos);
        this.setResizable(false);

        this.setTitle("Students Management System");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Components
        JPanel thePanel=new JPanel();
        thePanel.setBackground(Color.darkGray);
        thePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        image=new JLabel(new ImageIcon("rsz_john-14-e1453307453324.jpg"));
        JPanel panelImage=new JPanel();
        panelImage.add(image);
        thePanel.add(panelImage);
        //Personnel informations
        JPanel personnelInfoPanel=new JPanel();
        personnelInfoPanel.setLayout(new GridBagLayout());

        TitledBorder personnelInfoBorder= BorderFactory.createTitledBorder("Personnel Informations");
        personnelInfoPanel.setBorder(personnelInfoBorder);

        firstName=new JLabel("First Name :");
        firstName.setFont(new Font("Arial",Font.ITALIC,16));
        firstNameValue=new JTextField("Yassine",40);

        addComponentsWay(personnelInfoPanel,firstName,0,0,1,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        addComponentsWay(personnelInfoPanel,firstNameValue,1,0,2,1,GridBagConstraints.WEST,GridBagConstraints.NONE);

        lastName=new JLabel("Last Name :");
        lastName.setFont(new Font("Arial",Font.ITALIC,16));
        lastNameValue=new JTextField("Hoummani",40);

        addComponentsWay(personnelInfoPanel,lastName,0,1,1,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        addComponentsWay(personnelInfoPanel,lastNameValue,1,1,2,1,GridBagConstraints.WEST,GridBagConstraints.NONE);

        age=new JLabel("Age :");
        age.setFont(new Font("Arial",Font.ITALIC,16));


        ageValue=new JSlider(JSlider.HORIZONTAL,0,100,5);

        ageValue.setMajorTickSpacing(10);
        ageValue.setMinorTickSpacing(5);
        ageValue.setValue(33);
        ageValue.setPaintLabels(true);
        ageValue.setPaintTicks(true);
        addComponentsWay(personnelInfoPanel,age,0,2,2,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        addComponentsWay(personnelInfoPanel,ageValue,1,2,5,1,GridBagConstraints.WEST,GridBagConstraints.NONE);

        sex=new JLabel("Sex :");
        sex.setFont(new Font("Arial",Font.ITALIC,16));
        men=new JRadioButton("Men");
        men.setSelected(true);
        women=new JRadioButton("Women");

        ButtonGroup sexGroup=new ButtonGroup();
        sexGroup.add(men);
        sexGroup.add(women);
        JPanel sexPanel=new JPanel();
        sexPanel.add(men);
        sexPanel.add(women);
        addComponentsWay(personnelInfoPanel,sex,0,3,2,1,GridBagConstraints.EAST,GridBagConstraints.NONE);
        addComponentsWay(personnelInfoPanel,sexPanel,1,3,5,1,GridBagConstraints.WEST,GridBagConstraints.NONE);

        updatePersonnelInfo=new JButton("Update Informations");
        addComponentsWay(personnelInfoPanel,updatePersonnelInfo,1,4,5,1,GridBagConstraints.CENTER,GridBagConstraints.NONE);

        thePanel.add(personnelInfoPanel);
        this.add(thePanel);


        //end of components
        this.setVisible(true);

    }
    public void addComponentsWay(JPanel panel,JComponent jComponent,int xPos,int yPos,int compWidth,int compHeight,int place,int stretch){
        GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.gridx=xPos;
        gridBagConstraints.gridy=yPos;
        gridBagConstraints.gridwidth=compWidth;
        gridBagConstraints.gridheight=compHeight;
        gridBagConstraints.weightx=300;
        gridBagConstraints.weighty=300;
        gridBagConstraints.insets=new Insets(10,10,10,10);
        gridBagConstraints.anchor=place;
        gridBagConstraints.fill=stretch;
        panel.add(jComponent,gridBagConstraints);
    }
}
