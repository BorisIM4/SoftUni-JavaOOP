package L2_Encapsulation_Exercise.P1_Class_Box_Data_Validation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }


    private void setLength(double length) {
        if (isPOsitiveOrBiggerThanZero(length)) {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (isPOsitiveOrBiggerThanZero(width)) {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (isPOsitiveOrBiggerThanZero(height)) {
            this.height = height;
        }
    }

    private boolean isPOsitiveOrBiggerThanZero(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number cannot be zero or negative.");
        }
        return true;
    }

    public double calculateSurfaceArea() {
        double surfaceArea = 2 * this.length * this.width +
                2 * this.length * this.height +
                2 * this.width * this.height;
        return surfaceArea;
    }

    public double calculateLateralSurfaceArea() {
        double lateralSurfaceArea = 2 * this.length * this.height +
                2 * this.width * this.height;
        return lateralSurfaceArea;
    }

    public double calculateVolume() {
        double Volume = this.length * this.width * this.height;
        return Volume;
    }

}
