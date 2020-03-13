package selfTest11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LeaderBoard {
private ReadWriteLock rwl = new ReentrantReadWriteLock();
private List<Integer> highScores = new ArrayList<>();
public void addScore(Integer score) {
// position A
	Lock lock = rwl.writeLock();
lock.lock();
try {
if (highScores.size() < 10) {
highScores.add(score);
} else if (highScores.get(highScores.size() - 1) < score) {
highScores.set(highScores.size() - 1, score);
} else {
return;
}
Collections.sort(highScores, Collections.reverseOrder());
} finally {
lock.unlock();
}
}
public List<Integer> getHighScores() {
// position B
	Lock lock = rwl.readLock();
lock.lock();
try {
return Collections.unmodifiableList(new ArrayList<>(highScores));
} finally {
lock.unlock();
}
}
}