package graficos;

import javax.swing.JFrame;// este paquete es para poder crear los marcos
import javax.swing.JPanel; // este paquete es para poder crear la lamina

import java.awt.FlowLayout;

import javax.swing.JButton; // este paquete es para poder crear los Botones
// Tambien podria importar el paquete: javax.swing.JButton; Y asi ahorra tener que crear los tres 
// paquetes anteriores

public class Layout_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoLayout marco = new MarcoLayout();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoLayout extends JFrame {

	public MarcoLayout() {

		setTitle("Prueba accioes");
		setBounds(600, 350, 600, 300);
		Panel_Layout lamina = new Panel_Layout();
		FlowLayout align = new FlowLayout(FlowLayout.RIGHT);
		lamina.setLayout(align);
		add(lamina);

	}
}

class Panel_Layout extends JPanel {
	public Panel_Layout() {
		JButton botonMorado = new JButton("Morado");
		add(botonMorado);
		add(new JButton("Rojo"));
		add(new JButton("Amarrillo"));

	}
}