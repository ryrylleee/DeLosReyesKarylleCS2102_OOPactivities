public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Gracie Abrams", "American", 25, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Jeonghan Yoon", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Lee Chan", "Korean", 26, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Claude Monet", "French", 86, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("William Shakespeare", "British", 51, "Writing", WritingGenre.ROMANCE);
        writer.displayInfo();
    }
}
