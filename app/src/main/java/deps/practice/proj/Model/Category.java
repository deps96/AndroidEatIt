package deps.practice.proj.Model;

public class Category {
    private String Name;
    private String IMAGE;

    public Category() {
    }

    public Category(String name, String IMAGE) {
        Name = name;
        this.IMAGE = IMAGE;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }
}
