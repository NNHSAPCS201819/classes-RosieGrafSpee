

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CashRegisterTester {
   public static void main(String[] args) {
      CashRegister register = new CashRegister();
      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.receivePayment(50);
      double change = register.giveChange();
      System.out.println(change);
      System.out.println("Expected: 11.25");
   }
}
