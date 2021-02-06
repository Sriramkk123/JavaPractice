package FactoryPattern;

public class factoryPatternDemo {
	
	public static void main(String[] args)
	{
		osFactory osf = new osFactory(); 
		
		operatingSystem android = osf.getOS("ANDROID");
		android.show();
		
		operatingSystem windows = osf.getOS("WINDOWS");
		windows.show();
		
		operatingSystem ios = osf.getOS("IOS");
		ios.show();
	}
}
