package ch.ks.enumExample;

public class EnumExample4 {
	  
	  public static void main(String[] args) {
	    EnumExample[] ee = EnumExample.values();
	    for (int i = 0; i < ee.length; i++) {
	      System.out.println(ee[i]);
	    }
	    
	    EnumExample3[] ee2 = EnumExample3.values();
	    for (int j = 0; j < ee2.length; j++) {
	      System.out.println(ee2[j] + ": " + 
	                         ee2[j].getValue1() + ", " + 
	                         ee2[j].getValue2());
	    }
	    
	    EnumExample3 ee3 = EnumExample3.valueOf("B");
	    System.out.println(ee3.getValue1() + ", " + ee3.getValue2());
	  }
	}