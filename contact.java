import java.util.ArrayList;
class contact
{
public static void main(String[]rashi)
{
ArrayList<String>con=new ArrayList<String>();
con.add("Rashi");
con.add("Priya");
con.add("Sri");
con.add("Deepika");
con.add("Shafi");
for(String con1:con)
{
System.out.println("contactList:"+con1);
}
System.out.println("Retriere:"+con.get(3));
System.out.println("Update:"+con.set(4,"Rohini"));
System.out.println("Delete:"+con.remove(2));
}
}
 