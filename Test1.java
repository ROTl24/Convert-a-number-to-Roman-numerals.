package s202355;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //重复输入
        while(true)
        {
            String s = sc.next();
            boolean trf = TF(s);
            StringBuilder sb = new StringBuilder();
            if(trf){
                for (int i = 0; i < s.length(); i++) {
                    int number = s.charAt(i)-48;
                    sb =sb.append(luoma(number));
                }
                System.out.println(sb);
                System.out.println("是否要再次输入,输入1为取消，其他数字都将继续");
                int num = sc.nextInt();
                if(num == 1){
                    break;
                }
            }
            else{
                System.out.println("输入错误请重新输入");
            }
        }

    }
    //检验是否在0~9之内
    public static boolean TF(String s){
        for (int i = 0; i < s.length(); i++) {
            int cha = s.charAt(i);
            if(cha<'0'||cha>'9'){
                return false;
            }
        }
        return true;
    }
    //转换成罗马数字
    public static String luoma(int numer){
        String[] s1={" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return s1[numer];
    }
}
