package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args)throws Exception
	{
PrintWriter pw=new PrintWriter("/Users/bodagalasuneelsaibabu/Downloads/output.txt");
Pattern p=Pattern.compile("[0|91]?[1-9][0-9]{9}");
BufferedReader br=new BufferedReader(new FileReader("/Users/bodagalasuneelsaibabu/Downloads/input.txt"));
String line=br.readLine();
while(line != null)
{
	Matcher m=p.matcher(line);
	while(m.find()) {
		pw.println(m.group());
	}
	line= br.readLine();
}
pw.flush();
	}

}
