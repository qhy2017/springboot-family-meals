package qhy.example.cache.demo;

import java.math.BigDecimal;

public class MainTest {
    public static void main(String[] args) {
//        new BigDecimal(subtract.toString()).divide(k89,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP)
        String result1 = "36761.77";
        String total = "77303.12";
        BigDecimal bigDecimal = new BigDecimal(result1).setScale(4).divide(new BigDecimal(total).setScale(4), BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100)).setScale(2,BigDecimal.ROUND_HALF_UP);
        String s = bigDecimal.toString();
        System.out.println(s);

    }
}
