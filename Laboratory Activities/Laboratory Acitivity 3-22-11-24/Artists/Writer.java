enum WritingGenre {
    ROMANCE,
    HISTORICAL,
    ACTION,
    FANTASY,
    HORROR,
    SCIFI,
    MYSTERY
}

class Writer extends Artist {
    private WritingGenre writingGenre;

    public Writer(String name, String nationality, int age, String specialty, WritingGenre writingGenre) {
        super(name, nationality, age, specialty);
        this.writingGenre = writingGenre;
    }

    public WritingGenre getwritingGenre() {
        return writingGenre;
    }

    public void setWritingStyle(WritingGenre writingGenre) {
        this.writingGenre = writingGenre;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Writer Info ==");
        super.displayInfo();
        System.out.println("Writing Genre: " + writingGenre);
    }
}
