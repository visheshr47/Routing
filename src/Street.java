import java.util.Scanner;

public class Street extends City {
    private String area;
    private int streetanimal;
    private Boolean clean;

    public Street(String landmark, int station, String mall, int park, String area, int streetanimal, Boolean clean) {
        super(landmark, station, mall, park);
        this.area = area;
        this.streetanimal = streetanimal;
        this.clean = clean;
    }

    public Street() {
        super(null, 0, null, 0);
    }

    @Override
    public void toilet() {
        System.out.println("Toilets are Dirty");
        super.toilet();
    }

    public void showMessage(String msg) {
        System.out.println(msg.getClass());
    }

    public void showMessage(Integer msg) {
        System.out.println(msg.getClass());
    }

    public void printSum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = in.nextInt();
        System.out.println("Enter the second number");
        int n2 = in.nextInt();
        int n3 = n1 + n2;
        System.out.println(n3);
    }
}