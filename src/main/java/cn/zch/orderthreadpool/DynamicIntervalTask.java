package cn.zch.orderthreadpool;
/**
 * @author atlas
 */
public interface DynamicIntervalTask extends Runnable {
	/**
	 * @return the next scheduled interval in ms. If <= 0 the task will not
	 * be re-scheduled
	 */
	long nextInterval();
}
