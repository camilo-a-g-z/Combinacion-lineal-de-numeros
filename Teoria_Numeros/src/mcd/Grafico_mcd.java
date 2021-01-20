package mcd;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Grafico_mcd extends JFrame {
	//se decalran variables
	private JPanel contentPane;
	private JTextField jText_num1;
	private JTextField jText_num2;
	private JTextField jText_num3;
	private JTextField jText_num4;
	private JLabel jLabel_info;
	private JButton jBoton_mcd;
	private JTextArea jText_area_1;
	private JTextArea jText_area_2;
	private JTextArea jText_area_3;
	private JTextArea jLabel_resultado;
	private JLabel jLabel_mcd;
	private JScrollPane scrollPane_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico_mcd frame = new Grafico_mcd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grafico_mcd() {
		//se define propiedades de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//variable de informacion y advertencia
		jLabel_info = new JLabel("Ingrese los cuatro numeros a encontrar MCD");
		jLabel_info.setBounds(10, 17, 331, 28);
		contentPane.add(jLabel_info);
		
		jText_num1 = new JTextField();
		jText_num1.addMouseListener(new MouseAdapter() {
			@Override
			//cuando se oprima en el campo el texto se elimine para que el usuario pueda escribir
			public void mouseClicked(MouseEvent arg0) {
				if(jText_num1.getText().equals("Numero 1")) {
					jText_num1.setText("");
				}
			}
		});
		jText_num1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//advertencias en caso de valores no aceptados
				char caracter = e.getKeyChar();
				if(caracter=='-') {
					jLabel_info.setText("<html><body>El MCD de un número negativo se calcula de la misma forma que los números positivos</body></html>");
				}else {
					jLabel_info.setText("Ingrese los cuatro números a encontrar MCD");
				}
				if(caracter<'0'||caracter>'9') {
					e.consume();
				}
			}
		});
		jText_num1.setText("Numero 1");
		jText_num1.setBounds(20, 56, 86, 20);
		contentPane.add(jText_num1);
		jText_num1.setColumns(10);
		
		jText_num2 = new JTextField();
		jText_num2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//cuando se oprima en el campo el texto se elimine para que el usuario pueda escribir
				if(jText_num2.getText().equals("Numero 2")) {
					jText_num2.setText("");
				}
			}
		});
		jText_num2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//advetencia de valortes no aceptados
				char caracter = e.getKeyChar();
				if(caracter=='-') {
					jLabel_info.setText("<html><body>El MCD de un número negativo se calcula de la misma forma que los números positivos</body></html>");
				}else {
					jLabel_info.setText("Ingrese los cuatro números a encontrar MCD");
				}
				if(caracter<'0'||caracter>'9') {
					e.consume();
				}
			}
		});
		jText_num2.setText("Numero 2");
		jText_num2.setBounds(192, 56, 86, 20);
		contentPane.add(jText_num2);
		jText_num2.setColumns(10);
		
		jText_num3 = new JTextField();
		jText_num3.addMouseListener(new MouseAdapter() {
			@Override
			//cuando se oprima en el campo el texto se elimine para que el usuario pueda escribir
			public void mouseClicked(MouseEvent arg0) {
				if(jText_num3.getText().equals("Numero 3")) {
					jText_num3.setText("");
				}
			}
		});
		jText_num3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//advertencia de acciones invalidas
				char caracter = e.getKeyChar();
				if(caracter=='-') {
					jLabel_info.setText("<html><body>El MCD de un número negativo se calcula de la misma forma que los números positivos</body></html>");
				}else {
					jLabel_info.setText("Ingrese los cuatro números a encontrar MCD");
				}
				if(caracter<'0'||caracter>'9') {
					e.consume();
				}
			}
		});
		jText_num3.setText("Numero 3");
		jText_num3.setBounds(357, 56, 86, 20);
		contentPane.add(jText_num3);
		jText_num3.setColumns(10);
		
		jText_num4 = new JTextField();
		jText_num4.addMouseListener(new MouseAdapter() {
			@Override
			//cuando se oprima en el campo el texto se elimine para que el usuario pueda escribir
			public void mouseClicked(MouseEvent arg0) {;
				if(jText_num4.getText().equals("Numero 4")) {
					jText_num4.setText("");
				}
			}
		});
		jText_num4.addKeyListener(new KeyAdapter() {
			@Override
			//Advertencia de valores no validos
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();
				if(caracter=='-') {
					jLabel_info.setText("<html><body>El MCD de un número negativo se calcula de la misma forma que los números positivos</body></html>");
				}else {
					jLabel_info.setText("Ingrese los cuatro números a encontrar MCD");
				}
				if(caracter<'0'||caracter>'9') {
					e.consume();
				}
			}
		});
		jText_num4.setText("Numero 4");
		jText_num4.setBounds(496, 56, 86, 20);
		contentPane.add(jText_num4);
		jText_num4.setColumns(10);
		
		jBoton_mcd = new JButton("MCD");
		jBoton_mcd.addMouseListener(new MouseAdapter() {
			@Override
			//setear valores de campo a vacio
			public void mouseClicked(MouseEvent arg0) {
				jText_area_1.setText("");
				jText_area_2.setText("");
				jText_area_3.setText("");
				
				calcular_mcd();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				//condicional
				if(jText_num1.getText().equals("")||jText_num1.getText().equals("Numero 1")||jText_num2.getText().equals("")||jText_num2.getText().equals("Numero 2")||jText_num3.getText().equals("")||jText_num3.getText().equals("Numero 3")||jText_num4.getText().equals("")||jText_num4.getText().equals("Numero 4")) {
					jLabel_info.setText("Numeros no ingresados");
					jBoton_mcd.setEnabled(false);
				}else if(Double.parseDouble(jText_num1.getText())>1000000||Double.parseDouble(jText_num2.getText())>100000||Double.parseDouble(jText_num3.getText())>100000||Double.parseDouble(jText_num4.getText())>100000) {
					jLabel_info.setText("Ingrese numeros menores a 1000000");
					jBoton_mcd.setEnabled(false);
				}else {
					jLabel_info.setText("Ingrese los cuatro numeros a encontrar MCD");
					jBoton_mcd.setEnabled(true);
				}
			}
		});
		jBoton_mcd.setBounds(357, 17, 89, 23);
		contentPane.add(jBoton_mcd);
		//label donde se muestra mcd
		jLabel_mcd = new JLabel("MCD");
		jLabel_mcd.setBounds(469, 500, 80, 24);
		contentPane.add(jLabel_mcd);
		//scroll para jtextfield
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 101, 194, 340);
		contentPane.add(scrollPane);
		//lugar para escibir ombinaciones
		jText_area_1 = new JTextArea();
		scrollPane.setViewportView(jText_area_1);
		jText_area_1.setEditable(false);
		jText_area_1.setText("Primera combinación lineal");
		//scroll para jtextfield
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(236, 102, 207, 340);
		contentPane.add(scrollPane_1);
		//lugar para escribir las combinaciones
		jText_area_2 = new JTextArea();
		scrollPane_1.setViewportView(jText_area_2);
		jText_area_2.setEditable(false);
		jText_area_2.setText("Segunda combinación lineal");
		//scroll para jtextfield
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(463, 101, 200, 340);
		contentPane.add(scrollPane_2);
		//lugar para escribir las combinaciones
		jText_area_3 = new JTextArea();
		scrollPane_2.setViewportView(jText_area_3);
		jText_area_3.setEditable(false);
		jText_area_3.setText("Tercera combinacón lineal");
		//scroll para jtextfield
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(20, 500, 423, 50);
		contentPane.add(scrollPane_3);
		//lugar en el que se muestra combinacion funas
		jLabel_resultado = new JTextArea("Combinación lineal");
		scrollPane_3.setViewportView(jLabel_resultado);
		jLabel_resultado.setEditable(false);
	}
	void calcular_mcd() {
		//variables necesarias para realizar combinacion
		int[] arreglo = new int[4];
		int[] variables = new int[5];
		int aux=0;
	    int p_p=0;
	    int s_p=0;
	    int residuo=0;
	    //variables de posicionamiento para combinacion lineal
	    int y1=1,y2=0;
	    int x1=0,x2=1;
		int mcd=0;
		int[] arreglo_aux = new int[4];
		//Arreglo con el que se va a interactuar
		arreglo[0]=Integer.parseInt(jText_num1.getText());
		arreglo[1]=Integer.parseInt(jText_num2.getText());
		arreglo[2]=Integer.parseInt(jText_num3.getText());
		arreglo[3]=Integer.parseInt(jText_num4.getText());
		//arreglo que va a mantener valores originales
		arreglo_aux[0]=Integer.parseInt(jText_num1.getText());
		arreglo_aux[1]=Integer.parseInt(jText_num2.getText());
		arreglo_aux[2]=Integer.parseInt(jText_num3.getText());
		arreglo_aux[3]=Integer.parseInt(jText_num4.getText());
		
		//bucle para organizar numeros
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				if(arreglo[j]<arreglo[j+1]){
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
					
					aux = arreglo_aux[j];
					arreglo_aux[j] = arreglo_aux[j+1];
					arreglo_aux[j+1] = aux;
				}
			}
		}
		//se setean valores para mostrar primera combinacion lineal y operar hasta que el residuo sea 0
		p_p=arreglo[0];
	    s_p=arreglo[1];
	    residuo = arreglo[0]%arreglo[1];
	    //mensaje
	    jText_area_1.append("Se realiza una primera combinacion lineal:\n");
	    jText_area_1.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	    //posicion para combinacion lineal
	    y1 = (((p_p/s_p)*y2)*-1)+y1;
	    x1 = (((p_p/s_p)*x2)*-1)+x1;
	    if(residuo!=0) {
        	variables[0] = y1;
        	variables[1] = x1;
        }
	    //se pregunta residuo y se procede a operar las variables y almacenarlas en los respectivos arreglos
	    if(residuo!=0){
	        do{
	            p_p=s_p;
	            s_p=residuo;
	            residuo=p_p%s_p;
	            //mensaje
	            jText_area_1.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	            if(residuo!=0) {
	            	y2=(((p_p/s_p)*y1)*-1)+y2;	
	            	x2=(((p_p/s_p)*x1)*-1)+x2;
	            	variables[0] = y2;
	            	variables[1] = x2;
	            }
	            if(residuo!=0) {
	            	p_p=s_p;
		            s_p=residuo;
		            residuo=p_p%s_p;
		            //mensaje
		            jText_area_1.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
		            if(residuo!=0) {
		            	y1 = (((p_p/s_p)*y2)*-1)+y1;
		            	x1 = (((p_p/s_p)*x2)*-1)+x1;
		            	variables[0] = y1;
		            	variables[1] = x1;
		            }
	            }
	        }while(residuo!=0);
	    }
	    //mensaje
	    jText_area_1.append("\nMCD obtenido de combinacion lineal: "+mcd_individual(arreglo[0],arreglo[1],0)+"\n");
	    jText_area_1.append("\n"+mcd_individual(arreglo[0],arreglo[1],0)+"="+arreglo_aux[0]+"*("+variables[0]+")+"+arreglo_aux[1]+"*("+variables[1]+")");
	    //Se refrescan variables
	    y1=1;
	    y2=0;
	    x1=0;
	    x2=1;
	    
	    //mensaje
	    jText_area_2.append("Se realiza una segunda combinacion lineal entre el mcd y el siguiente numero:\n");
	    p_p=arreglo[2];
	    s_p=mcd_individual(arreglo[0],arreglo[1],0);
	    residuo=p_p%s_p;
	    jText_area_2.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	    y1 = (((p_p/s_p)*y2)*-1)+y1;
	    x1 = (((p_p/s_p)*x2)*-1)+x1;
	    //se pregunta residuo y se procede a operar las variables y almacenarlas en los respectivos arreglos
	    if(residuo!=0) {
        	variables[2] = y1;
        	variables[3] = x1;
        }
	    if(residuo!=0){
	        do{
	            p_p=s_p;
	            s_p=residuo;
	            residuo=p_p%s_p;
	            //mensaje
	            jText_area_2.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	            if(residuo!=0) {
	            	y2=(((p_p/s_p)*y1)*-1)+y2;	
	            	x2=(((p_p/s_p)*x1)*-1)+x2;
	            	variables[2] = y2;
	            	variables[3] = x2;
	            }
	            if(residuo!=0) {
	            	p_p=s_p;
		            s_p=residuo;
		            residuo=p_p%s_p;
		            //mensaje
		            jText_area_1.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
		            if(residuo!=0) {
		            	y1 = (((p_p/s_p)*y2)*-1)+y1;
		            	x1 = (((p_p/s_p)*x2)*-1)+x1;
		            	variables[2] = y1;
		            	variables[3] = x1;
		            }
	            }
	        }while(residuo!=0);
	    }
	    if(variables[3]!=0) {
	    	variables[0] *= variables[3];
	    	variables[1] *= variables[3];
	    }
	    variables[3] =0;
	    jText_area_2.append("\nMCD obtenido de combinacion lineal: "+mcd_individual(arreglo[0],arreglo[1],arreglo[2]));
	    jText_area_2.append("\n"+mcd_individual(arreglo[0],arreglo[1],arreglo[2])+"="+arreglo_aux[0]+"*("+variables[0]+")+"+arreglo_aux[1]+"*("+variables[1]+")+"+arreglo_aux[2]+"*("+variables[2]+")");
	    //Se refrecan variables
	    y1=1;
	    y2=0;
	    x1=0;
	    x2=1;
	    jText_area_3.append("Se realiza una segunda combinacion lineal entre el mcd y el siguiente numero:\n\n");
	    p_p=arreglo[3];
	    s_p=mcd_individual(arreglo[0],arreglo[1],arreglo[2]);
	    residuo=p_p%s_p;
	    //se pregunta residuo y se procede a operar las variables y almacenarlas en los respectivos arreglos
	    jText_area_3.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	    y1 = (((p_p/s_p)*y2)*-1)+y1;
	    x1 = (((p_p/s_p)*x2)*-1)+x1;
	    if(residuo!=0) {
        	variables[3] = y1;
        	variables[4] = x1;
        }
	    if(residuo!=0){
	        do{
	            p_p=s_p;
	            s_p=residuo;
	            residuo=p_p%s_p;
	            //mensaje
	            jText_area_3.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
	            if(residuo!=0) {
	            	y2=(((p_p/s_p)*y1)*-1)+y2;	
	            	x2=(((p_p/s_p)*x1)*-1)+x2;
	            	variables[3] = y2;
	            	variables[4] = x2;
	            }
	            if(residuo!=0) {
	            	p_p=s_p;
		            s_p=residuo;
		            residuo=p_p%s_p;
		            //mensaje
		            jText_area_1.append(p_p+" = "+s_p+"*"+(p_p/s_p)+" + "+residuo+"\n");
		            if(residuo!=0) {
		            	y1 = (((p_p/s_p)*y2)*-1)+y1;
		            	x1 = (((p_p/s_p)*x2)*-1)+x1;
		            	variables[3] = y1;
		            	variables[4] = x1;
		            }
	            }
	        }while(residuo!=0);
	    }
	    jText_area_3.append("\nSe obtiene combinacion lineal y MCD");
	    if(variables[4]!=0) {
	    	variables[0] *= variables[4];
	    	variables[1] *= variables[4];
	    	variables[2] *= variables[4];
	    }
	    
		for (int i=2;i>=0;i--){
		    p_p=arreglo[i];
		    s_p=arreglo[i+1];
		    residuo=arreglo[i]%arreglo[i+1];
		}
		jLabel_resultado.setText("");
		jLabel_resultado.append("La combinacion resultante de los numeros: "+arreglo[0]+", "+arreglo[1]+", "+arreglo[2]+", "+arreglo[3]);
		jLabel_resultado.append("");
		//se calcula mcd
		for(int i=0;i<=3;i++){
			if(i==0){
				mcd = arreglo[i];
			}
			else{
				do{
					residuo=mcd%arreglo[i];
					
					if(residuo!=0){
						mcd=arreglo[i];
						arreglo[i]=residuo;
					}else{
						mcd=arreglo[i];
					}
				}while(residuo!=0);
			}
		}
		jLabel_resultado.append("\n"+mcd+"="+arreglo_aux[0]+"*("+variables[0]+")+"+arreglo_aux[1]+"*("+variables[1]+")+"+arreglo_aux[2]+"*("+variables[2]+")+"+arreglo_aux[3]+"*("+variables[3]+")");
		jLabel_mcd.setText("MCD: "+mcd);
		
	}
	//funcion para calcular mcd 
	int mcd_individual(int x, int y, int z) {
		int[] aux = {x,y,z};
		int residuo , mcd=0;
		if(z==0) {
			do {
				residuo = x%y;
				if(residuo !=0) {
					x = y;
					y = residuo;
				}else {
					mcd =y;
				}
			}while(residuo!=0);
			return mcd;
		}else {
			for (int i=0;i<=2;i++) {
				if(i==0) {
					mcd = aux[i];
				}else {
					do {
						residuo=mcd%aux[i];
						
						if(residuo!=0){
							mcd=aux[i];
							aux[i]=residuo;
						}else{
							mcd=aux[i];
						}
					}while(residuo!=0);
				}
			}
			return mcd;
		}
	}
}
