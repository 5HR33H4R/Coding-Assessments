public static String timeConversion(String s) {
        String rw_time, hr;
        int hour = Integer.parseInt(s.substring(0, 2));
        rw_time = s.substring(2,8);
        char x = s.charAt(8);
        if (x == 'P') {
            if (hour != 12) {
                hour += 12;
            }
            hr = Integer.toString(hour);
        }
        else {
            if (hour == 12) {
                hour = 00;                
            }
            hr = Integer.toString(hour);
            if (hour < 10) {
                hr = "0" + hr;
            }
        }
        rw_time = hr + rw_time;
        return rw_time;
    }

