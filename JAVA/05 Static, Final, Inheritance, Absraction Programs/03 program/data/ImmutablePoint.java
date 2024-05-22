package data;

public class ImmutablePoint {
    public final int x_coordinate;
    public final int y_coordinate;

    public ImmutablePoint(int x,int y)
    {
        x_coordinate=x;
        y_coordinate=y;
    }

    public int getX_coordinate() {
        return x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }
}
