import java.io.*;
class FileDemo{
public static void main(String[] args){
try{
BufferedWriter Writer = new BufferedWriter(new FileWriter("students.txt")); 
Writer.write("Alice\nBob\ncharlie");
Writer.close();
BufferedReader reader = new BufferedReader(new FileReader("students.txt"));
String Line;
System.out.println("Student Names:");
while((Line=reader.readLine())!=null)
{
System.out.println(Line);
}
reader.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}