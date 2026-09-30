package spring.example.codepran;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private payment payment;
    public Order(payment payment){
        this.payment=payment;
    }
    public void data(){
        payment.pay();
        System.out.println("hello");
    }




}
