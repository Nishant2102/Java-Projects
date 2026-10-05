package org.pankaj.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHander implements ActionListener {

	MainFrame frame;
	
	public ButtonHander(MainFrame frame) {
		super();
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Runnable rectTarget = () ->
			{
				int xPos = 100;
			
				int yPos = 60;
				
				Graphics grp = frame.getGraphics();
				
				try {
					while(true)
					{
						grp.setColor(Color.black);
						grp.drawRect(xPos, yPos, 60, 20);
									
						Thread.sleep(25);
						
						grp.setColor(Color.white);
						
						grp.drawRect(xPos, yPos, 60, 20);
						
						yPos+=1;
						
					}
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			};
			
			Thread rectThread = new Thread(rectTarget);
			rectThread.setDaemon(true);
			rectThread.start();
			
			Runnable ovalTarget = () ->
			{
				int xPos = 300;
			
				int yPos = 500;
				
				Graphics grp = frame.getGraphics();
				grp.setColor(Color.black);
				grp.drawOval(xPos, yPos, 60, 20);
				
				try {
					rectThread.join(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while(true)
					{
						grp.setColor(Color.black);
						grp.drawOval(xPos, yPos, 60, 20);
									
						Thread.sleep(25);
						
						grp.setColor(Color.white);
						
						grp.drawOval(xPos, yPos, 60, 20);
						
						yPos-=1;
						
					}
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			};
			
			Thread ovalThread = new Thread(ovalTarget);
			ovalThread.setDaemon(true);
			ovalThread.start();
			

	}

}










