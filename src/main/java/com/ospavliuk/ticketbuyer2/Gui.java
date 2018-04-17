package com.ospavliuk.ticketbuyer2;

import com.ospavliuk.ticketbuyer2.controller.Controller;
import com.ospavliuk.ticketbuyer2.controller.WagonType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

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
        startLabel = new JLabel();
        destLabel = new JLabel();
        jSeparator1 = new JSeparator();
        changeButton = new JButton();
        dayBox = new JComboBox<>();
        monthBox = new JComboBox<>();
        dateLabel = new JLabel();
        jSeparator2 = new JSeparator();
        trainNumberLabel = new JLabel();
        anyTrainNumberButton = new JRadioButton();
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
        startField = new JComboBox<>();
        destField = new JComboBox<>();
        c1Button = new JRadioButton();
        c2Button = new JRadioButton();
        timeBox = new JComboBox<>();
        jSeparator9 = new JSeparator();
        browserLabel = new JLabel();
        edgeButton = new JRadioButton();
        chromeButton = new JRadioButton();
        firefoxButton = new JRadioButton();
        anyWagonTypeButton = new JRadioButton();
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
        placeField1 = new JTextField();
        placefield2 = new JTextField();
        placefield3 = new JTextField();
        placefield4 = new JTextField();
        placefield5 = new JTextField();
        placefield6 = new JTextField();
        placeFields = new JTextField[]{placeField1, placefield2, placefield3, placefield4, placefield5, placefield6};
        startFactorMembers = new JLabel[]{startLabel, destLabel, dateLabel, wagonTypeLabel};
        childBox1 = new JCheckBox();
        jSeparator8 = new JSeparator();
        wagonNumLabel = new JLabel();
        wagonOnlyButton = new JRadioButton();
        anyWagonNumberButton = new JRadioButton();
        wagonExceptBox = new JCheckBox();
        wagonOnlyField = new JTextField();
        wagonExceptField = new JTextField();
        fullOrderBox = new JCheckBox();
        sameCupeBox = new JCheckBox();
        Font font = new java.awt.Font("Tahoma", Font.PLAIN, 14);
        _28daysModel = new DefaultComboBoxModel<>(new String[]{"---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28"});
        _29daysModel = new DefaultComboBoxModel<>(new String[]{"---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28", "29"});
        _30daysModel = new DefaultComboBoxModel<>(new String[]{"---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30"});
        _31daysModel = new DefaultComboBoxModel<>(new String[]{"---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
                "28", "29", "30", "31"});

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ticket Buyer 2.0 by Alexander Pavliuk");
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);

        startLabel.setFont(font);
        startLabel.setForeground(Color.RED);
        startLabel.setText("Откуда");
        startLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startField.removeAllItems();
                startField.getEditor().setItem("ХАРЬКОВ-ПАСС");
                stationIsTyping(startField);
            }
        });

        destLabel.setFont(font);
        destLabel.setForeground(Color.RED);
        destLabel.setText("Куда");
        dateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LocalDate ld = LocalDate.from(new Date().toInstant().atZone(ZoneId.of("UTC"))).plusDays(44);
                monthBox.setSelectedIndex(ld.getMonthValue());
                dayBox.setSelectedIndex(ld.getDayOfMonth());
            }
        });

        changeButton.setFont(font);
        changeButton.setText("поменять");
        changeButton.setEnabled(false);
        changeButton.setPreferredSize(new java.awt.Dimension(90, 25));
        changeButton.addActionListener(evt -> controller.directionChanged());

        dayBox.setModel(_31daysModel);
        dayBox.addItemListener(evt -> {
            if (evt.getStateChange() == ItemEvent.DESELECTED) {
                return;
            }
            setDate();
        });

        monthBox.setModel(new DefaultComboBoxModel<>(new String[]{"---", "Январь", "Февраль", "Март", "Апрель", "Май",
                "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"}));
        monthBox.addItemListener(evt -> {
            if (evt.getStateChange() == ItemEvent.DESELECTED) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            int month = monthBox.getSelectedIndex();
            int day = dayBox.getSelectedIndex();
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                dayBox.setModel(_30daysModel);
                if (day > 30) {
                    day = 0;
                }
            } else if (month == 2) {
                if (((GregorianCalendar) calendar).isLeapYear(calendar.get(Calendar.YEAR) - 1900)) {
                    dayBox.setModel(_29daysModel);
                    if (day > 29) {
                        day = 0;
                    }
                } else {
                    dayBox.setModel(_28daysModel);
                    if (day > 28) {
                        day = 0;
                    }
                }
            } else {
                dayBox.setModel(_31daysModel);
            }
            dateLabel.setForeground(Color.RED);
            dayBox.setSelectedIndex(day);
            if (day > 0 && month > 0) {
                setDate();
            }
            checkStartAbility();
        });
        dateLabel.setFont(font);
        dateLabel.setForeground(Color.RED);
        dateLabel.setText("Отправление:");

        trainNumberLabel.setFont(font);
        trainNumberLabel.setText("Номер поезда:");

        buttonGroup1.add(anyTrainNumberButton);
        anyTrainNumberButton.setSelected(true);
        anyTrainNumberButton.setText("Любой");
        anyTrainNumberButton.addActionListener(evt -> controller.trainNumberSelected("Любой"));

        buttonGroup1.add(specifyTrainButton);
        specifyTrainButton.setText("Задать");
        specifyTrainButton.addActionListener(evt -> controller.trainNumberSelected("Задать"));

        trainNumberField.setFont(new java.awt.Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        trainNumberField.setForeground(new java.awt.Color(255, 0, 0));
        trainNumberField.setToolTipText("Полный номер поезда с буквой без пробелов");
        trainNumberField.setEnabled(false);

        wagonTypeLabel.setFont(font);
        wagonTypeLabel.setForeground(Color.RED);
        wagonTypeLabel.setText("Тип вагона:");

        startButton.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        startButton.setText("СТАРТ");
        startButton.setEnabled(false);
        startButton.addActionListener(evt -> controller.startPressed(startButton.getText()));

        infoArea.setEditable(false);
        infoArea.setColumns(20);
        infoArea.setLineWrap(true);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        authorizeBox.setText("Аутентификация на uz.gov.ua");
        authorizeBox.addActionListener(evt -> controller.authSelected(authorizeBox.isSelected()));

        usernameField.setEnabled(false);

        loginLabel.setText("Login");

        passwordLabel.setText("Password");

        passwordField.setEnabled(false);

        startField.setEditable(true);
        startField.setFont(font);
        startField.setMinimumSize(new java.awt.Dimension(6, 23));

        destField.setEditable(true);
        destField.setFont(font);

        buttonGroup2.add(plazkartButton);
        plazkartButton.setText("Плацкарт");
        plazkartButton.addActionListener(evt -> wagonTypeChanged(WagonType.PLATZKART));

        buttonGroup2.add(cupeButton);
        cupeButton.setText("Купе");
        cupeButton.addActionListener(evt -> wagonTypeChanged(WagonType.KUPE));

        buttonGroup2.add(luxButton);
        luxButton.setText("Люкс");
        luxButton.addActionListener(evt -> wagonTypeChanged(WagonType.LUX));

        buttonGroup2.add(c1Button);
        c1Button.setText("С1");
        c1Button.addActionListener(evt -> wagonTypeChanged(WagonType.C1));

        buttonGroup2.add(c2Button);
        c2Button.setText("С2");
        c2Button.addActionListener(evt -> wagonTypeChanged(WagonType.C2));

        buttonGroup2.add(anyWagonTypeButton);
        anyWagonTypeButton.setText("Любой");
        anyWagonTypeButton.addActionListener(evt -> wagonTypeChanged(WagonType.ANY_TYPE));

        timeBox.setModel(new DefaultComboBoxModel<>(new String[]{"00:00", "01:00", "02:00", "03:00", "04:00", "05:00",
                "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00",
                "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"}));
        timeBox.addItemListener(evt -> {
            if (evt.getStateChange() == ItemEvent.SELECTED && dayBox.getSelectedIndex() != 0 && monthBox.getSelectedIndex() != 0) {
                setDate();
            }
        });

        browserLabel.setFont(font);
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
                                                                        .addComponent(startLabel)
                                                                        .addComponent(destLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(startField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(destField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(trainNumberLabel)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(anyTrainNumberButton)
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
                                                                                        .addComponent(anyWagonTypeButton)
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
                                                        .addComponent(startField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(startLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(destField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(destLabel)))
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
                                        .addComponent(anyTrainNumberButton)
                                        .addComponent(trainNumberLabel))
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
                                                        .addComponent(anyWagonTypeButton)))
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

        passengersLabel.setFont(font);
        passengersLabel.setText("Данные пассажиров:");

        passBox1.setSelected(true);
        passBox1.setEnabled(false);

        surName1.setFont(font);
        surName1.setText("Фамилия");
        surName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name1.setFont(font);
        name1.setText("Имя");
        name1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        passBox2.addActionListener(evt -> controller.passengerEnabled(1, passBox2.isSelected()));

        surName2.setFont(font);
        surName2.setText("Фамилия");
        surName2.setEnabled(false);
        surName2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name2.setFont(font);
        name2.setText("Имя");
        name2.setEnabled(false);
        name2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        childBox2.setText("Детский");
        childBox2.setEnabled(false);

        passBox3.addActionListener(evt -> controller.passengerEnabled(2, passBox3.isSelected()));

        surName3.setFont(font);
        surName3.setText("Фамилия");
        surName3.setEnabled(false);
        surName3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name3.setFont(font);
        name3.setText("Имя");
        name3.setEnabled(false);
        name3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        childBox3.setText("Детский");
        childBox3.setEnabled(false);

        passBox4.addActionListener(evt -> controller.passengerEnabled(3, passBox4.isSelected()));

        surName4.setFont(font);
        surName4.setText("Фамилия");
        surName4.setEnabled(false);
        surName4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name4.setFont(font);
        name4.setText("Имя");
        name4.setEnabled(false);
        name4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        childBox4.setText("Детский");
        childBox4.setEnabled(false);

        passBox5.addActionListener(evt -> controller.passengerEnabled(4, passBox5.isSelected()));

        surName5.setFont(font);
        surName5.setText("Фамилия");
        surName5.setEnabled(false);
        surName5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name5.setFont(font);
        name5.setText("Имя");
        name5.setEnabled(false);
        name5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        childBox5.setText("Детский");
        childBox5.setEnabled(false);

        passBox6.addActionListener(evt -> controller.passengerEnabled(5, passBox6.isSelected()));

        surName6.setFont(font);
        surName6.setText("Фамилия");
        surName6.setEnabled(false);
        surName6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Фамилия");
            }
        });

        name6.setFont(font);
        name6.setText("Имя");
        name6.setEnabled(false);
        name6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                fieldFocusGained(evt);
            }

            public void focusLost(FocusEvent evt) {
                fieldFocusLost(evt, "Имя");
            }
        });

        childBox6.setText("Детский");
        childBox6.setEnabled(false);

        lowSeatBox1.setText("Только нижнее");
        lowSeatBox1.setEnabled(false);

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
        sameWagonBox.setEnabled(false);
        sameWagonBox.addActionListener(evt -> sameCupeBox.setEnabled(sameWagonBox.isSelected() && areSeveralPassenger() && !(c1Button.isSelected() || c2Button.isSelected())));

        lateralDiscardBox.setSelected(true);
        lateralDiscardBox.setText("запретить боковые");
        lateralDiscardBox.setToolTipText("Только для плацкарта");
        lateralDiscardBox.setEnabled(false);

        manualPlaceBox.setText("Задать места вручную");
        manualPlaceBox.setToolTipText("Будут заказаны только указанные места");
        manualPlaceBox.addActionListener(evt -> controller.manualPlacesSelected(manualPlaceBox.isSelected()));

        placesLabel.setText("Место");

        for (JTextField tf : placeFields) {
            tf.setFont(font);
            tf.setEnabled(false);
        }

        childBox1.setText("Детский");
        childBox1.setEnabled(false);

        jSeparator8.setOrientation(SwingConstants.VERTICAL);

        wagonNumLabel.setText("Номер вагона:");

        buttonGroup3.add(wagonOnlyButton);
        wagonOnlyButton.setText("только:");
        wagonOnlyButton.addActionListener(evt -> controller.wagonNumberSelected(true));

        buttonGroup3.add(anyWagonNumberButton);
        anyWagonNumberButton.setSelected(true);
        anyWagonNumberButton.setText("любой");
        anyWagonNumberButton.addActionListener(evt -> controller.wagonNumberSelected(false));

        wagonExceptBox.setText("кроме:");
        wagonExceptBox.addActionListener(evt -> controller.exceptWagonSelected(wagonExceptBox.isSelected()));

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

        sameCupeBox.setSelected(true);
        sameCupeBox.setText("В одном купе");
        sameCupeBox.setToolTipText("Для первых по списку");
        sameCupeBox.setEnabled(false);

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
                                                                                .addComponent(sameCupeBox)
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
                                                                                        .addComponent(anyWagonNumberButton)
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
                                        .addComponent(placefield5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                        .addComponent(placefield6)
                                        .addComponent(placefield3)
                                        .addComponent(placefield2)
                                        .addComponent(placefield4)
                                        .addComponent(placeField1, GroupLayout.Alignment.LEADING)))
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
                                                        .addComponent(placeField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
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
                                                .addComponent(placefield2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
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
                                                .addComponent(placefield3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(childBox3)
                                        .addComponent(lowSeatBox3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(placefield4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(placefield5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(childBox5, GroupLayout.Alignment.TRAILING)
                                        .addComponent(lowSeatBox5))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(surName6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(name6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(placefield6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                                                .addComponent(anyWagonNumberButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(wagonExceptBox)
                                                        .addComponent(wagonExceptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(sameWagonBox)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(sameCupeBox)
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

    private void setDate() {
        int setMonth = monthBox.getSelectedIndex();
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        boolean success = controller.setDate(
                dayBox.getSelectedIndex(),
                setMonth,
                setMonth > currentMonth ? currentYear : currentYear + 1,
                String.valueOf(timeBox.getSelectedItem()));
        dateLabel.setForeground(success ? Color.GREEN.darker() : Color.RED);
        checkStartAbility();
    }

    private void wagonTypeChanged(WagonType type) {
        wagonTypeLabel.setForeground(Color.GREEN.darker());
        enableLowPlaces();
        sameCupeBox.setEnabled(sameWagonBox.isSelected() && areSeveralPassenger() && !(c1Button.isSelected() || c2Button.isSelected()));
        controller.setWagonType(type);
        lateralDiscardBox.setEnabled(plazkartButton.isSelected() || anyWagonTypeButton.isSelected());
        checkStartAbility();
    }

    private void enableLowPlaces() {
        for (int i = 0; i < 6; i++) {
            if (passengerBoxes[i].isSelected()) {
                lowSeatBoxes[i].setEnabled(plazkartButton.isSelected() || cupeButton.isSelected() || anyWagonTypeButton.isSelected());
            }
        }
    }

    private void checkStartAbility() {
        boolean ready = true;
        for (JLabel l : startFactorMembers) {
            if (l.getForeground() == Color.RED) {
                ready = false;
                break;
            }
        }
        startButton.setEnabled(ready && controller.checkAvailability());
        System.out.println(ready && controller.checkAvailability());
    }

    public void setTrainNumberFieldEnabled(boolean enabled) {
        trainNumberField.setEnabled(enabled);
    }

    public void setStartButtonLabel(String label) {
        startButton.setText(label);
    }

    public void setChangeButtonEnabled(boolean enable) {
        changeButton.setEnabled(enable);
    }

    public void changeDirection() {
        String buffer = (String) startField.getSelectedItem();
        startField.getEditor().setItem(destField.getSelectedItem());
        stationIsTyping(startField);
        destField.getEditor().setItem(buffer);
        stationIsTyping(destField);
    }

    private void print(String text) {
        infoArea.setText(infoArea.getText() + text);
        infoArea.setCaretPosition(infoArea.getDocument().getLength());
    }

    public void println(String text) {
        print(text + "\n");
    }

    private boolean areSeveralPassenger() {
        for (int i = 1; i < 6; i++) {
            if (passengerBoxes[i].isSelected()) {
                return true;
            }
        }
        return false;
    }

    private void fieldFocusGained(FocusEvent evt) {
        JTextField currentField = (JTextField) (evt.getSource());
        String currentFieldText = currentField.getText();
        if (currentFieldText.equals("Имя") || currentFieldText.equals("Фамилия")) {
            currentField.setText("");
        }
    }

    private void fieldFocusLost(FocusEvent evt, String defaultText) {
        JTextField currentField = (JTextField) evt.getSource();
        if (currentField.getText().isEmpty()) {
            currentField.setText(defaultText);
        }
    }

    private void stationIsTyping(JComboBox<String> comboBox) {
        java.util.List<String> highlights;
        Object o = comboBox.getEditor().getItem();
        String text = "";
        if (o != null) {
            text = String.valueOf(o);
        }
        comboBox.removeAllItems();
        comboBox.hidePopup();
        comboBox.addItem(text);
        if (text.length() < 3) {
            return;
        }
        highlights = controller.findStation(text.toUpperCase());
        for (String station : highlights) {
            if (station.equals(comboBox.getItemAt(0))) {
                comboBox.removeItemAt(0);
            }
            comboBox.addItem(station);
        }
        if (comboBox.getItemAt(1) != null) {
            comboBox.showPopup();
        }
    }

    int getPassengerNumber() {
        int counter = 0;
        for (JCheckBox box : passengerBoxes) {
            if (box.isSelected()) {
                counter++;
            }
        }
        return counter;
    }

    public String getWebDriverType() {
        for (Enumeration<AbstractButton> buttons = buttonGroup4.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    protected String getLogin() {
        return usernameField.getText();
    }

    protected String getPassword() {
        return Arrays.toString(passwordField.getPassword());
    }

    public void enablePassenger(int num, boolean enable) {
        surNameFields[num].setEnabled(enable);
        nameFields[num].setEnabled(enable);
        childBoxes[num].setEnabled(enable);
        lowSeatBoxes[num].setEnabled(enable && (plazkartButton.isSelected() || cupeButton.isSelected() || anyWagonTypeButton.isSelected()));
        placeFields[num].setEnabled(enable && manualPlaceBox.isSelected());
        sameWagonBox.setEnabled(areSeveralPassenger() && anyWagonNumberButton.isSelected());
        sameCupeBox.setEnabled(areSeveralPassenger() && (luxButton.isSelected() || plazkartButton.isSelected() || cupeButton.isSelected() || anyWagonTypeButton.isSelected()));
        fullOrderBox.setEnabled(areSeveralPassenger());
    }

    private void initUserComponents() {
        passengerBoxes = new JCheckBox[]{passBox1, passBox2, passBox3, passBox4, passBox5, passBox6};
        lowSeatBoxes = new JCheckBox[]{lowSeatBox1, lowSeatBox2, lowSeatBox3, lowSeatBox4, lowSeatBox5, lowSeatBox6};
        childBoxes = new JCheckBox[]{childBox1, childBox2, childBox3, childBox4, childBox5, childBox6};
        surNameFields = new JTextField[]{surName1, surName2, surName3, surName4, surName5, surName6};
        nameFields = new JTextField[]{name1, name2, name3, name4, name5, name6};
        table = new Hashtable<Integer, Color>();
        table.put(0, Color.MAGENTA);
        table.put(1, Color.RED);
        table.put(2, Color.BLUE);
        table.put(3, Color.GREEN);
        table.put(4, Color.GRAY);
        table.put(5, Color.ORANGE);
        table.put(6, Color.CYAN);
        startField.setRenderer(new MyListCellRenderer(table));
        destField.setRenderer(new MyListCellRenderer(table));


        destField.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stationIsTyping(destField);
            }
        });
        startField.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stationIsTyping(startField);
            }
        });
        startField.addItemListener(e -> {
            boolean realStation = controller.tryToSetStation(String.valueOf(startField.getSelectedItem()), true);
            setStationColor(true, realStation ? Color.GREEN.darker() : Color.RED);
            checkStartAbility();
        });
        destField.addItemListener(e -> {
            boolean realStation = controller.tryToSetStation(String.valueOf(destField.getSelectedItem()), false);
            setStationColor(false, realStation ? Color.GREEN.darker() : Color.RED);
            checkStartAbility();
        });
    }

    public void setWagonOnlyFieldEnabled(boolean enable) {
        wagonOnlyField.setEnabled(enable);
        wagonExceptBox.setEnabled(!enable);
        wagonExceptField.setEnabled(!enable && wagonExceptBox.isSelected());
    }

    public void setWagonExceptFieldEnabled(boolean enable) {
        wagonExceptField.setEnabled(enable);
    }

    public void setPlacesEnabled(boolean enable) {
        for (int i = 0; i < placeFields.length; i++) {
            placeFields[i].setEnabled(enable && passengerBoxes[i].isSelected());
        }
    }

    public void setAuthFieldsSelected(boolean enabled) {
        usernameField.setEnabled(enabled);
        passwordField.setEnabled(enabled);
    }

    private void setStationColor(boolean isStartStation, Color color) {
        JLabel label = isStartStation ? startLabel : destLabel;
        label.setForeground(color);
    }

    public void setStartButtonEnabled(boolean enable) {
        startButton.setEnabled(enable);
    }

    public void setSettingsEnabled(boolean enable) {
        startLabel.setEnabled(enable);
        startField.setEnabled(enable);
        destLabel.setEnabled(enable);
        destField.setEnabled(enable);
        changeButton.setEnabled(enable);
        dateLabel.setEnabled(enable);
        dayBox.setEnabled(enable);
        monthBox.setEnabled(enable);
        timeBox.setEnabled(enable);
        trainNumberLabel.setEnabled(enable);
        trainNumberField.setEnabled(enable);
        anyTrainNumberButton.setEnabled(enable);
        specifyTrainButton.setEnabled(enable);
        wagonTypeLabel.setEnabled(enable);
        plazkartButton.setEnabled(enable);
        cupeButton.setEnabled(enable);
        luxButton.setEnabled(enable);
        c1Button.setEnabled(enable);
        c2Button.setEnabled(enable);
        anyWagonTypeButton.setEnabled(enable);
        authorizeBox.setEnabled(enable);
        browserLabel.setEnabled(enable);
        edgeButton.setEnabled(enable);
        chromeButton.setEnabled(enable);
        firefoxButton.setEnabled(enable);
    }

    class MyListCellRenderer extends DefaultListCellRenderer {
        Hashtable<Integer, Color> table;

        MyListCellRenderer(Hashtable<Integer, Color> table) {
            this.table = table;
            setOpaque(true);
        }

        public Component getListCellRendererComponent(JList jc, Object val, int idx, boolean isSelected, boolean cellHasFocus) {
            setText(val.toString());
            setForeground(table.get(idx));
            if (isSelected)
                setBackground(Color.LIGHT_GRAY);
            else
                setBackground(Color.WHITE);
            return this;
        }
    }

    private JRadioButton anyWagonTypeButton;
    private JRadioButton anyTrainNumberButton;
    private JCheckBox authorizeBox;
    private JLabel browserLabel;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private ButtonGroup buttonGroup3;
    private ButtonGroup buttonGroup4;
    private JRadioButton c1Button;
    private JRadioButton c2Button;
    private JButton changeButton;
    private JCheckBox childBox1;
    private JCheckBox childBox2;
    private JCheckBox childBox3;
    private JCheckBox childBox4;
    private JCheckBox childBox5;
    private JCheckBox childBox6;
    private JRadioButton chromeButton;
    private JRadioButton cupeButton;
    private JLabel dateLabel;
    private JComboBox<String> dayBox;
    private JRadioButton edgeButton;
    private JRadioButton firefoxButton;
    private JComboBox<String> startField;
    private JLabel startLabel;
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
    private JCheckBox lateralDiscardBox;
    private JLabel loginLabel;
    private JCheckBox lowSeatBox1;
    private JCheckBox lowSeatBox2;
    private JCheckBox lowSeatBox3;
    private JCheckBox lowSeatBox4;
    private JCheckBox lowSeatBox5;
    private JCheckBox lowSeatBox6;
    private JRadioButton luxButton;
    private JCheckBox manualPlaceBox;
    private JComboBox<String> monthBox;
    private JTextField name1;
    private JTextField name2;
    private JTextField name3;
    private JTextField name4;
    private JTextField name5;
    private JTextField name6;
    private JLabel trainNumberLabel;
    private JCheckBox passBox1;
    private JCheckBox passBox2;
    private JCheckBox passBox3;
    private JCheckBox passBox4;
    private JCheckBox passBox5;
    private JCheckBox passBox6;
    private JLabel passengersLabel;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JTextField placeField1;
    private JTextField placefield2;
    private JTextField placefield3;
    private JTextField placefield4;
    private JTextField placefield5;
    private JTextField placefield6;
    private JLabel placesLabel;
    private JRadioButton plazkartButton;
    private JCheckBox sameCupeBox;
    private JCheckBox sameWagonBox;
    private JRadioButton specifyTrainButton;
    private JButton startButton;
    private JTextField surName1;
    private JTextField surName2;
    private JTextField surName3;
    private JTextField surName4;
    private JTextField surName5;
    private JTextField surName6;
    private JComboBox<String> timeBox;
    private JComboBox<String> destField;
    private JLabel destLabel;
    private JTextField trainNumberField;
    private JTextField usernameField;
    private JRadioButton anyWagonNumberButton;
    private JCheckBox wagonExceptBox;
    private JTextField wagonExceptField;
    private JLabel wagonNumLabel;
    private JRadioButton wagonOnlyButton;
    private JTextField wagonOnlyField;
    private JLabel wagonTypeLabel;
    private JLabel[] startFactorMembers;
    private JCheckBox[] passengerBoxes;
    private JTextField[] surNameFields;
    private JTextField[] nameFields;
    private JCheckBox[] lowSeatBoxes;
    private JCheckBox[] childBoxes;
    private JTextField[] placeFields;
    private final Controller controller;
    private Hashtable<Integer, Color> table;
    private DefaultComboBoxModel<String> _28daysModel;
    private DefaultComboBoxModel<String> _29daysModel;
    private DefaultComboBoxModel<String> _30daysModel;
    private DefaultComboBoxModel<String> _31daysModel;
}
