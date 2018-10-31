package br.com.devfast.jsurveymonkey.entities;

public class Heading {

    String heading;
    String description;
    Image image;
    Random_Assignment random_assignment;

    /**
     * Constructor for Heading
     * @param heading: required
     */
    public Heading(String heading) {
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Random_Assignment getRandom_assignment() {
        return random_assignment;
    }

    public void setRandom_assignment(Random_Assignment random_assignment) {
        this.random_assignment = random_assignment;
    }
}