public class PracticeProblems {

    public static int countOccurrences(int[] arr, int n)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == n)
            {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseArray(int[] arr)
    {
        int[] reversed = new int[arr.length];
        int indexOfReversed = 0;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            reversed[indexOfReversed] = arr[i];
            indexOfReversed++;
        }
        return reversed;
    }

}
