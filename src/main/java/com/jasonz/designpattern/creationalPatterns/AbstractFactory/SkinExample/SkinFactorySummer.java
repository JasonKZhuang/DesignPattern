package creationalPatterns.AbstractFactory.SkinExample;

public class SkinFactorySummer implements SkinFactory
{

	public Button createButton()
	{
		return new ButtonSummer();
	}

	public TextField createTextField()
	{
		return new TextFieldSummer();
	}

	public ComboBox createComboBox()
	{
		return new ComboBoxSummer();
	}

}
