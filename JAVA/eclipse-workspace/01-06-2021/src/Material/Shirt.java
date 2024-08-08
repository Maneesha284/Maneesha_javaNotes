package Material;

enum MaterialEnum {
	COTTON, LINEN, POLYSTER;
}

public class Shirt {
	private float collarSize;
	private float length;
	private MaterialEnum material;

	public float getCollarSize() {
		return collarSize;
	}

	public void setCollarSize(float collarSize) {
		this.collarSize = collarSize;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public MaterialEnum getMaterial() {
		return material;
	}

	public void setMaterial(MaterialEnum material) {
		this.material = material;
	}
	public Shirt() {
		this.collarSize = 0;
		this.length = 0;
		this.material = MaterialEnum.COTTON;
	}

	public Shirt(float collarSize, float length, MaterialEnum material) {
		this.collarSize = collarSize;
		this.length = length;
		this.material = material;
	}

	public void displayDetails() {
		System.out.println("Shirt [collarSize=" + collarSize + ", length=" + length + ", material=" + material + "]");
	}
}
