//Jackson Torregrossa
package sentimentAnalysis;

public class Main {

	//TO DO: add user input for root of project path--will make things easier.
	public static void main(String[] args) {
		String path = "C:\\Users\\memjk\\OOP\\project1\\sentimentAnalysis\\testProcessed.txt";
		
		Test main = new Test(path);
		
		main.unitTest();
		//main.stop();
	} 

}
