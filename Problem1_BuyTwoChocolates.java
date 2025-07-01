import java.util.*;
public class Problem1_BuyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int money = sc.nextInt();
        int resut=btc(prices, money);
        System.out.println(resut);
    }
    public static int btc(int[]prices,int money){
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int price: prices){
            if(price<min1){
                min2=min1;
                min1=price;
            }
            else if(price<min2){
                min2=price;
            }
            
        }
        int total=min1+min2;
        if(total<=money){
            return money - total;
        }
        else if(total>money){
            return money;
        }   
        return 0;
    }
}