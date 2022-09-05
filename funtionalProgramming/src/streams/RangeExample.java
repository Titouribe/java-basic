package streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeExample {
    public static void main(String[] args) {

        /*
       int sum = IntStream.range(5, 20)
               .reduce(0, Integer::sum);
         */

        IntStream num = IntStream.rangeClosed(5, 20);

        IntSummaryStatistics summaryStatistics = num.summaryStatistics() ;

        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getSum());
    }
}
