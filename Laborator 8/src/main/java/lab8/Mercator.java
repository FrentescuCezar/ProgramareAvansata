package lab8;

abstract class Mercator {
    final static double RADIUS_MAJOR = 6378137.0; //radius is the distance from the center of the earth to the equator
    final static double RADIUS_MINOR = 6356752.3142; //radius is the distance from the center of the earth to the north and south poles

    abstract double yAxisProjection(double input);
    abstract double xAxisProjection(double input);
}