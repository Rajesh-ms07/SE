import java.io.FileReader;
import java.io.IOException;
public class fileread {
    public static void main(String [] args ){
        try {
            FileReader fr=new FileReader("gani.txt");
        int chararcter;
        while ((chararcter=fr.read()) !=-1){
System.out.println((char)chararcter);

        }
        fr.close();
    
    }
    catch(IOException e){
        System.out.println("error accured ");
        e.printStackTrace();
    }

}
}
