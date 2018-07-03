public class City {
    private String landmark;
    private int station;
    private String mall;
    private int park;

    public City(String landmark, int station, String mall, int park) {
        this.landmark = landmark;
        this.station = station;
        this.mall = mall;
        this.park = park;
    }

    public String getLandmark() {
        return landmark;
    }

    public int getStation() {
        return station;
    }

    public String getMall() {
        return mall;
    }

    public int getPark() {
        return park;
    }


    public void toilet()
    {
        System.out.println("Very Dirty");
    }

    public void traffic()
    {
        System.out.println("Clear traffiv mostly");
    }

}
