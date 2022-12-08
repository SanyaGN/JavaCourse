public class Main {
    public static void main(String[] args) {

        //task 211
        int[] array = {1, -12, 8, -7, 6, 11, 4, 0};
        int positiveQuantity = 0;
        int positiveSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveQuantity++;
                positiveSum = positiveSum + array[i];
            }
        }
        System.out.println(positiveSum / positiveQuantity);

        //task 212
        positiveQuantity = 0;
        int sumOfPositiveElementsSquare = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= 0) {
                positiveQuantity++;
                sumOfPositiveElementsSquare = sumOfPositiveElementsSquare * array[j];
            }
        }
        System.out.println(sumOfPositiveElementsSquare / positiveQuantity);

        //task 213
        int negativeQuantity = 0;
        int sumOfNegativeElementsSquare = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                negativeQuantity++;
                sumOfNegativeElementsSquare = sumOfNegativeElementsSquare * array[j];
            }
        }
        System.out.println(sumOfNegativeElementsSquare / negativeQuantity);

        //task 214
        negativeQuantity = 0;
        int negativeSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeQuantity++;
                negativeSum = negativeSum + array[i];
            }
        }
        System.out.println(negativeSum / negativeQuantity);

        //task 215
        int evenIndexNumbersSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexNumbersSum = evenIndexNumbersSum + array[i];
            }
        }
        System.out.println(evenIndexNumbersSum);

        //task 216
        evenIndexNumbersSum = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexNumbersSum = evenIndexNumbersSum * array[i];
            }
        }
        System.out.println(evenIndexNumbersSum);

        //task 217
        int oddIndexSum = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                oddIndexSum = oddIndexSum * array[i] * array[i];
            }
        }
        System.out.println(oddIndexSum);

        //task 218
        oddIndexSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1 && array[i] < 0) {
                oddIndexSum = oddIndexSum + array[i] * -1;
            } else if (i % 2 == 1 && array[i] >= 0) {
                oddIndexSum = oddIndexSum + array[i];
            }
        }
        System.out.println(oddIndexSum);

        //task 219
        int k = 2;
        int indexCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (i % k == 0) {
                indexCount++;
            }
        }
        System.out.println(indexCount);

        //task 220
        positiveQuantity = 0;
        negativeQuantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveQuantity++;
            } else if (array[i] < 0) {
                negativeQuantity++;
            }
        }
        System.out.print("drakan indexneri qanak@ ");
        System.out.println(positiveQuantity);
        System.out.print("bacasakan indexneri qanak@ ");
        System.out.println(negativeQuantity);

        //task 221 [0-3] mijakayq
        int sum = 0;
        for (int i = 0; i <= 3; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        //task 222 [4-minchev verj] mijakayq
        sum = 1;
        for (int i = 4; i < array.length; i++) {
            sum = sum * array[i];
        }
        System.out.println(sum);

        //task 223 [0-3] mijakayq
        int quantity = 0;
        for (int i = 0; i <= 3; i++) {
            quantity++;
        }
        System.out.println(quantity);

        //task 225
        int t = 10;
        int artadryal = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] * -1 < t) {
                artadryal = artadryal * array[i] * -1;
            } else if (array[i] > 0 && array[i] < t) {
                artadryal = artadryal * array[i];
            }
        }
        System.out.println(artadryal);

        //task 226
        sum = 0;
        t = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] * -1 < t) {
                sum = sum + array[i] * -1;
            } else if (array[i] > 0 && array[i] < t) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);

        //task 227
        sum = 0;
        indexCount = 0;
        k = 2;
        for (int i = 1; i < array.length; i++) {
            if (i % k == 0) {
                indexCount++;
                sum = sum + array[i];
            }
        }
        System.out.println(sum / indexCount);

        //task 228
        sum = 0;
        indexCount = 0;
        k = 2;
        for (int i = 0; i < array.length; i++) {
            if (i % k == 0) {
                indexCount++;
                sum = sum + array[i];
            }
        }
        System.out.println(sum / indexCount);

        //task 229
        artadryal = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                artadryal = artadryal * array[i];
            }
        }
        System.out.println(artadryal);

        //task 230
        quantity = 0;
        artadryal = 1;
        k = 2;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                quantity++;
                artadryal = artadryal * array[i];
            }
        }
        System.out.println(artadryal / quantity);

        //task 231
        sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i] * array[i];
            }
        }
        System.out.println(sum);

        //task 232
        quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                quantity++;
            }
        }
        System.out.println(quantity);

        //task 233
        sum = 0;
        artadryal = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
                artadryal = artadryal * array[i];
            }
        }
        System.out.print("artadryal ");
        System.out.println(artadryal);
        System.out.print("gumar ");
        System.out.println(sum);

        //task 234
        int oddSum = 0;
        quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                quantity++;
                oddSum = oddSum + array[i];
            }
        }
        System.out.println(oddSum / quantity);

        //task 235
        artadryal = 1;
        quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                quantity++;
                artadryal = artadryal * array[i];
            }
        }
        System.out.println(artadryal / quantity);

        //task 236
        artadryal = 1;
        oddSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1 || array[i] % 2 == -1) {
                artadryal = artadryal * array[i];
                oddSum = oddSum + array[i];
            }
        }
        System.out.print("artadryal");
        System.out.println(artadryal);
        System.out.print("gumar");
        System.out.println(oddSum);

        //task 237
        quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                quantity++;
            }
        }
        System.out.println(quantity);

        //task 238
        sum = 0;
        quantity = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                sum = sum + array[i];
                quantity++;
            }
        }
        System.out.println(sum / quantity);

        //task 239
        artadryal = 1;
        quantity = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                artadryal = artadryal * array[i];
                quantity++;
            }
        }
        System.out.println(artadryal / quantity);

        //task 240
        quantity = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                quantity++;
            }
        }
        System.out.println(quantity);
    }
}
