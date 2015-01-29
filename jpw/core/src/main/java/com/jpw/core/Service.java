package com.jpw.core;

public abstract class Service implements IService {
	public enum State {
		INIT,
		STARTING,
		RUNNING,
		STOPPING
	}
	
	public boolean start()
	{
		//state = STARTING;
		return true;
		//state = RUNNING;
	}
	
	public void stop()
	{
		//state = STOPPED;
		
		//state = STOPPING;
	}
	
	protected abstract boolean startService() ;
	protected abstract void stopService() ;
	
	protected boolean beforeStartService() { return true; };	
	protected void afterStartService() { };

	protected void beforeStopService() {};	
	protected void afterStopService() {};
	
	protected int state;
}
