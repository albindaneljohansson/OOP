package OOP_Inlamning2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InUppgift_2 {

    public static void main(String[] args) {
        InUppgift_2 IU2 = new InUppgift_2(false);
        IU2.mainProgram();
    }
    private final static Path customerFilePath = Paths.get("src/OOP_Inlamning2/customers.txt");
    private String tempPerson;
    Scanner sc = new Scanner(System.in);
    protected boolean test = false;

    public InUppgift_2(boolean test) {
        this.test = test;
    }
       // Mainprogram - för user input och metodanrop
    public void mainProgram() {
        System.out.println("Vem ska träna? Ange fullständigt namn eller personnummer:");
        String customer = sc.nextLine().trim();
        if (getSubscriptionStatus(customer, customerFilePath, null)) {
            addToWorkOutLog(getTempPerson(), null, null);
            System.out.println("Kunden är medlem. Vill du se kundens träningslog? Ja/Nej");
            String s = sc.nextLine().trim();
            if (s.equalsIgnoreCase("ja")) {
                printLogFile(getTempPerson());
            } else {
                System.out.println("Ok. Programmet avslutas.");
            }
        } else {
            System.out.println("Personen är ej medlem.");
        }
    }

    public void setTempPerson(String person) {
        this.tempPerson = person;
    }

    public String getTempPerson() {
        return tempPerson;
    }

    // Metoden returnerar booelan på om årsavgiften betalades för
    // mindre än ett år sedan för de personer som ligger på den aktuella filen  man skickar in
    // Gör ej tidskontrollen, skickar den vidare till getTimeOfSubscription
    public boolean getSubscriptionStatus(String personIdentifier, Path filePath, LocalDate testDate) {
        String fileLine;

        try (Scanner scan = new Scanner(filePath)) {

            while (scan.hasNextLine()) {
                fileLine = scan.nextLine();
                if (fileLine.toLowerCase().contains(personIdentifier.toLowerCase())) {
                    if (!test) {
                        if (getTimeOfSubscription(scan.nextLine(), null)) {
                            setTempPerson(fileLine);
                            return true;
                        }
                    }
                    if (test) {
                        if (getTimeOfSubscription(scan.nextLine(), testDate)) {
                            setTempPerson(fileLine);
                            return true;
                        }
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Filen kunde ej hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("Felaktig IO-data");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e) {
            System.out.println("Ospecificerat fel inträffade");
            e.printStackTrace();
            System.exit(0);
        }
        return false;
    }
    //Metoden returnerar boolean på inskickat datum jämfört med dagens datum
    public boolean getTimeOfSubscription(String date, LocalDate testDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateNow = LocalDate.now();
        if (test) {
            dateNow = testDate;
        }
        LocalDate date_of_subscription = LocalDate.parse(date, dtf);
        Period p = Period.between(date_of_subscription, dateNow);
        return p.toTotalMonths() < 12;
    }

    // Metoden skriver till konsol träningstillfällen för den person som skickas in
    public void printLogFile(String person) {
        String s = "src/OOP_Inlamning2/" + person + ".txt";

        try (BufferedReader br = new BufferedReader(new FileReader(s))){
            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Filen kunde ej hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e) {
            System.out.println("Felaktig IO-data");
            e.printStackTrace();
            System.exit(0);
        }
    }

    // Metoden adderar nytt träningstillfälle till log för aktuell person
    public void addToWorkOutLog (String person, String testDate, String testTime) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH.mm");
        String timeNow = LocalTime.now().format(dtf);
        String dateNow = LocalDate.now().toString();
        String path = "src/OOP_Inlamning2/" + person + ".txt";
        String testPath = "Test/OOP_Inlamning2/" + person + "_Test.txt";

            if (test) {
                try (PrintWriter printToFile = new PrintWriter(new FileWriter(testPath))){
                    timeNow = testTime;
                    dateNow = testDate;
                    printToFile.write("Datum: " + dateNow + "\tTid: "
                            + timeNow + "\n");                                              
                }
                catch (IOException e) {
                    System.out.println("Felaktig IO-data");
                    e.printStackTrace();
                    System.exit(0);
                }
            }
                else {
                    try (PrintWriter printToFile = new PrintWriter(new FileWriter(path,true))){
                      printToFile.write("Datum: " + dateNow + "\tTid: "
                              + timeNow + "\n");
                    }

                    catch (IOException e) {
                        System.out.println("Felaktig IO-data");
                        e.printStackTrace();
                        System.exit(0);
                    }
                }
    }
}