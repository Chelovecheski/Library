package org.chelobyte.library.misc;

public enum Genre {

    MYSTERY("Mystery"),
    DYSTOPIA("Dystopia"),
    ROMANCE("Romance"),
    SCIENCE_FICTION("Science fiction"),
    FICTION("Fiction"),
    HORROR("Horror"),
    THRILLER("Thriller"),
    COMEDY("Comedy");

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
