import java.text.*;
import java.util.*;
class Dates3 {
public static void main(String[] args) {
Date d1 = new Date(10000000000000L);
DateFormat[] dfa = new DateFormat[6];
dfa[0] = DateFormat.getInstance();
dfa[1] = DateFormat.getDateInstance();
dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
for(DateFormat df : dfa)
System.out.println(df.format(d1));
}
}