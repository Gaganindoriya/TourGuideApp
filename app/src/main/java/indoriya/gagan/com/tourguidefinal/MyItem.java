package indoriya.gagan.com.tourguidefinal;

public class MyItem {
    String place;
    String description;
    int image;

    public MyItem(String place, String description, int image) {
        this.place = place;
        this.description = description;
        this.image = image;
    }
    public String getPlace() {
        return place;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
