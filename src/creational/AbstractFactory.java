package creational;

public interface AbstractFactory {
	Button createButton();
	Checkbox createCheckbox();
}


interface Button {
	
	void paint();
}

interface Checkbox{
	
	void paint();
	
}


class WindowsButton implements Button{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("created winddows button");	
	}
}

class MacOSButton implements Button{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("created MacOSButton button");
	}
}

class WindowsCheckbox implements Checkbox{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("created winddows checkbox");	
	}
}

class MacOSCheckbox implements Checkbox{

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("created MacOSButton checkbox");
	}
}

class WindowsFactory implements AbstractFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}
}

class MacOSFactoryPattern implements AbstractFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}
	
	
}
