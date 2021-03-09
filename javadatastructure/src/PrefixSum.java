public class PrefixSum {
    public static int Get(int[] arr, int left, int right) {
        var result = 0;
        int[] prefixSum = {};
        prefixSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + arr[i - 1];
        }

        if(left != 0) {
            result = prefixSum[right] - prefixSum[left];
        }
        else {
            result = prefixSum[right];
        }

        return  result;

    }

    public  static boolean IsEquilibriumExits(int arr[]) {
        boolean isEquilibriumExits = false;
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        for(int i = 1; i < arr.length; i++) {
            prefixSum[i] =  arr[i] + prefixSum[i -1];
        }

        for(int i = 1; i < prefixSum.length; i++) {
            var context = prefixSum[i];
            if(prefixSum[i - 1] == (prefixSum[arr.length - 1] - context )) {
                isEquilibriumExits = true;
                break;
            }
        }

        return isEquilibriumExits;
    }
}
