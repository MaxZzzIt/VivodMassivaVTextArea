package by.home.maxzzzit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


// Вывести одномерный массив, заполнить числами random от 1 до 100 и вывести в TextFild по нажатию кнопки!
public class VivodMassivaVTextArea extends JFrame{
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		JFrame vivod = new JFrame();
		JPanel pan = new JPanel();
		vivod.setTitle("Тиктак");
		JTextArea ta = new JTextArea(23,30);
		JButton bt = new JButton("Вывести массив");

		System.out.print("Введите размер одномерного массива - ");
		int a;
		a=scn.nextInt();
		int[]massiv=new int[a];
		for (int i=0; i<massiv.length;i++) {
			massiv[i]=(int)(Math.random()*100);
			System.out.print(massiv[i]+" ");
//			ta.setText(String.valueOf(massiv[i]));
//			ta.append(massiv.toString());
			bt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.setText(Arrays.toString(massiv)); // вывод массива в JTextArea					
				}
			});
		}
		vivod.add(pan);
		vivod.setSize(400,500);
		vivod.setLocationRelativeTo(null);
//		vivod.setResizable(false);
		vivod.setAlwaysOnTop(true);
		vivod.setDefaultCloseOperation(VivodMassivaVTextArea.EXIT_ON_CLOSE);
//		vivod.add(ta);
//		vivod.add(bt);
		pan.contains(30,30);
		pan.add(ta);
		pan.add(bt);
		vivod.setVisible(true);
	}
	
}
