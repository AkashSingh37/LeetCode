class Solution {
    public static class Car {
        public int position;
        public int speed;

        public Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
    }
    
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, (x, y) -> Integer.compare(y.position, x.position));

        int fleetsCount = 0;
        double lastCarArrivalTime = 0;

        for (Car car : cars) {
            double arrivalTime = (target - car.position) / (double) car.speed;

            if (arrivalTime > lastCarArrivalTime) {
                fleetsCount++; // new fleet formed
                lastCarArrivalTime = arrivalTime;
            }
        }

        return fleetsCount;
    }
}
