import processing.core.PApplet;

public class MainApp extends PApplet {

	private Server server;

	@Override
	public void setup() {
		size(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		server = new Server(this);
	}
	@Override
	public void draw() {
	}

}
