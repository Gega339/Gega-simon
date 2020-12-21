package ge.edu.btu.currency;
import org.apache.log4j.Logger;
import java.util.Scanner;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner skaneri = new Scanner(System.in);
        int tanxis_raodenoba;

        System.out.println("shemoitanet tanxis raodenoba: ");
        tanxis_raodenoba = skaneri.nextDouble();

        CurrencyService currencyService = new CurrencyServiceImpl();

        currencyService.setExchangeRate(3);

        System.out.println(currencyService.convert(12));
        System.out.println(currencyService.convert(122.3));
        logger.info(tanxis_raodenoba + " ---->>> " + currencyService.convert(tanxis_raodenoba));
    }
}
