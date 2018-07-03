public class Highway extends City {

    private int lane;
    private int lights;
    private int tower;
    private int footpath;

    public Highway(String landmark, int station, String mall, int park, int lane, int lights, int tower, int footpath) {
        super(landmark, station, mall, park);
        this.lane = lane;
        this.lights = lights;
        this.tower = tower;
        this.footpath = footpath;
        }

        public void ditches(){
        System.out.println("Not big ditches but still not for driving above 60km/hr");
        }


    @Override
    public void toilet() {
        System.out.println("Luxury Toilets Available");
        ditches();
        super.toilet();
    }


}
