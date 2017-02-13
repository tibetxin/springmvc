import java.util.ArrayList;
import java.util.List;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();
		 list.add("1-001");
		 list.add("2---002");
		 list.add("3---003");
		 list.add("4---004");
		 
		 for(int i=0;i<list.size();i++){
			 System.out.println(list.get(i));
		 }
	}

}
