package DesignPatterns.BuilderPattern;

public class Bicycle {

    private boolean gears;
    private boolean doublestands;
    private boolean doubleseats;
    private boolean carrier;

    private Bicycle(BicycleBuilder bicycleBuilder) {
        this.gears = bicycleBuilder.gears;
        this.doublestands = bicycleBuilder.doublestands;
        this.doubleseats = bicycleBuilder.doubleseats;
        this.carrier = bicycleBuilder.carrier;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                ", doublestands=" + doublestands +
                ", doubleseats=" + doubleseats +
                ", carrier=" + carrier +
                '}';
    }

    public static class BicycleBuilder {

        private boolean gears;
        private boolean doublestands;
        private boolean doubleseats;
        private boolean carrier;


        public BicycleBuilder gears(boolean gears) {
            this.gears = gears;
            return this;
        }

        public BicycleBuilder doublestands(boolean doublestands) {
            this.doublestands = doublestands;
            return this;
        }

        public BicycleBuilder doubleseats(boolean doubleseats) {
            this.doubleseats = doubleseats;
            return this;
        }

        public BicycleBuilder carrier(boolean carrier) {
            this.carrier = carrier;
            return this;
        }

        public Bicycle getBicycle() {
            return new Bicycle(this);
        }
    }
}
