package gol;

public class Position2D {

	private int x;
	private int y;

	public Position2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	public double distanceFrom(Position2D other) {
		double x1 = x;
		double y1 = y;
		
		
		x1 -= other.x;
		y1 -= other.y;
		return Math.sqrt(x1 * x1 + y1 * y1);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position2D other = (Position2D) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
	
	


