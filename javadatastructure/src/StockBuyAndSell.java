public class StockBuyAndSell {
    public static  int GetProfits(int[] arr) {
        int buyPrice = 0;
        int sellPrice = 0;
        int sum = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1] && buyPrice == 0) {
                buyPrice = arr[i];
            }
            else if(arr[i] > arr[i + 1] && buyPrice != 0) {
                sellPrice = arr[i];
                sum = sum + (sellPrice - buyPrice);
                sellPrice = 0;
                buyPrice = 0;
            }
        }
        if(buyPrice != 0) {
            sellPrice = arr[arr.length - 1];
            sum = sum + (sellPrice - buyPrice);
        }
        return  sum;
    }
}
