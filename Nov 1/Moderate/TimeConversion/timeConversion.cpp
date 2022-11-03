string timeConversion(string s) {
    string rw_time = s.substr(2,6), hr, temp = s.substr(0, 2);
    stringstream si;
    ostringstream is;
    si << temp;
    int hour;
    si >> hour;
    char x = s.at(8);
    if (x == 'P') {
        if (hour != 12) {
            hour += 12;
        }
        is << hour;
        hr = is.str();
    }
    else {
        if (hour == 12) {
            hour = 00;                
        }
        is << hour;
        hr = is.str();        
        if (hour < 10) {
            hr = "0" + hr;
        }
    }
    rw_time = hr + rw_time;
    return rw_time;
}
