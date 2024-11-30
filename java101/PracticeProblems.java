public class PracticeProblems {

    public static int CountOccurrences(int[] arr, int n)
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

}
