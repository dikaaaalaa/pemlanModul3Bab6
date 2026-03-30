public class MainManusia {
    public static void main(String[] args) {
        Manusia m1= new Manusia("Arab", true, "1234567890", true);
        System.out.println(m1);

        Manusia m2= new Manusia("Fuji", false, "0987654321", true);
        System.out.println(m2);

        Manusia m3= new Manusia("Furab", true, "1122334455", false);
        System.out.println(m3);
    }
}
