package averagesalaryexcludingtheminimumandmaximumsalary;

import java.util.Arrays;

public class SolutionAlt {
    public double average(int[] salary)
    {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       int total = 0;
       double result;

       for (int i = 0; i < salary.length; ++i) {
           if (salary[i] < min)
               min = salary[i];

           if (salary[i] > max)
               max = salary[i];

           total += salary[i];

       }

       int totalExcludedMinMax = total - min - max;

       return (double) totalExcludedMinMax / salary.length - 2;
    }
}
