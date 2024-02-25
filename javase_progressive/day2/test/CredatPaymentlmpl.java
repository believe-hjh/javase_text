package day2.test;

public class CredatPaymentlmpl  implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过信用卡网银支付了:" + money + "元!");
    }
}
