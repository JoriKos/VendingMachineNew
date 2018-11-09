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
        String lc = "";
        String[] antwoordenArray;
        antwoordenArray = new String[6];
        int run = 0;
        boolean repeat = false;
        Scanner s = new Scanner(System.in);
        String lc2;
        String antwoord1;

        while (run == 0) {

            boolean vraag = true;

            while (vraag) {
                System.out.println("Wil je wat drinken? Typ 'exit' om het programma af te sluiten of 'saldo' om je geld te zien");
                antwoord = s.nextLine();
                lc2 = antwoord.toLowerCase();
                if (lc2.equals("ja")) {
                    System.out.println("Warm of koud");
                    antwoordenArray[0] = "ja";
                    vraag = false;
                } else if (lc2.equals("nee")) {
                    System.out.println("Nu sluit het programma af");
                    System.exit(1);
                    antwoordenArray[0] = "nee";
                    vraag = false;
                } else if (lc2.equals("exit")) {
                    System.exit(1);
                    antwoordenArray[0] = "exit";
                    vraag = false;
                } else if (lc2.equals("saldo")) {
                    System.out.println("Je hebt nog €" + G);
                    antwoordenArray[1] = "saldo";
                }
            }


            boolean vraaag = true;

            antwoord1 = s.nextLine();
            lc = antwoord1.toLowerCase();

            if (lc.equals("koud")) {
                System.out.println("Kies uit:\n" +
                        "1. Cola €2\n" +
                        "2. Pepsi €2\n" +
                        "3. Fanta €1\n" +
                        "4. Water €0.50");
                antwoordenArray[2] = "koud";
                int cpfw = s.nextInt();
                if (cpfw == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Cola";
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 2) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Pepsi";
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 3) {
                    System.out.println("Dat word dan €1");
                    antwoordenArray[3] = "Fanta";
                    G = G - 1;
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
                } else if (cpfw == 4) {
                    System.out.println("Dat word dan €0.50");
                    G = G - 0.5;
                    antwoordenArray[3] = "Water";
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 0.5;
                        System.out.println("Je hebt nog €" + G);
                        vraaag = false;
                    }
                    vraaag = false;
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
                antwoordenArray[2] = "warm";

                if (kwct == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Koffie";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println("         {\n" +
                            "      {   }\n" +
                            "       }_{ __{\n" +
                            "    .-{   }   }-.\n" +
                            "   (   }     {   )\n" +
                            "   |`-.._____..-'|\n" +
                            "   |             ;--.\n" +
                            "   |            (__  \\\n" +
                            "   |             | )  )\n" +
                            "   |             |/  /\n" +
                            "   |             /  / \n" +
                            "   |            (  /\n" +
                            "   \\             y'\n" +
                            "    `-.._____..-'");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);

                    }
                } else if (kwct == 2) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    antwoordenArray[3] = "Water";
                    System.out.println("Je hebt nog €" + G);
                    System.out.println(" mmm\n" +
                            " )-(\n" +
                            "(   )\n" +
                            "|   |\n" +
                            "|   |\n" +
                            "|___|");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 3) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Chocolademelk";
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 2;
                        System.out.println("Je hebt nog €" + G);
                    }
                } else if (kwct == 4) {
                    System.out.println("Dat word dan €1");
                    G = G - 1;
                    antwoordenArray[3] = "Thee";
                    System.out.println("Je hebt nog €" + G);
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                }
            }
            System.out.println("Jouw keuzes waren: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2] + " " + antwoordenArray[1]);
            run = 1;
        }
    }
}