package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occurred!!!");
				}
			}// 익명클래스의 끝 
		);
		
		b.addActionListener((e)->System.out.println("ActionEvent occurred!!!"));
	} // main의 끝
} // InnerEx8의 끝
