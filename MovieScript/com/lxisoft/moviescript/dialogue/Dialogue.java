package com.lxisoft.moviescript.dialogue;
public class Dialogue
{
	private String dialogue;

	public String getDialogue()
	{
		return dialogue;
	}
	public void setDialogue(String dialogue)
	{
		this.dialogue=dialogue;
	}
	public boolean equals(Object dlg)
	{
		return dialogue.equals(((Dialogue)dlg).getDialogue());
	}
	public String toString()
	{
		return dialogue;
	}
	public int hashCode()
	{
		return 1;
	}
}