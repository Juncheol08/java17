package sec2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Files 클래스의 write() 메소드는 static이므로 별도의 파일 객체를 만들지 않는다
public class FilesEx1 {
    public static void main(String[] args) {


        try {
            Path pat = Paths.get("c:\\Users\\db400tea\\IdeaProjects\\ch14\\out6.txt");
//      "c:\\Users\\db400tea\\IdeaProjects\\ch14\\out3.txt;
            Files.write(pat, "I\'m dying of hunger".getBytes());


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
