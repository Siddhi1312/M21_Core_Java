package com.cg.annotations;
import java.lang.annotation.*;//element type and retention policy comes under this package
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
//custom annotation
//to print annotation parameters
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
//custom annotation
@interface OwnCustom
{
	int accept();
}
class d
{
	@OwnCustom (accept=35)
	public void display()
	{
		System.out.println("annotations");
	}
}
public class RetentionTargetAnnotation {

	public static void main(String[] args) throws Exception  {
		d e=new d();
		Method m=e.getClass().getMethod("display");
		OwnCustom o=m.getAnnotation(OwnCustom.class);
		e.display();
		System.out.println(o.accept());
		

	}

}
