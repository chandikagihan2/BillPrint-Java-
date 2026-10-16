class BillPrint{
    public static void main(String [] args){
        System.out.println("==============================================================================================");
        System.out.println("__          __  _                            _          _ __  __            _");
		System.out.println("\\ \\        / / | |                          | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __,_ _,__| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ' _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _  |  __| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println("==============================================================================================");

        Scanner input = new Scanner(System.in);
	
	System.out.print("Enter customer Number -");
	int number=input.nextInt();
	input.nextLine();

	System.out.println("");


	System.out.print("Enter customer Name -");
	String name=input.nextLine();

	System.out.println("");

    System.out.println("===============================================================================================");
	System.out.println("");

	System.out.print("Basmathi Qty (Kg) -");
	int A=input.nextInt();
	System.out.println("");

	System.out.print("Dhal Qty (Kg) -");
	int B=input.nextInt();
	System.out.println("");

	System.out.print("Suger Qty (Kg) -");
	int C=input.nextInt();
	System.out.println("");

	System.out.print("Higland Qty  -");
	int D=input.nextInt();
	System.out.println("");

	System.out.print("Yoghurt Qty  -");
	int E=input.nextInt();
	System.out.println("");

	System.out.print("Flour Qty (Kg) -");
	int F=input.nextInt();
	System.out.println("");

	System.out.print("Soap Qty  -");
	int I=input.nextInt();
	System.out.println("");

	double a = 250.00;
	double b = 180.00;
	double c = 150.00;
	double d = 1200.00;
	double e = 50.00;
	double f = 120.00;
	double i = 160.00;

	double totalBasmathi = A * a;
	double totalDhal = B * b;
	double totalSuger = C * c;
	double totalHigland = D * d;
	double totalYoghurt = E * e;
	double totalFlour = F * f;
	double totalSoap = I * i;
	double totalAmount = totalBasmathi + totalDhal + totalSuger + totalHigland + totalYoghurt + totalFlour + totalSoap;
	double Discount = totalAmount * 0.10;
	double finalPrice = totalAmount - Discount;

        String divider    = "+----------------------------------------------------------------------------------------------+";
        String divider2   = "+------------------------------+--------------+---------------+--------------------------------+";
        String divider3   = "+---------------------------------------------+---------------+--------------------------------+";
        String partialDiv = "|                                             +---------------+--------------------------------+";

		System.out.println(divider);
		System.out.println("|                              _   __  __          _____ _______                               |");
		System.out.println("|                             (_) |  \\/  |   /\\   |  __ \\__   __|                              |");
		System.out.println("|                              _  | \\  / |  /  \\  | |__) | | |                                 |");
		System.out.println("|                             | | | |\\/| | / /\\ \\ |  _  /  | |                                 |");
		System.out.println("|                             | | | |  | |/ ____ \\| | \\ \\  | |                                 |");
		System.out.println("|                             |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                                 |");
		System.out.println("|                                  225,Galle Road,Panadura.                                    |");
		System.out.println("|                                                                                              |");
		System.out.println(divider);

		System.out.printf("|                                     # Tell  : %-47s|\n",number);
		System.out.printf("|                                     # Name  : %-47s|\n",name);
		System.out.println(divider2);

		System.out.printf("| %-28s | %12s | %13s | %30s |\n", "", "Qty", "Unit price", "Price");
		System.out.println(divider2);

		String itemRowFormt = "| # %-26s | %12d | %13.1f | %30.1f |\n";

		System.out.printf(itemRowFormt,"Basmathi",A,a,totalBasmathi);
		System.out.printf(itemRowFormt,"Dhal",B,b,totalDhal);
		System.out.printf(itemRowFormt,"Suger",C,c,totalSuger);
		System.out.printf(itemRowFormt,"Higland",D,d,totalHigland);
		System.out.printf(itemRowFormt,"Yoghurt",E,e,totalYoghurt);
		System.out.printf(itemRowFormt,"Flour",F,f,totalFlour);
		System.out.printf(itemRowFormt,"Soap",I,i,totalSoap);
		System.out.println(divider2);

		String totalRowFormat ="|                                             | %-13s | %31.1f|\n";
		System.out.printf(totalRowFormat,"Total",totalAmount);
		System.out.println(partialDiv);
		System.out.printf(totalRowFormat,"discount(10%)",Discount);
		System.out.println(partialDiv);
		System.out.printf(totalRowFormat,"Price",finalPrice);
		System.out.println(divider3);
		System.out.print("");
		System.out.print("");

        System.out.print("Enter Net amount : ");
		double netAmount = input.nextDouble();	
		System.out.print("Enter Cash       : ");
                double cash = input.nextDouble();
		double change = cash - netAmount;

		System.out.println();

        String divider4 = "+-------------------+--------------+";
		System.out.println(divider4);
		System.out.printf("| %-17s | %12.1f |\n", "Net Amount", netAmount);
		System.out.println(divider4);
		System.out.printf("| %-17s | %12.1f |\n", "Cash", cash);
		System.out.println(divider4);
		System.out.printf("| %-17s | %12.0f |\n", "Change", change);
		System.out.println(divider4);

        System.out.print("Enter Rs.5000 notes: ");
		int n5000 = input.nextInt();
		System.out.print("Enter Rs.2000 notes: ");
		int n2000 = input.nextInt();
		System.out.print("Enter Rs.1000 notes: ");
		int n1000 = input.nextInt();
		System.out.print("Enter Rs.500 notes: ");
		int n500 = input.nextInt();
		System.out.print("Enter Rs.100 notes: ");
		int n100 = input.nextInt();
		System.out.print("Enter Rs.50 notes: ");
		int n50 = input.nextInt();
		System.out.print("Enter Rs.20 notes: ");
		int n20 = input.nextInt();
		System.out.print("Enter Rs.10 coins: ");
		int c10 = input.nextInt();
		System.out.print("Enter Rs.5 coins: ");
		int c5 = input.nextInt();
		System.out.print("Enter Rs.2 coins: ");
		int c2 = input.nextInt();
		System.out.print("Enter Rs.1 coins: ");
		int c1 = input.nextInt();

		int totalNotes = n5000 + n2000 + n1000 + n500 + n100 + n50 + n20;
		int totalCoins = c10 + c5 + c2 + c1;

        String divider5 = "+-------------------+--------------+";
		System.out.println(divider5);
		String newrowFormat = "| %-17s | %12s |\n";
		System.out.printf("| %-17s | %12s |\n", "  Value", "  No");
		System.out.println(divider5);

        System.out.printf(newrowFormat, "Rs.5000", n5000);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.2000", n2000);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.1000", n1000);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.500", n500);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.100", n100);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.50", n50);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.20", n20);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.10", c10);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.5", c5);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.2", c2);
		System.out.println(divider5);

		System.out.printf(newrowFormat, "Rs.1", c1);
		System.out.println(divider5);
		System.out.printf(newrowFormat, "No of Notes", totalNotes);
		System.out.println(divider5);
		System.out.printf(newrowFormat, "No of Coins", totalCoins);
		System.out.println(divider5);

    }
}