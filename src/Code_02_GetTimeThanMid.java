import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/24 23:25
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_GetTimeThanMid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        //input.useDelimiter("\r\n");
        Scanner in = new Scanner(input.nextLine());
        while (in.hasNextInt()) {
            arrayList.add(in.nextInt());
        }
        int n = arrayList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(i);
                    arrayList.remove(j - 1);
                    n -= 2;
                    i = -1;
                    break;
                }
            }
        }
        System.out.println(arrayList.get(0));
    }
}
