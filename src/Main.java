import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double G = 30;
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
        int run = 0;
        boolean repeat = false;
        Scanner s = new Scanner(System.in);

        while (run == 0) {

            System.out.println("Wil je wat drinken?");

            antwoord = s.nextLine();
            lc = antwoord.toLowerCase();

            if (lc.equals("ja")) {
                System.out.println("Warm of koud");
                wok = 1;
            } else if (lc.equals("nee")) {
                System.out.println("Nu sluit het programma af");
                System.exit(1);
            } else {
                System.out.println("Vul een antwoord in (ja of nee)");
            }

            antwoord = s.nextLine();
            lc = antwoord.toLowerCase();


            if (lc.equals("koud")) {
                System.out.println("Kies uit:\n" +
                        "1. Cola €2\n" +
                        "2. Pepsi €2\n" +
                        "3. Fanta €1\n" +
                        "4. Water €0.50");
                int cpfw = s.nextInt();
                if (cpfw == 1) {

                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                    }
                } else if (cpfw == 2) {

                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (cpfw == 3) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (cpfw == 4) {
                    System.out.println("Dat word dan €0.50");
                    G = G - 0.5;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 0.5;
                        System.out.println("Je hebt nog €" + G);
                    }
                }
            }
            if (lc.equals("warm")) {
                System.out.println("Kies uit:\n" +
                        "1. Koffie €2\n" +
                        "2. Water €1\n" +
                        "3. Chocolademelk €2\n" +
                        "4. Thee €1\n");
                System.out.println("Ik wil nummer: ");
                int kwct = s.nextInt();
                if (kwct == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);

                    }
                } else if (kwct == 2) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 3) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 4) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                }
            }
        }
    }
}