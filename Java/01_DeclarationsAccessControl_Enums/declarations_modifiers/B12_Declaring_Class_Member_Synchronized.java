package declarations_modifiers;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.record.Record;

/*
■ The synchronized modifier:
1-indicates that a method can be accessed by only one thread at a time
2-can be applied only to methods - not variables, not classes
can be matched with any of the four access control levels 
(which means it can be paired with any of the three access modifier keywords).
 */
public class B12_Declaring_Class_Member_Synchronized {
	public synchronized Record retrieveUserInfo(int id) {
		return null; }
}
