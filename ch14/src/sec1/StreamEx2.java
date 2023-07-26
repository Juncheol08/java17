package sec1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//키보드로 문자를 입력받아 out2.txt로 저장하고
//그 내용을 불러와 콘솔창에 다시 출력하는 프로그램
public class StreamEx2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("내용 입력 : ");
        String str= sc.next();

        byte[] bArr = str.getBytes();


        try{
            FileOutputStream fos = new FileOutputStream("out2.txt");
            for(int i=0; i<bArr.length; i++){
                fos.write(bArr[i]);
            }
            fos.close(); //메모리 관리

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("출력 파일이 존재하지 않거나 경로가 틀림");
        }

        try{
            FileInputStream fis = new FileInputStream("out2.txt");
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
