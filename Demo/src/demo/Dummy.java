package demo;

public class Dummy {

	public static void main(String[] args) {
		String[] arr=new String[4];
		arr[0]="Yazhini Kumar";
		arr[1]="Girish Kumar";
		arr[2]="Harish Kumar";
		arr[3]="Subash Chadran";
		
		for (int i = 0; i < arr.length; i++) {
			String name=arr[i];
			if(name.contains("Yazhini")||name.contains("Chadran")) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
