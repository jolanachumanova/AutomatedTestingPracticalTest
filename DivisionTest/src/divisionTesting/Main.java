package divisionTesting;

public class Main {

    public static void main(String[] args) {
	int testedNumber = 101;
	for(int i=1;i<=100;i++){
	    testedNumber = testedNumber - 1;
        //System.out.println(testedNumber);
        if ((testedNumber % 5 == 0) && (testedNumber % 3 == 0)){
            System.out.println("Testing");
        }
        else {
            if (testedNumber % 5 == 0) {
                System.out.println("Agile");
            } else if (testedNumber % 3 == 0) {
                System.out.println("Software");
            }
            else{
                System.out.println(testedNumber);
            }
        }
    }
    }
}
