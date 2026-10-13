package uk.ac.westminster.products_api;

public class Person {
    private Long id;
    private String name;
    private String Dob;

    public Person(Long id, String name, String Dob) {
        this.id = id;
        this.name = name;
        this.Dob = Dob;
    }
    // add getters
    public Person() {}
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }
}
