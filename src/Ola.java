public class Ola {

    public static void main(String[] args) throws InterruptedException {
        String[] x = {"O","l","a",","," ","t","u","d","o"," ","b","e","m","?"};
        for(int i = 0;i<14;i++){
            Thread.sleep(400);
            System.out.print(x[i]);
        }
        System.out.println("");
    }
    
    
}
