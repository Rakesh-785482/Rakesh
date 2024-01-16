public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(1);
        stu.setName("Rakesh");
        System.out.println(stu);
        System.out.println("Hiii Rakesh.....");
    }
}