/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package librery;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.sql.Time;

/**
 *
 * @author Rahman
 */
public class Background extends javax.swing.JPanel implements Runnable {

    Thread plane;
  BufferedImage b[]=new BufferedImage[4];
    public Background() {
     
        initComponents();
         	try {
			b[0] = ImageIO.read(new File("background.png"));
                  
		} catch (IOException ex) {
			System.out.println("k");
		}
                
                   setSize(400, 400);
    }

public void paint(Graphics td) {

		super.paint(td);
		Graphics2D g = (Graphics2D) td;

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	
		g.drawImage(b[0], 0, 0, null);
              

	}

	public void addNotify() {
		super.addNotify();
		plane = new Thread(this);
		plane.start();
	}



	public void run() {

		

			repaint();
			
		}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
