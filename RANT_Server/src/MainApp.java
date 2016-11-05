import processing.core.PApplet;

public class MainApp extends PApplet {

	private Server server;

	@Override
	public void setup() {
		server = new Server(this);
		server.start();
	}

}
