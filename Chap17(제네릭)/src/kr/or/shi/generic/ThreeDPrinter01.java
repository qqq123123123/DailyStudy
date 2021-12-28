package kr.or.shi.generic;

public class ThreeDPrinter01 {

	private Powder material;
    public Powder getMaterial()
    {
        return material;
    }
    public void setMaterial(Powder material)
    {
        this.material = material;
    }
    @Override
    public String toString() {
        return "재료는 Powder입니다.";
    }
}
