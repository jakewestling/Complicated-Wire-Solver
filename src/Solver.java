import java.util.Scanner;
public class Solver {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String led, star, red, blue, serial, parallel, battery, letter = null, wirestring;
		
		//Prompt user for serial, parallel port, and batteries
		System.out.println("Last serial digit even, Y or N?");
		serial = input.next();
		
		System.out.println("Parallel port, Y or N?");
		parallel = input.next();
		
		System.out.println("Two or more batteries, Y or N?");
		battery = input.next();
		
		int wire = 1;
		while(wire == 1) {
		
		//Prompt user for led, star, red, and blue
		System.out.println("LED, Y or N?");
		led = input.next();
		
		System.out.println("Star, Y or N?");
		star = input.next();
		
		System.out.println("Red, Y or N?");
		red = input.next();
		
		System.out.println("Blue, Y or N?");
		blue = input.next();
		
	//Get letter answer for led, star, red and blue (16 Tests)
		//1st Test - YYYY
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "D";
									//System.out.println(letter);
						}
		//2nd Test - YYYN
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "B";
									//System.out.println(letter);
								}
		//3rd Test - YYNY
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "P";
									//System.out.println(letter);
								}
		//4th Test - YYNN
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "B";
									//System.out.println(letter);
								}
		//5th Test - YNYY
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "S";
									//System.out.println(letter);
								}
		//6th Test - YNYN
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "B";
									//System.out.println(letter);
								}
		//7th Test - YNNY
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "P";
									//System.out.println(letter);
								}
		//8th Test - YNNN
				if((led.equals("y") || led.equals("Y"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "D";
									//System.out.println(letter);
								}
		//9th Test - NYYY
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "P";
									//System.out.println(letter);
						}
		//10th Test - NYYN
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "C";
									//System.out.println(letter);
								}
		//11th Test - NYNY
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "D";
									//System.out.println(letter);
								}
		//12th Test - NYNN
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("y") || star.equals("Y"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "C";
									//System.out.println(letter);
								}
		//13th Test - NNYY
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "S";
									//System.out.println(letter);
								}
		//14th Test - NNYN
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("y") || red.equals("Y"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "S";
									//System.out.println(letter);
								}
		//15th Test - NNNY
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("y") || blue.equals("Y"))) {
									letter = "S";
									//System.out.println(letter);
								}
		//16th Test - NNNN
				if((led.equals("n") || led.equals("N"))&&
				   (star.equals("n") || star.equals("N"))&&
				   (red.equals("n") || red.equals("N"))&&
				   (blue.equals("n") || blue.equals("N"))) {
									letter = "C";
									//System.out.println(letter);
								}
		//Final Answer - Cut or Leave Wire
				//Letter C
				if(letter.equals("C")) {
					System.out.println("CUT THE WIRE!");
				}
				
				//Letter D
				if(letter.equals("D")) {
					System.out.println("LEAVE THE WIRE, DO NOT CUT!");
				}
				
				//Letter S
				if((letter.equals("S") && (serial.equals("Y") || serial.equals("y")))) {
					System.out.println("CUT THE WIRE!");
				}
				if((letter.equals("S") && (serial.equals("N") || serial.equals("n")))) {
					System.out.println("LEAVE THE WIRE, DO NOT CUT!");
				}
				
				//Letter P
				if((letter.equals("P") && (parallel.equals("Y") || parallel.equals("y")))) {
					System.out.println("CUT THE WIRE!");
				}
				if((letter.equals("P") && (parallel.equals("N") || parallel.equals("n")))) {
					System.out.println("LEAVE THE WIRE, DO NOT CUT!");
				}
				
				//Letter B
				if((letter.equals("B") && (battery.equals("Y") || battery.equals("y")))) {
					System.out.println("CUT THE WIRE!");
				}
				if((letter.equals("B") && (battery.equals("N") || battery.equals("n")))) {
					System.out.println("LEAVE THE WIRE, DO NOT CUT!");
				}
				
				
		//Another wire to test?
				System.out.println("Another wire to test, Y or N?");
				wirestring = input.next();
				if((wirestring.equals("y")) || wirestring.equals("Y")) {
					wire = 1;
				}else{wire =2;}
		}
		input.close();
	}
	
	}