package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RequestProcessor {
	
	private ExecutorService threadpool;
	private ThreadGroup reportthreadgrp;
	private ThreadGroup databasethreadgrp;
	

	public RequestProcessor(){
		threadpool =Executors.newFixedThreadPool(10, new ThreadFactory());
		
	}

}

enum {
	DATABASE_QUERY;
	
}
class{
	
}
