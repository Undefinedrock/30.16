import java.util.concurrent.*;


public class ExecUTORtEST {

    public static void main(String[] args){

        ExecutorService executor= Executors.newCachedThreadPool(3);
        executor.execute(new PrintChar('a',100));
        executor.execute(new PrintChar('b',100));
        executor.execute(new PrintNum('a',100));
        executor.shutdown();



    }
}
