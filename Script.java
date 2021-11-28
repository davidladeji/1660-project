import java.util.*;

public class Script
{
	public static void main( String args[] ) throws Exception
	{
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to the Big Data Process Application");
        System.out.println("Please type the number that corresponds to the application you would like to run:");
        System.out.println("1. Apache Hadoop");
        System.out.println("2. Apache Spark");
        System.out.println("3. Jupyter Notebook");
        System.out.println("4. SonarQube and SonarScanner");
        System.out.println("5. Quit");
        System.out.println();

        boolean stay = true;
        int userInput = -1;
		while (stay){
            try{
                System.out.print("Type the number here > ");
                userInput = scan.nextInt();
            }
            catch(Exception e){
                System.out.println("The Input you entered is not supported. Please try again");
                scan.nextLine();
                continue;
            }

            if (userInput > 5 || userInput < 1){
                System.out.println("The Input you entered is not supported. Please try again");
                continue;
            }

            switch (userInput){
                case 1:
                    handleHadoop();
                    break;
                case 2:
                    handleSpark();
                    break;
                case 3:
                    handleJupyter();
                    break;
                case 4:
                    handleSonar();
                    break;
                case 5:
                    stay = false;
                    break;
            }

        }
        scan.close();
	}

    public static void handleHadoop(){
        System.out.println("Use url '34.136.238.63:9870' to access Hadoop");
    }

    public static void handleSpark(){
        System.out.println("Use url '34.72.213.50:8080' to access Spark");
    }

    public static void handleJupyter(){
        System.out.println("Use url '35.225.234.31:8888' to access Jupyter");
    }

    public static void handleSonar(){
        System.out.println("Use url '35.184.185.134:9000' to access SonarQube");
    }
}