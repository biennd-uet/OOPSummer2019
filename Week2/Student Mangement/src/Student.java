public class Student {
    private String id, name, email, group;

    public Student() {
        this("Student", "000", "uet@vnu.edu.vn");
    }
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    public Student(Student s) {
        this(s.name, s.id, s.email);
        this.group = s.group;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getGroup() {
        return group;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public String getInfo() {
        return this.name + " - "
            + this.id + " - "
            + this.group + " - "
            + this.email;
    }


}