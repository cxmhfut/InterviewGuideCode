package chapter9;

public class Rand {

    public int rand1To5() {
        return (int) (Math.random() * 5 + 1);
    }

    /**
     * 从5随机到7随机
     */
    public int rand1To7() {
        int num;
        do {
            num = (rand1To5() - 1) * 5 + rand1To5() - 1;
        } while (num > 20);

        return num % 7 + 1;
    }

    public int rand01() {
        double p = 0.83;
        return Math.random() < p ? 1 : 0;
    }

    /**
     * 等概率产生0~1
     *
     * @return
     */
    public int rand0To1() {
        int num;

        //产生01和10的概率都是p(1-p)
        do {
            num = rand01();
        } while (num == rand01());

        return num;
    }

    /**
     * 等概率产生0~3
     * <p>
     * rand0To1*2 随机产生 0,2 rand0To1 随机产生 0,1
     *
     * @return
     */
    public int rand0To3() {
        return rand0To1() * 2 + rand0To1();
    }

    public int rand1To6() {
        int num;

        do {
            num = rand0To3() * 4 + rand0To3();//随机产生0~15;
        } while (num > 11);

        return num % 6 + 1;
    }

    public int rand1ToM(int m) {
        return (int) (Math.random() * m + 1);
    }

    public int rand1ToN(int n, int m) {
        int nMSys[] = getMSysNum(n - 1, m);
        int randNum[] = getRandMSysNumLessN(nMSys, m);

        return getNumFromMSysNum(randNum, m) + 1;
    }

    //把value转成m进制数
    public int[] getMSysNum(int value, int m) {
        int res[] = new int[32];
        int index = res.length - 1;

        while (value != 0) {
            res[index] = value % m;
            value = value / m;
            index--;
        }

        return res;
    }

    //把m进制数转成10进制数
    public int getNumFromMSysNum(int mSysNum[], int m) {
        int res = 0;

        for (int i : mSysNum) {
            res = res * m + mSysNum[i];
        }

        return res;
    }

    //等概率产生一个0~nMSys范围的数,只不过是用m进制数表示
    public int[] getRandMSysNumLessN(int nMSys[], int m) {
        int res[] = new int[nMSys.length];
        int start = 0;

        while (nMSys[start] == 0) {
            start++;
        }

        int index = start;
        boolean lastEqual = true;

        while (index != nMSys.length) {
            res[index] = rand1ToM(m) - 1;
            if (lastEqual) {
                if (res[index] > nMSys[index]) {
                    index = start;
                    lastEqual = true;
                    continue;
                } else {
                    lastEqual = res[index] == nMSys[index];
                }
            }
            index++;
        }

        return res;
    }
}
