package pkg1_Encapsulation;
/*
 * class Object
new Object()						Constructs a new object: R
Class<?>getClass()					Runtime class
int hashCode()						Hash Code
boolean equals(Object obj)			Compare two objects
String toString()					String representation of the object
									return getClass().getName() + "@" + Integer.toHexString(hashCode());
notify()							Wakes up a single thread that is waiting on this object's
									@throws  IllegalMonitorStateException  if the current thread is not the owner of this object's monitor.
void notifyAll()					Wakes up all threads that are waiting on this object's monitor
 									@throws  IllegalMonitorStateException
void wait() throws InterruptedException
									@throws IllegalMonitorStateException
void wait(long timeoutMillis) throws InterruptedException
void wait(long timeoutMillis, int nanos) throws InterruptedException
									@throws IllegalArgumentException
									@throws IllegalMonitorStateException
									
 *               
 */
public class Class_Object {

}
