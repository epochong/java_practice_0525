/**
 * @author wangchong
 * @date 2019/5/24 22:47
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test_01 {
    public static int test(int b) {
        try {
            b += 10;
            return b;
        }finally {
            b += 10;
            return b;
        }
    }
    public static void main(String[] args) {
        int b = 10;
        System.out.println(test(b));
        System.out.println(true ? false : true == true ? false : false);
    }
}
