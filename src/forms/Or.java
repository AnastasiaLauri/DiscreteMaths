package forms;

public class Or extends Binary{

	
	public Or (Form left, Form right)throws InvalidFormException
	{
		super(left,right);
	}
	
	public String toString()
	{
		return toStringHelper("(" + left + " v " + right + ")");
	}

	public boolean equals(Object o)
	{
		if (o.getClass() != Or.class)
			return false;
		else if (((Or)o).left.equals(left) && ((Or)o).right.equals(right))
			return true;
		else
			return false;
	}
}
