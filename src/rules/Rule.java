package rules;

import forms.Form;

public abstract class Rule {

	private boolean end = false;
	
	public void setEnd()
	{
		end = true;
	}
	
	public boolean isEnd()
	{
		return end;
	}
	
	public abstract Form evaluate(Proof proof) throws Exception; 
	
	public abstract String toString();
}