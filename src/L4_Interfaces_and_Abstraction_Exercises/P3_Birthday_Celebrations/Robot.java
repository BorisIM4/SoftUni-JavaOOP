package L4_Interfaces_and_Abstraction_Exercises.P3_Birthday_Celebrations;

public class Robot implements Identifiable, Machinable {
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.setId(id);
        this.setModel(model);
    }

    private void setId(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
