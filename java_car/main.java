class main {
    public static void main(String[] args) {
        fire_truck fire_truck = new fire_truck();
        embulance embulance = new embulance();
        police_car police_car = new police_car();

        System.out.println(fire_truck.name);
        System.out.println(fire_truck.sounds);
        System.out.println(fire_truck.place);

        System.out.println(embulance.name);
        System.out.println(embulance.sounds);
        System.out.println(embulance.place);

        System.out.println(police_car.name);
        System.out.println(police_car.sounds);
        System.out.println(police_car.place);
    }
}



