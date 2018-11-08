import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int G = 30;
        System.out.println(" __     __  ________  __    __  _______   ______  __    __   ______          \n" +
                "/  |   /  |/        |/  \\  /  |/       \\ /      |/  \\  /  | /      \\         \n" +
                "$$ |   $$ |$$$$$$$$/ $$  \\ $$ |$$$$$$$  |$$$$$$/ $$  \\ $$ |/$$$$$$  |        \n" +
                "$$ |   $$ |$$ |__    $$$  \\$$ |$$ |  $$ |  $$ |  $$$  \\$$ |$$ | _$$/         \n" +
                "$$  \\ /$$/ $$    |   $$$$  $$ |$$ |  $$ |  $$ |  $$$$  $$ |$$ |/    |        \n" +
                " $$  /$$/  $$$$$/    $$ $$ $$ |$$ |  $$ |  $$ |  $$ $$ $$ |$$ |$$$$ |        \n" +
                "  $$ $$/   $$ |_____ $$ |$$$$ |$$ |__$$ | _$$ |_ $$ |$$$$ |$$ \\__$$ |        \n" +
                "   $$$/    $$       |$$ | $$$ |$$    $$/ / $$   |$$ | $$$ |$$    $$/         \n" +
                "    $/     $$$$$$$$/ $$/   $$/ $$$$$$$/  $$$$$$/ $$/   $$/  $$$$$$/          \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                " __       __   ______    ______   __    __  ______  __    __  ________       \n" +
                "/  \\     /  | /      \\  /      \\ /  |  /  |/      |/  \\  /  |/        |      \n" +
                "$$  \\   /$$ |/$$$$$$  |/$$$$$$  |$$ |  $$ |$$$$$$/ $$  \\ $$ |$$$$$$$$/       \n" +
                "$$$  \\ /$$$ |$$ |__$$ |$$ |  $$/ $$ |__$$ |  $$ |  $$$  \\$$ |$$ |__          \n" +
                "$$$$  /$$$$ |$$    $$ |$$ |      $$    $$ |  $$ |  $$$$  $$ |$$    |         \n" +
                "$$ $$ $$/$$ |$$$$$$$$ |$$ |   __ $$$$$$$$ |  $$ |  $$ $$ $$ |$$$$$/          \n" +
                "$$ |$$$/ $$ |$$ |  $$ |$$ \\__/  |$$ |  $$ | _$$ |_ $$ |$$$$ |$$ |_____       \n" +
                "$$ | $/  $$ |$$ |  $$ |$$    $$/ $$ |  $$ |/ $$   |$$ | $$$ |$$       |      \n" +
                "$$/      $$/ $$/   $$/  $$$$$$/  $$/   $$/ $$$$$$/ $$/   $$/ $$$$$$$$/       \n" +
                "                                                                             \n" +
                "                                                                             \n" +
                "                                                                             ");
        String antwoord;
        String lc;
        int wok = 0;
        String[] antwoordenArray;
        antwoordenArray = new String[10];


        System.out.println("Wil je wat drinken?");
        Scanner s = new Scanner(System.in);

        antwoord = s.nextLine();
        lc = antwoord.toLowerCase();

        if (lc.equals("ja")){
            System.out.println("Warm of koud");
            wok = 1;
            antwoord = s.nextLine();
            lc = antwoord.toLowerCase();
        }
        else if (lc.equals("nee")){
            System.out.println("Nu sluit het programma af");
            System.exit(1);
        }
        else{
            System.out.println("Vul een antwoord in (ja of nee)");
        }


        if (wok == 1){
            if(lc.equals("warm")){
                wok = 3;
            }
            else if(lc.equals("koud")){
                wok = 2;
            }
        }


        else if (wok == 2){
            System.out.println("Kies uit:\n" +
                    "1. Cola\n" +
                    "2. Pepsi\n" +
                    "3. Fanta\n" +
                    "4. Water");
            int cpfw = s.nextInt();
            System.out.println("Dat word dan €2");
            G = G - 2;
            if (G < 0){
                System.out.println("Je hebt niet genoeg geld");
                G = G + 2;
            }
            else if(cpfw == 2) {

                System.out.println("Dat word dan €1");
                G = G - 1;
                if (G < 0) {
                    System.out.println("Je hebt niet genoeg geld");
                    G = G + 1;
                }
            }
            else if(cpfw == 3){
                System.out.println("Dat word dan €2");
                G = G - 2;
                if(G < 0){
                    System.out.println("Je hebt niet genoeg geld");
                    G = G + 2;
                }
            }
            else if(cpfw == 4){
                System.out.println("Dat word dan €1");
                G = G - 1;
                if(G < 0){
                    System.out.println("Je hebt niet genoeg geld");
                    G = G + 1;
                }
            }
        }

        else if (wok == 3){
            System.out.println("Kies uit:\n" +
                    "1. Koffie\n" +
                    "2. Water\n" +
                    "3. Chocolademelk\n" +
                    "4. Thee\n");
            System.out.println("Ik wil nummer: ");
            int kwct = s.nextInt();
            if(kwct == 1){
                System.out.println("Dat word dan €2");
                G = G - 2;
                if (G < 0){
                    System.out.println("Je hebt niet genoeg geld");
                    G = G + 2;
                }
                else if(kwct == 2) {

                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                    }
                }
                else if(kwct == 3){
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    if(G < 0){
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                    }
                }
                else if(kwct == 4){
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    if(G < 0){
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                    }
                }
            }
        }
    }
}