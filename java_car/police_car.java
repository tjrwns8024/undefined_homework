class police_car extends Cars {
    String name = "경찰차";
    String sounds = "삐용삐용";
    String place = "경찰서";

    public void getName(String name) {
        this.name = name;
    }

    public void getSounds(String sounds) {
        this.sounds = sounds;
    }

    public void getPlace(String place) {
        this.place = place;
    }

}