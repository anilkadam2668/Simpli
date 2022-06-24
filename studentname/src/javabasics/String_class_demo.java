package javabasics;

public class String_class_demo {

	private static final int i = 0;

	public static void main(String[] args) {
		String s1="Selenium webdriver is web testing tool";
		//Length
       // int size=s1.length();
        System.out.println("lenth of the string: "+s1.length());
        
        //toUppercase
        System.out.println(s1.toUpperCase());
        //toLowercase
        System.out.println(s1.toLowerCase());
        
        //contain---boolean output
        System.out.println("is my string contains web: " +s1.contains("web"));//true
        System.out.println("is my string contains web: " +s1.contains("tools"));//False
        
        //Concatenation()
        String s2=" welcome to selenium taining";
        System.out.println(s1.concat(s2));
        
        //charat(index)
        System.out.println(s2.charAt(6));
        
        //trim()-to ignore white space before and after string
        String s3="      Welcome all   ";
        System.out.println(s3.trim());
        
        //compare --(string content) 1.equals()=case sensitive  2.eualsignorecase()=not case sensitive
        String s4="Please Enter Your Name";
	    String s5="Please Enter Your Name";
	    
	    System.out.println("equals: "+s4.equals(s5));
	    System.out.println("not equal: "+s4.equalsIgnoreCase(s5));
	    
	    //operator
	    System.out.println(s4==s5);
	    
	    //startswith()(prefix)  endswith(sufix)
	    System.out.println(s4.startsWith("Please"));
	    System.out.println(s4.endsWith("Name"));
	    
	    //split
	    String tools="hpqtp,selenium,testlink,jira";//if you remove , operator and keeping space
	    String ss[]=tools.split(",");//keeping " " we can get same result.
	    for(String i:ss)
	    {
	    	System.out.println(i);
	    }
	    
	    StringBuilder sb=new StringBuilder("selenium");//Mutable
	    System.out.println(sb.reverse());
	    
	    //reverse string logic
	    String ss1="java selenium";
	    String rev="";
	    for(int i=ss1.length()-1;i>=0;i--);
	    		{
	    			rev=rev+ss1.charAt(i);
	    		}
	    System.out.println("reverse string "+ss1+"is "+rev);
	    
	}
	

}
