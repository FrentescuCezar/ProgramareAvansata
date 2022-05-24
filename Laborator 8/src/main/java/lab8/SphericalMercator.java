package lab8;

public class SphericalMercator extends Mercator {
    //provides projection math for converting between mercator meters,
    //screen pixels (of 256x256 or configurable-size tiles), and latitude/longitude.

    @Override
    double xAxisProjection(double input) {
        return Math.toRadians(input) * RADIUS_MAJOR;
    }

    @Override
    double yAxisProjection(double input) {
        return Math.log(Math.tan(Math.PI / 4 + Math.toRadians(input) / 2)) * RADIUS_MAJOR;
    }
}
