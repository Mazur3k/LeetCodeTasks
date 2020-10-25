import java.util.HashMap;
import java.util.Map;

public class DateFormatter {
    public String reformatDate(String date) {
        String[] splitted = date.split(" ");
        String day = splitted[0].replaceAll("[A-Za-z]*","");
        day = day.length() == 1 ? "0" + day : day;

        String month = mapMonth(splitted[1]);

        String year = splitted[2];

        return year+"-"+month+"-"+day;
    }

    private String mapMonth(String month){
        return createMap().get(month);
    }

    private Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        return map;
    }
}
