import sun.security.jca.GetInstance;

public class SingletonTest {
    public static void main(String[] args){
        Renban renbanA=Renban.getInstance();
        Renban renbanB=Renban.getInstance();
       
        System.out.println( renbanA.getNumber() );
        System.out.println( renbanB.getNumber() );
        System.out.println( renbanB.getNumber() );
        System.out.println( renbanA.getNumber() );
        System.out.println( renbanB.getNumber() );
        }
    }
    class Renban{
        private static Renban instance =new Renban();
        private int number;

        private Renban(){
           int number =0;
        }
        
        private static Renban getInstance(){
            return instance;
        }
        public String getNumber(){
            number +=1;
            String str =String.format("%04d",number);
            return str;
        }
    }
}
