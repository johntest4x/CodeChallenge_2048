
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  /**
   * Iterate through each line of input.
   * 
   * 
   *     case tiles not match motion stop
   *     case tiles equal (merge)
   *     case multiple tiles same merge
   * 
   * 
   * 
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    
    int move =0;
    ArrayList arr= new ArrayList(4);
    
      
    class numb extends Object{
    	
    	String value="";
    	boolean done=false;
    	
    	
    	
    	
    }
    //input grid default rows (for left or right column motion)
    //for up or down these become column imputs L-->right) default dir is down 
    List tmp1=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List tmp2=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List tmp3=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List tmp4=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    
    
    
    List  tmpRot1=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List  tmpRot2=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List  tmpRot3=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    List  tmpRot4=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    
    
    
    
    
    boolean arr1Filled=false;
    boolean arr2Filled=false;
    boolean arr3Filled=false;
    boolean arr4Filled=false;
    
    boolean gridComplete=false;
    boolean gameComplete=false;
    

    
    while ((line = in.readLine()) != null) {

    	
      
      if(line.trim().equalsIgnoreCase("left")) {	  
    	  move =1;  
    	
      }else  if(line.trim().equalsIgnoreCase("right")) {
    	  move =2;
    	 
      }else  if(line.trim().equalsIgnoreCase("down")) {
    	  move =3;
    	
      }else  if(line.trim().equalsIgnoreCase("up")) {
    	  move =4;
    	 
      }else {

    	  String [] tmpA=new String[4];
    	  int i =0;
    	  
    	  
    	  

    	  
    	  if(arr1Filled==false) {
    		  tmpA=line.split(" ");    		  
    		  arr1Filled=true;
    		  
    		  tmp1=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    		  for(String x : tmpA) {
    			  numb n=new numb();
    			  n.value=x;
    			  tmp1.set(i++, n);   			      			  
    		  }

    		//to left  
    		if(move==1) {  
            List<String> l = new ArrayList(tmp1); 
            Collections.reverse(l); 
            tmp1 = new ArrayList(l);
    		}
    		

    		  
    	  }else if (arr2Filled==false) {
    		  tmpA=line.split(" ");    	
    		  arr2Filled=true;
    		  tmp2=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    		  for(String x : tmpA) {
    			  numb n=new numb();
    			  n.value=x;
    			  tmp2.set(i++, n);    			      			  
    		  }

    		  
    		  if(move==1) {  
    	            List<String> l = new ArrayList(tmp2); 
    	            Collections.reverse(l); 
    	            tmp2 = new ArrayList(l);
    	    		}
    		  
    		  
    		  
    	  }else if (arr3Filled==false) {
    		  tmpA=line.split(" ");  
    		  arr3Filled=true;
    		  tmp3=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    		  for(String x : tmpA) {
    			  numb n=new numb();
    			  n.value=x;
    			  tmp3.set(i++, n);    			      			  
    		  }
    		  
    		  if(move==1) {  
    	            List<String> l = new ArrayList(tmp3); 
    	            Collections.reverse(l); 
    	            tmp3 = new ArrayList(l);
    	    		}
    		  
    		  
    		  
    	  }else if (arr4Filled==false) {
    		  tmpA=line.split(" "); 
    		  arr4Filled=true;
    		  tmp4=new ArrayList(Arrays.asList(new numb(),new numb(),new numb(),new numb()));
    		  for(String x : tmpA) {
    			  numb n=new numb();
    			  n.value=x;
    			  tmp4.set(i++, n);    			      			  
    		  }
    		  
    		  if(move==1) {  
    	            List<String> l = new ArrayList(tmp4); 
    	            Collections.reverse(l); 
    	            tmp4 = new ArrayList(l);
    	    		}


    		  arr1Filled=false;
    		  arr2Filled=false;
    		  arr3Filled=false;
    		  arr4Filled=false;
    	
    		  gridComplete=true;
    	  }
    	  
    	  
    	  if(move>2 && gridComplete){

    		  
    		  
    		 
    		  tmpRot1.set(0,tmp1.get(3));              tmpRot1.set(1,tmp2.get(3));          tmpRot1.set(2,tmp3.get(3));         tmpRot1.set(3,tmp4.get(3));
        	 // tmpRot1.set(0,tmp1.get(3));  			tmpRot1[1]=tmp2[3];  				tmpRot1[2]=tmp3[3];  				tmpRot1[3]=tmp4[3];
    	
    		 
        	  tmpRot2.set(0,tmp1.get(2));               tmpRot2.set(1,tmp2.get(2));         tmpRot2.set(2,tmp3.get(2));          tmpRot2.set(3,tmp4.get(2));
    		  //tmpRot2[0]=tmp1[2];  					tmpRot2[1]=tmp2[2];  				tmpRot2[2]=tmp3[2];  				tmpRot2[3]=tmp4[2];
    		 
    		 
    		  tmpRot3.set(0,tmp1.get(1));               tmpRot3.set(1,tmp2.get(1));         tmpRot3.set(2,tmp3.get(1));         tmpRot3.set(3,tmp4.get(1));
    		  //tmpRot3[0]=tmp1[1];  					tmpRot3[1]=tmp2[1];  				tmpRot2[2]=tmp3[1];  				tmpRot2[3]=tmp4[1];
    		 
    		 
    		  tmpRot4.set(0,tmp1.get(0));               tmpRot4.set(1,tmp2.get(0));         tmpRot4.set(2,tmp3.get(0));         tmpRot4.set(3,tmp4.get(0));
    		  //tmpRot4[0]=tmp1[0];  					tmpRot4[1]=tmp2[0];  				tmpRot4[2]=tmp3[0];  				tmpRot4[3]=tmp4[0];
    		 
    	  }
 
      }

      
      
      
      
      

      
  

       
   
      
      
      
      
      boolean merged=false;
      boolean moved=false;
      
      
   if(gridComplete==true)  
      for (int i=0;i<4;i++) {
      
 
      arr = new ArrayList();
      if(i==0) {
    	  
    	  if(move >2) {

    		  arr = new ArrayList(tmpRot1);
    	  }else {

    		  arr = new ArrayList(tmp1);
    		  
    	  }
      }else if(i==1) {
    	  
    	  if(move >2) {

    		  arr = new ArrayList(tmpRot2);
    	  }else {

    		  arr = new ArrayList(tmp2);
    	  }
      }else if(i==2) {
    	  
    	  if(move >2) {

    		  arr = new ArrayList(tmpRot3);
    		  
    	  }else {

    		  arr = new ArrayList(tmp3);
    	  }
      }else if(i==3) {
    	  
    	  if(move >2) {

    		  arr = new ArrayList(tmpRot4);
    	  }else {
 
    		  arr = new ArrayList(tmp4);
    	  }
    	  
      }
    	  
    	  
      

      
      
       if(move==4) {
		  List<String> l = new ArrayList(arr); 
          Collections.reverse(l); 
        arr = new ArrayList(l);
	  }

   
   
   for(int jb=3;jb>0;jb--) {  
	   
      for(int ja=3;ja>0;ja--){
	      if(   ((numb) arr.get(ja)).value.equalsIgnoreCase("0")) {
	    	  ((numb) arr.get(ja)).value=((numb) arr.get(ja-1)).value;
	    	  ((numb) arr.get(ja-1)).value="0";
	    	 // arr[ja]=arr[ja-1];
	    	 // arr[ja-1]="0";

     		  
		  }
	      
	      
	      
       }
      
      
      
      
    	  
      //-------------------------------extract only pairs (since can only perf fusion once!
      //last back to first - order of shuffle
    //00YY 	
      //(arr[2].equalsIgnoreCase(arr[3].trim()) && (!arr[2].equalsIgnoreCase("0")))  & !done[3]
       if(  ((numb) arr.get(2)).value.equalsIgnoreCase( ((numb) arr.get(3)).value)  &&   !((numb) arr.get(2)).value.equalsIgnoreCase("0")  && !((numb) arr.get(3)).done &&  !((numb) arr.get(2)).done ) {
  			int add=Integer.valueOf( ((numb) arr.get(2)).value.trim())+Integer.valueOf( ((numb) arr.get(3)).value.trim());
  			 ((numb) arr.get(3)).value=""+add;
  			 ((numb) arr.get(2)).value="0";
  			
  			 ((numb) arr.get(3)).done=true;  
  			
  			//XXYY
  			// arr[0].equalsIgnoreCase(arr[1].trim()) && (!arr[0].equalsIgnoreCase("0")) & !done[1]  
	  		if( ((numb) arr.get(0)).value.equalsIgnoreCase( ((numb) arr.get(1)).value)  &&  !((numb) arr.get(0)).value.equalsIgnoreCase("0")   && ! ((numb) arr.get(1)).done  &&  !((numb) arr.get(0)).done  ) {
	  			add=Integer.valueOf(((numb) arr.get(0)).value.trim())+Integer.valueOf(((numb) arr.get(1)).value.trim());
	  			((numb) arr.get(1)).value=""+add;
	  			((numb) arr.get(0)).value="0";
    	  		
	  			((numb) arr.get(1)).done=true;	
	  	  }
  			
	  	//0ZZ0	
	  		//arr[1].equalsIgnoreCase(arr[2].trim()) && !arr[1].equalsIgnoreCase("0")   & !done[2]  
  	  }else if(   ((numb) arr.get(1)).value.equalsIgnoreCase( ((numb) arr.get(2)).value.trim())  &&  !((numb) arr.get(1)).value.equalsIgnoreCase("0")   && ! ((numb) arr.get(2)).done   && !((numb) arr.get(1)).done    ) {
    	  
	  		int add=Integer.valueOf( ((numb) arr.get(1)).value.trim())+Integer.valueOf( ((numb) arr.get(2)).value.trim());
	  		 ((numb) arr.get(2)).value=""+add;
	  		 ((numb) arr.get(1)).value="0";
	  
	  		 ((numb) arr.get(2)).done=true;
			
         //XX00
	  		 // (arr[0].equalsIgnoreCase(arr[1].trim()) && (!arr[0].equalsIgnoreCase("0")) & !done[1] 
        }else if(  ((numb) arr.get(0)).value.equalsIgnoreCase( ((numb) arr.get(1)).value.trim())  &&  !((numb) arr.get(0)).value.equalsIgnoreCase("0")   && ! ((numb) arr.get(1)).done && !((numb) arr.get(0)).done )  {
    	  
    	  		int add=Integer.valueOf( ((numb) arr.get(0)).value.trim())+Integer.valueOf( ((numb) arr.get(1)).value.trim());
    	  		 ((numb) arr.get(1)).value=""+add;
    	  		 ((numb) arr.get(0)).value="0";		
    	  		
    	  		 ((numb) arr.get(1)).done=true;
      }

      
      
   }//for     
      

    
      
      merged=false;
      
      if(move==1) {  
  
         
         
         if(move==1 ) {  
             List l = new ArrayList(arr); 
             Collections.reverse(l); 
             arr = new ArrayList(l);
     		}
     		
         
  		}
      
      
        if(move==1 || move==2){


            System.out.print( ((numb)arr.get(0)).value+ " " + ((numb)arr.get(1)).value+ " "+((numb)arr.get(2)).value+ " "+((numb)arr.get(3)).value+ "");            
            System.out.println();
      }
        
        
  if(move>2){
  	  
  
  //tmp1[3]=tmpRot1[0];  										tmp2[3]=tmpRot1[1];  											tmp3[3]=tmpRot1[2];  											tmp4[3]=tmpRot1[3];  
 ((numb) tmp1.get(3)).value= ((numb) tmpRot1.get(0)).value;		((numb) tmp2.get(3)).value= ((numb) tmpRot1.get(1)).value;     ((numb) tmp3.get(3)).value= ((numb) tmpRot1.get(2)).value;      ((numb) tmp4.get(3)).value= ((numb) tmpRot1.get(3)).value;
  	  
  //tmp1[2]=tmpRot2[0];  										tmp2[2]=tmpRot2[1];  											tmp3[2]=tmpRot2[2];  											tmp4[2]=tmpRot2[3];
 ((numb) tmp1.get(2)).value= ((numb) tmpRot2.get(0)).value; 	((numb) tmp2.get(2)).value= ((numb) tmpRot2.get(1)).value;      ((numb) tmp3.get(2)).value= ((numb) tmpRot2.get(2)).value;     ((numb) tmp4.get(2)).value= ((numb) tmpRot2.get(3)).value;
	  
  //tmp1[1]=tmpRot3[0];  										tmp2[1]=tmpRot3[1];  											tmp3[1]=tmpRot3[2];  											tmp4[1]=tmpRot3[3];
 ((numb) tmp1.get(1)).value= ((numb) tmpRot3.get(0)).value; 	((numb) tmp2.get(1)).value= ((numb) tmpRot3.get(1)).value;      ((numb) tmp3.get(1)).value= ((numb) tmpRot3.get(2)).value;     ((numb) tmp4.get(1)).value= ((numb) tmpRot3.get(3)).value;
	  
  //tmp1[0]=tmpRot4[0];  										tmp2[0]=tmpRot4[1];  											tmp3[0]=tmpRot4[2];  											tmp4[0]=tmpRot4[3];
 ((numb) tmp1.get(0)).value= ((numb) tmpRot4.get(0)).value;     ((numb) tmp2.get(0)).value= ((numb) tmpRot4.get(1)).value;     ((numb) tmp3.get(0)).value= ((numb) tmpRot4.get(2)).value;      ((numb) tmp4.get(0)).value= ((numb) tmpRot4.get(3)).value;
    

    
    
       if(move==4) {
		  List<String> l = new ArrayList(arr); 
          Collections.reverse(l); 
        arr = new ArrayList(l);
	  }
         
      if(i==0) {
    	      	 
    	  
   //tmp1[3]=arr[0];  											tmp2[3]=arr[1];  												tmp3[3]=arr[2];  												tmp4[3]=arr[3];
    ((numb) tmp1.get(3)).value= ((numb) arr.get(0)).value;	    ((numb) tmp2.get(3)).value= ((numb) arr.get(1)).value;          ((numb) tmp3.get(3)).value= ((numb) arr.get(2)).value;          ((numb) tmp4.get(3)).value= ((numb) arr.get(3)).value;
    	  
    
    
      }else if(i==1) {
   //tmp1[2]=arr[0];  											tmp2[2]=arr[1];  												tmp3[2]=arr[2];  												tmp4[2]=arr[3];
     ((numb) tmp1.get(2)).value= ((numb) arr.get(0)).value;	    ((numb) tmp2.get(2)).value= ((numb) arr.get(1)).value;          ((numb) tmp3.get(2)).value= ((numb) arr.get(2)).value;          ((numb) tmp4.get(2)).value= ((numb) arr.get(3)).value;	
        
    	  
      }else if(i==2) {
   //tmp1[1]=arr[0];  											tmp2[1]=arr[1];  											    tmp3[1]=arr[2];  												tmp4[1]=arr[3];
    ((numb) tmp1.get(1)).value= ((numb) arr.get(0)).value;	    ((numb) tmp2.get(1)).value= ((numb) arr.get(1)).value;          ((numb) tmp3.get(1)).value= ((numb) arr.get(2)).value;          ((numb) tmp4.get(1)).value= ((numb) arr.get(3)).value;	  

    
      }else {
    
    	  
   //tmp1[0]=arr[0];                                             tmp2[0]=arr[1];                                                tmp3[0]=arr[2];                                                 tmp4[0]=arr[3];
    ((numb) tmp1.get(0)).value= ((numb) arr.get(0)).value;	    ((numb) tmp2.get(0)).value= ((numb) arr.get(1)).value;          ((numb) tmp3.get(0)).value= ((numb) arr.get(2)).value;          ((numb) tmp4.get(0)).value= ((numb) arr.get(3)).value;    	  
    	  
    	  
    
        
       
         
  		
        
        
        
        
        
        
        
    	  
System.out.print( ((numb)tmp1.get(0)).value+ " " + ((numb)tmp1.get(1)).value+ " "+((numb)tmp1.get(2)).value+ " "+((numb)tmp1.get(3)).value+ "");            
System.out.println();
    
	  
System.out.print( ((numb)tmp2.get(0)).value+ " " + ((numb)tmp2.get(1)).value+ " "+((numb)tmp2.get(2)).value+ " "+((numb)tmp2.get(3)).value+ "");            
System.out.println();
    	  
System.out.print( ((numb)tmp3.get(0)).value+ " " + ((numb)tmp3.get(1)).value+ " "+((numb)tmp3.get(2)).value+ " "+((numb)tmp3.get(3)).value+ "");            
System.out.println();


System.out.print( ((numb)tmp4.get(0)).value+ " " + ((numb)tmp4.get(1)).value+ " "+((numb)tmp4.get(2)).value+ " "+((numb)tmp4.get(3)).value+ "");            


    	  
 

      }
    	  
  } 	  
    	  

    	  

      
      
    }//for
    
   
   
   
       

   
   
   
   
    
    
  }//while

	
	
	
  }//main	
	
	
	
	

}//class
