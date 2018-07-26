package creationalPatterns.AbstractFactory.SkinExample;

public class SkinFactorySpring implements SkinFactory
{

	public Button createButton()
	{
		return new ButtonSpring();
	}

	public TextField createTextField()
	{
		return new TextFieldSpring();
	}

	public ComboBox createComboBox()
	{
		return new ComboBoxSpring();
	}

}
