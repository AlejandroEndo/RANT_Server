import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import processing.core.PApplet;

public class Server extends Thread implements Observer {

	private ServerSocket ss;

	private ControlXMLUsuarios cxmlUsuarios;
	private ControlXMLMensajes cxmlMensajes;

	private ArrayList<ControlCliente> clientes;

	public Server(PApplet app) {
		cxmlUsuarios = new ControlXMLUsuarios(app);
		cxmlMensajes = new ControlXMLMensajes(app);
		clientes = new ArrayList<ControlCliente>();
		try {
			ss = new ServerSocket(5000);
			System.out.println("[ SERVIDOR INICIADO EN: " + ss.toString() + " ]");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Observable o, Object arg) {

	}
}
