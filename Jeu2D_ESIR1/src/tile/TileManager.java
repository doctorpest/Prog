public class TileManager {
	private Tile[][] map;

	public TileManager() {
		loadMap("path/to/mapfile.txt");
	}

	private void loadMap(String filePath) {
		// Read the file and initialize the map array with corresponding Tile objects
	}

	public void draw(Graphics g) {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				Tile tile = map[y][x];
				tile.draw(g, x * 16, y * 16);
			}
		}
	}
}
