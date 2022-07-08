/**
 * Class RectangleB. The RectangleB class represents a 2D axis aligned integral
 * rectangles.
 * 
 * @author (Yitzhak_Baror)
 * @version (26.11.2021)
 */
public class RectangleB {
    private Point _pointSW;
    private Point _pointNE;
    private final static int DEFAULT_WIDTH = 1;
    private final static int DEFAULT_HEIGHT = 1;

    /**
     * First constructor for objects of class RectangleB Constructs a new rectangle
     * with the specified width, height and it's south west corner is (0,0).
     * 
     * @param width  - The rectangle width.
     * @param height - The rectangle height.
     */
    public RectangleB(int w, int h) {
        _pointSW = new Point(0, 0);
        w = (w > DEFAULT_WIDTH) ? w : DEFAULT_WIDTH;
        h = (h > DEFAULT_HEIGHT) ? h : DEFAULT_HEIGHT;
        _pointNE = new Point(_pointSW.getX() + w, _pointSW.getY() + h);
    }

    /**
     * Second constructor for objects of class RectangleB Constructs a new rectangle
     * with the specified vertices.
     * 
     * @param p - south western vertex.
     * @param w - rectangle width.
     * @param h - rectangle height.
     * @See Also Point.
     */
    public RectangleB(Point p, int w, int h) {
        _pointSW = new Point(p);
        w = (w > DEFAULT_WIDTH) ? w : DEFAULT_WIDTH;
        h = (h > DEFAULT_HEIGHT) ? h : DEFAULT_HEIGHT;
        _pointNE = new Point(_pointSW.getX() + w, _pointSW.getY() + h);
    }

    /**
     * Third constructor for objects of class RectangleB Constructs a new rectangle
     * with the specified vertices.
     * 
     * @param sw - south western vertex.
     * @param ne - north eastern vertex.
     * @See Also Point.
     */
    public RectangleB(Point sw, Point ne) {
        _pointSW = new Point(sw);
        _pointNE = new Point(ne);
    }

    /**
     * Copy constructor for objects of class RectangleB Constructs a rectangle using
     * another rectangle.
     * 
     * @param r - The rectangle from which to construct the new object.
     */
    public RectangleB(RectangleB r) {
        _pointSW = new Point(r._pointSW);
        _pointNE = new Point(r._pointNE);
    }

    /**
     * Returns the South-West point of the rectangle.
     * 
     * @return a copy of the s-w point of the rectangle.
     */
    public Point getPointSW() {
        return new Point(_pointSW);
    }

    /**
     * Returns the North-East point of the rectangle.
     * 
     * @return a copy of the n-e point of the rectangle.
     */
    public Point getPointNE() {
        return new Point(_pointNE);
    }

    /**
     * Sets the South-West point of the rectangle. This change affects also the NE
     * Point since the width and height of the rectangle should NOT change.
     * 
     * @param p - the new S-W point of the rectangle.
     */
    public void setPointSW(Point p) {
        int width = getWidth(), height = getHeight();
        _pointSW = new Point(p);
        _pointNE = new Point(width + _pointSW.getX(), height + _pointSW.getY());
    }

    /**
     * Returns a string representation of the rectangle.
     * toString in class java.lang.Object.
     * return a string represent the rectangle For example: Width=4 Height=6
     * PointSW=(1,2).
     */
    public String toString() {
        return "Width=" + getWidth() + " Height=" + getHeight() + " PointSW=" + _pointSW;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return The perimeter of the rectangle.
     */
    public int getPerimeter() {
        return ((2 * getWidth()) + (2 * getHeight()));
    }

    /**
     * Calculates the area of the rectangle.
     * 
     * @return The area of the rectangle.
     */
    public int getArea() {
        return (getWidth() * getHeight());
    }

    /**
     * Move the rectangle by deltaX in x direction and deltaY in y direction.
     * 
     * @param deltaX - translate the rectangle deltaX in the x direction.
     * @param deltaY - translate the rectangle deltaY in the y direction.
     */
    // REMARK: in this class when you move pointSW you must also move pointNE
    // to keep the width and height the same
    // Points: -2
    public void move(int deltaX, int deltaY) {
        _pointSW.move(deltaX, deltaY);
    }

    /**
     * Returns the width of the rectangle.
     * 
     * @return the width of the rectangle
     */
    public int getWidth() {
        return _pointNE.getX() - _pointSW.getX();
    }

    /**
     * Returns the height of the rectangle.
     * 
     * @return the height of the rectangle.
     */
    public int getHeight() {
        return _pointNE.getY() - _pointSW.getY();
    }

    /**
     * Sets the width of the rectangle.
     * 
     * @param w - the width of the rectangle to set to.
     */
    // REMARK: if w is not valid you should not set
    // points: -1
    public void setWidth(int w) {
        w = (w > DEFAULT_WIDTH) ? w : DEFAULT_WIDTH;
        _pointNE = new Point(_pointSW.getX() + w, _pointNE.getY());
    }

    /**
     * Sets the height of the rectangle.
     * 
     * @param h - the height of the rectangle to set to.
     */
    // REMARK: if h is not valid you should not set
    // points: -1
    public void setHeight(int h) {
        h = (h > DEFAULT_HEIGHT) ? h : DEFAULT_HEIGHT;
        _pointNE = new Point(_pointNE.getX(), _pointSW.getY() + h);
    }

    /**
     * Returns true iff the given rectangle is equal to this rectangle.
     * 
     * @param other - the rectangle to check equality with.
     * @return true iff other and this rectangle are equal.
     */
    public boolean equals(RectangleB other) {
        return (_pointSW.equals(other._pointSW) && _pointNE.equals(other._pointNE));
    }

    /**
     * Returns the length of the rectangle diagonal.
     * 
     * @return the length of the diagonal of the Rectangle.
     */
    public double getDiagonalLength() {
        return _pointSW.distance(_pointNE);
    }

    /**
     * Returns true if the current rectangle is larger than the parameter rectangle.
     * 
     * @param other - another Rectangle to compare with.
     * @return true - if the current Rectangle's area is larger than the other
     *         Rectangle which recieved as parameter, false - otherwise.
     */
    public boolean isLarger(RectangleB other) {
        return (getArea() > other.getArea());
    }

    /**
     * Changes the width to height and vice versa.
     */
    public void changeSides() {
        int changeHeight = getWidth();
        setWidth(getHeight());
        setHeight(changeHeight);
    }

    /**
     * Returns true if the current rectangle is in the parameter rectangle.
     * 
     * @param r - another Rectangle to check with.
     * @return true - if the current Rectangle's completly in the other Rectangle
     *         which recieved as parameter, false - otherwise.
     */
    public boolean isIn(RectangleB r) {
        if (r._pointSW.isRight(_pointSW) || r._pointSW.isAbove(_pointSW))
            return false;
        else if (r._pointNE.isUnder(_pointNE) || r._pointNE.isLeft(_pointNE))
            return false;
        else
            return true;
    }

    /**
     * Returns true if the current rectangle overlaps with the parameter rectangle.
     * 
     * @param r - another Rectangle to check with.
     * @return true - if the current Rectangle's overlaps with the other Rectangle
     *         which recieved as parameter even by a single point, false -
     *         otherwise.
     */
    public boolean overlap(RectangleB r) {
        if (r._pointSW.isRight(_pointNE) || r._pointSW.isAbove(_pointNE))
            return false;
        else if (r._pointNE.isUnder(_pointSW) || r._pointNE.isLeft(_pointSW))
            return false;
        else
            return true;
    }

}