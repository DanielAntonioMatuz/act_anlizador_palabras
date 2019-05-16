
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class Palabras extends JFrame implements ActionListener {

	JFrame ventana;
	private JFrame f;
	private DefaultTableModel model;
	private JTable jt;
	private JLabel mensaje2,mensaje3,mensaje4,mensaje5,mensaje6;
	private JTextField resultadoA,resultadoC,resultadoE,resultadoD,resultadoF;
	private JButton verificar;
	
	
	public Palabras() {
		ventana = new JFrame();

		jt = new JTable(model);
		
		
		mensaje2 = new JLabel("Palabra:");
        mensaje2.setBounds(10, 50, 100, 60);
        mensaje2.setForeground(Color.white);
        ventana.add(mensaje2);
        
        mensaje3 = new JLabel("Palindromo:");
        mensaje3.setBounds(360, 10, 100, 60);
        mensaje3.setForeground(Color.white);
        ventana.add(mensaje3);
        
        mensaje4 = new JLabel("Longitud:");
        mensaje4.setBounds(360, 60, 100, 60);
        mensaje4.setForeground(Color.white);
        ventana.add(mensaje4);
        
        mensaje5 = new JLabel("Inversa:");
        mensaje5.setBounds(360, 110, 100, 60);
        mensaje5.setForeground(Color.white);
        ventana.add(mensaje5);
        
        mensaje6 = new JLabel("Repetidas:");
        mensaje6.setBounds(360, 160, 100, 60);
        mensaje6.setForeground(Color.white);
        ventana.add(mensaje6);
        
        resultadoA = new JTextField();
        resultadoA.setBounds(90, 60, 200, 40);
        //resultadoA.setEditable(false);
        ventana.add(resultadoA);

        resultadoC = new JTextField();
        resultadoC.setBounds(450, 20, 200, 40);
        resultadoC.setEditable(false);
        ventana.add(resultadoC);
        
        resultadoD = new JTextField();
        resultadoD.setBounds(450, 70, 200, 40);
        resultadoD.setEditable(false);
        ventana.add(resultadoD);
        
        resultadoE = new JTextField();
        resultadoE.setBounds(450, 120, 200, 40);
        resultadoE.setEditable(false);
        ventana.add(resultadoE);
        
        resultadoF = new JTextField();
        resultadoF.setBounds(450, 170, 200, 40);
        resultadoF.setEditable(false);
        ventana.add(resultadoF);
        
        verificar = new JButton();
        verificar.setText("verificar");
        verificar.setBounds(120, 120, 120, 25);
        verificar.addActionListener(this);
        ventana.add(verificar);

		ventana.setSize(700,300);
		ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().setBackground(new java.awt.Color(141,18,47));
		ventana.setVisible(true);
		
		
	}
	
	@Override
 	   public void actionPerformed(ActionEvent e) { 
		
	       char[]palabras = new char[100];
	       String datos = "";
		switch(e.getActionCommand()) {
		
		case "verificar":
			String palabra = resultadoA.getText();
		     int palab = 0;
		     for(int i=0;i<palabra.length();i++) {
		    	 palab++;
		     }
		     
		    String resultadoT = String.valueOf(palab);
		     resultadoD.setText(resultadoT);
		     
		     /////////////////////////////////////////
		     
		     for(int i=0;i<palabra.length();i++) {
		    	 if(palabra.charAt(i)==' ') {
		    		 
		    	 }else {
		    	 
		    	 palabras[i] = palabra.charAt(i);
		    	 }
		     }
		     
		     for(int i=palabra.length();i>-1;i--) {
		    	 datos = datos +  String.valueOf(palabras[i]);
		     }
		     resultadoE.setText(datos);
		     
		     //////////////////////////////////////////
		     
		     String datosA = "";
		     for(int i = palabra.length()-1;i>=0;i--) {
		    	 if(palabra.charAt(i)==' ') {
		    	 
		    	 }
		    	 else {
		    		 datosA = datosA + palabra.charAt(i);
		    	 }
		     }
		     if(palabra.compareTo(datosA)==0) {
		    	 resultadoC.setText("Si");
		     }
		     else {
		    	 
		    	 resultadoC.setText("No");
		     }

		     
		     int mayorRepeticion = 0;
		     char letraMasRepetida;
		   
		     for(int i=0; i<palabra.length(); i++){

		         char letraActual = palabras[i];
		         int contador = 0;

		         for (int j =0; j<palabra.length(); j++){
		             if (palabras[j] == letraActual)
		                 contador++;
		         }

		         if(mayorRepeticion < contador)
		         {
		             mayorRepeticion = contador;
		             letraMasRepetida = letraActual;
		             String LetraRP = String.valueOf(palabras[i]);
		             resultadoF.setText(LetraRP);
		         }
		     }
		
	
		     

		     
			break;
		
		}
 		   
 	   };
 	   
 	
	public void addRow(String str1, String str2, String str3) {

	}
	
	
	
	public static void main(String[] args){
		Palabras i = new Palabras();
        
        
    }
}