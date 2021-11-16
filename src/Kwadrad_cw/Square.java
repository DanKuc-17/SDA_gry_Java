package Kwadrad_cw;

public class Square {

    private Point leftTop;
    private Point leftBottom;
    private Point rightTop;
    private Point rightBottom;
    private int length;
    public Square(Point leftTop, int length) {
        this.leftTop = leftTop;
        this.length = length;
        this.generateCorners(leftTop);
    }
    public boolean isCovered(Square second) {
        // TODO czy jeden nachodzi na drugi?
        if (isBetweenX(second.rightBottom, this.leftTop, this.rightTop) &&
                isBetweenY(second.rightBottom, this.leftTop, this.leftBottom)) {
            return true;
        }
        if (isBetweenX(second.leftBottom, this.leftTop, this.rightTop) &&
                isBetweenY(second.leftBottom, this.rightTop, this.rightBottom)) {
            return true;
        }
        if (isBetweenX(second.leftTop, this.leftBottom, this.rightBottom) &&
                isBetweenY(second.leftTop, this.rightBottom, this.rightBottom)) {
            return true;
        }
        if (isBetweenX(second.rightTop, this.leftBottom, this.rightBottom) &&
                isBetweenY(second.rightTop, this.leftTop, this.leftBottom)) {
            return true;
        }
        return false;
    }
    private void generateCorners(Point leftTop) {
        this.rightTop = new Point(this.leftTop.getX() + length, this.leftTop.getY());
        this.rightBottom = new Point(this.leftTop.getX() + length, this.leftTop.getY() - length);
        this.leftBottom = new Point(this.leftTop.getX(), this.leftTop.getY() - length);
    }
    private boolean isBetweenX(Point p1, Point p2, Point p3) {
        //is point p1 between p2 and p3 on x axis?
        if (p1.getX() >= p2.getX() && p1.getX() <= p3.getX())
            return true;
        return false;
    }
    private boolean isBetweenY(Point p1, Point p2, Point p3) {
        // is point p1 between p2 and p3 on y axis?
        if (p1.getY() <= p2.getY() && p1.getY() >= p3.getY())
            return true;
        return false;
    }
    public static class Point {
        private int x;
        private int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }
}
