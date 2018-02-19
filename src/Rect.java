
public class Rect {
	private int x;
	private int y;
	private int width;
	private int height;

	Rect() {
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
	}
	
	Rect(int w, int h) {
		this.x = 0;
		this.y = 0;
		if (w < 0)
			this.width = 0;
		else
			this.width = w;
		if (h < 0)
			this.height = 0;
		else
			this.height = h;
	}

	Rect(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		if (w < 0)
			this.width = 0;
		else
			this.width = w;
		if (h < 0)
			this.height = 0;
		else
			this.height = h;
	}

	Rect(Rect r) {
		this.x = r.getX();
		this.y = r.getY();
		this.width = r.getWidth();
		this.height = r.getHeight();
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void resize(int w, int h) {
		if (w < 0)
			this.width = 0;
		else
			this.width = w;
		if (h < 0)
			this.height = 0;
		else
			this.height = h;
	}

	public void scale(double factor) {
		if (factor > 0) {
			this.width *= factor;
			this.height *= factor;
		}
	}

	public void scale(double fw, double fh) {
		if (fw > 0)
			this.width *= fw;
		if (fh > 0)
			this.height *= fh;

	}
	
	public void translate(int value) {
		this.x += value;
		this.y += value;
	}
	
	public void translate(int vx, int vy) {
		this.x += vx;
		this.y += vy;
	}
	
	public int area() {
		return this.height * this.width;
	}
	
	
	public boolean equals(Object o) {
		if (o instanceof Rect) {
			Rect r = (Rect) o;
			return this.x == r.x && this.y == r.y && this.width == r.width && this.height == r.height;
		}
		return false;
	}
	
	public String toString() {
		return "Loc = (" + this.x + "," + this.y + ")  W = " + this.width + "  H = " + this.height;
	}
}
