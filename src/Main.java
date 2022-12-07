import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //task 201
        int number = 245870;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println(count);

        //task 202
        number = 52486;
        int gumar = 0;
        while (number != 0) {
            gumar = gumar + number % 10;
            number = number / 10;
        }
        System.out.println(gumar);

        //task 203
        number = 123;
        int artadryal = 1;
        while (number != 0) {
            artadryal = artadryal * (number % 10);
            number = number / 10;
        }
        System.out.println(artadryal);

        //task 204
        number = 2564;
        int ajicDzakh = 0;
        while (number != 0) {
            ajicDzakh = number % 10;
            number = number / 10;
            System.out.print(ajicDzakh + " ");
        }
        System.out.println();

        //task 206
        number = 2547;
        int hakarakTiv = 0;
        while (number != 0) {
            hakarakTiv = hakarakTiv * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(hakarakTiv);

        //task 207
        number = 652754;
        int k = 0;
        int k1 = 0;
        while (number != 0) {
            k = number % 10;
            number = number / 10;
            if (k == 2) {
                k1 = k;
            }
        }
        if (k1 == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //task 209
        number = 2648;
        int kentiMnacord = 0;
        int j = 0;
        while (number != 0) {
            j = number % 10;
            number = number / 10;
            if (j % 2 == 1) {
                kentiMnacord = j;
                break;
            }
        }
        if (kentiMnacord == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //task 210
        number = 1322;
        int kenteriGumar = 0;
        int zuygeriGumar = 0;
        int verjinTiv = 0;
        while (number != 0) {
            verjinTiv = number % 10;
            if (verjinTiv % 2 == 0) {
                zuygeriGumar = zuygeriGumar + verjinTiv;
            }
            else if (verjinTiv % 2 == 1) {
                kenteriGumar = kenteriGumar + verjinTiv;
            }
            number = number / 10;
        }
        if (kenteriGumar == zuygeriGumar) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //task 205, 208 couldn't solve

    }
}