package creationalPatterns.AbstractFactory;

import creationalPatterns.AbstractFactory.SkinExample.Button;
import creationalPatterns.AbstractFactory.SkinExample.ComboBox;
import creationalPatterns.AbstractFactory.SkinExample.SkinFactory;
import creationalPatterns.AbstractFactory.SkinExample.SkinFactorySpring;
import creationalPatterns.AbstractFactory.SkinExample.SkinFactorySummer;
import creationalPatterns.AbstractFactory.SkinExample.TextField;
import creationalPatterns.AbstractFactory.SkinExample.XMLUtilSkin;

public class ClientSkin
{
	public static void main(String args[])
	{
		// Using abstract Factory and abstract Object
		SkinFactory factory;
		Button bt;
		TextField tf;
		ComboBox cb;
		//==========================//
		factory = new SkinFactorySummer(); 
		bt = factory.createButton();
		tf = factory.createTextField();
		cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
		//==========================//
		factory = new SkinFactorySpring();
		bt = factory.createButton();
		tf = factory.createTextField();
		cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
		
		//==========================//
		factory = (SkinFactory) XMLUtilSkin.getBean();
		bt = factory.createButton();
		tf = factory.createTextField();
		cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
	}

}
