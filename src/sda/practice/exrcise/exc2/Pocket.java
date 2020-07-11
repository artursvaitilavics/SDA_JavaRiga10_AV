package sda.practice.exrcise.exc2;

public class Pocket {
    private int money;

    public Pocket(int money) {
        this.money = money;
    }

    public int getMoney() {
        if (money <= 10) {
            return 0;
        } else {
            return money;
        }
    }

    public void setMoney(int money) {
        if (money<0){
            System.out.println("I need more money!");
        }else if(money>3000){
            System.out.println("Not enough space in my pocket for as much money!");
        }else{
            this.money = money;
        }
    }
}
