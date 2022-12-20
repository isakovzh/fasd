import java.util.Scanner;

public class Registrations {
    Scanner scan = new Scanner(System.in);

    public void typeOfAccount(){
        System.out.println("Student account"); 
        System.out.println("Marketing account"); 
        System.out.println("Director account"); 
        System.out.println("Manager account"); 
        System.out.println("Worker account"); 
        
        do {
            System.out.print("Type of acc");
            System.out.println();
            String choose = scan.nextLine();
            switch (choose) {
               
                case "Maneger":
                    maneger();
                    System.out.println("fdsg");
                    break;
                case "Student":
                    student();
                    break;
                case "Director":
                    director();
                    break;
                case "Market":
                    market();
                    break;
                case "Worker":
                    worker();
                    break;
                default:
                    System.out.print("Would you like to exit[1] or repeat[0]?");
                    int ex = scan.nextInt();
                    if (ex == 0){
                        typeOfAccount();
                    }
                    if(ex == 1){
                        System.exit(0);
                    }else{
                        System.out.println("Try again");
                    }
               
            }
            break;
        } while (true);

    }
    public void maneger(){
        String keyword = "comp-maneger";
        do{
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if(keyword_in.equals(keyword)){
                answear = true;
            }
            if(answear == true){
                System.out.println();
                Maneger maneger = new Maneger();
                maneger.menu();
                break;

            }

        }while (true);

    }
    public void student(){
        String keyword = "comp-hr";
        do{
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if(keyword_in.equals(keyword)){
                answear = true;
            }
            if(answear == true){
                System.out.println();
                Student student = new Student();
                student.menu();
                break;
            }

        }while (true);
    }
    public void director(){
        String keyword = "comp-director";
        do{
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if(keyword_in.equals(keyword)){
                answear = true;
            }
            if(answear == true){
                System.out.println();
                Director director = new Director();
                director.menu();
                break;
            }

        }while (true);
    }
    public void market(){
        String keyword = "comp-market";
        do{
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if(keyword_in.equals(keyword)){
                answear = true;
            }
            if(answear == true){
                System.out.println();
                Market market = new Market();
                market.menu();
                break;
            }

        }while (true);
    }
    public void worker(){
        String keyword = "comp-worker";
        do{
            System.out.println("Enter your keyword ");
            String keyword_in = scan.nextLine();
            boolean answear = false;
            if(keyword_in.equals(keyword)){
                answear = true;
            }
            if(answear == true){
                System.out.println();
                Worker worker = new Worker();
                worker.menu();
                break;
            }

        }while (true);
    }
}
