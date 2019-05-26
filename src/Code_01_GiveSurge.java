import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/24 23:02
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_GiveSurge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int A = (a + c) / 2;
        int C = (d - b) / 2;

        int B1 = (c - a) / 2;
        int B2 = (b + d) / 2;

        if (B1 != B2)  {
            System.out.println("No");
        }
        else {
            System.out.println(A + " " + B1 + " " + C);
        }

    }
}
