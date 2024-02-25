package day2.order;

import java.util.Scanner;

public class Test {
     /*
         ClassCastException : 类型转换异常

                 在引用数据类型的强转中, [实际类型]和[目标类型]不匹配, 就会出现此异常
      */
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("1.国内订单 2.国外订单");
          OrderService orderService = null;
          int num = sc.nextInt();
          switch (num){
               case 1:
                    orderService = new OrderServiceImpl();
                    break;
               case 2:
                    orderService = new OverseasServiceImpl();
          }
          if(orderService instanceof OverseasServiceImpl){
               OverseasServiceImpl osi = (OverseasServiceImpl) orderService;
               osi.check();
          }

          orderService.create();
          orderService.findOne();
          orderService.findList();
          orderService.cancel();
          orderService.finish();
          orderService.paid();
     }
}