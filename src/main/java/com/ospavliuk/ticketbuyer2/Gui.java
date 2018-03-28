package com.ospavliuk.ticketbuyer2;

import com.ospavliuk.ticketbuyer2.controller.Controller;

import javax.swing.*;
import java.util.Arrays;

public class Gui extends JFrame {

    static {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    public Gui(Controller controller) {
        initComponents();
        this.controller = controller;
        initUserComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        jPanel1 = new JPanel();
        fromLabel = new JLabel();
        toLabel = new JLabel();
        jSeparator1 = new JSeparator();
        changeButton = new JButton();
        dayBox = new JComboBox<>();
        monthBox = new JComboBox<>();
        dateLabel = new JLabel();
        jSeparator2 = new JSeparator();
        numTrainLabel = new JLabel();
        anyTrainButton = new JRadioButton();
        specifyTrainButton = new JRadioButton();
        trainNumberField = new JTextField();
        jSeparator3 = new JSeparator();
        wagonTypeLabel = new JLabel();
        plazkartButton = new JRadioButton();
        cupeButton = new JRadioButton();
        luxButton = new JRadioButton();
        startButton = new JButton();
        jSeparator6 = new JSeparator();
        jScrollPane1 = new JScrollPane();
        infoArea = new JTextArea();
        jSeparator7 = new JSeparator();
        authorizeBox = new JCheckBox();
        usernameField = new JTextField();
        loginLabel = new JLabel();
        passwordLabel = new JLabel();
        passwordField = new JPasswordField();
        fromField = new JComboBox<>();
        toField = new JComboBox<>();
        c1Button = new JRadioButton();
        c2Button = new JRadioButton();
        timeBox = new JComboBox<>();
        jSeparator9 = new JSeparator();
        browserLabel = new JLabel();
        edgeButton = new JRadioButton();
        chromeButton = new JRadioButton();
        firefoxButton = new JRadioButton();
        anyButton = new JRadioButton();
        jSeparator4 = new JSeparator();
        jPanel2 = new JPanel();
        passengersLabel = new JLabel();
        passBox1 = new JCheckBox();
        surName1 = new JTextField();
        name1 = new JTextField();
        passBox2 = new JCheckBox();
        surName2 = new JTextField();
        name2 = new JTextField();
        childBox2 = new JCheckBox();
        passBox3 = new JCheckBox();
        surName3 = new JTextField();
        name3 = new JTextField();
        childBox3 = new JCheckBox();
        passBox4 = new JCheckBox();
        surName4 = new JTextField();
        name4 = new JTextField();
        childBox4 = new JCheckBox();
        passBox5 = new JCheckBox();
        surName5 = new JTextField();
        name5 = new JTextField();
        childBox5 = new JCheckBox();
        passBox6 = new JCheckBox();
        surName6 = new JTextField();
        name6 = new JTextField();
        childBox6 = new JCheckBox();
        jSeparator5 = new JSeparator();
        lowSeatBox1 = new JCheckBox();
        lowSeatBox2 = new JCheckBox();
        lowSeatBox3 = new JCheckBox();
        lowSeatBox4 = new JCheckBox();
        lowSeatBox5 = new JCheckBox();
        lowSeatBox6 = new JCheckBox();
        sameWagonBox = new JCheckBox();
        lateralDiscardBox = new JCheckBox();
        manualPlaceBox = new JCheckBox();
        placesLabel = new JLabel();
        place1field = new JTextField();
        place2field = new JTextField();
        place3field = new JTextField();
        place4field = new JTextField();
        place5field = new JTextField();
        place6field = new JTextField();
        childBox1 = new JCheckBox();
        jSeparator8 = new JSeparator();
        wagonNumLabel = new JLabel();
        wagonOnlyButton = new JRadioButton();
        wagonAnyButton = new JRadioButton();
        wagonExceptBox = new JCheckBox();
        wagonOnlyField = new JTextField();
        wagonExceptField = new JTextField();
        fullOrderBox = new JCheckBox();
        sameCupeButton = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Buyer 2.0 by Alexander Pavliuk");
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);

        fromLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromLabel.setText("Откуда");
        fromLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fromLabelMouseClicked(evt);
            }
        });

        toLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toLabel.setText("Куда");

        changeButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeButton.setText("Поменять");
        changeButton.setEnabled(false);
        changeButton.setPreferredSize(new java.awt.Dimension(90, 25));
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        dayBox.setModel(new DefaultComboBoxModel<>(new String[]{"---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        monthBox.setModel(new DefaultComboBoxModel<>(new String[]{"---", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"}));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateLabel.setText("Отправление:");

        numTrainLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numTrainLabel.setText("Номер поезда:");

        buttonGroup1.add(anyTrainButton);
        anyTrainButton.setSelected(true);
        anyTrainButton.setText("Любой");
        anyTrainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.trainNumberSelected("Любой");
            }
        });

        buttonGroup1.add(specifyTrainButton);
        specifyTrainButton.setText("Задать");
        specifyTrainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.trainNumberSelected("Задать");
            }
        });

        trainNumberField.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        trainNumberField.setForeground(new java.awt.Color(255, 0, 0));
        trainNumberField.setToolTipText("Номер поезда");
        trainNumberField.setEnabled(false);

        wagonTypeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wagonTypeLabel.setText("Тип вагона:");

        startButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        startButton.setText("СТАРТ");
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        infoArea.setEditable(false);
        infoArea.setColumns(20);
        infoArea.setLineWrap(true);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        authorizeBox.setText("Аутентификация на uz.gov.ua");
        authorizeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.authSelected(authorizeBox.isSelected());
            }
        });

        usernameField.setEnabled(false);

        loginLabel.setText("Login");

        passwordLabel.setText("Password");

        passwordField.setEnabled(false);

        fromField.setEditable(true);
        fromField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromField.setMinimumSize(new java.awt.Dimension(6, 23));
        fromField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromFieldActionPerformed(evt);
            }
        });

        toField.setEditable(true);
        toField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFieldActionPerformed(evt);
            }
        });
        toField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toFieldKeyReleased(evt);
            }
        });

        buttonGroup2.add(plazkartButton);
        plazkartButton.setText("Плацкарт");
        plazkartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("Плацкарт");
            }
        });

        buttonGroup2.add(cupeButton);
        cupeButton.setText("Купе");
        cupeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("Купе");
            }
        });

        buttonGroup2.add(luxButton);
        luxButton.setText("Люкс");
        luxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("Люкс");
            }
        });

        buttonGroup2.add(c1Button);
        c1Button.setText("С1");
        c1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("C1");
            }
        });

        buttonGroup2.add(c2Button);
        c2Button.setText("С2");
        c2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("C2");
            }
        });

        buttonGroup2.add(anyButton);
        anyButton.setText("Любой");
        anyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controller.wagonTypeSelected("Любой");
            }
        });

        timeBox.setModel(new DefaultComboBoxModel<>(new String[]{"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));

        browserLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        browserLabel.setText("Браузер:");

        buttonGroup4.add(edgeButton);
        edgeButton.setSelected(true);
        edgeButton.setText("Edge");

        buttonGroup4.add(chromeButton);
        chromeButton.setText("Chrome");

        buttonGroup4.add(firefoxButton);
        firefoxButton.setText("FireFox");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(authorizeBox)
                                                                .addGap(79, 79, 79))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(chromeButton)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(firefoxButton))))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(loginLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(passwordLabel)
                                                .addGap(48, 48, 48))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(fromLabel)
                                                                        .addComponent(toLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(fromField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(toField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(numTrainLabel)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(anyTrainButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(specifyTrainButton)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(trainNumberField, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator7, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator3)
                                                        .addComponent(jSeparator1)
                                                        .addComponent(jSeparator2)
                                                        .addComponent(jSeparator6, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator9)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(dateLabel)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(dayBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(monthBox, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(timeBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(wagonTypeLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(plazkartButton)
                                                                                        .addComponent(c1Button))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(cupeButton)
                                                                                        .addComponent(c2Button))
                                                                                .addGap(36, 36, 36)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(anyButton)
                                                                                        .addComponent(luxButton)))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(browserLabel)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(edgeButton)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(startButton, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(fromField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(fromLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(toField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(toLabel)))
                                        .addComponent(changeButton, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(dateLabel)
                                        .addComponent(dayBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(monthBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timeBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(specifyTrainButton)
                                        .addComponent(trainNumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(anyTrainButton)
                                        .addComponent(numTrainLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(wagonTypeLabel)
                                                .addComponent(plazkartButton)
                                                .addComponent(cupeButton))
                                        .addComponent(luxButton))
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(c2Button)
                                                        .addComponent(anyButton)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(c1Button)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(authorizeBox)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginLabel)
                                        .addComponent(passwordLabel))
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(browserLabel)
                                        .addComponent(edgeButton)
                                        .addComponent(chromeButton)
                                        .addComponent(firefoxButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(startButton, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jSeparator4.setOrientation(SwingConstants.VERTICAL);

        passengersLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passengersLabel.setText("Данные пассажиров:");

        passBox1.setSelected(true);
        passBox1.setEnabled(false);

        surName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName1.setText("Фамилия");
        surName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name1.setText("Имя");
        name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        passBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBox2ActionPerformed(evt);
            }
        });

        surName2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName2.setText("Фамилия");
        surName2.setEnabled(false);
        surName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name2.setText("Имя");
        name2.setEnabled(false);
        name2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        childBox2.setText("Детский");
        childBox2.setEnabled(false);

        passBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBox3ActionPerformed(evt);
            }
        });

        surName3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName3.setText("Фамилия");
        surName3.setEnabled(false);
        surName3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name3.setText("Имя");
        name3.setEnabled(false);
        name3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        childBox3.setText("Детский");
        childBox3.setEnabled(false);

        passBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBox4ActionPerformed(evt);
            }
        });

        surName4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName4.setText("Фамилия");
        surName4.setEnabled(false);
        surName4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name4.setText("Имя");
        name4.setEnabled(false);
        name4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        childBox4.setText("Детский");
        childBox4.setEnabled(false);

        passBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBox5ActionPerformed(evt);
            }
        });

        surName5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName5.setText("Фамилия");
        surName5.setEnabled(false);
        surName5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name5.setText("Имя");
        name5.setEnabled(false);
        name5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        childBox5.setText("Детский");
        childBox5.setEnabled(false);

        passBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBox6ActionPerformed(evt);
            }
        });

        surName6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        surName6.setText("Фамилия");
        surName6.setEnabled(false);
        surName6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        name6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name6.setText("Имя");
        name6.setEnabled(false);
        name6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldFocusGained(evt);
            }
        });

        childBox6.setText("Детский");
        childBox6.setEnabled(false);

        lowSeatBox1.setText("Только нижнее");

        lowSeatBox2.setText("Только нижнее");
        lowSeatBox2.setEnabled(false);

        lowSeatBox3.setText("Только нижнее");
        lowSeatBox3.setEnabled(false);

        lowSeatBox4.setText("Только нижнее");
        lowSeatBox4.setEnabled(false);

        lowSeatBox5.setText("Только нижнее");
        lowSeatBox5.setEnabled(false);

        lowSeatBox6.setText("Только нижнее");
        lowSeatBox6.setEnabled(false);

        sameWagonBox.setSelected(true);
        sameWagonBox.setText("только в одном вагоне ");
        sameWagonBox.setToolTipText("");
        sameWagonBox.setEnabled(false);
        sameWagonBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sameWagonBoxActionPerformed(evt);
            }
        });

        lateralDiscardBox.setSelected(true);
        lateralDiscardBox.setText("запретить боковые");
        lateralDiscardBox.setToolTipText("Только для плацкарта");
        lateralDiscardBox.setEnabled(false);

        manualPlaceBox.setText("Задать места вручную");
        manualPlaceBox.setToolTipText("Будут заказаны только указанные места");
        manualPlaceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualPlaceBoxActionPerformed(evt);
            }
        });

        placesLabel.setText("Место");

        place1field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place1field.setEnabled(false);

        place2field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place2field.setEnabled(false);

        place3field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place3field.setEnabled(false);

        place4field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place4field.setEnabled(false);

        place5field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place5field.setEnabled(false);

        place6field.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        place6field.setEnabled(false);

        childBox1.setText("Детский");
        childBox1.setEnabled(false);

        jSeparator8.setOrientation(SwingConstants.VERTICAL);

        wagonNumLabel.setText("Номер вагона:");

        buttonGroup3.add(wagonOnlyButton);
        wagonOnlyButton.setText("только:");
        wagonOnlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wagonOnlyButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(wagonAnyButton);
        wagonAnyButton.setSelected(true);
        wagonAnyButton.setText("любой");
        wagonAnyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wagonAnyButtonActionPerformed(evt);
            }
        });

        wagonExceptBox.setText("кроме:");
        wagonExceptBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wagonExceptBoxActionPerformed(evt);
            }
        });

        wagonOnlyField.setHorizontalAlignment(JTextField.RIGHT);
        wagonOnlyField.setEnabled(false);

        wagonExceptField.setHorizontalAlignment(JTextField.TRAILING);
        wagonExceptField.setToolTipText("");
        wagonExceptField.setEnabled(false);

        fullOrderBox.setSelected(true);
        fullOrderBox.setText("Только полный заказ");
        fullOrderBox.setToolTipText("Не делать заказ, если мест хватает не всем пассажирам");
        fullOrderBox.setActionCommand("");
        fullOrderBox.setEnabled(false);

        sameCupeButton.setSelected(true);
        sameCupeButton.setText("В одном купе");
        sameCupeButton.setToolTipText("Для первых по списку");
        sameCupeButton.setEnabled(false);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(passBox6)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(childBox2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(childBox3, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(childBox4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(childBox5, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(childBox6, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(childBox1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lowSeatBox6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lowSeatBox5, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lowSeatBox4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lowSeatBox3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lowSeatBox2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lowSeatBox1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(21, 21, 21)
                                                                                .addComponent(sameCupeButton)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(sameWagonBox, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lateralDiscardBox, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(manualPlaceBox, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(fullOrderBox, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jSeparator8, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(wagonOnlyButton)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(wagonOnlyField))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(wagonAnyButton)
                                                                                        .addComponent(wagonNumLabel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(0, 15, Short.MAX_VALUE))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(wagonExceptBox)
                                                                                .addGap(9, 9, 9)
                                                                                .addComponent(wagonExceptField)))))
                                                .addGap(37, 37, 37))
                                        .addComponent(jSeparator5))
                                .addGap(23, 23, 23))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(passBox1)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(surName1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surName2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surName3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surName4, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surName5, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(surName6, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(passBox5)
                                        .addComponent(passBox4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passBox3)
                                        .addComponent(passBox2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(name1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name6, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(place5field, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(place6field)
                                        .addComponent(place3field)
                                        .addComponent(place2field)
                                        .addComponent(place4field)
                                        .addComponent(place1field, GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passengersLabel)
                                .addGap(68, 68, 68)
                                .addComponent(placesLabel))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(passBox1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(placesLabel)
                                                        .addComponent(passengersLabel))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(surName1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(name1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(place1field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lowSeatBox1)
                                        .addComponent(childBox1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(passBox2)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(place2field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(childBox2)
                                        .addComponent(lowSeatBox2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(passBox3)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(place3field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(childBox3)
                                        .addComponent(lowSeatBox3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(place4field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(passBox4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(childBox4)
                                        .addComponent(lowSeatBox4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(passBox5)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(place5field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(childBox5, GroupLayout.Alignment.TRAILING)
                                        .addComponent(lowSeatBox5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(place6field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(passBox6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(childBox6)
                                        .addComponent(lowSeatBox6))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, 8, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(wagonNumLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(wagonOnlyButton)
                                                        .addComponent(wagonOnlyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(wagonAnyButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(wagonExceptBox)
                                                        .addComponent(wagonExceptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(sameWagonBox)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(sameCupeButton)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lateralDiscardBox)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(fullOrderBox)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(manualPlaceBox))
                                                .addComponent(jSeparator8, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(365, 365, 365)
                                        .addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(370, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jSeparator4, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        pack();
    }

    public void setTrainNumberFieldEnabled(boolean enabled) {
        trainNumberField.setEnabled(enabled);
    }

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        print(monthBox.getSelectedItem().toString());
        monthBox.showPopup();
    }

    private void passBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBox2ActionPerformed
        enablePassenger(1);
    }//GEN-LAST:event_passBox2ActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed
        String buffer = fromField.getSelectedItem().toString();
        fromField.setSelectedItem(toField.getSelectedItem().toString());
        toField.setSelectedItem(buffer);
    }//GEN-LAST:event_changeButtonActionPerformed

    public void print(String text) {
        infoArea.setText(infoArea.getText() + text);
        infoArea.setCaretPosition(infoArea.getDocument().getLength());
    }

    public void println(String text) {
        print(text + "\n");
    }

    private void passBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBox3ActionPerformed
        enablePassenger(2);
    }//GEN-LAST:event_passBox3ActionPerformed

    private void passBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBox5ActionPerformed
        enablePassenger(4);
    }//GEN-LAST:event_passBox5ActionPerformed

    private void passBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBox4ActionPerformed
        enablePassenger(3);
    }//GEN-LAST:event_passBox4ActionPerformed

    private void passBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passBox6ActionPerformed
        enablePassenger(5);
    }

    public void setLateralDiscardBoxEnabled(boolean enable) {
        lateralDiscardBox.setEnabled(enable);
    }

    private void luxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luxButtonActionPerformed
        lateralDiscardBox.setEnabled(plazkartButton.isSelected());
    }//GEN-LAST:event_luxButtonActionPerformed

    private void sameWagonBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sameWagonBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sameWagonBoxActionPerformed

    private void fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldFocusGained
        JTextField a = (JTextField) (evt.getSource());
        a.selectAll();
    }//GEN-LAST:event_fieldFocusGained

    private void fromFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromFieldActionPerformed

    private void wagonOnlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wagonOnlyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wagonOnlyButtonActionPerformed

    private void wagonAnyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wagonAnyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wagonAnyButtonActionPerformed

    private void wagonExceptBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wagonExceptBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wagonExceptBoxActionPerformed

    private void manualPlaceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualPlaceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manualPlaceBoxActionPerformed

    private void toFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFieldActionPerformed
        print("performed");
    }//GEN-LAST:event_toFieldActionPerformed

    private void toFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toFieldKeyReleased
        print("KeyReleased");
    }//GEN-LAST:event_toFieldKeyReleased

    private void authorizeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorizeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorizeBoxActionPerformed

    private void anyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anyButtonActionPerformed
        controller.wagonTypeSelected(evt.getSource().getClass().getSimpleName());
    }//GEN-LAST:event_anyButtonActionPerformed

    private void fromLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fromLabelMouseClicked
        fromField.removeAllItems();
        fromField.addItem("Харьков Пасс");
        toField.transferFocus();
    }

    String getFromStation() {
        return fromField.getSelectedItem().toString();
    }

    String getTillStation() {
        return toField.getSelectedItem().toString();
    }

    int[] getDate() {
        return new int[]{dayBox.getSelectedIndex(), monthBox.getSelectedIndex()};
    }

    String getTrainNumberField() {
        return trainNumberField.getText();
    }

    String getWagonType() {
        if (plazkartButton.isSelected()) {
            return "Плацкарт";
        } else if (cupeButton.isSelected()) {
            return "Купе";
        } else {
            return "Люкс";
        }
    }

    int getPassangerNumber() {
        int counter = 0;
        for (JCheckBox box : passengerArray) {
            if (box.isSelected()) {
                counter++;
            }
        }
        return counter;
    }

    protected String getLogin() {
        return usernameField.getText();
    }

    protected String getPassword() {
        return Arrays.toString(passwordField.getPassword());
    }

    private void enablePassenger(int num) {
        boolean passSelected = passengerArray[num].isSelected();
        surNameArray[num].setEnabled(passSelected);
        nameArray[num].setEnabled(passSelected);
        childBoxArray[num].setEnabled(passSelected);
        lowSeatArray[num].setEnabled(passSelected);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JRadioButton anyButton;
    protected JRadioButton anyTrainButton;
    JCheckBox authorizeBox;
    private JLabel browserLabel;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private JRadioButton c1Button;
    private JRadioButton c2Button;
    private JButton changeButton;
    protected JCheckBox childBox1;
    protected JCheckBox childBox2;
    protected JCheckBox childBox3;
    protected JCheckBox childBox4;
    protected JCheckBox childBox5;
    protected JCheckBox childBox6;
    private JRadioButton chromeButton;
    protected JRadioButton cupeButton;
    private JLabel dateLabel;
    protected JComboBox<String> dayBox;
    private JRadioButton edgeButton;
    private JRadioButton firefoxButton;
    private JComboBox<String> fromField;
    private JLabel fromLabel;
    private JCheckBox fullOrderBox;
    private JTextArea infoArea;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private JSeparator jSeparator6;
    private JSeparator jSeparator7;
    private JSeparator jSeparator8;
    private JSeparator jSeparator9;
    protected JCheckBox lateralDiscardBox;
    private JLabel loginLabel;
    protected JCheckBox lowSeatBox1;
    protected JCheckBox lowSeatBox2;
    protected JCheckBox lowSeatBox3;
    protected JCheckBox lowSeatBox4;
    protected JCheckBox lowSeatBox5;
    protected JCheckBox lowSeatBox6;
    protected JRadioButton luxButton;
    private JCheckBox manualPlaceBox;
    protected JComboBox<String> monthBox;
    protected JTextField name1;
    protected JTextField name2;
    protected JTextField name3;
    protected JTextField name4;
    protected JTextField name5;
    protected JTextField name6;
    private JLabel numTrainLabel;
    private JCheckBox passBox1;
    protected JCheckBox passBox2;
    protected JCheckBox passBox3;
    protected JCheckBox passBox4;
    protected JCheckBox passBox5;
    protected JCheckBox passBox6;
    private JLabel passengersLabel;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JTextField place1field;
    private JTextField place2field;
    private JTextField place3field;
    private JTextField place4field;
    private JTextField place5field;
    private JTextField place6field;
    private JLabel placesLabel;
    protected JRadioButton plazkartButton;
    private JCheckBox sameCupeButton;
    protected JCheckBox sameWagonBox;
    protected JRadioButton specifyTrainButton;
    private JButton startButton;
    protected JTextField surName1;
    protected JTextField surName2;
    protected JTextField surName3;
    protected JTextField surName4;
    protected JTextField surName5;
    protected JTextField surName6;
    private JComboBox<String> timeBox;
    private JComboBox<String> toField;
    private JLabel toLabel;
    protected JTextField trainNumberField;
    private JTextField usernameField;
    private JRadioButton wagonAnyButton;
    private JCheckBox wagonExceptBox;
    private JTextField wagonExceptField;
    private JLabel wagonNumLabel;
    private JRadioButton wagonOnlyButton;
    private JTextField wagonOnlyField;
    private JLabel wagonTypeLabel;
    // End of variables declaration//GEN-END:variables
//    private Drive drive;
    private JCheckBox[] passengerArray;
    JTextField[] surNameArray;
    JTextField[] nameArray;
    JCheckBox[] lowSeatArray;
    JCheckBox[] childBoxArray;
    JTextField[] groupArray;
    private final Controller controller;

    private void initUserComponents() {
        JCheckBox[] passengerArray = {passBox1, passBox2, passBox3, passBox4, passBox5, passBox6};
        JCheckBox[] lowSeatArray = {lowSeatBox1, lowSeatBox2, lowSeatBox3, lowSeatBox4, lowSeatBox5, lowSeatBox6};
        JCheckBox[] childBoxArray = {childBox1, childBox2, childBox3, childBox4, childBox5, childBox6};
        JTextField[] surNameArray = {surName1, surName2, surName3, surName4, surName5, surName6};
        JTextField[] nameArray = {name1, name2, name3, name4, name5, name6};
        JTextField[] groupArray = {place1field, place2field, place3field, place4field, place5field, place6field};
        this.passengerArray = passengerArray;
        this.surNameArray = surNameArray;
        this.nameArray = nameArray;
        this.lowSeatArray = lowSeatArray;
        this.childBoxArray = childBoxArray;
        this.groupArray = groupArray;
        toField.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toFieldKeyReleased(evt);
            }
        });
    }

    int getOrderLowSeatNum(int start, int stop) {
        int counter = 0;
        for (int i = start; i < stop; i++) {
            if (lowSeatArray[i].isSelected()) {
                counter++;
            }
        }
        return counter;
    }

    public void setAuthFieldsSelected(boolean enabled) {
        usernameField.setEnabled(enabled);
        passwordField.setEnabled(enabled);
    }
}
