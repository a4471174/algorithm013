package shuati;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * 860. 柠檬水找零
 * 题目描述:
 *     在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
 *     顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
 *     每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
 *     注意，一开始你手头没有任何零钱。
 *     如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
 *
 */
public class LemonadeChange {


    public boolean lemonadeChange(int[] bills) {

        Map<Integer, Integer> balance = new HashMap<>(); // 余额
        balance.put(5,0);  // 5元
        balance.put(10,0); // 10元
        balance.put(20,0); // 20元

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5){
                balance.put(5,balance.get(5) +1);
                continue;
            }
            if (bills[i] ==10 && balance.get(5)>=1) {
                balance.put(10,balance.get(10) +1); // 10元
                balance.put(5,balance.get(5) -1);
                continue;
            }

            if (bills[i] ==20 && balance.get(5)>=1 && balance.get(10)>=1) {
                balance.put(20,balance.get(20) +1); // 20元
                balance.put(5,balance.get(5) -1);
                balance.put(10,balance.get(10) -1);
                continue;
            }
            if (bills[i] ==20 && balance.get(5)>=3) {
                balance.put(20,balance.get(20) +1); // 20元
                balance.put(5,balance.get(5) -3);
                continue;
            }
            return false;

        }

        return true;
    }

    /**
     *  方法1:
     *      思路 参考LeeCode
     *      复杂度分析
     *          时间复杂度 O(N)
     *          空间复杂度 O(1)
     */
    public boolean lemonadeChange2(int[] bills) {

        //Map<Integer, Integer> balance = new HashMap<>(); // 余额
        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {

            if (bills[i] == 5){
                five++;
                continue;
            }
            if (bills[i] ==10 && five>0) {
                ten++;
                five--;
                continue;
            }
            if (bills[i] ==20 && five>0 && ten>0) {
                five--;
                ten--;
                continue;
            }
            if (bills[i] ==20 && five>=3) {
                five -= 3;
                continue;
            }
            return false;

        }
        return true;
    }

    /*public static void main(String[] args) {
        // 5,5,5,10,20
        // 5,5,10,10,20
        //[5,5,5,10,5,20,5,10,5,20]
        int[] bills = {5,5,5,10,5,20,5,10,5,20};
        //[5,5,5,10,20]
        shuati.LemonadeChange lc = new shuati.LemonadeChange();
        boolean res = lc.lemonadeChange(bills);
        System.out.println(res);
    }*/






}
