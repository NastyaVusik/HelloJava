package IPAddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckIPAddress {

    private String ipAddress;
    private String from0To255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    private String ipRegex = from0To255 + "\\." + from0To255 + "\\." + from0To255 + "\\." + from0To255;


    public CheckIPAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

//    public void checkIPvar1() {
//        //Compile regEx
//        Pattern pattern = Pattern.compile(ipRegex);
//
//        //Find match between pattern ipRegex and IP address
//        Matcher matcher = pattern.matcher(ipAddress);
//        while (matcher.find()) {
//            System.out.println("IP address is correct");
//            return;
//        }
//        System.out.println("IP address isn't correct");
//    }


    public void checkIP() {
        //Compile regEx
        Pattern pattern = Pattern.compile(ipRegex);

        //Find match between pattern ipRegex and IP address
        Matcher matcher = pattern.matcher(ipAddress);
        if (matcher.matches()) {
            System.out.println("IP address is correct");
        } else {
            System.out.println("IP address isn't correct");
        }
    }

}
