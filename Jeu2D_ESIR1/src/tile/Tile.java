public class Tile {
	private TileType type;
	private Image image;

	public Tile(TileType type, Image image) {
		this.type = type;
		this.image = image;
	}

	public void draw(Graphics g, int x, int y) {
		g.drawImage(image, x, y, null);
	}
}
