package Enum.Season;

public class SeasonCelsius {
    public static void main(String[] args) {
        for(Season s:Season.values())
            System.out.println(s+" Average Temperature :"+s.gettemp());
    }
}
