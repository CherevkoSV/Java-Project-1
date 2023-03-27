package com.example.java_hw7;

public class Quadrilateral {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public double getArea() {
        return 0;
    }

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    public class Square extends Quadrilateral {
        public Square(double side) {
            super(side, side, side, side);
        }

        @Override
        public double getArea() {
            return side1 * side1;
        }
    }

    public class Rectangle extends Quadrilateral {
        public Rectangle(double length, double width) {
            super(length, width, length, width);
        }

        @Override
        public double getArea() {
            return side1 * side2;
        }
    }

    public class Parallelogram extends Quadrilateral {
        protected double height;

        public Parallelogram(double base, double side, double height) {
            super(base, side, base, side);
            this.height = height;
        }

        @Override
        public double getArea() {
            return side1 * height;
        }
    }

    public class Trapezoid extends Quadrilateral {
        protected double height;

        public Trapezoid(double base1, double base2, double side1, double side2, double height) {
            super(base1, base2, side1, side2);
            this.height = height;
        }

        @Override
        public double getArea() {
            return (side1 + side2) * height / 2;
        }
    }

    public class Rhombus extends Quadrilateral {
        protected double height;

        public Rhombus(double side, double height) {
            super(side, side, side, side);
            this.height = height;
        }

        @Override
        public double getArea() {
            return side1 * height;
        }
    }
}
