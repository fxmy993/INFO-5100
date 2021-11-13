package edu.northeastern.fxmy;

class TrafficLight {

    private final Light light;
    public TrafficLight() {
        light = new Light();
    }

    public void carArrived(
            int carId,
            int roadId,
            int direction,
            Runnable turnGreen,
            Runnable crossCar
    ) {

        synchronized(light){
            if(light.crossingRoad != roadId){
                turnGreen.run();
                light.crossingRoad = roadId;
            }
            crossCar.run();
        }

    }

    class Light {
        int crossingRoad = 1;
    }
}
