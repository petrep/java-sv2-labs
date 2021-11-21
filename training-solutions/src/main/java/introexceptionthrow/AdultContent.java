package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        Adult adult = new Adult("Old Shatterhand", 33);

        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        Adult child = new Adult("Eric Young", 17);

        System.out.println(child.getName());
        System.out.println(child.getAge());
    }
}
