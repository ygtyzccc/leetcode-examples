package averagesalaryexcludingtheminimumandmaximumsalary;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public double average(int[] salary)
    {
        Arrays.sort(salary);

        int min = salary[0];
        int max = salary[salary.length - 1];
        int total = 0;
        double result;
        for (int i = 1; i < salary.length - 1; ++i)
            total += salary[i];

        result = (double)total / (salary.length - 2);

        return result;

    }
}
