package aravind.apps;

class Star {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
 * 
 * public static void main(String[] args) { try{ int
 * nooflines=Integer.parseint(args[0]); for(int
 * lineNumber=1;linenumber<nooflines;linenumber++){ for (int
 * linecounter=1;linecounter<=linenumber;linecounter++){
 * syste.out.println(linecounter); } System.out.println(*); //replace * with
 * linecounter for number pattern }catch(Numberformatexception exp){
 * System.out.println("Please give a valid number and not a character"); } } }
 */