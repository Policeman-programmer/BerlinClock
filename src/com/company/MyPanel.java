package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by admin on 13.07.2017.
 */
public class MyPanel extends JPanel {
    //переменная отвечающая за секунды
    int second = 0;
    Point2D center;
    float radius = 19.0f;
    //Color[] colors = {Color.white, color2};
    float dist[] = {0.0f, 0.4f};
    RadialGradientPaint grad;
    static JLabel clock;


    MyPanel() {
        clock = new JLabel();
        JPanel p = new JPanel();
        // p.setBackground(Color.red);
        this.setLayout(new BorderLayout());
        this.add(BorderLayout.SOUTH, clock);
    }


    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("clock.jpg").getImage();
        g.drawImage(image, 0, 0, this);

        if (BerlinClock.second()) {
            center = new Point.Float(68, 22);
            Color[] colors = {Color.white, Color.YELLOW};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.yellow);
            g.fillOval(49, 3, 37, 37);
        }

        if (BerlinClock.hour5()) {
            center = new Point.Float(19, 60);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
           // g.setColor(Color.red);
            g.fillRoundRect(4, 50, 30, 21,8,8);
        }

        if (BerlinClock.hour10()) {
            center = new Point.Float(53, 60);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRect(39, 50, 28, 21);
        }

        if (BerlinClock.hour15()) {
            center = new Point.Float(86, 60);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRect(72, 50, 28, 21);
        }

        if (BerlinClock.hour20()) {
            center = new Point.Float(117, 60);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRoundRect(103, 50, 28, 21,8,8);
        }

        if (BerlinClock.hour1()) {
            center = new Point.Float(19, 94);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRoundRect(4, 84, 30, 21,8,8);
        }
        if (BerlinClock.hour2()) {
            center = new Point.Float(53, 94);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRect(39, 84, 28, 21);
        }
        if (BerlinClock.hour3()) {
            center = new Point.Float(86, 94);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.red);
            g.fillRect(72, 84, 28, 21);
        }
        if (BerlinClock.hour4()) {
            center = new Point.Float(117, 94);
            Color[] colors = {Color.orange, Color.red};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            g.setColor(Color.red);
            g.fillRoundRect(103, 84, 28, 21,8,8);
        }
        if (BerlinClock.minute5()) {
            g.setColor(Color.yellow);
            g.fillRect(4, 118, 8, 21);
        }
        if (BerlinClock.minute10()) {
            g.setColor(Color.yellow);
            g.fillRect(16, 118, 8, 21);
        }
        if (BerlinClock.minute15()) {
            g.setColor(Color.red);
            g.fillRect(28, 118, 8, 21);
        }
        if (BerlinClock.minute20()) {
            g.setColor(Color.yellow);
            g.fillRect(40, 118, 8, 21);
        }
        if (BerlinClock.minute25()) {
            g.setColor(Color.yellow);
            g.fillRect(52, 118, 8, 21);
        }
        if (BerlinClock.minute30()) {
            g.setColor(Color.red);
            g.fillRect(65, 118, 8, 21);
        }
        if (BerlinClock.minute35()) {
            g.setColor(Color.yellow);
            g.fillRect(77, 118, 8, 21);
        }
        if (BerlinClock.minute40()) {
            g.setColor(Color.yellow);
            g.fillRect(89, 118, 8, 21);
        }
        if (BerlinClock.minute45()) {
            g.setColor(Color.red);
            g.fillRect(101, 118, 8, 21);
        }
        if (BerlinClock.minute50()) {
            g.setColor(Color.yellow);
            g.fillRect(113, 118, 8, 21);
        }
        if (BerlinClock.minute55()) {
            g.setColor(Color.yellow);
            g.fillRect(124, 118, 8, 21);
        }
        if (BerlinClock.minute1()) {
            center = new Point.Float(19, 162);
            Color[] colors = {Color.white, Color.yellow};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.yellow);
            g.fillRoundRect(4, 151, 29, 21,8,8);
        }
        if (BerlinClock.minute2()) {
            center = new Point.Float(53, 162);
            Color[] colors = {Color.white, Color.yellow};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.yellow);
            g.fillRect(37, 151, 29, 21);
        }
        if (BerlinClock.minute3()) {
            center = new Point.Float(86, 162);
            Color[] colors = {Color.white, Color.yellow};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.yellow);
            g.fillRect(70, 151, 29, 21);
        }
        if (BerlinClock.minute4()) {
            center = new Point.Float(117, 162);
            Color[] colors = {Color.white, Color.yellow};
            grad = new RadialGradientPaint(center, radius, dist, colors);
            Graphics2D g2 = (Graphics2D) g;
            g2.setPaint(grad);
            //g.setColor(Color.yellow);
            g.fillRoundRect(102, 151, 30, 21,8,8);
        }


//        Graphics2D g2d = (Graphics2D)g;
//        int red = (int)(Math.random()*255);
//        int green = (int)(Math.random()*255);
//        int blue = (int)(Math.random()*255);
//        Color startRandomColor = new Color(red,green,blue);
//
//        red = (int)(Math.random()*255);
//        green = (int)(Math.random()*255);
//        blue = (int)(Math.random()*255);
//        Color endRandomColor = new Color(red,green,blue);
//        GradientPaint gradient = new GradientPaint(0,0,startRandomColor,100,100,endRandomColor);
//
//        g2d.setPaint(gradient);
//        g2d.fillOval(0,0,100,100);

    }
}
