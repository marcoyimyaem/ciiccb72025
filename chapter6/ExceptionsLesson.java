package chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsLesson{
    public static void main(String[] args) throws Exception, RuntimeException {
        throw new Exception("Bad Code");
        // throw new RuntimeException("Bad Code");
    }
}
class ExceptionLesson2{
    public static void main(String[] args) {
        try{
            
            // System.out.println(args[0]);
            System.out.println(12/0);
            
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("eeeee");
            System.exit(0);
        }
        catch(RuntimeException e){
            System.out.println(e);
            
        }
        finally{
            System.out.println("finally block");
        }

        System.out.println("done");
        
    }
}
class ExceptionLesson3{
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = read();
            }
        catch(IOException e){
            try{
                if(reader!=null){
                    reader.close();
                            }
                }
            catch(IOException inner){
                    //
                }
            }
        }
            
            private static FileReader read() throws IOException {
                return null;
            }
}
