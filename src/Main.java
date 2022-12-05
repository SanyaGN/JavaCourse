public class Main {
    public static void main(String[] args) {
        //task 51
        int eranish = 762;
        boolean param;

        int miavor = eranish%10;
        int tasnavor = eranish%100 / 10;
        int haryuravor = eranish/100;

        if (miavor == tasnavor + haryuravor) {
            param = true;
        } else {
            param = false;
        }
        System.out.println(param);

        //task 52
        boolean t;
        if (miavor == tasnavor || miavor == haryuravor || tasnavor == haryuravor) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        //task 53
        int eranishGumarHaraberutyun = eranish/(miavor+tasnavor+haryuravor);
        int gumarEranishHaraberutyun = (miavor+tasnavor+haryuravor)/eranish;
        if (eranish > eranishGumarHaraberutyun) {
            System.out.println(eranishGumarHaraberutyun);
        } else {
            System.out.println(gumarEranishHaraberutyun);
        }

        //task 54
        if (miavor > tasnavor && miavor > haryuravor) {
            System.out.println(miavor);
        } else if (tasnavor > miavor && tasnavor > haryuravor) {
            System.out.println(tasnavor);
        } else  {
            System.out.println(haryuravor);
        }

        //task 55
        if (miavor < tasnavor && miavor < haryuravor) {
            System.out.println(miavor);
        } else if (tasnavor < miavor && tasnavor < haryuravor) {
            System.out.println(tasnavor);
        } else  {
            System.out.println(haryuravor);
        }

        //task 56
        if (miavor > tasnavor) {
            System.out.println(gumarEranishHaraberutyun);
        } else {
            System.out.println(eranish);
        }

        //task 57
        if (eranish > 300) {
            System.out.println(tasnavor/miavor);
        } else {
            System.out.println(haryuravor/miavor);
        }

        //task 58
        char f;
        if (tasnavor + haryuravor < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);

        //task 59
        if (miavor > tasnavor && tasnavor > haryuravor) {
            System.out.println(miavor);
            System.out.println(tasnavor);
            System.out.println(haryuravor);
        } else if (tasnavor > miavor && miavor > haryuravor) {
            System.out.println(tasnavor);
            System.out.println(miavor);
            System.out.println(haryuravor);
        } else if (miavor > haryuravor && haryuravor > tasnavor) {
            System.out.println(miavor);
            System.out.println(haryuravor);
            System.out.println(tasnavor);
        } else if (tasnavor > haryuravor && haryuravor > miavor) {
            System.out.println(tasnavor);
            System.out.println(haryuravor);
            System.out.println(miavor);
        } else if (haryuravor > tasnavor && tasnavor > miavor) {
            System.out.println(haryuravor);
            System.out.println(tasnavor);
            System.out.println(miavor);
        } else {
            System.out.println(haryuravor);
            System.out.println(miavor);
            System.out.println(tasnavor);
        }

        //task 60
        if (miavor < tasnavor && tasnavor < haryuravor) {
            System.out.println(miavor);
            System.out.println(tasnavor);
            System.out.println(haryuravor);
        } else if (tasnavor < miavor && miavor < haryuravor) {
            System.out.println(tasnavor);
            System.out.println(miavor);
            System.out.println(haryuravor);
        } else if (miavor < haryuravor && haryuravor < tasnavor) {
            System.out.println(miavor);
            System.out.println(haryuravor);
            System.out.println(tasnavor);
        } else if (tasnavor < haryuravor && haryuravor < miavor) {
            System.out.println(tasnavor);
            System.out.println(haryuravor);
            System.out.println(miavor);
        } else if (haryuravor < tasnavor && tasnavor < miavor) {
            System.out.println(haryuravor);
            System.out.println(tasnavor);
            System.out.println(miavor);
        } else {
            System.out.println(haryuravor);
            System.out.println(miavor);
            System.out.println(tasnavor);
        }
    }
}