public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0), max = 0, sum = 0;
        int len = arr.size(), n = len;
        long temp;
        
        while (n > 0) {
            temp = arr.get(n-1);
            sum += temp;
            if (temp >= max) {
                max = temp;
            }
            if (temp <= min) {
                min = temp;
            }
            --n;
        }
        System.out.println((sum - max) + " " + (sum - min));

    }
