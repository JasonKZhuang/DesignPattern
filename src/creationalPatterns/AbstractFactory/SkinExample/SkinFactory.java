package creationalPatterns.AbstractFactory.SkinExample;

public interface SkinFactory
{
	public Button createButton();
	
	public TextField createTextField();
	
	public ComboBox createComboBox();
}
