public class EnumWithMethods {
    enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6);

        private final double mass;
        private final double radius;
        static final double G = 6.67300E-11;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        double surfaceGravity() {
            return G * mass / (radius * radius);
        }

        double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
    }

    enum Direction {
        NORTH, SOUTH, EAST, WEST;

        public Direction opposite() {
            switch (this) {
                case NORTH: return SOUTH;
                case SOUTH: return NORTH;
                case EAST:  return WEST;
                case WEST:  return EAST;
                default: throw new AssertionError();
            }
        }
    }
    public static void main(String[] args) {
        double earthWeight = 75.0;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s: %.2f%n", p, p.surfaceWeight(mass));
        }

        System.out.println("Opposite of NORTH: " + Direction.NORTH.opposite());
    }
}
