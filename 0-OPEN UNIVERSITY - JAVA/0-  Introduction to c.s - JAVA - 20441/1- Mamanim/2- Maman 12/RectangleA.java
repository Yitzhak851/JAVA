/**
 * Class RectangleA. The RectangleA class represents a 2D axis aligned integral
 * rectangles.
 * 
 * @author (Yitzhak_ baror)
 * @version (26.11.2021)
 */
public class RectangleA {
    private int _width;
    private int _height;
    private Point _pointSW;
    private final static int DEFAULT_WIDTH = 1;
    private final static int DEFAULT_HEIGHT = 1;

    /**
     * First constructor for objects of class RectangleA Constructs a new rectangle
     * with the specified width, height and it's south west corner is (0,0).
     * 
     * @param width  - The rectangle width.
     * @param height - The rectangle height
     */
    public RectangleA(int w, int h) {
        _pointSW = new Point(0, 0);
        _width = (w > DEFAULT_WIDTH) ? w : DEFAULT_WIDTH;
        _height = (h > DEFAULT_HEIGHT) ? h : DEFAULT_HEIGHT;
    }

    /**
     * Second constructor for objects of class RectangleA Construct a new rectangle
     * with the specified width, height and south west vertex.
     * 
     * @param sw - south western vertex.
     * @param w  - rectangle width.
     * @param h  - rectangle height.
     *           See Also: Point
     */
    public RectangleA(Point p, int w, int h) {
        _pointSW = new Point(p);
        _width = (w > DEFAULT_WIDTH) ? w : DEFAULT_WIDTH;
        _height = (h > DEFAULT_HEIGHT) ? h : DEFAULT_HEIGHT;
    }

    /**
     * Third constructor for objects of class RectangleA Construct a new rectangle
     * with the specified south west vertex and north east vertex.
     * 
     * @param sw - south western vertex.
     * @param ne - north eastern vertex
     */
    public RectangleA(Point sw, Point ne) {
        _pointSW = new Point(sw);
        _width = ne.getX() - sw.getX();
        _height = ne.getY() - sw.getY();
    }

    /**
     * Copy constructor for objects of class RectangleA Constructs a rectangle using
     * another rectangle.
     * 
     * @param r - The rectangle from which to construct the new object.
     */
    public RectangleA(RectangleA r) {
        _height = r._height;
        _width = r._width;
        _pointSW = new Point(r._pointSW);
    }

    /**
     * Returns the width of the rectangle.
     * 
     * @return the width of the rectangle.
     */
    public int getWidth() {
        return _width;
    }

    /**
     * Returns the height of the rectangle.
     * 
     * @return the height of the rectangle.
     */
    public int getHeight() {
        return _height;
    }

    /**
     * Returns the South-West point of the rectangle.
     * 
     * @return a copy of the s-w point of the rectangle
     */
    public Point getPointSW() {
        return new Point(_pointSW);
    }

    /**
     * Sets the width of the rectangle.
     * 
     * @param w - the width of the rectangle to set to.
     */
    public void setWidth(int w) {
        _width = (w >= DEFAULT_WIDTH) ? w : _width;
    }

    /**
     * Sets the height of the rectangle.
     * 
     * @param h - the height of the rectangle to set to.
     */
    public void setHeight(int h) {
        _height = (h >= DEFAULT_HEIGHT) ? h : _height;
    }

    /**
     * Sets the South-West point of the rectangle.
     * 
     * @param p - the S-W point of the rectangle to set to.
     */
    public void setPointSW(Point p) {
        _pointSW = new Point(p);
    }

    /**
     * Returns a string representation of the rectangle.
     * toString in class java.lang.Object
     * 
     * @return a string represent the rectangle For example: Width=4 Height=6
     *         PointSW=(1,2)
     */
    public String toString() {
        return "Width=" + _width + " Height=" + _height + " PointSW=" + _pointSW;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * 
     * @return The perimeter of the rectangle.
     */
    public int getPerimeter() {
        return ((2 * _width) + (2 * _height));
    }

    /**
     * Calculates the area of the rectangle.
     * return The area of the rectangle.
     */
    public int getArea() {
        return (_width * _height);
    }

    /**
     * Move the rectangle by deltaX in x direction and deltaY in y direction.
     * 
     * @param deltaX - translate the rectangle deltaX in the x direction.
     * @param deltaY - translate the rectangle deltaY in the y direction.
     */
    public void move(int deltaX, int deltaY) {
        _pointSW.move(deltaX, deltaY);
    }

    /**
     * Returns true iff the given rectangle is equal to this rectangle.
     * 
     * @param other - the rectangle to check equality with.
     * @return true iff other and this rectangle are equal.
     */
    public boolean equals(RectangleA other) {
        return (_pointSW.equals(other._pointSW) && _height == other._height && _width == other._width);
    }

    /**
     * Returns the length of the rectangle diagonal.
     * 
     * @return the length of the diagonal of the Rectangle.
     */
    public double getDiagonalLength() {
        return (Math.sqrt(Math.pow(_height, 2) + Math.pow(_width, 2)));
    }

    /**
     * Returns true if the current rectangle is larger than the parameter rectangle.
     * 
     * @param other - another Rectangle to compare with.
     * @return true - if the current Rectangle's area is larger than the other
     *         Rectangle which recieved as parameter, false - otherwise.
     */
    public boolean isLarger(RectangleA other) {
        return (getArea() > other.getArea());
    }

    /**
     * Returns the North-East point of the rectangle.
     * 
     * @return a copy of the North-East point of the Rectangle.
     */
    public Point getPointNE() {
        return new Point(_pointSW.getX() + _width, _pointSW.getY() + _height);
    }

    /**
     * Changes the width to height and vice versa.
     */
    public void changeSides() {
        int changeHeight = _width;
        _width = _height;
        _height = changeHeight;
    }

    /**
     * Returns true if the current rectangle is in the parameter rectangle.
     * 
     * @param r - another Rectangle to check with.
     * @return true - if the current Rectangle's completly in the other Rectangle
     *         which recieved as parameter, false - otherwise.
     */
    public boolean isIn(RectangleA r) {
        if (r._pointSW.isRight(_pointSW) || r._pointSW.isAbove(_pointSW))
            return false;
        else if (r.getPointNE().isUnder(getPointNE()) || r.getPointNE().isLeft(getPointNE()))
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
    public boolean overlap(RectangleA r) {
        if (r._pointSW.isRight(getPointNE()) || r._pointSW.isAbove(getPointNE()))
            return false;
        else if (r.getPointNE().isUnder(_pointSW) || r.getPointNE().isLeft(_pointSW))
            return false;
        else
            return true;
    }
}