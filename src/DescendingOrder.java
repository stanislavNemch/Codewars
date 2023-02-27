import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        char[] chars = ("" + num).toCharArray();

        Arrays.sort(chars);

//        char[] charsNew = new char[chars.length];
//
//        for (int i = chars.length - 1, j = 0; i >= 0; i--, j++) {
//            charsNew[j] = chars[i];
//        }

        for (int i = 0; i < chars.length / 2; i++) { // ������ ������� ��� �������� �������
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        return Integer.parseInt(String.copyValueOf(chars));//��������������� � ������ String.copyValueOf(chars) �����
                                                           // ������ � ����� Integer.parseInt
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }
}
