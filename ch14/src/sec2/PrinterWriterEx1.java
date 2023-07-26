package sec2;


import java.io.*;

//PrintWriter : 출력을 버퍼, 한줄, 한글자, 문자열 등의 모든 단위의 파일에 쓰기 작업
public class PrinterWriterEx1 {
    public static void main(String[] args) {

        try{
            File file = new File("out4.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file); // 연필
            PrintWriter writer = new PrintWriter(fw); //사용자

            //연필로 노트에 쓰기.
            writer.write("점심시간 10분전");
            writer.println("배고파");
            writer.print("\n\n밥");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
