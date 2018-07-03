public class Bridge extends City {
    private int timeTaken;
    private int distance;
    private String condition;

    public Bridge(String landmark, int station, String mall, int park, int timeTaken, int distance, String condition) {
        super(landmark, station, mall, park);
        this.timeTaken = timeTaken;
        this.distance = distance;
        this.condition = condition;
    }


    @Override
    public void toilet() {
        System.out.println("Not available");
        super.toilet();
    }

    @Override
    public void traffic() {
        System.out.print("Heavy traffic");
        super.traffic();
    }
}


