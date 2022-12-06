public class Main {
    public static void main(String[] args) {
        //task 51
        int eranish = 762;
        boolean param;

        int miavor = eranish % 10;
        int tasnavor = eranish % 100 / 10;
        int haryuravor = eranish / 100;

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
        int eranishGumarHaraberutyun = eranish / (miavor + tasnavor + haryuravor);
        int gumarEranishHaraberutyun = (miavor + tasnavor + haryuravor) / eranish;
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
        } else {
            System.out.println(haryuravor);
        }

        //task 55
        if (miavor < tasnavor && miavor < haryuravor) {
            System.out.println(miavor);
        } else if (tasnavor < miavor && tasnavor < haryuravor) {
            System.out.println(tasnavor);
        } else {
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
            System.out.println(tasnavor / miavor);
        } else {
            System.out.println(haryuravor / miavor);
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

        int qaranish = 2389;
        int miavor4 = qaranish % 10;
        int tasnavor4 = qaranish % 100 / 10;
        int haryuravor4 = qaranish % 1000 / 100;
        int hazaravor4 = qaranish / 1000;

        //task 61
        if (miavor4 + tasnavor4 == haryuravor4 + hazaravor4) {
            param = true;
        } else {
            param = false;
        }
        System.out.println(param);

        //task 62
        if (qaranish < 5000) {
            System.out.println(qaranish / (miavor4 + haryuravor4));
        } else {
            System.out.println(qaranish / (hazaravor4 + tasnavor4));
        }

        //task 63
        if (miavor4 == 1 || tasnavor4 == 1 || haryuravor4 == 1 || hazaravor4 == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        //task 64
        char y;
        if (miavor4 + tasnavor4 == 5) {
            y = 's';
        } else {
            y = 'd';
        }
        System.out.println(y);

        //task 65
        if (miavor4 * tasnavor4 == 12) {
            System.out.println("y = 12");
        } else {
            System.out.println("y = 0");
        }

        //task 66
        if (hazaravor4 == 4 || miavor4 == 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //task 67
        if ((miavor4 + tasnavor4 + haryuravor4 + haryuravor4) * (miavor4 + tasnavor4 + haryuravor4 + haryuravor4) == qaranish) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        //task 68
        if (miavor4 > tasnavor4) {
            System.out.println(miavor4 * haryuravor4);
        } else {
            System.out.println("1");
        }

        //task 69
        int Y;
        if (miavor4 + tasnavor4 + haryuravor4 + hazaravor4 > 20) {
            Y = 1;
        } else {
            Y = 0;
        }
        System.out.println(Y);

        //task 70
        if (miavor4 * tasnavor4 * haryuravor4 * hazaravor4 > 200) {
            Y = 0;
        } else {
            Y = 1;
        }
        System.out.println(Y);
    }
}