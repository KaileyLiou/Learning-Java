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

    public static double sumGrid(double[][] grid)
    {
        double sum = 0;

        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[i].length; j++)
            {
                sum += grid[i][i];
            }
        }
        return sum;
    }

    public static int fib(int n)
    {
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++)
        {
            int sum = a + b;
            a = b;
            b = sum;

        }
        return b;
    }

}
