package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Stream(스트림)
public class StreamEx1 {
    public static void main(String[] args) {
        //Input -> 파일에 있는 자료를 가져오기 -
        //InputStream (FileInputStream, ByteArrayInputStream, FilterInputStream)
        //Output -> 파일에 자료를 저장하기
        //OutputStream (FileOutputStream, ByteArrayOutputStream, FilterOutputStream)

        try{
            FileOutputStream fos = new FileOutputStream("out.txt");
                fos.write(65);
                fos.write(66);
                fos.write(67);
                fos.close(); //메모리 관리

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("출력 파일이 존재하지 않거나 경로가 틀림");
        }

        try{
            FileInputStream fis = new FileInputStream("out.txt");
            int i;
            while ((i= fis.read()) != -1){
                System.out.print((char)i);

            }
            fis.close();
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("입력 파일이 존재하지 않거나 경로가 틀림");

        }
    }
}
