
public class Conditionals {
    public static void main(String[] args){
        int salary = 20000;

        if(salary>10000){
            salary+=5000;
        }
        else{
            salary+=1000;
        }
        System.out.println(salary);

        // multiple if-else
        int money = 10000;
        if(money<5000){
            money+=1000;
        }
        else if (money>7000) {
            money+=2000;
        }
        else
            money+=500;
        System.out.println(money);
    }
}
