class NamedCow extends Cow
{
	private String name;
	private String mySound;
	private String myType;
	public NamedCow(String type, String name1, String sound){
		mySound = sound;
		myType = type;
		name = name1;
	}
	public String getName(){
		return name;
	}
	public String getSound(){
		return mySound;
	}
}