void miniMaxSum(vector<int> arr) {
    int len = arr.size();
    long int max = 0, min = arr[0], sum = 0, temp;
    int n = len;
    
    while (n > 0) {
        temp = arr[n-1];
        sum += temp;
        
        if (temp >= max) {
            max = temp;
        }
        if (temp <= min) {
            min = temp;
        }
        --n;
    }    
    
    cout << (sum - max) << " " << (sum - min) << endl;
}

