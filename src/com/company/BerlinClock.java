package com.company;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//заполнить градиентом, нарисоваь по углам многоугольник соответствующий ячейке

public class BerlinClock extends JFrame {
    private static Date now;
    static JPanel panel;


    BerlinClock() {
        super("BerlinClock");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400, 300, 140, 230);
        setVisible(true);
        setResizable(false);

        panel = new MyPanel();
        getContentPane().add(BorderLayout.CENTER, panel);
    }

    public static boolean second() {
        boolean bright = false;
        now = new Date();
        if ((now.getSeconds() % 2) == 0) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour5() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() / 5) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour10() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() / 10) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour15() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() / 15) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour20() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() / 20) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour1() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() % 5) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour2() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() % 5) >= 2) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour3() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() % 5) >= 3) {
            bright = true;
        }
        return bright;
    }

    public static boolean hour4() {
        boolean bright = false;
        now = new Date();
        if ((now.getHours() % 5) >= 4) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute5() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 5) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute10() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 10) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute15() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 15) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute20() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 20) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute25() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 25) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute30() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 30) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute35() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 35) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute40() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 40) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute45() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 45) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute50() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 50) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute55() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() / 55) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute1() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() % 5) >= 1) {
            bright = true;
        }
        return bright;
    }

    public static boolean minute2() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() % 5) >= 2) {

            bright = true;
        }
        return bright;
    }

    public static boolean minute3() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() % 5) >= 3) {

            bright = true;
        }
        return bright;
    }

    public static boolean minute4() {
        boolean bright = false;
        now = new Date();
        if ((now.getMinutes() % 5) >= 4) {

            bright = true;
        }
        return bright;
    }


    public void showClock() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
        MyPanel.clock.setText("               " + ft.format(dNow));

    }

    public static void main(String[] args) {
        BerlinClock bc = new BerlinClock();
        Thread t = Thread.currentThread();
        while (true) {
            try {
                t.sleep(1000);
                bc.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bc.showClock();
        }

    }
}