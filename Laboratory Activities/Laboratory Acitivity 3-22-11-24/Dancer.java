enum DanceStyle {
    HIPHOP,
    CONTEMPORARY,
    BALLROOM,
    BALLET,
    JAZZ;
}

class Dancer extends Artist {
    private DanceStyle danceStyle;

    public Dancer(String name, String nationality, int age, String specialty, DanceStyle danceStyle) {
        super(name, nationality, age, specialty);
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDance() {
        return danceStyle;
    }

    public void setDanceStyle(DanceStyle dance) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
