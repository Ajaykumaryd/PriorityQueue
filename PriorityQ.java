package pQbasics;
import java.util.*;
public class PriorityQ {
    
	ArrayList<Integer> heap;
	
//	public PriorityQ()
//	{
//		heap=new ArrayList<>();
//	}
	
	boolean isEmpty() {
		return heap.size()==0;
	}
	
	int size() {
		return heap.size();
	}
	
	int getMin() throws PQEmptyexception {
	if(isEmpty()) {
	throw new PQEmptyexception();
	}
	return heap.get(0);
	}
	
	void insert(int element) {
	
	heap.add(element);
	int childIndex=heap.size()-1;
	int parentIndex=(childIndex-1)/2;
	while (childIndex > 0) {
		if (heap.get(childIndex) < heap.get(parentIndex)) {
			int temp = heap.get(childIndex);
			heap.set(childIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			childIndex = parentIndex;
			parentIndex = (childIndex - 1) / 2;
		} else {
			return;
		}
	}	
   }
   
    int remove() throws PQEmptyexception{
    if(isEmpty()){
    	throw new PQEmptyexception();
    }
    int temp=heap.get(0); 	
    heap.set(0,heap.get(heap.size()-1));
    heap.remove(heap.size()-1);    
    int Index=0;
    int minIndex=Index;
    int leftIndex=1;
    int rightIndex=2;
    
    while(leftIndex <heap.size()){

    	if(rightIndex<heap.size() && heap.get(rightIndex)<heap.get(minIndex)){
        	minIndex=rightIndex;
        }
    	
        if( heap.get(leftIndex)<heap.get(minIndex) ){
        	minIndex=leftIndex;
        }	
        
        if(minIndex==Index){
        	break;
        }
        else {    
         int temp1=heap.get(Index);
         heap.set(Index,heap.get(minIndex));
         heap.set(minIndex,temp1);
         Index=minIndex;
         leftIndex=2*Index+1;
         rightIndex=2*Index+2;
        }     	
        }
        return temp;
        }
    
			
	public static void main(String[] args) throws PQEmptyexception {
	
		PriorityQ pq=new PriorityQ();
		pq.heap=new ArrayList<>();;
        int a[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            pq.insert(a[i]);	
        }
        
        while(!pq.isEmpty()){
         System.out.print(pq.remove() + " ");    	
        }
	 } 
  }
