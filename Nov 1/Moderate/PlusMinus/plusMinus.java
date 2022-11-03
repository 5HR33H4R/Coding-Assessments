 public static void plusMinus(List<Integer> arr) {
        int len = arr.size(), n_count = 0, p_count = 0, z_count = 0;
        float n = len;
        
        while (len>0) {
            if (arr.get(len-1) > 0) {
                ++p_count;
            }
            else if (arr.get(len-1) < 0) {
                ++n_count;
            }
            else {
                ++z_count;
            }
            --len;
        }
        //System.out.println(n);
        
        System.out.println(String.format("%.6f",(p_count/n)));
        System.out.println(String.format("%.6f",(n_count/n)));
        System.out.println(String.format("%.6f",(z_count/n)));
    }
