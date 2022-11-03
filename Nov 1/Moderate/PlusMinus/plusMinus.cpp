void plusMinus(vector<int> arr) {
    int len, n_count = 0, p_count = 0, z_count = 0;
    
    len = arr.size();
    //cout << len;
    float n = len * 1.0;
    
    while (len>0) {
        if (arr[len-1] > 0) {
            ++p_count;
        }
        else if (arr[len-1] < 0) {
            ++n_count;
        }
        else {
            ++z_count;
        }
        --len;
    }
    
    cout << fixed << setprecision(6) << float(p_count/n) << endl;
    cout << fixed << setprecision(6) << float(n_count/n) << endl;
    cout << fixed << setprecision(6) << float(z_count/n) << endl;
}

