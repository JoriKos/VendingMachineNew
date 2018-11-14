import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double G = 6;
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
int run = 0;
boolean repeater = false;

        while (run == 0) {

            repeater = false;
            String antwoord;
            String lc;
            String[] antwoordenArray;
            String[] menu;
            menu = new String[10];
            antwoordenArray = new String[6];
            menu[0] = "Koude drankjes:";
            menu[1] = "Cola";
            menu[2] = "Pepsi";
            menu[3] = "Fanta";
            menu[4] = "Water";
            menu[5] = "Warme drankjes:";
            menu[6] = "Koffie";
            menu[7] = "Water";
            menu[8] = "Chocolademelk";
            menu[9] = "Thee";
            boolean repeat = false;
            Scanner s = new Scanner(System.in);
            String lc2;
            String antwoord1;

            boolean vraag = true;

            while (vraag) {
                System.out.println("Wil je wat drinken? Typ 'exit' om het programma af te sluiten, 'menu' om het hele menu te zien, 'saldo' om je geld te zien");
                antwoord = s.nextLine();
                lc2 = antwoord.toLowerCase();

                if (lc2.equals("ja")) {
                    System.out.println("Warm of koud");
                    antwoordenArray[0] = "ja";
                    repeater = true;
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
                } else if (lc2.equals("menu")){
                    System.out.println(menu[0] +"\n" + menu[1] + "\n" + menu[2] + "\n" + menu[3] + "\n" + menu[4] + "\n" + menu[5] + "\n" + menu[6] +
                            "\n" + menu[7] + "\n" + menu[8] + "\n" + menu[9]);
                    antwoordenArray[5] = "menu";
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
                repeater = true;

                int cpfw = s.nextInt();

                if (cpfw == 1) {
                    System.out.println("Dat word dan €2");
                    G = G - 2;
                    antwoordenArray[3] = "Cola";
                    System.out.println("                    .....uuuxuouuuuuuuuuu.....\n" +
                            "             ..xnHHMM$5$$$$$$$$$R$$$$$$$$$$$$NWbeou..\n" +
                            "        .::!!H!MMMMM5$888888888M8888888BB$$$$$$$$$$$$Neu.\n" +
                            "      .<!!!!!!!!H@M**#\"##T?????!!!???TTTTT###*R$$$$$$$$$$Nu\n" +
                            "     :!!!!!!!!!!!!!)xxuoiX!~~`````)???!!!!!!!!?TT#*$$$$$$$$k\n" +
                            "    dX!!!!!!!!)>!:H#\"???\"!..::::!!:!!!<~!!::()!!!!!!?T*$$$$R\n" +
                            "    ?$U!!!!!<!XWiix:xxxxxXX(..<???X()Xud%:::/`!!:::)!!!?T*#)\n" +
                            "    :8$NiX!!!!!!\"\"\"\"\"\"\"\"?##!**@@****##\"\">!!!~---!!!!!<!!XxH6\n" +
                            "    9$$$$$RHnx:::~~<<:<<<<<<<<:<~~~~~~<<<<<<<:<:~<<(:xHX88$$k\n" +
                            "   :$$$$$$$NN@WQSXXx+<x<::.L::..:::::.....:<x+:nHS88NN$$$$$$$\n" +
                            "   t$$$$$$$$$$$$NNNWWUQXQXXS?!??!????XXXUUWWWWWNN$$$$$$$$$$$$L\n" +
                            "   $$$$$$$$$$$$$$$$$$$$$$$$$NNN8NNNNNN$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>\n" +
                            "  $$$$$$$$$$$$$$$$R$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$k\n" +
                            "  $$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$&T$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$XR$$$$$$$$R$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$?QR& $$$$$$$R ?T*$$$$Z.$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$B?$$M ?$$$$$$$     T#$$U.R$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$.?$R  $$$$$$R 9NWX   ?$% #$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$W.TR  RZ#$$$B ?R$$WX      R$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$N.?%X9$N.#$$X  TRB$$WX XXW$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$RX ?#$$$W.#$NX  ?TMR$W?#$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$# ?HX ?T*$$U?#$NU     ?  $$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$R   X$WX  ?T*NW.R$NWUX   X$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$R   X$$$$NU   ?T% R$$$$WXM$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$X  X$$$$$$$WUX    \"T*R$$N T$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$X X$$$$$$$$$$$WUXX         9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$&X8$$$$$$$$$$$R*#RH UxX  XU$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$B?#*$$$$$$$$$R XWiU ?#$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$RX WWQ R$$$$$B ?*$MXWWUT*$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$X W#$$WU R$$$$X  ?X$$$$NX#$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$& RW $$$N #$$$$WX  ?T*$$R ?$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$X R$6 R$$ R$$$$RtX        9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$WX #$NW   $$$R#T?R*NUUXXXU$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$NX ?$$$$$$$R tNNWbU2TR$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$W  ?*$$$$$B ?*$B$$$WX#$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$NX  ?#$$$$UX ??T$$$$W?$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$U   ?#R$$$UX  ?R$$$H?$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$WX    ?#*$$NWWUB$$R 9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$R$NU     ?T#**R$*T? 9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$ ?T$NUX            X$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$U  $$$NWUX        U@$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$RNW$$$$$$$NWWWWWWN$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$ ?TR$$$T*$$$$$$$$$$R$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$\"   ?#$$W2#$$$$$$$Rt$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$ NNUX  \"T*H?#$$$$R $$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$X.#$NWX   ?  R$$$  $$$$$$$$$$$$$$$$$$$$$\n" +
                                "  $$$$$$$$$$$$$$$$$$$$$NX ?R$$NWX   X$$R  $$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$$$W. ?#R$$W?h$$$?  R$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$R*R$WX  ???  R$$   X$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$ N.?#$WX     9$$  X$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$X.RWU$$$WXHWW$$$  W$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$NX.TR$$$$$W7$$$$  $$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$$$WX T#$$$$R R$$& $$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$$$$$X   ?TT? X$$B $$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$TITR$$$**R$XWX.   .W$$$ $$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$RX$U R$? .....$$NWW$$$$$ 9$$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$?R$W@$X $$R9N6.*$$$$$$$$ $$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$X #$$$$X ?t$$$$N.#$$$$$$ M$$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$X T$$$$WX ?#R$$$X.$$$$$$ $$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$X MR$$$$WX  ???  X$$$$$ $$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$U? ?R$$$$NW:.  XW$$$$$ 9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$U  ?TR$$$$$NWWN$$$$$$ 9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$NX   7#R$$$$$$$$$$$R 9$$$$$$$$$$$$$$$$$$$\n" +
                            "  $$$$$$$$$$$$$$$$$$$$$$WU  \"\"?T#*$$$$*#\" X$$$$$$$$$$$$$$$$$$$\"\n" +
                            "  ?$$$$$$$$$$$$$$$$$$$$$$$N6             X$$$$$$$$$$$$$$$$$$$F\n" +
                            "   $$$$$$$$$$$$$$$$$$$$$$$$$$W6        XW$$$$$$$$$$$$$$$$$$$$\n" +
                            "   '$$$$$$$$$$$$$$$$$$$$$$$$$$$$NWWWWW@$$$$$$$$$$$$$$$$$$$$$\"\n" +
                            "    '\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$R\"\n" +
                            "       #$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#\n" +
                            "        T$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                            "          T$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$?\n" +
                            "            ?$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$?\n" +
                            "               ?$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$%");
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
                    System.out.println("  ..--------------------..\n" +
                            "            |``--------------------''|\n" +
                            "            |                        |\n" +
                            "            |      ,,,;;;;;;,,,      |\n" +
                            "            |   ,;;;;;;;;;;;;;;;;,   |\n" +
                            "            |  ;;;;;;;;;;;;;;;;;;;;  |\n" +
                            "            | ;;;;;;;;;'''  _  '';;; |\n" +
                            "            |   _'''_  _   (_'  |  ` |\n" +
                            "            |  |_) |_  |_) ._)  |    |\n" +
                            "            | .|   |_  |     .....   |\n" +
                            "            | :::..     ...::::::::: |\n" +
                            "            |  ::::::::::::::::::::  |\n" +
                            "            |   '::::::::::::::::'   |\n" +
                            "            |      '''::::::'''      |\n" +
                            "            |                        |\n" +
                            "            |                        |\n" +
                            "            ';----..............----;'\n" +
                            "              '--------------------'");
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
                    System.out.println("───────────────────────────────────\n" +
                            "─────────█████████████████─────────\n" +
                            "──────████░░░░░░░░░░░░░░░████──────\n" +
                            "────███░░░░░░░░░░░░░░░░░░░░░███────\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "──██░░░░░░░░▄███▄░░░░░░░░░░░░░░██──\n" +
                            "─██░░░░░░░▄███████▄░░░░░▄▄░░░░░░██─\n" +
                            "██░░░░░▄▄███████████░░░▄██▄░░░░░░██\n" +
                            "█░░░░░░░▀████████▀░░░██████░███▄░░█\n" +
                            "█░░░▄██▄░░▀▀▀░░░░░░░░░▀███░░░███▄░█\n" +
                            "█░▄█████░░░░░▀██▄█████░░██░▄█████▌█\n" +
                            "█░███▀▀░▄██▄░░░██▀░░▀██░██░██░▀██▌█\n" +
                            "█▐███░░░▀████▄░██░░░░██░██░██░░██▌█\n" +
                            "█▐███▄░░░░████░██░░░░██░██░▀██▄▐█░█\n" +
                            "█▐█████░▄█████░██▌░░▐██░██░░░░░░░░█\n" +
                            "█▐███▀░▄██▀███░██▌░▄███░█░░░░░░░░░█\n" +
                            "█░███░░██░░▀██░███░▀██▀░░░░░░░░░░░█\n" +
                            "█░░██░░███▄░▀█░██▀░░░░░░░░░░░░░░░░█\n" +
                            "██░██░░▀████░▀░░░░░░░░░░░░░░░░░░░██\n" +
                            "─██░▀░░░░▀▀░░░░░░░░░░░░░░░░░░░░░██─\n" +
                            "──██░░░░░░░░░░░░░░░░░░░░░░░░░░░██──\n" +
                            "───██░░░░░░░░░░░░░░░░░░░░░░░░░██───\n" +
                            "────██░░░░░░░░░░░░░░░░░░░░░░░██────\n" +
                            "─────███░░░░░░░░░░░░░░░░░░░███─────\n" +
                            "───────████░░░░░░░░░░░░░████───────\n" +
                            "──────────███████████████──────────\n" +
                            "───────────────────────────────────");
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
                    System.out.println("         .--------.\n" +
                            "    ____/          \\\n" +
                            "   |.--,            |\n" +
                            "   ||__|            |\n" +
                            "   '---,            |\n" +
                            "       |____________|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "       | \\ \\ \\ \\ \\ \\|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "       | \\ \\ \\ \\ \\ \\|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "       | \\ \\ \\ \\ \\ \\|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "       | \\ \\ \\ \\ \\ \\|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "       | \\ \\ \\ \\ \\ \\|\n" +
                            "       |\\ \\ \\ \\ \\ \\ |\n" +
                            "   jgs |_\\_\\_\\_\\_\\_\\|\n" +
                            "       `\"\"\"\"\"\"\"\"\"\"\"\"`");
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
                repeater = true;

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
                    System.out.println(" ( ) ;\n" +
                            " ;)( ;\n" +
                            ":----:\n" +
                            "C|====|\n" +
                            "|    |\n" +
                            "`----'");
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
                    System.out.println("            .------.____\n" +
                            "         .-'       \\ ___)\n" +
                            "      .-'         \\\\\\\n" +
                            "   .-'        ___  \\\\)\n" +
                            ".-'          /  (\\  |)\n" +
                            "         __  \\  ( | |\n" +
                            "        /  \\  \\__'| |\n" +
                            "       /    \\____).-'\n" +
                            "     .'       /   |\n" +
                            "    /     .  /    |\n" +
                            "  .'     / \\/     |\n" +
                            " /      /   \\     |\n" +
                            "       /    /    _|_\n" +
                            "       \\   /    /\\ /\\\n" +
                            "        \\ /    /__v__\\\n" +
                            "         '    |       |\n" +
                            "              |     .#|\n" +
                            "              |#.  .##|\n" +
                            "              |#######|\n" +
                            "              |#######|\n" +
                            "                      (\n" +
                            "                        )     (\n" +
                            "                 ___...(-------)-....___\n" +
                            "             .-\"\"       )    (          \"\"-.\n" +
                            "       .-'``'|-._             )         _.-|\n" +
                            "      /  .--.|   `\"\"---...........---\"\"`   |\n" +
                            "     /  /    |                             |\n" +
                            "     |  |    |                             |\n" +
                            "      \\  \\   |                             |\n" +
                            "       `\\ `\\ |                             |\n" +
                            "         `\\ `|                             |\n" +
                            "         _/ /\\                             /\n" +
                            "        (__/  \\                           /\n" +
                            "     _..---\"\"` \\                         /`\"\"---.._\n" +
                            "  .-'           \\                       /          '-.\n" +
                            " :               `-.__             __.-'              :\n" +
                            " :                  ) \"\"---...---\"\" (                 :\n" +
                            "  '._               `\"--...___...--\"`              _.'\n" +
                            "    \\\"\"--..__                              __..--\"\"/\n" +
                            "     '._     \"\"\"----.....______.....----\"\"\"     _.'\n" +
                            "        `\"\"--..,,_____            _____,,..--\"\"`\n" +
                            "                      `\"\"\"----\"\"\"`");
                    if (G < 0) {
                        System.out.println("Je hebt niet genoeg geld");
                        G = G + 1;
                        System.out.println("Je hebt nog €" + G);
                    }
                }
            }

            if (antwoordenArray[1] == "saldo") {
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2] + " " + antwoordenArray[1]);
            } else if (antwoordenArray[1] == "" && antwoordenArray[5] == ""){
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2]);
            } else if (antwoordenArray[1] == "" && antwoordenArray[5] == "menu"){
                System.out.println("Antwoorden die jij hebt gegeven: " + antwoordenArray[0] + " " + antwoordenArray[3] + " " + antwoordenArray[2] + " " + antwoordenArray[5]);
            }
            
        }
        if (repeater){
            run = 0;
        }

    }
}