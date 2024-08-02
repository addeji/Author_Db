import java.util.Arrays;

public class StringError {

    public static void main(String[] args) {

        String inputStr = "aaaabbbxxxzz";
        System.out.println(isError(inputStr));
        System.out.println(isError2(inputStr));
        int errors = 0;
        for (Character s : inputStr.toCharArray()) {
            if (s > 'm') errors++;

        }
        System.out.println(errors + "/" + inputStr.length());
        int[] number={2,2,1,2,1};
        int[] result= removeSmallest((number));
        System.out.println( Arrays.toString(result) );

    }


    public static String isError(String arr) {

        int errors = 0;
        int length = arr.length();

        for (int i = 0; i < length; i++) {
            char start = arr.charAt(i);
            if (start > 'm') {
                errors++;
            }
        }

        return errors + "/" + length;
    }

    public static String isError2(String arr) {
        return arr.replaceAll("[a-m]", "").length() + "/" + arr.length();
    }

    //remove lowest rating
    public static int[] removeSmallest(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[smallest]) {
                smallest = i;
            }
        }
        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != smallest) {
                result[j++] = arr[i];
            }
        }
        return result;
    }
}

