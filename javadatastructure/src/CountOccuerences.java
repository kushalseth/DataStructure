public class CountOccuerences {
    public int Get(int[] arr, int element) {
        int result = 0;
        int lowIndex = 0;
        int highIndex = arr.length;

        int last = SearchingLastOccurence.Get(arr, element);

        int first = SearchFirstOccurence.Get(arr, element);

        result = last - first;
        return result;
    }
}
