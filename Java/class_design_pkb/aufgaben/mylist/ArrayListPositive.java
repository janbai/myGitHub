package aufgaben.mylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.UnaryOperator;

@SuppressWarnings("serial")
public class ArrayListPositive extends ArrayList<Integer> {

	/**
	 * Wird später richtig realisiert werden können (wenn wir mehr übers fubktionale Programmieren wissen)
	 */
	@Override
	public void replaceAll(UnaryOperator<Integer> operator) {
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
	private void checkElement(Integer e) throws NullArgumentException, NotPostivieArgumentException {
		if(e==null) {
			throw new NullArgumentException();
		}
		
		if(e <= 0) {
			throw new NotPostivieArgumentException();
		}
	}
	
	@Override
	public boolean add(Integer e) throws NullArgumentException, NotPostivieArgumentException {
		checkElement(e);		
		return super.add(e);
	}
	
	@Override
	public void add(int index, Integer e) throws NullArgumentException, NotPostivieArgumentException {
		checkElement(e);
		super.add(index, e);
	}
	
	@Override
	public boolean addAll(Collection<? extends Integer> c) throws NullArgumentException, NotPostivieArgumentException {
		c.forEach(e -> checkElement(e));
		return super.addAll(c);
	}
	
	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) throws NullArgumentException, NotPostivieArgumentException {
		c.forEach(e -> checkElement(e));
		return super.addAll(index, c);
	}
	
	@Override
	public Integer set(int index, Integer e) throws NullArgumentException, NotPostivieArgumentException {
		checkElement(e);
		return super.set(index, e);
	}
}
