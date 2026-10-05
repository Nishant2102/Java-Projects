package org.pankaj.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame 
{
	
	Object dummy = new Object();
	Object dummy2 = new Object();
	
	public MainFrame() {

		setBounds(0,0,700,700);
		
		addWindowListener(new WindowAdapter()
				{
					@Override
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				}
		);
		
		setLayout(null);
		Button btnStart = new Button("Start");
		
		btnStart.setBounds(600,50,60,20);
		
		btnStart.addActionListener(new ButtonHander(this));
		
		add(btnStart);
		
		
		
		setVisible(true);
		
		

	}

}
