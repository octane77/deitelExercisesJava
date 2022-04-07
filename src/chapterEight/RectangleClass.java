package chapterEight;

public class RectangleClass {
    private double length;
    private double width;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20){
        this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20) {
            this.width = width;
        }
    }

}
