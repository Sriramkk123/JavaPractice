package FactoryPattern;

public class osFactory {
	public operatingSystem getOS(String osType){
	      if(osType == null){
	         return null;
	      }		
	      if(osType.equalsIgnoreCase("ANDROID")){
	         return new Android();
	         
	      } else if(osType.equalsIgnoreCase("WINDOWS")){
	         return new Windows();
	         
	      } else if(osType.equalsIgnoreCase("IOS")){
	         return new ios();
	      }
	      
	      return null;
	   }
}