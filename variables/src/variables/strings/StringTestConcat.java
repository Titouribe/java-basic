package variables.strings;

public class StringTestConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        //StringBUilder is mutable
        StringBuilder sb = new StringBuilder(a);

        long init = System.currentTimeMillis();

        // 2 ms
        /* for (int i = 0; i < 500; i++) {
            c = c.concat(a).concat(b).concat("\n");
        } */

        // 10 ms
        /* for (int i = 0; i < 500; i++) {
            c += a + b + "\n";
        } */

        // 0 ms
        /* for (int i = 0; i < 500; i++) {
            sb.append(a)
                    .append(b)
                    .append("\n");
        } */

        long end = System.currentTimeMillis();

        System.out.println(end - init);

        System.out.println(sb.toString());

    }
}
