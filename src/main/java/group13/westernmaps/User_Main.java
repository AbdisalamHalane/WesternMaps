/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package group13.westernmaps;
import java.lang.Math;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import java.awt.Point;
import javax.swing.JTextArea;
/**
 *
 * @author blind
 */
public class User_Main extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    //
    
    public Weather w;
    
           
    //
    
    
    public JScrollPane m1S;
    public JScrollPane m2S;
    public JScrollPane m3S;
    public JScrollPane m4S;
    public JScrollPane m5S;
    
    public JScrollPane a1S;
    public JScrollPane a2S;
    public JScrollPane a3S;
    
    public JScrollPane w1S;
    public JScrollPane w2S;
    public JScrollPane w3S;
    public JScrollPane w4S;
    public JScrollPane w5S;
    public JScrollPane w6S;
    public JScrollPane w7S;
    
    public JTextField userNameField;
    public JPasswordField passWordField;
    
    
    private map map;
    private int width;
    private int height;
    private JTabbedPane mainP;
    private JTabbedPane Login_main;
    private JPanel loginPage;
    private JPanel editPage;
    private JButton logout;
    private JButton save;
    private javax.swing.JComboBox<String> option;
    private JButton searchButton1;
    private String[] poi;
    private JLabel list;
    
    private JLabel search;
    private JTextField searchBar;
    private javax.swing.JComboBox<String> floorOption;
    private JButton searchButton;

    //Layer Option
    //private JLabel layer
    private javax.swing.JComboBox<String> layerOption;
    private javax.swing.JComboBox<String> layerFloorOption;
    private JLabel layerText;
    private JButton layerButton;
    private JButton layerHide;
    private JButton removeLayer;
    private JButton editLayer;
    
    private JButton addLayer;
    private JLabel addLayerText;
    
    
    private javax.swing.JComboBox<String> useroptions;
    private JButton UCPOI;
    private JButton Uhide;
    private JButton Udisplay;
    private JLabel ULabel;
    
    private javax.swing.JComboBox<String> boptions;
    private JButton BPOI;
    private JLabel BLabels;
    
    
    
    
    
    // Favourites
    
    private javax.swing.JComboBox<String> favouriteOptions;
    private JLabel favouriteText;
    private JButton goFavourite;
    private JButton displayFav;
    private JButton hideFav;
    
    // Favourites
    
    private List floors;
    
    private JButton Weather;
    
    private JButton help;
    
    private List Building;
    
    private JPanel menu;
    
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel Middlesex1;
    private JLabel m1;
    private JPanel Middlesex2;
    private JLabel m2;
    private JPanel Middlesex3;
    private JLabel m3;
    private JPanel Middlesex4;
    private JLabel m4;
    private JPanel Middlesex5;
    private JLabel m5;
    private JPanel Alumni1;
    private JLabel a1;
    private JPanel Alumni2;
    private JLabel a2;
    private JPanel Alumni3;
    private JLabel a3;
    private JPanel Weldon1;
    private JLabel w1;
    private JPanel Weldon2;
    private JLabel w2;
    private JPanel Weldon3;
    private JLabel w3;
    private JPanel Weldon4;
    private JLabel w4;
    private JPanel Weldon5;
    private JLabel w5;
    private JPanel Weldon6;
    private JLabel w6;
    private JPanel Weldon7;
    private JLabel w7;
    
    private JLabel backGround2;
    private JPanel helpPanel;
    
    private JPanel weatherPanel;
    
    private JLabel currentWeather;
    
    
    // Admin edits 
    private JButton addBuilding;
    private JButton addFloor;
    private JButton removeBuilding;
    private JButton removeFloor;
    private javax.swing.JComboBox<String> buildingtoRemove;
    private javax.swing.JComboBox<String> floortoRemove;
    private javax.swing.JComboBox<String> floortoAdd;
    private javax.swing.JComboBox<String> buildingtoAdd;
    
    private JLabel addBF;
    private JLabel removeBF;
    // Adming edits
     
    
    private boolean online;
    
    public User_Main(map MAP){
        map = MAP;
        width = 800;
        height = 800;
        
        
        Login_main = new JTabbedPane();
        Login_main.setBounds(0,0,800,800);
        loginPage = new JPanel();
        editPage = new JPanel();
        editPage.setBackground(Color.darkGray);
        
        Login_main.addTab("Login", loginPage);
        Login_main.addTab("edit",editPage);

        
        
        
        //logout button
        logout = new JButton("Logout");
        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
        logout.setBounds(685,0,100,30);
        //Save button
        save = new JButton("Close");
        save.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
        save.setBounds(580,0,100,30);
        
        // main Panel
        mainP = new JTabbedPane();
        mainP.setBounds(150,200,632,562);
        
        helpPanel = new JPanel();
        
        JScrollPane helpScroll = new JScrollPane();
           
        JTextArea jTextArea1 = new JTextArea(); 
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\nABOUT:\n\nWestern Maps.\nTeam members:\nTeam 13\t1\tKoroush Emari\t        kemari@uwo.ca\nTeam 13\t2\tRobert Ghita\t        rghita@uwo.ca\nTeam 13\t3\tAbdisalam Halane\tahalane@uwo.ca\nTeam 13\t4\tMohammed Mustafa Khan\tmkhan545@uwo.ca\nTeam 13\t5\tJonathon Mikhael\tjmikhael@uwo.ca\n\nRelease Date: April 6th 2023\n\n\n:: HELP GUIDE ::\n\nMAP: \nTo navigate the maps, once on the main menu, the options of different buildings should be \ngiven to you, choose the building you want and select edit. A similar screen will pop up\nfor that building's floors, in the same fashion, choose the floor you want and you will be\non that floor's map. To navigate back to the main menu, simply click on the main menu tab \nat the top of the map.\n\n\nCreating point of interests:\n\nTo create Point of interests, simly click on the screen and a pop up will appear, guiding you\nwith the required properities of the Point of interest that should be filled. Once filled, hit \nok/save.\n\n**CAUTION, DO NOT ADD COMMA INTO YOUR NAME**\nEditing User Created Point of interest.\n\nTo edit a User created point of interest, simply click on the point of interest you want and\nthen the display and edit menu should appear. You would first be on the display tab, switch over\nto the edit tab and there you can see similar options as when you first created the point of interest.\nOnce satisfied, save your edit, or remove it if you like. You can also cancel your edit by pressing the\nclose button on the pop window.\n\nDisplay Layers:\n\nOnce you have selected a Layer from the drop down menu, simply press display, and the layer should be \ndisplayed. The hide button would hide the layer of interest.\n\nYou can add a new Layer to populate by putting in the name of your desired layer in the textbox under the layer\nselection, once you have finished choosing your name, press add, and the new layer should appear there and also\nas another option for types when making a new Point of Interest. (both as admin or user).\n\nYou can also remove a layer by selecting the layer you want to delete in the drop box, and then presssing remove.\n\nThe weather should be displayed in the bottom left corner, you can hit the update button to update the weater.\nYou can also hit the help guide again to see this page.\n\nYou can search a point of interest by first selecting a floor and then pressing the search button, if no result is \nfound, Nothing happens.\n\nYou can also select a point of interest youd like to discover in the drop box menu at the top left corner of the window.\nsimply press ok once finished selecting a POI.\n\nAdmin can create new Built In POIS. Login in as an admin, and you should be able to create one similar to how a user \nwould create their user created poi.\n\nYou can display and hide the usercreated point of interest by pressing the display/hide buttons where it says UPOI.\nYou can also select and go to a Usercreated Point of interest in that corner by selecting the User Created POI you want\nfrom the drop box menu and pressing ok.\n\nYou can favourite a point of interest you like by pressing it and then hitting the favourite buttton in the new pop up\nwindow, the point of interest should turn blue. You can also remove it by hitting the same favourite button.\nFavourites should be put in the favourite drop down menu, and then pressing ok. You can also display and hide favourites\nwith the hide and display buttons. NOTE, this does only the floor you are on.\n\nTo exit the help, select the main menu tab.\n- Abdisalam\n\n\n\n");
        helpScroll.setViewportView(jTextArea1);
        helpScroll.setBounds(0,0,632,562);
        helpPanel.setLayout(null);
        helpPanel.add(helpScroll);
        
        
        
        
        //String[] poi = {"1","2","3","4","5"};
        
        //POI List Text
        list = new JLabel("POI LIST");
        list.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
        list.setForeground(Color.WHITE);
        list.setBounds(0,-12,50,50);
        
        //dropable list
        option = new javax.swing.JComboBox<>();
        option.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        updatePickPOI();
        option.setBounds(70,0,100,30);
        
        searchButton1 = new JButton("Go");
        
        searchButton1.setBounds(173,0,55,30);
        
        w = new Weather();
        
        Weather = new JButton("Update Weather");
        Weather.setBounds(0,0,150,25);
        
        weatherPanel = new JPanel();
        weatherPanel.setLayout(null);
        weatherPanel.setBounds(0,570,150,140);
        
        
        
        currentWeather = new JLabel(w.getWeather());
        currentWeather.setFont(new java.awt.Font("Segoe UI Black", 0, 8));
        
        currentWeather.setBounds(0,60,150,25);
        weatherPanel.add(Weather);
        weatherPanel.add(currentWeather);
        editPage.add(weatherPanel);
        
        search = new JLabel("Search POI");
        search.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
        search.setForeground(Color.WHITE);
        search.setBounds(0,38,70,50);
        
        searchBar = new JTextField();
        searchBar.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
        searchBar.setBounds(223,50,100,30);
        
        searchButton = new JButton("Search");
        searchButton.setBounds(326,50,100,30);
        List floorsList_ = floorListgetter();
        String[] floorList__ = new String[floorsList_.getSize()];
        for (int i = 0; i<floorsList_.getSize();i++){
            floorList__[i] = (String)floorsList_.find(i+1)[1];
        }
        floorOption = new javax.swing.JComboBox<>();
        floorOption.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        floorOption.setModel(new javax.swing.DefaultComboBoxModel<>(floorList__));
        floorOption.setBounds(70,50,150,30);
        
        
        
        
        
        
        
        // Favourite code
        
        help = new JButton("Help");
        help.setBounds(0,712,150,25);
        
        
        this.setUpGUI();
    }
    
    //public void addtoSearchList(){
        
    
    
      //  for(int i = 0; i<)
   //}
    
    public void setUpGUI(){
        setSize(width,height);
        setTitle("Western Maps");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        setResizable(false);
        Container c = this.getContentPane();
        c.setBackground(Color.BLACK);
        
        
        //Login Page
        JLabel loginBackGround = new JLabel();
        loginBackGround.setIcon(new javax.swing.ImageIcon("login.jpg"));
        loginBackGround.setBounds(0,0,800,800);
        javax.swing.JComboBox<String> loginOptions = new javax.swing.JComboBox<>();
        loginOptions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        loginOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        loginOptions.setBounds(450,300,150,30);
        
        userNameField = new JTextField();
        passWordField = new JPasswordField();
        userNameField.setBounds(450,350,150,30);
        passWordField.setBounds(450,400,150,30);
        
        JLabel userNameLabel = new JLabel("UserName     :");
        JLabel passWordLabel = new JLabel("Password      :");
        JLabel userType = new JLabel("Editor Mode :");
        
        userNameLabel.setBounds(250,350,150,30);
        userNameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        passWordLabel.setBounds(250,400,150,30);
        passWordLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        userType.setBounds(250,300,150,30);
        userType.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18));
        loginButton.setBounds(450,500,150,30);
        
        
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt,userNameField.getText(),passWordField.getText(),(String)loginOptions.getSelectedItem());
            }
        });
        
        loginPage.setLayout(null);
        loginPage.add(loginButton);
        loginPage.add(userType);
        loginPage.add(passWordLabel);
        loginPage.add(userNameLabel);
        loginPage.add(userNameField);
        loginPage.add(passWordField);
        loginPage.add(loginOptions);
        loginPage.add(loginBackGround);
        
        
        //Login Page
        
        //
        List layerList = layerList(map.buildingList);
        String[] layers = new String[layerList.getSize()];
        for (int i = 0; i<layerList.getSize();i++){
            layers[i] = (String)layerList.find(i+1)[1];
        }
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            if(true){
                List floorsList_ = floorListgetter();
                String[] floorList__ = new String[floorsList_.getSize()];
                for (int i = 0; i<floorsList_.getSize();i++){
                    floorList__[i] = (String)floorsList_.find(i+1)[1];
                }
                online = true;
            // layer
                layerText = new JLabel("Select A Layer");
                layerText.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18
                layerText.setForeground(Color.WHITE);
                layerText.setBounds(0,88,100,50);
                editPage.add(layerText);
                
                
                
                layerOption = new javax.swing.JComboBox<>();
                layerOption.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
                layerOption.setModel(new javax.swing.DefaultComboBoxModel<>(layers));
                layerOption.setBounds(70,100,200,30);
                editPage.add(layerOption);



                layerButton = new JButton("Display");
                layerButton.setBounds(278,100,100,30);
                editPage.add(layerButton);

                layerButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        
                        highlightm1((String)layerOption.getSelectedItem(),map.currentBuilding.getBuildingName(),map.currentFloor.getName());
                    }                  
                });
                
                layerHide = new JButton("Hide");
                layerHide.setBounds(381,100,100,30);
                editPage.add(layerHide);
                
                layerHide.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        
                        hideLayer((String)layerOption.getSelectedItem(),map.currentBuilding.getBuildingName(),map.currentFloor.getName());
                    }                  
                });
                
                removeLayer = new JButton("Remove");
                removeLayer.setBounds(482,100,150,30);
                editPage.add(removeLayer);
                
                removeLayer.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    map.buildingList = removeLayer(map.buildingList,(String)layerOption.getSelectedItem());
                    List layerList = layerList(map.buildingList);
                    String[] layers = new String[layerList.getSize()];
                    for (int i = 0; i<layerList.getSize();i++){
                        layers[i] = (String)layerList.find(i+1)[1];
                    }
                    layerOption.setModel(new javax.swing.DefaultComboBoxModel<>(layers));
                    }                    
                });
                
                addLayerText = new JLabel("Add a Layer");
                addLayerText.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18
                addLayerText.setForeground(Color.WHITE);
                addLayerText.setBounds(0,138,100,50);
                editPage.add(addLayerText);
                
                JTextField addNewLayer = new JTextField();
                addNewLayer.setBounds(173, 150, 100, 30);
                editPage.add(addNewLayer);
                

                addLayer = new JButton("Add");
                addLayer.setBounds(70,150,100,30);
                editPage.add(addLayer);
                
                addLayer.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                    
                    map.buildingList = addLayer(map.buildingList,(String)addNewLayer.getText());
                    List layerList = layerList(map.buildingList);
                    String[] layers = new String[layerList.getSize()];
                    for (int i = 0; i<layerList.getSize();i++){
                        layers[i] = (String)layerList.find(i+1)[1];
                    }
                    layerOption.setModel(new javax.swing.DefaultComboBoxModel<>(layers));
                    }                    
                });
                //

                // Favourite code
                favouriteOptions= new javax.swing.JComboBox<>();
                favouriteOptions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
                favouriteList(false);
                favouriteOptions.setBounds(0,250,150,30);
                editPage.add(favouriteOptions);

                favouriteText = new JLabel("Select a Favourite");
                favouriteText.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18
                favouriteText.setForeground(Color.WHITE);
                favouriteText.setBounds(10,210,150,50);
                editPage.add(favouriteText);

                displayFav = new JButton("Display");
                displayFav.setBounds(0,330,150,30);
                hideFav = new JButton("Hide");
                hideFav.setBounds(0,370,150,30);
                
                hideFav.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    hideFavourite();
                }
                });
                
                displayFav.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    displayFavourite();
                }
                });
                
                
                UCPOI = new JButton("GO");
                UCPOI.setBounds(479,150,50,30);
                UCPOI.setFont(new java.awt.Font("Segoe UI Black", 0, 7));
                
                Uhide = new JButton("Hide");
                Uhide.setFont(new java.awt.Font("Segoe UI Black", 0, 7));
                Uhide.setBounds(605,150,60,30);
                Udisplay = new JButton("Display");
                Udisplay.setFont(new java.awt.Font("Segoe UI Black", 0, 7));
                Udisplay.setBounds(532,150,70,30);
                
                Udisplay.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    displayUPOI();
                }
                });
                
                Uhide.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    hideUPOI();
                }
                });
                
                ULabel = new JLabel("UPOI : ");
                ULabel.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
                ULabel.setBounds(306,150,70,30);
                
                
                
                
                useroptions= new javax.swing.JComboBox<>();
                useroptions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
                favouriteList(false);//replace with new code
                useroptions.setBounds(376,150,100,30);
                
                
                BPOI = new JButton("GO");
                BPOI.setFont(new java.awt.Font("Segoe UI Black", 0, 7));
                BPOI.setBounds(682,50,70,30);
                
                
                BLabels = new JLabel("UPOI : ");
                BLabels.setFont(new java.awt.Font("Segoe UI Black", 0, 10));
                BLabels.setBounds(306,150,70,30);
                
                boptions=new javax.swing.JComboBox<>();
                boptions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
                favouriteList(false);// replace with new code
                boptions.setBounds(529,50,150,30);
                
                
                
                
                editPage.add(boptions);
                editPage.add(BPOI);
                
                BPOI.addActionListener(new java.awt.event.ActionListener() {
                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBPOI();
                }
                });
                
                UCPOI.addActionListener(new java.awt.event.ActionListener() {
                 public void actionPerformed(java.awt.event.ActionEvent evt) {
                goUPOI();
                }
                });
                editPage.add(useroptions);
                editPage.add(UCPOI);
                editPage.add(Uhide);
                editPage.add(Udisplay);
                editPage.add(ULabel);
                
                editPage.add(displayFav);
                editPage.add(hideFav);
                
                editPage.remove(backGround2);
                editPage.add(backGround2);
                
            }
            //
        }
        });
        
        
        goFavourite = new JButton("Go");
        goFavourite.setBounds(0,290,150,30);
        editPage.add(goFavourite);
        
        JButton button = new JButton("Logout");
        button.setBounds(50,50,50,25);
   
        panel = new JPanel();
        JLabel backGround = new JLabel();
        //Change this image
        backGround.setIcon(new javax.swing.ImageIcon("mainmenu.jpg"));
        panel.setLayout(null);
        
        backGround.setBounds(0,0,632,562);
        
        mainP.addTab("MainMenu", panel);
        mainP.addTab("Help",helpPanel);
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int x = mainP.indexOfTab("Help");
                mainP.setSelectedIndex(x);
            }
        });
        
        List buildingList = buildingList();
        String[] buildingList__ = new String[buildingList.getSize()];
        for (int i = 0; i<buildingList.getSize();i++){
            buildingList__[i] = (String)buildingList.find(i+1)[1];
        }
        System.out.println(buildingList__[2]);
        javax.swing.JComboBox<String> buildingOptions = new javax.swing.JComboBox<>();
        buildingOptions.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        buildingOptions.setModel(new javax.swing.DefaultComboBoxModel<>(buildingList__));
        buildingOptions.setBounds(200,200,150,30);
        
        JLabel selectBuilding = new JLabel("Select a Building");
        selectBuilding.setFont(new java.awt.Font("Segoe UI Black", 0, 17));
        selectBuilding.setForeground(Color.WHITE);
        selectBuilding.setBackground(Color.BLACK);
        selectBuilding.setOpaque(true);
        selectBuilding.setBounds(50,200,200,30);
        
        JButton go = new JButton("GO");
        go.setBounds(350,200,75,30);
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBuilding(evt,buildingOptions);
                
                String name = (String)buildingOptions.getSelectedItem();
                System.out.println(name);
                int index__ ;
                if(name.equals("Weldon")){
                    index__ = 3;
                }else{
                    index__ = (int)map.buildingList.findBuilding(name)[1];
                }
                System.out.print(index__);
                map.changeBuilding((Building)map.buildingList.find(index__)[1]);
               
            }
         
        });
        
        
        
        panel.add(buildingOptions);
        panel.add(selectBuilding);
        panel.add(go);
        panel.add(backGround);
       
        
        
        //MiddleSex 
        panel2 = new JPanel();
        //MiddleSex code
        panel2.setLayout(null);
        javax.swing.JComboBox<String> middleSexFloors = new javax.swing.JComboBox<>();
        middleSexFloors.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        middleSexFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Middlesex1","Middlesex2","Middlesex3","Middlesex4","Middlesex5"}));
        middleSexFloors.setBounds(200,200,150,30);
        
        JLabel selectMiddleSexFloor = new JLabel("Select a Floor");
        selectMiddleSexFloor.setFont(new java.awt.Font("Segoe UI Black", 0, 17));
        selectMiddleSexFloor.setForeground(Color.WHITE);
        selectMiddleSexFloor.setBackground(Color.BLACK);
        selectMiddleSexFloor.setOpaque(true);
        selectMiddleSexFloor.setBounds(50,200,200,30);
        
        JButton go1 = new JButton("GO");
        go1.setBounds(350,200,75,30);
        go1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBuilding(evt,middleSexFloors);
                String name = (String)buildingOptions.getSelectedItem();
                int index__ = (int)map.buildingList.findBuilding(name)[1];
                Building buidling__ = (Building)map.buildingList.find(index__)[1];
                String str = ((String)middleSexFloors.getSelectedItem());
                str = String. valueOf((char)str.charAt(str.length()-1));
                map.changeFloor((floor)buidling__.getFloor(Integer.parseInt(str)));
            }
        });
        
        JLabel middlesexBackGround = new JLabel();
        middlesexBackGround.setIcon(new javax.swing.ImageIcon("middlesex__.jpg"));
        middlesexBackGround.setBounds(0,0,632,562);
        
        panel2.add(middleSexFloors);
        panel2.add(selectMiddleSexFloor);
        panel2.add(go1);
        panel2.add(middlesexBackGround);
        
        
        //MiddleSex code
        
        
        //Alumnai 
        panel3 = new JPanel();
        //Alumnai Code
        
        panel3.setLayout(null);
        javax.swing.JComboBox<String> AlumnaiFloors = new javax.swing.JComboBox<>();
        AlumnaiFloors.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        AlumnaiFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumni1","Alumni2","Alumni3"}));
        AlumnaiFloors.setBounds(200,200,150,30);
        
        JLabel selectAlumnaiFloor = new JLabel("Select a Floor");
        selectAlumnaiFloor.setFont(new java.awt.Font("Segoe UI Black", 0, 17));
        selectAlumnaiFloor.setForeground(Color.WHITE);
        selectAlumnaiFloor.setBackground(Color.BLACK);
        selectAlumnaiFloor.setOpaque(true);
        selectAlumnaiFloor.setBounds(50,200,200,30);
        
        JButton go2 = new JButton("GO");
        go2.setBounds(350,200,75,30);
        go2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBuilding(evt,AlumnaiFloors);
                String name = (String)buildingOptions.getSelectedItem();
                int index__ = (int)map.buildingList.findBuilding(name)[1];
                Building buidling__ = (Building)map.buildingList.find(index__)[1];;
                String str = ((String)AlumnaiFloors.getSelectedItem());
                str = String. valueOf((char)str.charAt(str.length()-1));
                map.changeFloor((floor)buidling__.getFloor(Integer.parseInt(str)));
            }
        });
        
        
        JLabel alumniBackGround = new JLabel();
        alumniBackGround.setIcon(new javax.swing.ImageIcon("alumni.jpg"));
        alumniBackGround.setBounds(0,0,632,562);
        
        
        panel3.add(AlumnaiFloors);
        panel3.add(selectAlumnaiFloor);
        panel3.add(go2);
        panel3.add(alumniBackGround);
        
        //Alumnai Code
        
        
        
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToPOI();
            }
        });
        
        
        
        
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPOI();
            }
        });
        
        
        Weather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEWEATHER();
            }
        });
        
        //Weldon 
        panel4 = new JPanel();
        //Weldon 3 Code
        
        panel4.setLayout(null);
        javax.swing.JComboBox<String> WeldonFloors = new javax.swing.JComboBox<>();
        WeldonFloors.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18
        WeldonFloors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weldon1","Weldon2","Weldon3","Weldon4","Weldon5","Weldon6","Weldon7"}));
        WeldonFloors.setBounds(200,200,150,30);
        
        JLabel selectWeldonFloor = new JLabel("Select a Floor");
        selectWeldonFloor.setFont(new java.awt.Font("Segoe UI Black", 0, 17));
        selectWeldonFloor.setForeground(Color.WHITE);
        selectWeldonFloor.setBackground(Color.BLACK);
        selectWeldonFloor.setOpaque(true);
        selectWeldonFloor.setBounds(50,200,200,30);
        
        JButton go3 = new JButton("GO");
        go3.setBounds(350,200,75,30);
        go3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToBuilding(evt,WeldonFloors);
                String name = (String)buildingOptions.getSelectedItem();
                int index__ = (int)map.buildingList.findBuilding(name)[1];
                Building buidling__ = (Building)map.buildingList.find(index__)[1];
                String str = ((String)WeldonFloors.getSelectedItem());
                str = String. valueOf((char)str.charAt(str.length()-1));
                map.changeFloor((floor)buidling__.getFloor(Integer.parseInt(str)));
                
            }
        });
        
        JLabel weldonBackGround = new JLabel();
        weldonBackGround .setIcon(new javax.swing.ImageIcon("weldon.jpg"));
        weldonBackGround .setBounds(0,0,632,562);
        
        panel4.add(WeldonFloors);
        panel4.add(selectWeldonFloor);
        panel4.add(go3);
        panel4.add(weldonBackGround );
        
        //Weldon Code
        
        
        
        //

        goFavourite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToFavourite();
            }
        });
        
        //
        //
        
        
        //floor for MiddleSex
        
        
        //floor 1 for middleSex
        Middlesex1 = new JPanel();
        m1S= new JScrollPane();
        m1 = new JLabel();
        m1.setIcon(new javax.swing.ImageIcon("MiddleSex1.jpg"));
        Middlesex1.setLayout(null);
        
        m1S.setViewportView(m1);
        m1S.setBounds(0,0,632,562);
        Middlesex1.add(m1S);
        m1.setLayout(null);
        m1.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    middlesex1EditorUser(e);
                }
                else{
                    middlesex1EditorAdmin(e);
                }
                }
            });
        
        
        
    
        // floor 1 for middlesex
        
        //floor 2 for middlesex
        
        Middlesex2 = new JPanel();
        m2S= new JScrollPane();
        m2 = new JLabel();
        m2.setIcon(new javax.swing.ImageIcon("MiddleSex2.jpg"));
        Middlesex2.setLayout(null);
        
        m2S.setViewportView(m2);
        m2S.setBounds(0,0,632,562);
        Middlesex2.add(m2S);
        m2.setLayout(null);
        m2.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    middlesex2EditorUser(e);
                }
                else{
                    middlesex2EditorAdmin(e);
                }
                }
            });
        
        //floor 2 for middlesex
        
        //floor 3 for middlesex
        Middlesex3 = new JPanel();
        m3S= new JScrollPane();
        m3 = new JLabel();
        m3.setIcon(new javax.swing.ImageIcon("MiddleSex3.jpg"));
        Middlesex3.setLayout(null);
        
        m3S.setViewportView(m3);;
        m3S.setBounds(0,0,632,562);
        Middlesex3.add(m3S);
        m3.setLayout(null);
        m3.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    middlesex3EditorUser(e);
                }
                else{
                    middlesex3EditorAdmin(e);
                }
                }
            });
        
        
        //floor 3 for middlesex
        
        //floor 4 for middlesex
        Middlesex4 = new JPanel();
        m4S= new JScrollPane();
        m4 = new JLabel();
        m4.setIcon(new javax.swing.ImageIcon("MiddleSex4.jpg"));
        Middlesex4.setLayout(null);
        
        m4S.setViewportView(m4);
        m4S.setBounds(0,0,632,562);
        Middlesex4.add(m4S);
        m4.setLayout(null);
        m4.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    middlesex4EditorUser(e);
                }
                else{
                    middlesex4EditorAdmin(e);
                }
                }
            });
        
        
        
        
        //floor 4 for middlesex
        
        //floor 5 for middlesex
        Middlesex5 = new JPanel();
        m5S= new JScrollPane();
        m5 = new JLabel();
        m5.setIcon(new javax.swing.ImageIcon("MiddleSex5.jpg"));
        Middlesex5.setLayout(null);
        
        m5S.setViewportView(m5);
        m5S.setBounds(0,0,632,562);
        Middlesex5.add(m5S);
        m5.setLayout(null);
        m5.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    middlesex5EditorUser(e);
                }
                else{
                    middlesex5EditorAdmin(e);
                }
                }
            });
        //floor 5 for middlesex
        
        // floor for Middle Sex
        
        
        //floor for Alumani
        //Alumni1
            Alumni1 = new JPanel();
            
            a1S= new JScrollPane();
            a1 = new JLabel();
            a1.setIcon(new javax.swing.ImageIcon("Alumnai1.jpg"));
            Alumni1.setLayout(null);
        
            a1S.setViewportView(a1);
            a1S.setBounds(0,0,632,562);
            Alumni1.add(a1S);
            a1.setLayout(null);
            a1.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    alumni1EditorUser(e);
                }
                else{
                    alumni1EditorAdmin(e);
                }
                }
            });
        //Alumni1
        
        //Alumni2
            Alumni2 = new JPanel();
            a2S= new JScrollPane();
            a2 = new JLabel();
            a2.setIcon(new javax.swing.ImageIcon("Alumnai2.jpg"));
            Alumni2.setLayout(null);
        
            a2S.setViewportView(a2);
            a2S.setBounds(0,0,632,562);
            Alumni2.add(a2S);
            a2.setLayout(null);
            a2.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    alumni2EditorUser(e);
                }
                else{
                    alumni2EditorAdmin(e);
                }
                }
            });
        //Alumni2
        
        //Alumni 3
            Alumni3 = new JPanel();
            a3S= new JScrollPane();
            a3 = new JLabel();
            a3.setIcon(new javax.swing.ImageIcon("Alumnai3.jpg"));
            Alumni3.setLayout(null);
        
            a3S.setViewportView(a3);
            a3S.setBounds(0,0,632,562);
            Alumni3.add(a3S);
            a3.setLayout(null);
            a3.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    alumni3EditorUser(e);
                }
                else{
                    alumni3EditorAdmin(e);
                }
                }
            });
        //Alumni 3
        
        //floorforAlumnai
        
        
        
        //floor for Weldon
        
        // Weldon1
            Weldon1 = new JPanel();
            w1S= new JScrollPane();
            w1 = new JLabel();
            w1.setIcon(new javax.swing.ImageIcon("Weldon1.jpg"));
            Weldon1.setLayout(null);
        
            w1S.setViewportView(w1);
            w1S.setBounds(0,0,632,562);
            Weldon1.add(w1S);
            w1.setLayout(null);
            w1.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon1EditorUser(e);
                }
                else{
                    weldon1EditorAdmin(e);
                }
                }
            });
        // Weldon 1
        
        // Weldon 2
            Weldon2 = new JPanel();
            w2S= new JScrollPane();
            w2 = new JLabel();
            w2.setIcon(new javax.swing.ImageIcon("Weldon2.jpg"));
            Weldon2.setLayout(null);
        
            w2S.setViewportView(w2);
            w2S.setBounds(0,0,632,562);
            Weldon2.add(w2S);
            w2.setLayout(null);
            w2.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon2EditorUser(e);
                }
                else{
                    weldon2EditorAdmin(e);
                }
                }
            });
        // Weldon 2
        
        // Weldon 3
            Weldon3 = new JPanel();
            w3S= new JScrollPane();
            w3 = new JLabel();
            w3.setIcon(new javax.swing.ImageIcon("Weldon3.jpg"));
            Weldon3.setLayout(null);
        
            w3S.setViewportView(w3);
            w3S.setBounds(0,0,632,562);
            Weldon3.add(w3S);
            w2.setLayout(null);
            w2.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon3EditorUser(e);
                }
                else{
                    weldon3EditorAdmin(e);
                }
                }
            });
        // Weldon 3
        
        // Weldon 4
            Weldon4 = new JPanel();
            w4S= new JScrollPane();
            w4 = new JLabel();
            w4.setIcon(new javax.swing.ImageIcon("Weldon4.jpg"));
            Weldon4.setLayout(null);
        
            w4S.setViewportView(w4);
            w4S.setBounds(0,0,632,562);
            Weldon4.add(w4S);
            w4.setLayout(null);
            w4.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon4EditorUser(e);
                }
                else{
                    weldon4EditorAdmin(e);
                }
                }
            });
        // Weldon 4
        
        // Weldon 5
            Weldon5 = new JPanel();
            w5S= new JScrollPane();
            w5 = new JLabel();
            w5.setIcon(new javax.swing.ImageIcon("Weldon5.jpg"));
            Weldon5.setLayout(null);
        
            w5S.setViewportView(w5);
            w5S.setBounds(0,0,632,562);
            Weldon5.add(w5S);
            w5.setLayout(null);
            w5.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon5EditorUser(e);
                }
                else{
                    weldon5EditorAdmin(e);
                }
                }
            });
        // Weldon 5
        
        // Weldon 6
            Weldon6 = new JPanel();
            w6S= new JScrollPane();
            w6 = new JLabel();
            w6.setIcon(new javax.swing.ImageIcon("Weldon6.jpg"));
            Weldon6.setLayout(null);
        
            w6S.setViewportView(w6);
            w6S.setBounds(0,0,632,562);
            Weldon6.add(w6S);
            w6.setLayout(null);
            w6.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon6EditorUser(e);
                }
                else{
                    weldon6EditorAdmin(e);
                }
                }
            });
        // Weldon 6
        
        // Weldon 7
            Weldon7 = new JPanel();
            w7S= new JScrollPane();
            w7 = new JLabel();
            w7.setIcon(new javax.swing.ImageIcon("Weldon7.jpg"));
            Weldon7.setLayout(null);
        
            w7S.setViewportView(w7);
            w7S.setBounds(0,0,632,562);
            Weldon7.add(w7S);
            w7.setLayout(null);
            w7.addMouseListener(new MouseAdapter(){
            public void mouseClicked( MouseEvent e){
                if(online){
                    weldon7EditorUser(e);
                }
                else{
                    weldon7EditorAdmin(e);
                }
                }
            });
        // Weldon 7
        floorsUpdater();

        
        //floor for Weldon
        mainP.add("Middlesex1",Middlesex1);
        mainP.add("Middlesex2",Middlesex2);
        mainP.add("Middlesex3",Middlesex3);
        mainP.add("Middlesex4",Middlesex4);
        mainP.add("Middlesex5",Middlesex5);
        
        mainP.add("Alumni1",Alumni1);
        mainP.add("Alumni2",Alumni2);
        mainP.add("Alumni3",Alumni3);
        
        mainP.add("Weldon1",Weldon1);
        mainP.add("Weldon2",Weldon2);
        mainP.add("Weldon3",Weldon3);
        mainP.add("Weldon4",Weldon4);
        mainP.add("Weldon5",Weldon5);
        mainP.add("Weldon6",Weldon6);
        mainP.add("Weldon7",Weldon7);
        
        mainP.add("Middlesex",panel2);
        mainP.add("Alumni",panel3);
        mainP.add("Weldon",panel4);
        
        
        JLabel barM = new JLabel();
        barM.setBackground(Color.DARK_GRAY);
        barM.setOpaque(true);
        barM.setBounds(0,0,800,25);
        this.add(barM);
        
        JLabel bar = new JLabel();
        bar.setBackground(Color.black);
        bar.setOpaque(true);
        bar.setBounds(255,200,800,62);
        JLabel bar2 = new JLabel();
        bar2.setBackground(Color.black);
        bar2.setOpaque(true);
        bar2.setBounds(150,180,800,62);
        editPage.setLayout(null);
        this.setVisible(true);
        editPage.add(logout);
        editPage.add(bar);
        editPage.add(bar2);
        editPage.add(mainP);
        //add(button);
        editPage.add(save);
        editPage.add(option);
        editPage.add(list);
        editPage.add(floorOption);
        editPage.add(search);
        editPage.add(searchBar);
        editPage.add(searchButton);
        editPage.add(searchButton1);
        editPage.add(help);
        // Background
        
        backGround2 = new JLabel();
        backGround2.setIcon(new javax.swing.ImageIcon("background.jpg"));
        backGround2.setBounds(0,0,800,800);
        editPage.add(backGround2);
        
        // Background
        
        this.add(Login_main);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        // logout button
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout(evt);
            }
        });
        
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save(evt);
            }
        });
        
        //this.addLayer("Class Room");
    }
    
    //M1
    public void middlesex1EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m1.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = m1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = m1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m1.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        m1.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);

                                        Component TEMPCOMPONENT = m1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m1.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        m1.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = m1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m1.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    m1.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m1.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void floorsUpdater(){
        if(map.poiList == null){
            return;
        }
        
        int buildingsize = map.buildingList.getSize();
        
        List floors;
        
        int poiListSize = map.poiList.getSize();
        
        for(int i = 1;i<poiListSize+1; i++){
            BuiltInPOI tempPOI  = (BuiltInPOI)map.poiList.find(i)[1];
            int[] xy = tempPOI.getXYLocation();
            String buildingName = tempPOI.getBuildingName();
            int floorNumber = tempPOI.getFloorNumber();
            boolean fav = tempPOI.getFavourite();
            System.out.println(fav);
            if((buildingName).equals("Middlesex")&&(floorNumber == 1)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    m1.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m1.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m1.add(toAdd);
                    }
                }
                
            }

        //middlesex1
        
        //m2
        if((buildingName).equals("Middlesex")&&(floorNumber == 2)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    m2.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m2.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m2.add(toAdd);
                    }
                }
                
            }
        //m2
        
        //m3
        if((buildingName).equals("Middlesex")&&(floorNumber == 3)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    m3.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m3.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m3.add(toAdd);
                    }
                }
                
            } 
        //m3
        
        
        //m4
        if((buildingName).equals("Middlesex")&&(floorNumber == 4)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    m4.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m4.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m4.add(toAdd);
                    }
                }
                
            }
        //m4
        
        
        
        //m5
        if((buildingName).equals("Middlesex")&&(floorNumber == 5)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    m5.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m5.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        m5.add(toAdd);
                    }
                }
                
            }
        //m5
        
        //a1
        if((buildingName).equals("Alumni")&&(floorNumber == 1)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    a1.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a1.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a1.add(toAdd);
                    }
                }
                
            }
        //a1
        
        //a2
        if((buildingName).equals("Alumni")&&(floorNumber == 2)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    a2.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a2.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a2.add(toAdd);
                    }
                }
                
            }
        //a2
        
        //a3
        if((buildingName).equals("Alumni")&&(floorNumber == 3)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    a3.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a3.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        a3.add(toAdd);
                    }
                }
                
            }
        //a3
        
        //w1
        if((buildingName).equals("Weldon")&&(floorNumber == 1)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w1.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w1.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w1.add(toAdd);
                    }
                }
                
            }
        //w1
        
        //w2
        if((buildingName).equals("Weldon")&&(floorNumber == 2)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w2.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w2.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w2.add(toAdd);
                    }
                }
                
            }
        //w2
        
        
        //w3
        if((buildingName).equals("Weldon")&&(floorNumber == 3)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w3.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w3.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w3.add(toAdd);
                    }
                }
                
            }
        //w3
        
        //w4
        if((buildingName).equals("Weldon")&&(floorNumber == 4)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w4.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w4.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w4.add(toAdd);
                    }
                }
                
            }
        //w4
        
        //w5
        if((buildingName).equals("Weldon")&&(floorNumber == 5)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w5.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w5.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w5.add(toAdd);
                    }
                }
                
            }
        //w5
        
        //w6
        if((buildingName).equals("Weldon")&&(floorNumber == 6)){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w6.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w6.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w6.add(toAdd);
                    }
                }
                
            }
        //w6
        
        //w7
        if((buildingName).equals("Weldon")&&(floorNumber ==7 )){
                if(fav){
                    JLabel toAdd = new JLabel(new javax.swing.ImageIcon("favourite.png"));
                    toAdd.setBounds(xy[0],xy[1],50,50);
                    w7.add(toAdd);
                }
                else{
                    if(tempPOI.builtIn){
                        System.out.println(1);
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("builtinpoi.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w7.add(toAdd);
                    }
                    else{
                        JLabel toAdd = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                        toAdd.setBounds(xy[0],xy[1],50,50);
                        w7.add(toAdd);
                    }
                }
                
            }
        //w7
        
        
        }//for loor
        
    }
    
    public void middlesex1EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updateBPOI();
                                updatePickPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m1.add(POI);
                    updatePickPOI();
                    updateBPOI();
                }
                else{
                    Component[] tcomponents = m1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            System.out.println(1);
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m1.remove(TEMPCOMPONENT);
                                    System.out.println("THIS IS A BUILT IN POI");
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    
                                    }
                            });
                        }

                    }
    }
    //M1
    
    
    
    //M2
    public void middlesex2EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m2.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = m2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m2.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        m2.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = m2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m2.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        m2.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = m2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m2.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    m2.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    updateUCPOI();
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void middlesex2EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m2.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m2.add(POI);
                    updatePickPOI();
                    updateBPOI();
                }
                else{
                    Component[] tcomponents = m2.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    //M2
    
    
    
    //M3
    
    public void middlesex3EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m3.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = m3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m3.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        m3.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = m3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m3.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        m3.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = m3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m3.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    m3.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    public void middlesex3EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m3.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m3.add(POI);
                    updatePickPOI();
                    
                }
                else{
                    Component[] tcomponents = m3.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //M3
    
    
    
    //M4
    public void middlesex4EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m4.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = m4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m4.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        m4.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = m4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m4.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        m4.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = m4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m4.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    m4.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m4.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void middlesex4EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m4.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m4.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = m4.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m4.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    //M4
    
    //M5
    public void middlesex5EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updateUCPOI();
                                updatePickPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updateUCPOI();
                                updatePickPOI();
                                
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m5.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = m5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m5.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        m5.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = m5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        m5.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        m5.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = m5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m5.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    m5.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m5.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    public void middlesex5EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m5.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updateBPOI();
                                updatePickPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updateBPOI();
                                updatePickPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    m5.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = m5.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = m5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    m5.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    //M5
    
    
    //A1
    public void alumni1EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a1.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = a1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a1.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        a1.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = a1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a1.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        a1.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = a1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a1.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    a1.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a1.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void alumni1EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = a1.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a1.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a1.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //A1
    
    
    //A2
    public void alumni2EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a2.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = a2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a2.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        a2.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = a2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a2.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        a2.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = a2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a2.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    a2.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    public void alumni2EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = a2.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateBPOI();
                                
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a2.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = a2.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    t.dispose();
                                    updateBPOI();
                                    updatePickPOI();
                                    }
                            });
                        }

                    }
    }
    
    //A2
    
    
    
    //A3
    public void alumni3EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a3.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = a3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a3.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        a3.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = a3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        a3.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        a3.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = a3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a3.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    a3.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    t.dispose();
                                    updateUCPOI();
                                    updatePickPOI();
                                    }
                            });
                        }

                    }
    }
    
    public void alumni3EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = a3.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    a3.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = a3.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = a3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    a3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    
                                    }
                            });
                        }

                    }
    }
    
    //A3
    
    
    //W1
    public void weldon1EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w1.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w1.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w1.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w1.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w1.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w1.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w1.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w1.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void weldon1EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w1.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w1.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w1.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w1.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updateBPOI();
                                    t.dispose();
                                    updatePickPOI();
                                    }
                            });
                        }

                    }
    }
    
    //W1
    
    
    //W2
    
    public void weldon2EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w2.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w2.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w2.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w2.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w2.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w2.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w2.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    public void weldon2EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w2.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w2.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w2.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w2.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w2.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //W2
    
    
    //W3
    
    public void weldon3EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    updatePickPOI();
                    w3.add(POI);
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w3.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w3.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w3.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w3.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w3.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w3.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void weldon3EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w3.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w3.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w3.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w3.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w3.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    t.dispose();
                                    updateBPOI();
                                    updatePickPOI();
                                    }
                            });
                        }

                    }
    }
    
    //W3
    
    
    //W4
    public void weldon4EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w4.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w4.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w4.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w4.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w4.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w4.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w4.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w4.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    public void weldon4EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w4.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w4.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w4.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w4.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w4.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //W4
    
    
    //W5
    public void weldon5EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w5.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w5.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w5.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w5.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w5.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w5.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w5.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w5.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    
    
    public void weldon5EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w5.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w5.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w5.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w5.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w5.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //W5
    
    
    //W6
    public void weldon6EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w6.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w6.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w6.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w6.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w6.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w6.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w6.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w6.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w6.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w6.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w6.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w6.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void weldon6EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w6.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updateBPOI();
                                updatePickPOI();
                                
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w6.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w6.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w6.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w6.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //W6
    
    
    //W7
    public void weldon7EditorUser(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = m1.getComponentAt(e.getX(), e.getY());
                
                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();updateUCPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = false;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateUCPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("poi2.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w7.add(POI);
                    updatePickPOI();
                }
                else{
                    //Component[] tcomponents = a1.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);

                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    t.jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                if(map.favourites != null){
                                    if(tpoi.isFavourite){
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        tpoi.isFavourite = true;
                                        
                                        map.favourites.removeFav(tpoi);
                                        tpoi.isFavourite = false;
                                        map.poiList.add(tpoi);
                                        Component TEMPCOMPONENT = w7.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w7.remove(TEMPCOMPONENT);
                                        if(!tpoi.builtIn){
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                                        }
                                        else{
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtinpoi.png"));
                                        }
                                        w7.add(TEMPCOMPONENT);
                                        favouriteList(false);
                                        t.dispose();
                                    }
                                    else{
                                        int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                        map.poiList.remove(index__);
                                        
                                        
                                        BuiltInPOI ttpoi = new BuiltInPOI(tpoi.getName(),tpoi.getDescription(),tpoi.getType(),tpoi.getRoomNumber(),tpoi.getBuildingName(),tpoi.getFloorNumber(),tpoi.getXYLocation());
                                                                                

                                        ttpoi.isFavourite = false;

                                        map.favourites.addFav(ttpoi);
                                        
                                        
                                        tpoi.isFavourite = true;
                                        map.poiList.add(tpoi);
                                        
                                        System.out.println("tpoi is now set Favourite to : "+tpoi.getFavourite());
                                        

                                        Component TEMPCOMPONENT = w7.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                        w7.remove(TEMPCOMPONENT);
                                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                        w7.add(TEMPCOMPONENT);
                                        favouriteList(true);
                                        t.dispose();
                                    }
                                }
                                else{
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    tpoi.isFavourite = true;
                                   
                                    //System.out.println("YOUR POI IS NOT SET TO :"+tpoi.getFavourite());
                                    map.poiList.add(tpoi);
                                    BuiltInPOI ttpoi = tpoi;
                                    map.favourites = new favourite(ttpoi);
                                    
                                    Component TEMPCOMPONENT = w7.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w7.remove(TEMPCOMPONENT);
                                    ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                                    w7.add(TEMPCOMPONENT);
                                    favouriteList(true);
                                    t.dispose();
                                }
                                
                                }
                        });
                        if(!tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = false;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });

                            t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w7.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w7.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateUCPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    public void weldon7EditorAdmin(MouseEvent e){
        
                System.out.println("X :" + e.getX() + " Y : "+e.getY());
                    //NewJFrame t = new NewJFrame();
                    //t.setVisible(true);
                int x__ = e.getX();
                int y__ = e.getY();

                int[] xy = {x__-30,y__-30};
                   // Component tempPOI = w7.getComponentAt(e.getX(), e.getY());

                if(!inRadius(xy,map.poiList)){
                    String[] types = quickLayer();
                    AddPOI t = new AddPOI(types);
                    t.setVisible(true);
                    t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            if(map.poiList == null){
                                System.out.println(1);
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList = new List(poiToADD);
                                updatePickPOI();updateBPOI();
                                t.dispose();
                            }
                            else{
                                UserCreatedPOI poiToADD = t.jButton1ActionPerformed(evt,xy,map.currentBuilding,map.currentFloor);
                                poiToADD.builtIn = true;
                                poiToADD.setFavourite(false);
                                map.poiList.add(poiToADD);
                                updatePickPOI();
                                updateBPOI();
                                t.dispose();
                                }
                                }
                    });

                    JLabel POI = new JLabel(new javax.swing.ImageIcon("builtInPOI.png"));
                    String name__ = Integer.toString(e.getX())+","+Integer.toString(e.getY());
                    POI.setName(name__);
                    POI.setBounds(e.getX()-30,e.getY()-30,50,50);
                    w7.add(POI);
                    updatePickPOI();
                }
                else{
                    Component[] tcomponents = w7.getComponents();
                    BuiltInPOI tpoi = editPOI(xy,map.poiList);


                        //System.out.println(XY);/
                    String[] types = quickLayer();
                    DisplayAndE t = new DisplayAndE(tpoi,types);
                    t.setVisible(true);
                    t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                            t.dispose();
                            }
                    });
                    
                    if(tpoi.builtIn){
                            t.jButton1.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    UserCreatedPOI TPOI = t.button1(evt, tpoi.getXYLocation(), map.currentBuilding, map.currentFloor);
                                    TPOI.builtIn = true;
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    map.poiList.remove(index__);
                                    map.poiList.add(TPOI);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                    });

                    t.jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {

                                    Component TEMPCOMPONENT = w7.findComponentAt(tpoi.getXYLocation()[0],tpoi.getXYLocation()[1]);
                                    w7.remove(TEMPCOMPONENT);
                                    int index__ = (int)map.poiList.findPOI(tpoi)[1];
                                    System.out.println(index__);
                                    map.poiList.remove(index__);
                                    updatePickPOI();
                                    updateBPOI();
                                    t.dispose();
                                    }
                            });
                        }

                    }
    }
    
    //W7
    
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) { 
        
        System.out.println("one");
    }
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt,String UserName,String Password, String type) { 
        
       String username = map.getUser().getName();
       String password = map.getUser().getPassword();
       Admin a = map.getAdmin();
       a.changeUserName("Admin");
       map.admin = a;
       String username1 = map.getAdmin().getName();
       
       String password1 = map.getAdmin().getPassword();
       System.out.println(username1);
       if (UserName.equals(username)&&Password.equals(password)&&type.equals("User")){
           int x = Login_main.indexOfTab("edit");
           Login_main.setSelectedIndex(x);
           online = true;
        }
       
       if (UserName.equals(username1)&&Password.equals(password1)&&type.equals("Admin")){
           int x = Login_main.indexOfTab("edit");
           Login_main.setSelectedIndex(x);
           online = false;
       }
        
    }
    
    private void update(java.awt.event.ActionEvent evt){
        this.revalidate();
    }
    
   
    private void goToBuilding(java.awt.event.ActionEvent evt,javax.swing.JComboBox<String> buildingOptions){
        
        
        String y = (String)buildingOptions.getSelectedItem();
        
        int x = mainP.indexOfTab(y);
        
        mainP.setSelectedIndex(x);
        
    }
    
    public List floorListgetter(){
        
        
        List toReturn = new List("");
        List toReturnR = null;
        if (map.buildingList != null){
           
            int size = this.map.buildingList.getSize();
            for(int i = 1; i < size + 1; i++){

                Building building = (Building)map.buildingList.find(i)[1];
                if(building == null){
                    continue;
                }
                System.out.println(building.getBuildingName());
                List floors = building.getFloorList();
                if(floors != null){
                    int size2 = floors.getSize();

                    for(int j = 1; j<size2+1;j++){
                        floor floor = (floor)floors.find(j)[1];
                        String name = building.getBuildingName()+Integer.toString(floor.getName());
                        if (toReturnR == null){
                            toReturnR = new List(name);
                        }
                        else{
                            toReturnR.add(name);
                        }
                    }
                }

            }
        }
        if(toReturnR != null){
            toReturn = toReturnR;
        }
        return toReturn;
    }
    
    public List buildingList (){
        
        List toReturn = new List("");
        List toReturnR = null;
        if (map.buildingList != null){
           
            int size = map.buildingList.getSize();
            for(int i = 1; i < size + 1; i++){

                Building building = (Building)map.buildingList.find(i)[1];
                String name = building.getBuildingName();
                if (toReturnR == null){
                    toReturnR = new List(name);
                }
                else{
                    toReturnR.add(name);
                }

            }
        }
        if(toReturnR != null){
            toReturn = toReturnR;
        }
        return toReturn;
    }
    
    private List buildingFloors (Building building){
        
        List floors = building.getFloorList();
        List toReturn = null;
        if(floors != null){
            int size2 = floors.getSize();
                
            for(int j = 1; j<size2+1;j++){
                floor floor = (floor)floors.find(j)[1];
                String name = building.getBuildingName()+Integer.toString(floor.getName());
                if (toReturn == null){
                    toReturn = new List(name);
                }
                else{
                    toReturn.add(name);
                }
            }
        }
            
        return toReturn;
        
    }
    
    // checks to see if poi is within radius
    private Boolean inRadius(int[] xy,List poiList){
        if (poiList == null){
            return false;
        }
        Boolean toReturn = false;
        int size = poiList.getSize();
        
        for(int i = 1; i<size +1; i++){
            int x = xy[0];
            int y = xy[1];
            BuiltInPOI poi = (BuiltInPOI)(poiList.find(i)[1]);
            
            x = Math.abs(x-poi.getXYLocation()[0]);
            y = Math.abs(y-poi.getXYLocation()[1]);
            

            x = x*x;
            y = y*y;
            
            if (Math.sqrt(x+y)<50){
               
                //System.out.println(poi.getName());
                toReturn =  true;
            }
            
            
        }
        return toReturn;
    }
    
    public BuiltInPOI editPOI(int[] xy,List poiList){
 
        int size = poiList.getSize();
        
        BuiltInPOI toReturn = null;
        for(int i = 1; i<size +1; i++){
            BuiltInPOI poi = (BuiltInPOI)(poiList.find(i)[1]);
            int x = xy[0];
            int y = xy[1];
//            System.out.println(poi.getName());
//            System.out.println("POI X: "+poi.getXYLocation()[0]);
//            System.out.println("POI Y: "+poi.getXYLocation()[1]);
//            System.out.println("MOUSE LOCATION X : "+x);
//            System.out.println("MOUSE LOCATION Y :"+y);
            
            x = Math.abs(x-poi.getXYLocation()[0]);
            y = Math.abs(y-poi.getXYLocation()[1]);

            x = x*x;
            y = y*y;
            
            
            
            if (Math.sqrt(x+y)<50){
               
                toReturn = poi;
            }
            
            
        }
        return toReturn;
    }
    
    private void Logout(java.awt.event.ActionEvent evt) {
        // code for saving the map object
        map.updateMap();
        Login_main.setSelectedIndex(Login_main.indexOfTab("Login"));
        userNameField.setText("");
        passWordField.setText("");
        
    }
    
    private void save(java.awt.event.ActionEvent evt) {
        map.updateMap();
        this.dispose();
        //code for saving the map object
    }
    
    
    public List addLayer(List buildingList,String Name){
        
        if(buildingList == null){
            return null;
        }
        
        int size = buildingList.getSize();
        
        for(int i = 1; i<size+1;i++){
            Building curr = ((Building)buildingList.find(1)[1]);
            
            if(curr.getFloorList() == null){
                continue;
            }
            else{
                int size2 = curr.getFloorList().getSize();
                for (int j = 1; j< size2+1 ; j++){
                    floor floor = (floor)curr.getFloorList().find(j)[1];
                    int[] a = {1,1};
                    BuiltInPOI poi = new BuiltInPOI("","",Name,1,"",1,a);
                    Layers layer = new Layers(Name,poi);
                    curr.addLayer(floor.getName(), layer);
                }
                buildingList.remove(1);
                buildingList.add(curr);
            }
            
        }
        return buildingList;
    }
    
    public List layerList(List buildingList){
        List toReturn = null;
        if(buildingList == null){
            return null;
        }
        else{
            int size = buildingList.getSize();
        
        for(int i = 1; i<size+1;i++){
            Building curr = (Building)buildingList.find(1)[1];
            
            if(curr.getFloorList() == null){
                continue;
            }
            else{
                int size2 = curr.getFloorList().getSize();
                for (int j = 1; j< size2+1 ; j++){
                    floor floor = (floor)curr.getFloorList().find(j)[1];
                    if(floor.getLayerList() == null){
                        continue;
                    }
                    int size3 = floor.getLayerList().getSize();
                    
                    for(int k = 1; k<size3+1;k++){
                    Layers layer = (Layers)(floor.getLayerList()).find(k)[1];
                    if(toReturn == null){
                        toReturn = new List(layer.getName());
                    }
                    else{
                         toReturn.add(layer.getName());
                    }
                    }
                    return toReturn;
                }
            }
            
        }
        }
        return toReturn;
    }
    
   
    public List removeLayer(List buildingList,String Name){
        
        if(buildingList == null){
            return null;
        }
        
        int size = buildingList.getSize();
        int x;
        for(int i = 1; i<size+1;i++){
            Building curr = (Building)buildingList.find(1)[1];
            
            if(curr.getFloorList() == null){
                continue;
            }
            else{
                List floors;
                floor floor = (floor)curr.getFloorList().find(1)[1];
                int size2 = (int)curr.getFloorList().getSize();
                int index__ = (int)floor.getLayerList().findLayer(Name)[2];
                floor.layersList.remove(index__);
                floors = new List(floor);
                
                List Layers = floor.getLayerList();
                
                for(int j = 2; j<size2+1;j++){
                    floor = (floor)curr.getFloorList().find(j)[1];
                    floor.layersList = Layers;
                    floors.add(floor);
                }
                
                
                buildingList.remove(1);
                curr.setFloorList(floors);
                buildingList.add(curr);
            }
            
        }
        return buildingList;
    }
    
    public String[] quickLayer(){
        List layerList = layerList(map.buildingList);
        String[] layers = new String[layerList.getSize()];
        for (int i = 0; i<layerList.getSize();i++){
                layers[i] = (String)layerList.find(i+1)[1];
            }
        return layers;
    }
    
    
    public void highlightm1(String type, String Building, int floor){
        if(map.poiList == null){
            return;
        }
        System.out.println(Building+floor);
        int size = map.poiList.getSize();
        boolean visible = false;
       
       int i = 1;   
       if((1== floor)&&(Building.equals("Middlesex"))){   
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    
                    
                    
                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                        TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                         m1.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                            TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                             m1.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                            TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                             m1.add(TEMPCOMPONENT);
                        }

                    }
                
                    
                }
                else{ i = i+1;}
            }
            else {i = i+1;}
            }
       }
            if((2== floor)&&(Building.equals("Middlesex"))){   
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    
                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                        TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                         m2.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                            TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                             m2.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                            TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1], 50, 50);
                             m2.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }
            }
            
            i = 1;
            if((3== floor)&&(Building.equals("Middlesex"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                   

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         m3.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             m3.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             m3.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }
            }
            i = 1;
            if((4== floor)&&(Building.equals("Middlesex"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
    

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         m4.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             m4.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             m4.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            if((5== floor)&&(Building.equals("Middlesex"))){ 
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    
                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         m5.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             m5.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             m5.add(TEMPCOMPONENT);
                        }

                    }
                   
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((1== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         a1.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             a1.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             a1.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((2== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         a2.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             a2.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             a2.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
             }
              else {i = i+1;}
            }}
            i = 1;
            if((3== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         a3.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             a3.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             a3.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((1== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w1.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w1.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w1.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            
            i = 1;
            if((2== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w2.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w2.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w2.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((3== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w3.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w3.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w3.add(TEMPCOMPONENT);
                        }

                    }
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((4== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w4.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w4.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w4.add(TEMPCOMPONENT);
                        }

                    }
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((5== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w5.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w5.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w5.add(TEMPCOMPONENT);
                        }

                    }
                    
                } else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((6== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w6.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w6.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w6.add(TEMPCOMPONENT);
                        }

                    }
                    
                } else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((7== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(!poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    
                    w7.remove(TEMPCOMPONENT);

                    if(poi.isFavourite){
                        ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                         w7.add(TEMPCOMPONENT);

                    }
                    else{
                        if(poi.builtIn){
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("builtin.png"));
                             w7.add(TEMPCOMPONENT);
                        }
                        else{
                            ((JLabel)TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                             w7.add(TEMPCOMPONENT);
                        }
            

                    }
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
             
    }
    
    
    
    
    
    public void hideLayer(String type, String Building, int floor){
        if(map.poiList == null){
            return;
        }
        int size = map.poiList.getSize();
        
        
        int i = 1;
            if((1== floor)&&(Building.equals("Middlesex"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    System.out.println(1);
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m1.remove(TEMPCOMPONENT);
                    
                }
                else{
                i = i+1;
            }
            } 
             else {i = i+1;}
            }}
            
            if((2== floor)&&(Building.equals("Middlesex"))){ 
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.visible)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    
                    Component TEMPCOMPONENT = m2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m2.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
             }
              else {i = i+1;}
            }}
            if((3== floor)&&(Building.equals("Middlesex"))){ 
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;
                        continue;
                    }
                    m3.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((4== floor)&&(Building.equals("Middlesex"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    m4.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            
            if((5== floor)&&(Building.equals("Middlesex"))){ 
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;
                        continue;
                    }
                    m5.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((1== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;
                        continue;
                    }
                    a1.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }
            }
            i = 1;
            if((2== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a2.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            
            i = 1;
            if((3== floor)&&(Building.equals("Alumni"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a3.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((1== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w1.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((2== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;continue;
                    }
                    w2.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            if((3== floor)&&(Building.equals("Weldon"))){ 
            i = 1;
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
           if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;
                        continue;
                    }
                    w3.remove(TEMPCOMPONENT);
                   
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((4== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    if(TEMPCOMPONENT == null){
                        i = i+1;continue;
                    }
                    w4.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
            }}
            i = 1;
            if((5== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w5.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((6== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
             if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w6.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w6.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
              else {i = i+1;}
            }}
            i = 1;
            if((7== floor)&&(Building.equals("Weldon"))){ 
            while (i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== floor)&&(poi.getBuildingName().equals(Building))){
                if((poi.getType().equals(type))&&(poi.getVisibility())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w7.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w7.remove(TEMPCOMPONENT);
                    
                }
                 else {i = i+1;}
            }
             else {i = i+1;}
           
            }}
    }
    
    
    public void favouriteList(boolean bool){
        System.out.println(1);
       if(map.favourites== null){
           String[] toADD = {""};
           favouriteOptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       }
       List favList = map.favourites.getFavourites();
       
       if(favList == null){
           return;
       }
       
       int size = favList.getSize();
       
       List FavList = null;
       if(size == 0){
           String[] toADD = {""};
           favouriteOptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       };
       for(int i = 1; i<size +1;i++){
          BuiltInPOI poi = (BuiltInPOI)favList.find(i)[1];
          int x = poi.getXYLocation()[0];
          int y = poi.getXYLocation()[1];
          
          String name = poi.getName();
          
          String toADD = name+"                      ,"+Integer.toString(x)+","+Integer.toString(y)+","+poi.getBuildingName()+","+poi.getFloorNumber();
          if(FavList == null){
              FavList = new List(toADD);
          }
          else{
              FavList.add(toADD);
          }
       }
        String[] favList__ = new String[FavList.getSize()];
        for (int i = 0; i<FavList.getSize();i++){
                favList__[i] = (String)FavList.find(i+1)[1];
            }
        
        favouriteOptions.setModel(new javax.swing.DefaultComboBoxModel<>(favList__));
    }
    
    
    public void hideFavourite(){
        if(map.favourites == null){
         return;
        }
        if(map.favourites.getFavourites() == null){
            return;
        }
        
        int size = map.poiList.getSize();
        int i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    System.out.println(poi.getBuildingName());
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 4)){
         i = 1;
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m4.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m5.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
        i = 1;
         if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
         if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w4.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 5)){
        i = 1;
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w5.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 6)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 6)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w6.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w6.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 7)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 7)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w7.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w7.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
    }
    
    public void displayFavourite(){
        if(map.favourites == null){
         return;
        }
        if(map.favourites.getFavourites() == null){
            return;
        }
        
        int size = map.poiList.getSize();
        int i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    m1.add(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    m2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    m3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    m4.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    m5.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    a1.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    a2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    a3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w1.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w4.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w5.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 6)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 6)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w6.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 7)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 7)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(poi.getFavourite())){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("favourite.png"));
                    w7.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
       
        
    }
    
    public void goToFavourite(){
        String tempS = (String)favouriteOptions.getSelectedItem();
        if(tempS.equals("")){
         return;
        }
        String[] selectedPOI = tempS.split(",");       
        int x = Integer.parseInt(selectedPOI[1]);
        int y = Integer.parseInt(selectedPOI[2]);
        int[] Coordinates = {x,y};
        BuiltInPOI tpoi = editPOI(Coordinates,map.poiList);
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 6)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w6S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 7)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w7S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
    }
    
    
    public void goToPOI(){
        String tempS = (String)option.getSelectedItem();
        if(tempS.equals("")){
         return;
        }
        String[] selectedPOI = tempS.split(",");       
        int x = Integer.parseInt(selectedPOI[1]);
        int y = Integer.parseInt(selectedPOI[2]);
        int[] Coordinates = {x,y};
        BuiltInPOI tpoi = editPOI(Coordinates,map.poiList);
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 6)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w6S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 7)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w7S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
    }
    
    public void updatePickPOI(){
       
       if(map.poiList == null){
           System.out.println("POILIST IS EMPTY ");
           String[] toADD = {""};
           option.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       }
       
       int size = map.poiList.getSize();
       
       List list = null;
       if(size == 0){
           String[] toADD = {""};
           option.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       };
       for(int i = 1; i<size +1;i++){
          BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
          int x = poi.getXYLocation()[0];
          int y = poi.getXYLocation()[1];
          
          String name = poi.getName();
          
          String toADD = name+"                      ,"+Integer.toString(x)+","+Integer.toString(y)+","+poi.getBuildingName()+","+poi.getFloorNumber();
          if(list == null){
              list = new List(toADD);
          }
          else{
              list.add(toADD);
          }
       }
        String[] poiList__ = new String[map.poiList.getSize()];
        for (int i = 0; i<list.getSize();i++){
                poiList__[i] = (String)list.find(i+1)[1];
            }
        
        option.setModel(new javax.swing.DefaultComboBoxModel<>(poiList__));
        this.revalidate();
    }
    
    public  String removeLastChar(String s) {
    return (s == null || s.length() == 0)
      ? null 
      : (s.substring(0, s.length() - 1));
    }
    public void searchPOI(){
        
        
        
        String floorBuilding = (String)floorOption.getSelectedItem();
        
        int floor = Integer.parseInt(String.valueOf((char)floorBuilding.charAt(floorBuilding.length()-1)));
        
        String building = removeLastChar(floorBuilding);
        
        String poiName = searchBar.getText();
        System.out.println(poiName);
        System.out.println(building);
        System.out.println(floor);
        BuiltInPOI tpoi = null;
        if(map.poiList == null){
            return;
        }

        for(int i = 1; i<map.poiList.getSize()+1;i++){
            BuiltInPOI POI = (BuiltInPOI)map.poiList.find(i)[1];
            
            if((POI.getName().equals(poiName))&&(POI.getBuildingName().equals(building))&&(floor==POI.getFloorNumber())){
                tpoi = POI;
                System.out.println(POI.getName());
            }
        }
        
        if(tpoi == null){
            return;
        }
        String[] selectedPOI = {"","","",building,Integer.toString(floor)};
        int x = tpoi.getXYLocation()[0];
        int y = tpoi.getXYLocation()[1];
        int[] Coordinates = {x,y};
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 6)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w6S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 7)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w7S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
    
    }
    
    
    public void updateUCPOI(){
       if(map.poiList == null){
           System.out.println("POILIST IS EMPTY ");
           String[] toADD = {""};
           useroptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       }
       
       int size = map.poiList.getSize();
       
       List list = null;
       if(size == 0){
           String[] toADD = {""};
           useroptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       };
       for(int i = 1; i<size +1;i++){
          BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
          int x = poi.getXYLocation()[0];
          int y = poi.getXYLocation()[1];
          
          String name = poi.getName();
          
          String toADD = name+"                      ,"+Integer.toString(x)+","+Integer.toString(y)+","+poi.getBuildingName()+","+poi.getFloorNumber();
          if(!poi.builtIn){
            if(list == null){
                list = new List(toADD);
            }
            else{
                list.add(toADD);
            }
          }
       }
        String[] poiList__ = new String[map.poiList.getSize()];
        for (int i = 0; i<list.getSize();i++){
                poiList__[i] = (String)list.find(i+1)[1];
            }
        
        useroptions.setModel(new javax.swing.DefaultComboBoxModel<>(poiList__));
    }
    
    
    public void updateBPOI(){
       if(map.poiList == null){
           System.out.println("POILIST IS EMPTY ");
           String[] toADD = {""};
           boptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       }
       
       int size = map.poiList.getSize();
       
       List list = null;
       if(size == 0){
           String[] toADD = {""};
           boptions.setModel(new javax.swing.DefaultComboBoxModel<>(toADD));
           return;
       };
       for(int i = 1; i<size +1;i++){
          BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
          int x = poi.getXYLocation()[0];
          int y = poi.getXYLocation()[1];
          
          String name = poi.getName();
          
          String toADD = name+"                      ,"+Integer.toString(x)+","+Integer.toString(y)+","+poi.getBuildingName()+","+poi.getFloorNumber();
          if(poi.builtIn){
            if(list == null){
                list = new List(toADD);
            }
            else{
                list.add(toADD);
            }
          }
       }
        String[] poiList__ = new String[map.poiList.getSize()];
        for (int i = 0; i<list.getSize();i++){
                poiList__[i] = (String)list.find(i+1)[1];
            }
        
        boptions.setModel(new javax.swing.DefaultComboBoxModel<>(poiList__));
    }
    
    public void goBPOI(){
        String tempS = (String)boptions.getSelectedItem();
        if(tempS.equals("")){
         return;
        }
        String[] selectedPOI = tempS.split(",");       
        int x = Integer.parseInt(selectedPOI[1]);
        int y = Integer.parseInt(selectedPOI[2]);
        int[] Coordinates = {x,y};
        BuiltInPOI tpoi = editPOI(Coordinates,map.poiList);
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 6)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w6S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 7)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w7S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
    }
    
    
    
    public void goUPOI(){
        String tempS = (String)useroptions.getSelectedItem();
        if(tempS.equals("")){
         return;
        }
        String[] selectedPOI = tempS.split(",");       
        int x = Integer.parseInt(selectedPOI[1]);
        int y = Integer.parseInt(selectedPOI[2]);
        int[] Coordinates = {x,y};
        BuiltInPOI tpoi = editPOI(Coordinates,map.poiList);
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Middlesex")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            m5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Alumni")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            a3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 1)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w1S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 2)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w2S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 3)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w3S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 4)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w4S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        
        if((tpoi.getFloorNumber() == 5)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w5S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 6)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w6S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
        
        if((tpoi.getFloorNumber() == 7)&&tpoi.getBuildingName().equals("Weldon")){
            int a = mainP.indexOfTab(selectedPOI[3]+selectedPOI[4]);
            mainP.setSelectedIndex(a);
            String[] types = quickLayer();
            DisplayAndE t = new DisplayAndE(tpoi,types);
            t.setVisible(true);
            w7S.getViewport().setViewPosition(new Point(x-280,y-250));
            t.jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                t.dispose();
                                }
                        });
        }
    }
    
    
    
    
    
    
    public void hideUPOI(){

        if(map.poiList == null){
         return;
        }
        
        int size = map.poiList.getSize();
        int i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            System.out.println(poi.builtIn);
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    System.out.println(poi.getBuildingName());
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 4)){
         i = 1;
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m4.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Middlesex"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = m5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    m5.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }
        }
        i = 1;
         if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
         if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Alumni"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = a3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    a3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w1.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w1.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w2.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w2.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w3.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w3.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w4.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w4.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 5)){
        i = 1;
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w5.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w5.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 6)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 6)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w6.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w6.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 7)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 7)&&(poi.getBuildingName().equals("Weldon"))){
                if((poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(false);
                    map.poiList.add(poi);
                    Component TEMPCOMPONENT = w7.findComponentAt(poi.getXYLocation()[0],poi.getXYLocation()[1]);
                    
                    w7.remove(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
    }
    
    public void displayUPOI(){
        
        if(map.poiList == null){
         return;
        }
        
        int size = map.poiList.getSize();
        int i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    m1.add(TEMPCOMPONENT);
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    m2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
        if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    m3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    m4.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
         i = 1;
         
         if(map.currentBuilding.getBuildingName().equals("Middlesex")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Middlesex"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    m5.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    a1.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    a2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        
        if(map.currentBuilding.getBuildingName().equals("Alumni")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Alumni"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    a3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 1)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 1)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w1.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 2)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 2)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w2.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 3)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 3)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w3.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 4)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 4)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w4.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 5)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 5)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w5.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 6)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 6)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w6.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        i = 1;
        if(map.currentBuilding.getBuildingName().equals("Weldon")&&(map.currentFloor.getName() == 7)){
        while(i<size+1){
            BuiltInPOI poi = (BuiltInPOI)map.poiList.find(i)[1];
            if((poi.getFloorNumber()== 7)&&(poi.getBuildingName().equals("Weldon"))){
                if((!poi.getVisibility())&&(!poi.builtIn)){
                    map.poiList.remove(i);
                    poi.setVisibility(true);
                    map.poiList.add(poi);
                    JLabel TEMPCOMPONENT = new JLabel();
                    TEMPCOMPONENT.setBounds(poi.getXYLocation()[0],poi.getXYLocation()[1],50,50);
                    (TEMPCOMPONENT).setIcon(new javax.swing.ImageIcon("poi2.png"));
                    w7.add(TEMPCOMPONENT);
                    
                    
                }else{i = i+1;}
                
            }else {i = i+1;}
        }}
        
       
        
    }
    
    
    public void UPDATEWEATHER(){
        currentWeather = new JLabel(w.getWeather());
    }
    
    
    
    public static void main(String[] args){
        
        
        map MAP = new map("temp.json");
        MAP = MAP.readMap();
        
        
        //MAP.buildingList = addLayer(MAP.buildingList,"");
        //layerList(MAP.buildingList);
        //MAP.poiList = null;
        //int index = (int)MAP.buildingList.findBuilding("Weldon")[1];
        
        //MAP.favourites = null;
        User_Main f = new User_Main(MAP);
    }
}
