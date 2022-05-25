package Api;

import java.io.Serializable;

public class Pet {
    private int id;
    private String  name;
    private String status;
    private Category category;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Category getCategory() {
        return category;
    }
//    public Pet(){
//
//    }

    public Pet(int id, Category category ,String name,String status) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.category = category;
    }
}
