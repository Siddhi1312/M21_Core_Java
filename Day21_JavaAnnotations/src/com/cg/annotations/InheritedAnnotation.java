package com.cg.annotations;
import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
//custom annotation
//if we need to inherit an annotation from superclass then this annotation is used
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
@Inherited
@interface multi
{
	String easy();
}
class dif
{
	
	public void create()
	{
		System.out.println("one");
	}
	
}

class art extends dif
{
	
	@multi (easy="siddhi")
	public void create1()
	{
		System.out.println("two");	
	}
}

public class InheritedAnnotation {

	public static void main(String[] args) throws Exception {
		art a=new art();
		a.create();
		a.create1();
		Method m=a.getClass().getMethod("create1");
		multi o=m.getAnnotation(multi.class);
		System.out.println(o.easy());
		
		

	}

}
