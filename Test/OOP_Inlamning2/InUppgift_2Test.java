package OOP_Inlamning2;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

class InUppgift_2Test {

    InUppgift_2 IN2 = new InUppgift_2(true);

    @Test
    void getSetTempPerson() {
        IN2.setTempPerson("kalle");
        assert(IN2.getTempPerson().equals("kalle"));
        assert(!IN2.getTempPerson().equals(""));
    }

    // Metoden returnerar booelan på om årsavgiften betalades för
    // mindre än ett år sedan för de personer som ligger på en fil man skickar in
    // Metoden anropar getTimeOfSubscription som använder datum på fil med dagens datum
    // Hårdkodat testdatum används då för att testet ska ge samma resultat framåt i tiden.
    @Test
    void getSubscriptionStatus()  {
        LocalDate testDate = LocalDate.of(2022, 10, 19);
        assert (IN2.getSubscriptionStatus("Alhambra Aromes", Paths.get("src/OOP_Inlamning2/customers.txt"), testDate));
        assert (IN2.getSubscriptionStatus("7703021234", Paths.get("src/OOP_Inlamning2/customers.txt"), testDate));
        assert (!IN2.getSubscriptionStatus("Mitsuko Mayotte", Paths.get("src/OOP_Inlamning2/customers.txt"), testDate));
    }

    //Metoden returnerar boolean på inskickat datum jämfört med dagens datum
    // Datum +- LocalTimeNow för att testet alltid ska fungeras
    @Test
    void getTimeOfSubscription() {
        LocalDate dateNow = LocalDate.now();
        String date1 = dateNow.minusMonths(10).toString();
        String date2 = dateNow.minusMonths(18).toString();
        assert(IN2.getTimeOfSubscription(date1, dateNow));
        assert(!IN2.getTimeOfSubscription(date2, dateNow));
    }

    // Metoden adderar nytt träningstillfälle till log för aktuell person
    // För att ej påverka filer som används i programet skapas testfil i testmappen
    // Som sedan kontrolleras med en scanner
    @Test
    void addToWorkOutLog()  {
        String person = "7703021234, Alhambra Aromes";
        IN2.addToWorkOutLog(person,"2022-10-22", "13.30");
        File testFile = new File("Test/OOP_Inlamning2/7703021234, Alhambra Aromes_Test.txt");
        try {
            Scanner sc = new Scanner(testFile);
            String testLine = sc.nextLine();
            assert (testLine.equals("Datum: 2022-10-22\tTid: 13.30"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}