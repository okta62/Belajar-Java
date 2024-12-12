public class ObjekGeometri {
    private String color = "red";

    public ObjekGeometri() {
        // Konstruktor default
    }

    public ObjekGeometri(String color) {
        // Konstruktor dengan parameter untuk mengatur warna
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}