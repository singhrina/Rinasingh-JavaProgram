package collactions;

public class CommanNumber {
	public static void main(String[] args) {
	int a[]= {0,1,1,2,2,5};
	int b[]= {0,1,2,2,2,6};
	    for(int i =1;i<a.length; i++){
		for(int j=1;j<b.length;j++){
			if(a[i]==b[j]){
				System.out.print(b[j]);
			}
		}
	}
}

}


