public class Point
{
    private double x;
    private double y;
    Point(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    void setXY(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return "X: "+x+", Y: "+y;
    }

}