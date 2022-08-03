package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
//custom annotation
@Documented
@Retention (RetentionPolicy.RUNTIME)
@interface customA
{
	String get();
}
class same
{
	@customA(get="siddhi")
	public void display()
    {
  	  System.out.println("display");
    }
}
public class DocumentedAnnotation {
          public void display()
          {
        	  System.out.println("display");
          }
	public static void main(String[] args) {
		System.out.println("display this");

	}

}
