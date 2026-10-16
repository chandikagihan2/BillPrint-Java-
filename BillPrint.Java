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

    
    }
}