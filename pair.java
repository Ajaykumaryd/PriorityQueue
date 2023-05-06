package pQbasics;
import java.util.*;
public class pair {


	public static Scanner s=new Scanner(System.in);	
	
    int v1=0;
    int v2=0;
    
    pair(int  v1,int v2 ) {
    	this.v1=v1;
    	this.v2=v2;
    }
	
	
	public static void test(){
	PriorityQueue<pair> pq= new PriorityQueue<>((a,b)->{
	 return b.v1-a.v1;	
	});
	
//	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=0;i<n;i++){
	int a=s.nextInt();
	int b=s.nextInt();
	pair p= new pair(a,b);
	pq.add(p);	
	}
	while(!pq.isEmpty()) {
	pair p=pq.remove();
	System.out.println(p.v1+","+p.v2);
	}
}
	public static void main(String[] args) {
		
    test();
	}

}
